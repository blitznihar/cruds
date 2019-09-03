package com.blitznihar.db.repo;

import com.blitznihar.db.pojos.Employee;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo implements IEmployeeRepo {

    public EmployeeRepo() {
        super();
    }

    @Override
    public void createEmployee(Employee employee) {

    }

    @Override
    public Employee getEmployee(int employeeId) {
        return null;

    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(int employeeId) {
		
	}

}