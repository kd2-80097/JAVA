package drivingCostCalculator;

public class TestCalaculator {

	public static void main(String[] args) {

		DrivingCost drivingcost = new DrivingCost();
		
		drivingcost.acceptData();
		drivingcost.calculateDrivingCostPerDay();
	}

}
