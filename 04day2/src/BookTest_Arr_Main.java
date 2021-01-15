
public class BookTest_Arr_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//book이라는 변수를 만들것임
		//1.배열선언  //bookList는 배열을 가리키는 변수임
		Book [] bookList =  new Book [3]; //Book을 담을 수 있는 배열 3개를 만듦
		//2.배열에 담을 Book 객체 생성, 객체 별 값 설정
		Book book1 = new Book();//객체 생성을 했으나 초기값이 없음(실제론 기본값 있음)
		book1.title="홍길동전";
		book1.price=10000;  //book1번의 객체에 대한 저장 완료
		Book book2 = new Book();
		book2.title="삼국지";
		book2.price=2000;
		Book book3 = new Book();
		book3.title="서태후";
		book3.price=32000;
		//3.배열에 객체 담기
		bookList[0]=book1; //book1을 0번에 넣어줌
		bookList[1]=book2;
		bookList[2]=book3;
		//4. 사용 전 배열 갯수 확인
		System.out.println(bookList.length); //배열의 갯수 확인
		for (int i = 0; i < bookList.length; i++) {
			bookList[i].printInfo();
		}
	}
}
