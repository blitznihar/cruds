package com.blitznihar.db.services;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.blitznihar.db.pojos.Employee;
import com.blitznihar.db.repo.EmployeeRepo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeService.class)
public class EmployeeServiceTest{

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepo employeeRepo;

    @Test
    public void updateCallTestwhenNoEmployeeFound(){
        when(employeeRepo.getEmployee(anyInt())).thenReturn(null);
        employeeService.updateCalls(1123);
        verify(employeeRepo, times(1)).getEmployee(anyInt());
        verify(employeeRepo, times(1)).updateEmployee(any(Employee.class));
        verify(employeeRepo, times(1)).createEmployee(any(Employee.class));
        assertTrue("update call Success as no error response", true);
    }

    @Test
    public void updateCallTestExistingEmployee(){
            Employee employee = new Employee();
            employee.setEmployeeId(1123);
            employee.setFirstName("SomeFirstName");
            employee.setLastName("SomeLastName");
            employee.setCall(5);
        when(employeeRepo.getEmployee(anyInt())).thenReturn(employee);
        employeeService.updateCalls(1123);
        verify(employeeRepo, times(1)).getEmployee(anyInt());
        verify(employeeRepo, times(1)).updateEmployee(any(Employee.class));
        verify(employeeRepo, times(0)).createEmployee(any(Employee.class));
        assertTrue("update call Success as no error response", true);
    }

}