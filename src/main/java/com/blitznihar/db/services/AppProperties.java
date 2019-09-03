package com.blitznihar.db.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class AppProperties {
    @Value("${employee.employeeId}")
    public int employeeId;

    public int returnEmployeeId(){
        return this.employeeId;
    }
}