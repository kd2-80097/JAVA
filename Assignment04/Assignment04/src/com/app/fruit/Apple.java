package com.app.fruit;

public class Apple extends Fruit {
	
	public Apple() {
		super();
	}
	
	public Apple(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
	}
	
	@Override
	public String taste() {
		return "Sweet n Sour Taste";
	}
	
	
	public boolean equals(String taste) {		
		if(this.taste()== taste)
			return true;
			return false;
	}

}
