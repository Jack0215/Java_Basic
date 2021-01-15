package Workshop7_4;

public class Boat extends Ship{
	
	

	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sail(int dist) {
		// TODO Auto-generated method stub
		setFuelTank(getFuelTank()-(dist*10));
	}

	@Override
	public void refuel(int fuel) {
		// TODO Auto-generated method stub
		setFuelTank(getFuelTank()+(fuel*10));
	}

	
}
