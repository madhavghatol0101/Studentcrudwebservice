package com.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.Model.Farmer;

@Repository
public interface MyRepository extends CrudRepository<Farmer, Integer>{

	public Farmer findAllByUnameAndPass(String uname, String pass);

}
