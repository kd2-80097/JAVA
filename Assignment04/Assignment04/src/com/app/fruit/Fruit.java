package com.app.fruit;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;
	
	public Fruit() {
	}
	
	public Fruit(String name,String color,double weight,boolean isFresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit Name = " + name +"\n Color = " + color +"\n Weight = " + weight +"\n isFresh = " + isFresh;
	}
	
	public String taste() {
		return "No Specific Test";
	}

}
