package Workshop7_4;
public class Boat extends Ship {
		public Boat() {
		super();
	}
	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);		
	}
	//부모의 연료탱크량 변수 - 받아온 디스턴스*10?
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
	public String shipName;
	public int fuelTank;
		
}
