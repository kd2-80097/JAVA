package com.app.fruit;

public class Orange extends Fruit {

	public Orange() {
	}

	public Orange(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
	}
	
	@Override
	public String taste() {
		return "Sour Taste";
	}
	
	public boolean equals(String taste) {		
		if(this.taste()== taste)
			return true;
			return false;
	}

}
