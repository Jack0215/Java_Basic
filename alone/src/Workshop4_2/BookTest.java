package Workshop4_2;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("SQL Plus",50000,5.0);
		Book book2 = new Book("Java 2.0",40000,3.0);
		Book book3 = new Book("JSP Servlet",60000,6.0);
		Book []	book = new Book[3];
		book[0]=book1;
		book[1]=book2;
		book[2]=book3;
		System.out.println("bookName \t bookPrice(원)  \t  bookDiscountRate(%)");
		System.out.println(book1.getBookname()+"\t"+book1.getBookprice()+"\t"+book1.getBookDiscountRate()+"\t"+book1.getDiscountPrice());
	}

}
