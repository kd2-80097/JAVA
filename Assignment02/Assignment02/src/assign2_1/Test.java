package assign2_1;

public class Test {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice();
		invoice.displayData();
		invoice.acceptData();
		invoice.displayData();
		invoice.setPartNo("SS15");
		invoice.setPartQuantity(75);
		invoice.setPricePerPart(100);
		invoice.displayData();
		invoice.getPartDescript();
		invoice.getPartNo();
		invoice.getPartQuantity();
		invoice.getPricePerPart();

	}

}
