   package com.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Employee;
import com.main.servicei.EmpServicei;

@RestController
public class MyController {
	
	@Autowired
	EmpServicei esi;
	
	@PostMapping("/saveData")
	public Employee regiData(@RequestBody Employee e) {
		
		System.out.println("saving data");
		return esi.saveData(e);
	}
	
	@GetMapping("/getData")
	public List<Employee> getList(){
		
		
		return esi.listEmployee();
	}
	@GetMapping("/getOne/{eid}")
	public Optional<Employee> getOneEmp(@PathVariable int eid) {
		
		Optional<Employee> e = esi.getOneEmp(eid);
		return e;
	}
	
	
	
	@DeleteMapping("/deleteData/{eid}")
	public String deleteData(@PathVariable int eid) {
		
		esi.deleteData(eid);
		return "deleted successfully";
	}
	@PutMapping("/editData/{eid}")
	public Employee editData(@PathVariable int eid,@RequestBody Employee e) {
		
		return esi.editData(eid,e);
}
	
}
