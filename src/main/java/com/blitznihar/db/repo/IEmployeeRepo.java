package com.blitznihar.db.repo;

import com.blitznihar.db.pojos.Employee;

public interface IEmployeeRepo {
    void createEmployee(Employee employee);
    Employee getEmployee(int employeeId);
    void updateEmployee(Employee employee);
    void deleteEmployee(int employeeId);
}