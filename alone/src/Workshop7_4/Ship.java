package Workshop7_4;

public abstract class Ship {
	private String shipName;
	private int fuelTank;
	public abstract void sail(int dist);
	public abstract void refuel(int fuel);
	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ship(String shipName, int fuelTank) {
		super();
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}
	@Override
	public String toString() {
		return shipName+"\t"+"\t"+fuelTank;
		
	}
	
	 
}
