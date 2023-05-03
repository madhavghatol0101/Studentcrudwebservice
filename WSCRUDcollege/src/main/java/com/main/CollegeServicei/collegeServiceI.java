package com.main.CollegeServicei;

import java.util.List;
import java.util.Optional;

import com.main.Model.College;

public interface collegeServiceI {

	public College postData(College c);

	public List<College> getData();

	public Optional<College> getOneCollege(int cid);

	public void deleteData(int cid);

	public College updateData(int cid, College c);
	
	

}
