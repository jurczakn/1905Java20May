package com.revature.driver;

import java.time.LocalDateTime;
import java.time.Period;

import com.revature.dao.FileDAO;
import com.revature.dao.FileSerializeDAO;
import com.revature.pojo.File;

public class Driver {

	private static FileDAO fdao = new FileSerializeDAO();
	
	public static void main(String[] args) {
		
		
		  File file = new File(); file.setName("Tree"); file.setOwner("Donald");
		  file.setDateCreated(LocalDateTime.now().minus(Period.ofDays(1)));
		  file.setDateLastEdited(LocalDateTime.now());
		  file.setContent("'Trees are cool' - Donald, Botonist"); fdao.saveFile(file);
		 
		
		file = fdao.loadFile();
		
		System.out.println(file);
		
		file.setContent(file.getContent() + "; Chapter 2: Trees are also interesting");
		fdao.saveFile(file);
		System.out.println(fdao.loadFile());

	}

}
