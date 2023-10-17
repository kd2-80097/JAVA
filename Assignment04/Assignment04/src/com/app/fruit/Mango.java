package com.app.fruit;

public class Mango extends Fruit {

	public Mango() {
	}

	public Mango(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
	}
	
	@Override
	public String taste() {
		return "Sweet Taste";
	}
	
	public boolean equals(String taste) {		
		if(this.taste()== taste)
			return true;
			return false;
	}

}
