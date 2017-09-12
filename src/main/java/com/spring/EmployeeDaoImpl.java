package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by NalinBakshi on 9/12/2017.
 */
@Repository
public class EmployeeDaoImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;




    public List<Employee> getEmployees() {
        String query  = "select id, name, age, address from employee";

        System.out.println("..............................");
        List<Employee> employees =jdbcTemplate.query(query, new EmployeeRowMapper());
        System.out.println("..............................");
        return employees;
    }


    public class EmployeeRowMapper implements RowMapper<Employee> {

        public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
            Employee emp = new Employee();
            emp.setEmpId(resultSet.getInt("id"));
            emp.setName(resultSet.getString("name"));
            emp.setAge(resultSet.getInt("age"));
            emp.setAddress(resultSet.getString("address"));
            return emp;
        }
    }
}
