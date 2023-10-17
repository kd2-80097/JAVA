package Circle;

import com.app.geometry.Point2D;

public class MyCircle {

	Point2D p;
	double myDiameter;
	
	public MyCircle()
	{
		this.myDiameter = 100;
		this.p =new Point2D();
	}
	
public MyCircle( double x,double y,double myDiameter) {
	if(myDiameter<0)
		throw new CircleNegativeDiaException("Diameter is Negative");
		this.myDiameter = myDiameter;
		this.p =new Point2D(x,y);
	}
	
	public String getMyCircle() {
		return p.getDetails()+"\nDiameter is : "+myDiameter; 
	}

	@Override
	public String toString() {
		return "Circle [p=" + p.getDetails() + ", myDiameter=" + myDiameter + "]";
	}
}
