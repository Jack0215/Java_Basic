package Workshop4_8;

public class CafeTest {
	public static void main(String[] args) {
	
		Cafe cafe = new Cafe();
		cafe.setCoffee(new Coffee("아메리카노", 4000));
		cafe.setCoffee(new Coffee("콜드블루", 5000));
		cafe.setCoffee(new Coffee("두유", 6000));
		
		Coffee[] arr = cafe.getCoffeeList();
		for (Coffee coffee : arr) {
			System.out.println(coffee);
		}
	System.out.println("Coffee가격의 합:"+cafe.totalPrice());
	}
	
	
}
