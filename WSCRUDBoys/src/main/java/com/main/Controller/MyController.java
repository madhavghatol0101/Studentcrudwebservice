package com.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.BoysServicei.boysServicei;
import com.main.model.Boys;

@RestController
public class MyController {
	
	@Autowired
	boysServicei bsi;
	
	@PostMapping("/postData")
	public Boys saveData(@RequestBody Boys b) {
		
		Boys bo = bsi.saveData(b);
		return bo;
	}
	
	@PutMapping("/updateOne")
	public Boys updateData(@RequestBody Boys b) {
		
		Boys boy = bsi.updateData(b);
		return boy;
	}
	
	
	@GetMapping("/getData")
	public Iterable<Boys> getAllBoys(){
		
		Iterable<Boys> boys = bsi.getAllBoys();
		return boys;
	}
	@DeleteMapping("/deleteOne/{bid}")
	public String deleteData(@PathVariable int bid) {
		
		
		bsi.deleteData(bid);
		return "Deleted Successfully....";
	}

}
