package com.blitznihar.db.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int personId;

    public int getPersonId(){
        return this.personId;
    }
    public void setPersonId(int value){
        this.personId = value;
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
    @Override
    public String toString() {
        return String.format(
                "Person[personId=%d, firstName='%s', lastName='%s']",
                personId, firstName, lastName);
    }

}