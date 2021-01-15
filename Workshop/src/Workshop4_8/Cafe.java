package Workshop4_8;

public class Cafe {
	Coffee[] CoffeeList = new Coffee[4];
	// new카페하는순간 배열10개, 인덱스 0으로 됨
	int index = 0;
	// setcoffee함수가 10개까지 추가할 수 있게
	// totalprice는 ㅋ커피배열 싹 뒤져서 가격만 합
	// main쪽에서는 커피 생성, set, 커피 종류 9~10개 넘겨주고
	// gettotal가격만 가져오면됨

	public Cafe() {
		super();
	}
	public Coffee[] getCoffeeList() {
		return CoffeeList;
	}
	public void setCoffeeList(Coffee coffee) {
		if (index < 10) {
			CoffeeList[index] = coffee;
			index = index + 1;
		} else {
			System.out.println("정보추가불가");
		}
	}
	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total = total + CoffeeList[i].getPrice();
		}
		return total;
	}
}
