package Workshop4_8;

public class CateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe cafe = new Cafe();
		cafe.setCoffeeList(new Coffee("아메리카노", 4000));
		cafe.setCoffeeList(new Coffee("카라멜마끼아또", 6500));
		cafe.setCoffeeList(new Coffee("블루베리스무디", 7000));
		cafe.setCoffeeList(new Coffee("디카페인아메리카노", 7000));
		Coffee[]arr = cafe.getCoffeeList();
		for (Coffee coffee : arr) {
			System.out.println(coffee);
		}
		
		System.out.println("Coffee가격의 합:"+cafe.totalPrice());
	}
}
