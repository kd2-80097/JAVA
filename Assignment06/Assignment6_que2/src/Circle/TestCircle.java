package Circle;

public class TestCircle {

	public static void main(String[] args) {
		
		MyCircle c1=new MyCircle();
		System.out.println(c1);
		
		try {
			MyCircle c2=new MyCircle(5,6,-2);
			System.out.println(c2);
		}	
		catch(CircleNegativeDiaException n)
		{
			System.err.println(n);
		}


	}

}
