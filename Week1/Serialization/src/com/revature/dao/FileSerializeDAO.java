package com.revature.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.revature.pojo.File;

public class FileSerializeDAO implements FileDAO {

	private static final String FILENAME = "myfile.dat";
	
	@Override
	public void saveFile(File f) {
		ObjectOutputStream oos = null;
		FileOutputStream foo = null;
		
		try {
			foo = new FileOutputStream(FILENAME);
			oos = new ObjectOutputStream(foo);
			oos.writeObject(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (foo != null) foo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public File loadFile() {
		// TODO Auto-generated method stub
		return null;
	}

}
