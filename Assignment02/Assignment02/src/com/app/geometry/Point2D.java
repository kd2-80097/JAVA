package com.app.geometry;

import java.util.Objects;
import java.util.Scanner;

/* Q4. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
string form of point's x & y co-ords
Hint : public String getDetails())
Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
both points are having same x,y co-ords or false otherwise.
Add calculateDistance method to calculate distance between current point and specified point &
return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
from user (Scanner) --to create 2 points (p1 & p2)
Use getDetails method to display point details.(p1's details & p2's details)
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
position)
If they are not located at the same position , display distance between p1 & p2   */

public class Point2D {
	
	private double x_coordinate;
	private double y_coordinate;
	
	public Point2D() {
	}
	
	public Point2D(double x_coordinate, double y_coordinate) {
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
	}
	
	public String getDetails() {
		String x = String.valueOf(x_coordinate);
		String y = String.valueOf(y_coordinate);
		return "Point : ("+x+","+y+")";
	}
	
//	public boolean isEqual(Point2D p2) {
//		if(this.x_coordinate == p2.x_coordinate && this.y_coordinate == p2.y_coordinate) 
//			return true;
//			return false;
//	}
    Scanner s = new Scanner(System.in);
	public void acceptData() {
		System.out.println("Enter X coordinate = ");
		this.x_coordinate = s.nextDouble();
		System.out.println("Enter Y coordinate = ");
		this.y_coordinate = s.nextDouble();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Point2D))
			return false;
		Point2D p = (Point2D) obj;	
		return (this.x_coordinate == p.x_coordinate && this.y_coordinate == p.y_coordinate);
	}
	
	
	
	public double calculateDistance(Point2D p1) {
		double distance;
		return distance = Math.sqrt(Math.pow((this.x_coordinate-p1.x_coordinate),2.0)+Math.pow((this.y_coordinate-p1.y_coordinate),2.0));
		
	}

}		
		
