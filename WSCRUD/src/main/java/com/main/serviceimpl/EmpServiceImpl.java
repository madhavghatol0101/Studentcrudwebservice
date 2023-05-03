package com.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Employee;
import com.main.repository.HomeRepository;
import com.main.servicei.EmpServicei;

@Service
public class EmpServiceImpl implements EmpServicei{
	@Autowired
	HomeRepository hr;

	@Override
	public Employee saveData(Employee e) {
		
		return hr.save(e);
	}

	@Override
	public List<Employee> listEmployee() {
		
		List<Employee> itr = (List<Employee>) hr.findAll();
		return itr;
	}
	
	@Override
	public Optional<Employee> getOneEmp(int eid) {
		
		Optional<Employee> emp = hr.findById(eid);
		return emp;
	}


	@Override
	public void deleteData(int eid) {

		hr.deleteById(eid);
	}

	@Override
	public Employee editData(int eid,Employee e) {
		
		Employee ee = hr.save(e);
		return ee;
	}

	
}
	