package com.blitznihar.db.services;

import com.blitznihar.db.pojos.Employee;
import com.blitznihar.db.repo.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public void updateCalls(int employeeId) {
        Employee employee = employeeRepo.getEmployee(employeeId);
        System.out.println(employee.getEmployeeId());
        if(employee==null)
        {
            employee = new Employee();
            employee.setEmployeeId(employeeId);
            employee.setFirstName("Something");
            employee.setLastName("Something");
            employeeRepo.createEmployee(employee);
        }
        employee.setCall(employee.getCall()+1);
        employeeRepo.updateEmployee(employee);
    }

	public void createEmployee(Employee employee) {
        employeeRepo.createEmployee(employee);
	}

}