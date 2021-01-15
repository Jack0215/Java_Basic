package Workshop7_4;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ship>list=new ArrayList<Ship>();
		Boat boat = new Boat("Boat", 500);
		Cruise cruise = new Cruise("Cruise", 400);
		
		list.add(cruise);
		list.add(boat);
		System.out.println("shipName"+"\t"+"fuelTank");
		System.out.println("-----------------------------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n"+"10 운항");
		System.out.println("shipName"+"\t"+"fuelTank");
		System.out.println("-----------------------------");
		for(int j=0; j<list.size(); j++) {
			Ship ship = list.get(j);
			ship.sail(10);
			System.out.println(ship.getShipName()+"\t"+"\t"+ship.getFuelTank());
		}
		System.out.println("\n"+"50 주유");
		System.out.println("shipName"+"\t"+"fuelTank");
		System.out.println("-----------------------------");
		for(int k=0; k<list.size(); k++) {
			Ship ship = list.get(k);
			ship.refuel(50);
			System.out.println(ship.getShipName()+"\t"+"\t"+ship.getFuelTank());
		}
		System.out.println("\n"+"Boat는20 주유, Cruise는 30주유");
		System.out.println("shipName"+"\t"+"fuelTank");
		System.out.println("-----------------------------");
		for(int l=0; l<list.size(); l++) {
			Ship ship = list.get(l);
			if (ship instanceof Boat) {
				ship.refuel(20);
			} else {
				ship.refuel(30);
			}
			System.out.println(ship.getShipName()+"\t"+"\t"+ship.getFuelTank());
		}
	}
}
