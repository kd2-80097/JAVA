package assign2_2;

import java.util.Scanner;

/* Q2. Create a class called Employee that includes three fields—a first name (type String), 
 * a last name (type String) and a monthly salary (double). 
 * Provide a constructor that initializes the three instance variables. 
 * Provide a set and a get method for each instance variable. 
 * If the monthly salary is not positive, do not set its value. 
 * Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. 
 * Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.    */

public class Employee 
{
	private String fname;
	private String lname;
	private double salary;
	public Employee() 
	{
		this.fname = "--";
		this.lname = "--";
		this.salary = 0.00;
	}
	public Employee(String fname, String lname, double salary) 
	{
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	Scanner s = new Scanner(System.in);
	public void acceptData() {
		System.out.println("***********************");		
		System.out.println("Please enter the First name : ");
		this.fname = s.nextLine();
		System.out.println("Please enter the Last name : ");
		this.lname = s.nextLine();
		System.out.println("Please enter the Salary");
		this.salary = s.nextDouble();
		if(this.salary < 0)
			this.salary = 0.00;
	}
	
	public void displayData() {
		System.out.println("***********************");
		System.out.println("Employee First Name : "+this.fname);
		System.out.println("Employee Last Name : "+this.lname);
		System.out.println("Employee Salary : "+this.salary);
	}
	
	public void increment()
	{
		this.salary += this.salary*0.1;
	}
    	

}
