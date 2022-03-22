package com.first;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInMemoryStore implements EmployeeStore {
	private static List<Employee> employelist = new ArrayList<Employee>();	
	
	public void  addEmployee(Employee employee)  {		
		employelist.add(employee);
	}

	public void deleteEmployeeByName(String name) {
		for (int i = (employelist.size() - 1); i >= 0; i--) {
			Employee employee = employelist.get(i);
			if(name.equals(employee.getName())) {
				employelist.remove(i);
			}
		}
	}
	
	public void deleteEmployee(int id) {
		for (int i = (employelist.size() - 1); i >= 0; i--) {
			Employee employee = employelist.get(i);
			if (id == employee.getId()) {
				employelist.remove(i);
			}
		}

	}

	public List<Employee> getsearchEmployee(String employeeName) {
		List<Employee> searchList = new ArrayList<Employee>();

		for (Employee e : employelist) {
			if (employeeName.equals(e.getName())) {
				searchList.add(e);
			}
		}

		return searchList;
	}

	public List<Employee> getEmployeeList() 
	{
		return employelist;
	}

	public Employee getEmployeeById(int employeeId) {

		for (Employee employee : employelist) {
			if (employeeId == employee.getId()) {
				return employee;
			}
		}
		return null;
	}

	
	// search employee detail by city
	public List<Employee> getsearchEmployeeCity(String employeeCity) {
		List<Employee> empList = new ArrayList<Employee>();
		for (int i = 0; i < employelist.size(); i++) {

			Employee employee = employelist.get(i);

			if (employeeCity.equals(employee.getCity())) {
				empList.add(employee);
			}
		}
		return empList;
	}

	

	/*public List<Employee> sortingEmployeesOrderBySalary() {
		List<Employee> slist = new ArrayList<Employee>();
		Employee last = null;

		for (int i = 0; i < employelist.size(); i++) {
			Employee tmp = employelist.get(0);
			if (last == null) {
				for (int j = 0; j < employelist.size(); j++) {
					Employee curr = employelist.get(j);
					if (curr.getSalary() > tmp.getSalary()) {

						tmp = curr;
					}

				}
			} else {

				for (int j = 0; j < employelist.size(); j++) {
					Employee curr = slist.get(j);
					if (curr.getSalary() > last.getSalary()) {
						tmp = curr;
						break;
					}

				}
				for (int j = 0; j < employelist.size(); j++) {
					Employee curr = slist.get(j);
					if (curr.getSalary() > tmp.getSalary() && curr.getSalary() > last.getSalary()) {
						tmp = curr;
					}

				}

			}
			slist.add(tmp);
			last = tmp;
		}
		return slist;
	}
		/*
		Collections.sort(employelist, new MySort());
		return employelist;


	} */
		
	
		
	
	public Employee findEmployeeWithMinimumSalary(){
		Employee minSalary = employelist.get(0);
		
	    for(int i=1;i<employelist.size();i++) {
	    	Employee temp = employelist.get(i);
	    	if(minSalary.getSalary()>employelist.get(i).getSalary()) {
	    		minSalary = employelist.get(i);
	    	}
	    	
	    }
		
		return minSalary;		
	}

	@Override
	public List<Employee> searchEmployee(String searchString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> searchEmployeeByName(String employeeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> searchEmployeeByCity(String employeeCity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> sortingEmployeesOrderBySalary() {
		// TODO Auto-generated method stub
		return null;
	}

}