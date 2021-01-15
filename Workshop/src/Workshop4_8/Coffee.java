package Workshop4_8;

public class Coffee {
	private String name;
	private int price;
	
	Coffee() {}
	public Coffee(String name, int price) {
		this.name=name;
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return name+price;
	}
}
