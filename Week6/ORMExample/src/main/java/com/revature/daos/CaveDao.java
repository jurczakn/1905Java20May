package com.revature.daos;

import java.util.List;

import com.revature.domains.Cave;

public interface CaveDao {
	
	public void createCave(Cave cave);
	public Cave readCave(Integer id);
	public List<Cave> readAllCaves();
	public void updateCave(Cave cave);
	public void deleteCave(Cave cave);

}
