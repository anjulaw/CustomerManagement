package com.github.practicalsession9.Model;

/**
 * Created by Anjulaw on 8/20/2016.
 */
public class CustomerBean {

    private String cusId;
    private String firstName;
    private String lastName;
    private String address;

    public CustomerBean(){}

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void createCustomer(String ci,String fn,String ln,String ad)
    {
        cusId=ci;
        firstName=fn;
        lastName=ln;
        address=ad;
    }


}
