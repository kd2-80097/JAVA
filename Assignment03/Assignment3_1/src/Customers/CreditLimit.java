package Customers;

import java.util.Scanner;

/* Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".    */

public class CreditLimit {
	
	private int acc_no = 0;
	private int startMonthBalance = 0;
	private int totalMonthCharge = 0;
	private int totalMonthCredit = 0;
	private int creditLimit = 0;
	
	public CreditLimit()
	{
	}

	public CreditLimit(int acc_no, int startMonthBalance, int totalMonthCharge, int totalMonthCredit, int creditLimit) {
		super();
		this.acc_no = acc_no;
		this.startMonthBalance = startMonthBalance;
		this.totalMonthCharge = totalMonthCharge;
		this.totalMonthCredit = totalMonthCredit;
		this.creditLimit = creditLimit;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getStartMonthBalance() {
		return startMonthBalance;
	}

	public void setStartMonthBalance(int startMonthBalance) {
		this.startMonthBalance = startMonthBalance;
	}

	public int getTotalMonthCharge() {
		return totalMonthCharge;
	}

	public void setTotalMonthCharge(int totalMonthItem) {
		this.totalMonthCharge = totalMonthCharge;
	}

	public int getTotalMonthCredit() {
		return totalMonthCredit;
	}

	public void setTotalMonthCredit(int totalMonthCredit) {
		this.totalMonthCredit = totalMonthCredit;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	Scanner s = new Scanner(System.in);
	public void acceptData()
	{
		System.out.print("Enter the Account Number = ");
		acc_no = s.nextInt();
		System.out.print("Enter the Balance in the Begining of Month = ");
		startMonthBalance = s.nextInt();
		System.out.print("Enter the Total Charges this Month = ");
		totalMonthCharge = s.nextInt();
		System.out.print("Enter the Total Credits Earned this Month = ");
		totalMonthCredit = s.nextInt();
		System.out.print("Enter the Allowed Credit Limit = ");
		creditLimit = s.nextInt();
		s.close();
	}
	
	public void calculateBalance()
	{	
		int newBalance = startMonthBalance + totalMonthCharge - totalMonthCredit;
		System.out.println("New Balance = "+newBalance);
		if(newBalance > creditLimit)
			System.out.print("Credit Limit Exceeded");
	}
	
	
}


