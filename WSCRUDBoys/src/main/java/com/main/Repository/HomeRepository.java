package com.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Boys;

@Repository
public interface HomeRepository extends CrudRepository<Boys, Integer>{

}
