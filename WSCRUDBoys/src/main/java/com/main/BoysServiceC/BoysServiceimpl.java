package com.main.BoysServiceC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.BoysServicei.boysServicei;
import com.main.Repository.HomeRepository;
import com.main.model.Boys;
@Service
public class BoysServiceimpl implements boysServicei {
	
	@Autowired
	HomeRepository hr;

	@Override
	public Boys saveData(Boys b) {
		
		Boys boy = hr.save(b);
		return boy;
	}

	@Override
	public Boys updateData(Boys b) {
		
		Boys bo = hr.save(b);
				
		return bo;
	}

	@Override
	public Iterable<Boys> getAllBoys() {
		
		Iterable<Boys> boy = hr.findAll();
		return boy;
	}

	@Override
	public void deleteData(int bid) {
		hr.deleteById(bid);
	}

}
