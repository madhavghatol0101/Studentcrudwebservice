package com.main.servicei;

import java.util.List;
import java.util.Optional;

import com.main.model.Employee;

public interface EmpServicei {

	public Employee saveData(Employee e);

	public List<Employee> listEmployee();
	
	public Optional<Employee> getOneEmp(int eid);

	public void deleteData(int eid);

	public Employee editData(int eid, Employee e);

}
