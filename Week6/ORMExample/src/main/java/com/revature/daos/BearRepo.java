package com.revature.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.domains.Bear;

@Repository("bearRepo")
public interface BearRepo extends JpaRepository<Bear, Integer> {

	public List<Bear> findAllByBreed(String breed);
	
}
