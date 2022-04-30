package net.java.hms.service;

import java.util.List;


import net.java.hms.model.Employee;

public interface EmployeeService 
{
List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
Employee getEmployeeById(long id);
void deleteEmployeeById(long id);	

}
