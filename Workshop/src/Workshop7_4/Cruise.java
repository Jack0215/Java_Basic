package Workshop7_4;
public class Cruise extends Ship {
	public String shipName;
	public int fuelTank;
	public Cruise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void sail(int dist) {
		// TODO Auto-generated method stub
		setFuelTank(getFuelTank()-(dist*13));
	}
	@Override
	public void refuel(int fuel) {
		// TODO Auto-generated method stub
		setFuelTank(getFuelTank()+(fuel*8));
	}

}
