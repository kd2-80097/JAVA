package assign2_1;

import java.util.Scanner;

/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.   */

public class Invoice {
	private String partNo;
	private String partDescript;
	private int partQuantity;
	private double pricePerPart;

	public Invoice() {
		this.partNo = "--";
		this.partDescript = "--";
		this.partQuantity = 0;
		this.pricePerPart = 0.00;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartDescript() {
		return partDescript;
	}

	public void setPartDescript(String partDescript) {
		this.partDescript = partDescript;
	}

	public int getPartQuantity() {
		return partQuantity;
	}

	public void setPartQuantity(int partQuantity) {
		this.partQuantity = partQuantity;
	}

	public double getPricePerPart() {
		return pricePerPart;
	}

	public void setPricePerPart(double pricePerPart) {
		this.pricePerPart = pricePerPart;
	}

	Scanner s = new Scanner(System.in);

	public void acceptData() {
		System.out.println("**********************************");
		System.out.println("----Please enter the Invoice Details----");
		System.out.println("Part N0. = ");
		this.partNo = s.nextLine();
		System.out.println("Part Description ");
		this.partDescript = s.nextLine();
		System.out.println("Quantity of Parts = ");
		this.partQuantity = s.nextInt();
		if(this.partQuantity < 0)
            this.setPartQuantity(0);	
		System.out.println("Price per Part = ");
		this.pricePerPart = s.nextDouble();
		if(this.pricePerPart < 0)
			this.setPricePerPart(0);
	}

	public void displayData() {
		System.out.println("**********************************");
		System.out.println("-----------------Invoice Details-----------------");
		System.out.println("Part No : " + this.getPartNo());
		System.out.println("Part Description : " + this.getPartDescript());
		System.out.println("Quantity : " + this.partQuantity);
		System.out.println("Per Part Price : " + this.pricePerPart);
		System.out.println("Total Bill is " + (this.getPartQuantity() * this.getPricePerPart()));
	}
}
