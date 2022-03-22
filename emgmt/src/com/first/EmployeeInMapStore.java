package com.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//import java.io.FileNotFoundException;


public class EmployeeInMapStore  implements EmployeeStore{
	
	private static  Map<Integer,Employee> employeeMap  = new HashMap<Integer,Employee>();
	
	@Override
	public void addEmployee(Employee employee) {
		employeeMap.put(employee.getId(), employee);		
	}

	@Override
	public void deleteEmployee(int id) {
			
		List<Employee> employeelist = new ArrayList<Employee>();
		Set<Integer> keys = employeeMap.keySet();
		for(Integer key: keys) {
			Employee emp = employeeMap.get(key);
			if(id==emp.getId()) {
				employeeMap.remove(key);
			}
		}
	}

	@Override
	public List<Employee> searchEmployee(String searchString) {
		List<Employee> searchList = new ArrayList<Employee>();
		
		for (int i=0;i<employeeMap.size();i++) {
			Employee employee = employeeMap.get(i);
			if (searchString.equals(employee.getName())) {
				searchList.add(employee);
			}
			
		}
		return searchList;
		}

	

	@Override
	public List<Employee> getEmployeeList() {
		List<Employee> employeelist = new ArrayList<Employee>();
		Set<Entry<Integer, Employee>> entries = employeeMap.entrySet();
		for(Entry<Integer,Employee> entry:entries) {
			Employee emp1 = entry.getValue();
			employeelist.add(emp1);
		}
		return employeelist;
		
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		Set<Integer> keys =employeeMap.keySet();
		for(Integer key : keys) {
			Employee emp = employeeMap.get(key);
			if(employeeId==emp.getId()) {
				return emp;
			}
		}
		return null;
	}

	@Override
	/*public Employee getEmployeeByMobileNumber(long employeeMobileNumber) {
	
		Set<Integer> keys = employeeMap.keySet();
		for(Integer key : keys) {
			Employee emp = employeeMap.get(key);
			if(employeeMobileNumber == emp.getMobileNumber()) {
				return emp;
			}
			
		}
		return null;
	}
*/
	public Employee findEmployeeWithMinimumSalary(){
		
		
		
		
		return null;
			
	}
	
	
	
	@Override
	public List<Employee> searchEmployeeByName(String employeeName) {
		List<Employee> empList = new ArrayList<Employee>();
		// check all objects of employee in map 
		Set<Entry<Integer, Employee>> entries = employeeMap.entrySet();
		for(Entry<Integer,Employee> entry: entries) {
			Employee emp = entry.getValue();
			if(employeeName.equals(emp.getName())) {
				empList.add(emp);
			}
		}
		return empList;
	}

	@Override
	public List<Employee> searchEmployeeByCity(String employeeCity) {
		List<Employee> empList = new ArrayList<Employee>();
		Set<Entry<Integer, Employee>> entries = employeeMap.entrySet();
		for(Entry<Integer,Employee> entry :entries) {
			Employee emp = entry.getValue();
			if(employeeCity.equals(emp.getCity())) {
				empList.add(emp);
			}
		}
		return empList;
		
		
	}

	@Override
	public void deleteEmployeeByName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> sortingEmployeesOrderBySalary() {
		// TODO Auto-generated method stub
		return null;
	}}
/*
	@Override
	public List<Employee> sortEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> sortEmployeeByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> sortEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/