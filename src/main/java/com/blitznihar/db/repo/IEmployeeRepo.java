package com.blitznihar.db.repo;

import com.blitznihar.db.pojos.Employee;

public interface IEmployeeRepo {
    int createEmployee(Employee employee);
    Employee getEmployee(int employeeId);
    int updateEmployee(Employee employee);
    void deleteEmployee(int employeeId);
}