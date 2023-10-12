package assign2_2;

public class Test {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Chetan","Arote",10000);
		employee1.displayData();
		
		Employee employee2 = new Employee();
		employee2.acceptData();
		employee2.displayData();
		
		System.out.println("****************************");

		employee1.increment();
		System.out.println("Salary of Employee 1 = "+employee1.getSalary());
		employee2.increment();
		System.out.println("Salary of Employee 2 = "+employee2.getSalary());
	}

}
