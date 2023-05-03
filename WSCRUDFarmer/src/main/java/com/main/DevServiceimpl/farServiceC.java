package com.main.DevServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.main.Model.Farmer;
import com.main.devServicei.FarServicei;
import com.main.repository.MyRepository;

@Service
public class farServiceC implements FarServicei{
	
	@Autowired
	MyRepository mr;

	@Override
	public Farmer saveData(@RequestBody Farmer d) {
		
		 Farmer far = mr.save(d);
		
		return far;
	}

	@Override
	public List<Farmer> getData() {

		List<Farmer> far = (List<Farmer>) mr.findAll();
		
		return far;
	}

	@Override
	public Farmer saveOneData(String uname, String pass) {

		Farmer farm = mr.findAllByUnameAndPass(uname,pass);
		
		return farm;
	}

	@Override
	public void deleteOneData(int fid) {
		
		mr.deleteById(fid);
	}

	@Override
	public Farmer updateData(Farmer f) {

			Farmer farm = mr.save(f);
			
		return farm;
	}
	
	

}
