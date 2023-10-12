package Customers;


public class TestCreditLimit {

	public static void main(String[] args) {

		CreditLimit creditlimit = new CreditLimit();
		creditlimit.acceptData();
		creditlimit.calculateBalance();
		
//		CreditLimit creditlimit1 = new CreditLimit(101,5000,6000,100,10000);
//		creditlimit1.calculateBalance();
	}

}
