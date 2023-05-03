package com.main.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.CollegeServicei.collegeServiceI;
import com.main.Model.College;

@RestController
public class MyController {
	
	@Autowired
	collegeServiceI csi;
	
	@PostMapping("/saveAllData")
	public College postData(@RequestBody College c)
	{
		College col = csi.postData(c);
		
		return col;
		
	}
	
	@GetMapping("/getAllData")
	public List<College> getData()
	{
		List<College> col = csi.getData();
		return col;
	}
	
	@GetMapping("/getSingleData/{cid}")
	public Optional<College> getOneCollege(@PathVariable int cid)
	{
	
		return csi.getOneCollege(cid);
	}
	
	@DeleteMapping("/deleteOne/{cid}")
	public String deleteOne(@PathVariable int cid)
	{
		System.out.println("Now one record deleting");
		csi.deleteData(cid);
		
		return "Deleted Successfully...";
	}
	@PutMapping("/updateOne/{cid}")
	public College updateData(@RequestBody College c,@PathVariable int cid)
	{
		College clg = csi.updateData(cid,c);
		return clg;
	}

}
