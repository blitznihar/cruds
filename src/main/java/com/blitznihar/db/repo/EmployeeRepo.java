package com.blitznihar.db.repo;

import com.blitznihar.db.pojos.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeRepo implements IEmployeeRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public EmployeeRepo() {
        super();
    }

    @Override
    public int createEmployee(Employee employee) throws DataAccessException {
      
    
        String sql = "INSERT INTO Employee VALUES("+employee.getEmployeeId()+",'"+employee.getFirstName()+"','"+employee.getLastName()+"',"+employee.getCall()+")";
        return jdbcTemplate.update(sql);

    }

    @Override
    public Employee getEmployee(int employeeId) {
        Employee employee = new Employee();
        String query = "SELECT * FROM EMPLOYEE WHERE EmployeeId = ?";
         employee = jdbcTemplate.queryForObject(query, new Object[] { employeeId }, new EmployeeRowMapper());
        return employee;

    }
    public class EmployeeRowMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
     
            employee.setEmployeeId(rs.getInt("EMPLOYEEID"));
            employee.setFirstName(rs.getString("FIRSTNAME"));
            employee.setLastName(rs.getString("LASTNAME"));
            employee.setCall(rs.getInt("CALL"));
     
            return employee;
        }
    }

    @Override
    public int updateEmployee(Employee employee) {
        String sql = "UPDATE Employee SET FIRSTNAME='"+employee.getFirstName()+"',LASTNAME='"+employee.getLastName()+"',CALL="+employee.getCall()+" WHERE EmployeeId="+employee.getEmployeeId();
        return jdbcTemplate.update(sql);
    }

    @Override
    public void deleteEmployee(int employeeId) {
		
	}

}