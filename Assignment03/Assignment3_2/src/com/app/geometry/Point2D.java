package com.app.geometry;

import java.util.Objects;
import java.util.Scanner;


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
		
//		public boolean isEqual(Point2D p2) {
//			if(this.x_coordinate == p2.x_coordinate && this.y_coordinate == p2.y_coordinate) 
//				return true;
//				return false;
//		}
		
		public double getX_coordinate() {
			return x_coordinate;
		}

		public void setX_coordinate(double x_coordinate) {
			this.x_coordinate = x_coordinate;
		}

		public double getY_coordinate() {
			return y_coordinate;
		}

		public void setY_coordinate(double y_coordinate) {
			this.y_coordinate = y_coordinate;
		}
        
		
		
		public void acceptData() {
			Scanner s = new Scanner(System.in);
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
