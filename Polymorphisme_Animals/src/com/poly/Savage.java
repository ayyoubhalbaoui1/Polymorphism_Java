package com.poly;

public class Savage extends Animal {
	protected String owner;	

	public Savage() {
		
		super();
		
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public Savage(String gender, String name, int number, String owner) {
		super(gender, name, number);
		this.owner = owner; 
		
	}
	
	public String getOwner() {
		return owner; 
	}
	
	public void setOwner(String owner) {
		
		this.owner = owner; 
		
	}
}
