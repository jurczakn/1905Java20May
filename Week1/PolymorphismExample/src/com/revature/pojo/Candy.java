package com.revature.pojo;

import java.io.IOException;

public class Candy {
	
	boolean containsNuts() {
		return false;
	}
	
	public boolean hasWrapper() {
		return true;
	}
	
	public Candy self() throws IOException{
		return this;
	}

}
