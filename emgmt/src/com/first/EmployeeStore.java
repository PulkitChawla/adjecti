package com.first;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public interface EmployeeStore {
	
	public void addEmployee(Employee employee);

	public void deleteEmployee(int id);

	public List<Employee> getEmployeeList();

	public Employee getEmployeeById(int employeeId);
	
	public List<Employee> searchEmployee(String searchString);
	
	public List<Employee> searchEmployeeByName(String employeeName);

	public List<Employee> searchEmployeeByCity(String employeeCity);

	public Employee findEmployeeWithMinimumSalary();
	
	public List<Employee> sortingEmployeesOrderBySalary();


	public void deleteEmployeeByName(String name);
}
