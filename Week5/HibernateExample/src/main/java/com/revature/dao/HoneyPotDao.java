package com.revature.dao;

import com.revature.domains.HoneyPot;

public interface HoneyPotDao {
	
	public void updateHoneyPot(HoneyPot hp);
	
	public void insertHoneyPot(HoneyPot hp);
	
	public void deleteHoneyPot(HoneyPot hp);
	
	public HoneyPot getHoneyPotById(int id);

}
