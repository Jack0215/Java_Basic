package Workshop7_4;
import java.util.ArrayList;
public class ShipTest {
	public static void main(String[] args) {
		ArrayList<Ship>list=new ArrayList<Ship>(); 		
		Boat boat = new Boat ("Boat01", 500);
		Cruise cruise = new Cruise("Cruise01", 500);		
		//ArrayList에 두 선반 add(import java.util.ArrayList;)
		list.add(cruise);
		list.add(boat);		
		//for 두 선박의 이름과 현재 연료량 출력(arraylist 입력하면 9행은 0, 10행은 1이 됨)
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}		
		//두 선박에 sail함수 호출 .sail(10)
		for(int j=0; j<list.size(); j++) {
		Ship ship = list.get(j);
		ship.sail(10);
		System.out.println(ship.getShipName() +"\t"+ ship.getFuelTank());
		}
		//두 선박의 이름과 현재 연료량 출력하여 서로 연료량이 달라졌는지 확인
		boat.sail(10);		cruise.sail(10);
		System.out.println(boat);		System.out.println(cruise);		
		//for 이용 두 선박을 검사하여 boat면 .refuel(20), cruise면 refuel(30)설정
		for(int k=0; k<list.size(); k++){
			Ship ship = list.get(k);
			if(ship instanceof Boat) {
				ship.refuel(20);
			}else {
				ship.refuel(30);
			} System.out.println(ship.getShipName()+"\t"+ship.getFuelTank());} } }
	

