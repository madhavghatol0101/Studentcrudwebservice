package com.main.CollegeServiceC;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.CollegeServicei.collegeServiceI;
import com.main.HomeRepository.HomeRepository;
import com.main.Model.College;

@Service
public class CollegeServiceImpl implements collegeServiceI{
	
	@Autowired
	HomeRepository hr;

	@Override
	public College postData(College c) {

		College co = hr.save(c);
		
		return co;
	}

	@Override
	public List<College> getData() {

		List<College> col = (List<College>) hr.findAll();
		
		return col;
	}

	@Override
	public  Optional<College> getOneCollege(int cid) {
	
		Optional<College> list = hr.findById(cid);
		return list;
	}

	@Override
	public void deleteData(int cid) {
		
		hr.deleteById(cid);
	}

	@Override
	public College updateData(int cid,College c) {
		System.out.println("updating one....");
		College clg = hr.save(c);
		
		return clg;
	}

	
}
