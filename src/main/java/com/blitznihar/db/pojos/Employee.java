package com.blitznihar.db.pojos;
public class Employee {

    private int employeeId;

    public int getEmployeeId(){
        return this.employeeId;
    }
    public void setEmployeeId(int value){
        this.employeeId = value;
    }

    private String firstName;

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String value){
        this.firstName = value;
    }

    private String lastName;

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String value){
        this.lastName = value;
    }

    
    private int call;

    public int getCall(){
        return this.call;
    }
    public void setCall(int value){
        this.call = value;
    }
}