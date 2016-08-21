package com.github.practicalsession9.Controller;

/**
 * Created by Anjulaw on 8/20/2016.
 *
 */

import com.github.practicalsession9.Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;


public class SimpleController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException
    {
        /*get the action from the user*/
        String action = request.getParameter("action");
        /*variable that keeps the name of the jsp page that the request will be forwarded */
        String jspPage ="index.html";
        /* if the action is not specified, make it "default" */
        if((action == null) || (action.length()<1))
        {
            action = "default";
        }
        if(action.equals("default"))
        {
            jspPage="../index.jsp";
        }
        else if( action.equals("displaycustomer"))
        {
        /*create objects before forwarding */
            String id=request.getParameter("cusId");
            CustomerDataBean manager=new CustomerDataBean();
            CustomerBean customer=manager.getCustomer(id);
            request.setAttribute("customer",customer);
        /*if the action is "displaycustomer" forward the request to
            "displayCustomer.jsp" */
            jspPage="../customer/displayCustomer.jsp";
        /*uncomment the following line and comment the previous line to use
            JSTL*/
        //jspPage="../customer/displayCustomer_jstl.jsp";
        }
        else if(action.equals("displaylist"))
        {
        /* create objects before forwarding */
            CustomerDataBean manager=new CustomerDataBean();
            List customers=manager.getCustomers();
            request.setAttribute("customers",customers);
        /*if the action is "displayList" forward the request to displayList.jsp"*/
            jspPage="../customer/displayList.jsp";
        /*uncomment the following line and comment the previous line to use
            JSTL*/
        //jspPage="../customer/displayList_jstl.jsp";
        }
        dispatch(jspPage,request,response);
    }
    protected void dispatch(String jsp,HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException
    {
        if(jsp!=null)
        {
        /* to forward a request, forward method of the "RequestDispacher"
        should be called */
            RequestDispatcher rd=request.getRequestDispatcher(jsp);
            rd.forward(request,response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException
    {
        doPost(request,response);
    }


}
