package com.blitznihar.db.controller;

import com.blitznihar.db.pojos.Employee;
import com.blitznihar.db.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeCallController {

    @Autowired
    private EmployeeService employeeService;

    @PutMapping("/")
    public Employee createEmployee(@RequestBody Employee employee){
        System.out.println(employee.getEmployeeId());

        employeeService.createEmployee(employee);
        return employee;
    }
    @PostMapping("/")
    public boolean UpdateCall(@RequestBody Integer employeeId){
        System.out.println(employeeId);

        employeeService.updateCalls(employeeId);
        return false;
    }
    
}