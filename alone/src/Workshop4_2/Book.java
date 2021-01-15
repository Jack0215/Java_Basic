package Workshop4_2;

public class Book {
	private String bookname;
	private int bookprice;
	private double bookDiscountRate;
	
	public Book() {}
	public Book(String bookname, int bookprice, double bookDiscountRate ) {
		this.bookname=bookname;
		this.bookprice=bookprice;
		this.bookDiscountRate=bookDiscountRate;
	}
	public double getDiscountBookPrice() {
		return this.bookprice*(1-(this.bookDiscountRate/100));
	}
	public double getDiscountPrice() {
		return this.bookprice-(bookprice*(bookDiscountRate/100));
	}
	public String setBookname() {
		return bookname;
	}
	public void getBookname(String bookname) {
		this.bookname=bookname;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
}
