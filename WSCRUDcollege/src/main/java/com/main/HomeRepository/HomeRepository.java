package com.main.HomeRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.Model.College;

@Repository
public interface HomeRepository extends CrudRepository<College, Integer> {

	public College save(int cid);
	
}