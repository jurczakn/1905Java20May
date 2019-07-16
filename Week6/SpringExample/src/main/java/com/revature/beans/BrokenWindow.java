package com.revature.beans;

import org.springframework.stereotype.Component;

@Component("window")
public class BrokenWindow implements Window {

	@Override
	public String toString() {
		return "This is a broken window; somebody better be paying for this";
	}
	
	@Override
	public String getSize() {
		return "smaller than it was";
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "broken";
	}

	@Override
	public boolean isOpen() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setSize(String size) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setOpen(boolean open) {
		// TODO Auto-generated method stub

	}

}
