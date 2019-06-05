package com.revature.dao;

import com.revature.pojo.File;

public interface FileDAO {
	
	public void saveFile(File f);
	
	public File loadFile();

}
