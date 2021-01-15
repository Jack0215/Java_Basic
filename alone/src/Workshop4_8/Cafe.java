package Workshop4_8;

public class Cafe {

	Coffee[] CoffeeList = new Coffee[4];
	int index = 0;
	public int totalPrice() {
		int sum = 0;
		for (int i = 0; i <index; i++) {
			sum += CoffeeList[i].getPrice();
		}
		return sum;
	}
	public void setCoffee(Coffee coffee) {
		if(index <10) {
			CoffeeList[index]=coffee;
			index=index+1;
		} else {
			System.out.println("더 이상 저장할 수 없습니다.");
		}
	}
	public Coffee[] getCoffeeList() {
		return CoffeeList;
	}
}
