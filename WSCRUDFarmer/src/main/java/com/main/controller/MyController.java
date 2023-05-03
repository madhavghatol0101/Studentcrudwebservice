package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.Model.Farmer;
import com.main.devServicei.FarServicei;

@RestController
public class MyController {
	
	@Autowired
	FarServicei fsi;
	
	@PostMapping("/postData")
	public Farmer saveData(@RequestBody Farmer d) {
		
		Farmer far = fsi.saveData(d);
		
		return far;
	}
	
	@GetMapping("/getData")
	public List<Farmer> getData(){
		
		List<Farmer> far = fsi.getData();
		
		return far;
	}
	
	@GetMapping("/getOneFarm/{uname}/{pass}")
	public Farmer getOneData(@PathVariable String uname, @PathVariable String pass) {
		
		Farmer far = fsi.saveOneData(uname,pass);
		
		return far;
	}
	@DeleteMapping("/deleteOne/{fid}")
	public String deleteOne(@PathVariable int fid) {
		
		fsi.deleteOneData(fid);
		
		return "deleted Successfully..!";
	}
	
	@PutMapping("/updateOneRecord/{fid}")
	public Farmer updateData(@PathVariable int fid, @RequestBody Farmer f) {
		
		Farmer farm = fsi.updateData(f);
		
		return farm;
	}

}
