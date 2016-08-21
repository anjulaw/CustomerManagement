package com.github.practicalsession9.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anjulaw on 8/20/2016.
 */
public class CustomerDataBean {

    private List cusList=new ArrayList();

    public CustomerDataBean(){

        CustomerBean c1=new CustomerBean();
        c1.createCustomer("100","John","Smith","Australia");

        CustomerBean c2=new CustomerBean();
        c2.createCustomer("101","Mark","Anthony","Canada");

        CustomerBean c3=new CustomerBean();
        c3.createCustomer("102","Cristina","Johns","USA");

        CustomerBean c4=new CustomerBean();
        c4.createCustomer("103","David","Cook","England");

        cusList.add(c1);
        cusList.add(c2);
        cusList.add(c3);
        cusList.add(c4);
    }

    public List getCustomers(){
        return cusList;

    }

    public CustomerBean getCustomer(String id)
    {
        CustomerBean ret=null;
        for(int i=0;i<cusList.size();i++)
        {
            CustomerBean cb=(CustomerBean)cusList.get(i);
            if(cb.getCusId().equals(id))
            {
                ret=cb;
            }
        }
        return ret;
    }
}
