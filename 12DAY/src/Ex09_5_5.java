
public class Ex09_5_5 {

	public static void a() throws Exception {
		b(); // b함수에서 발생 throws되서 a로 넘어감 //b를 찾아감
	}

	public static void b() throws Exception {
									//Exception 으로 하나만 바꿀 경우 성립이 안됨 
		int num = 10;
		if(num==10){
			throw new NullPointerException("널포인트익셉션발생");//메세지에 21행 캐치에서 잡힘
		} //try 캐치로 안잡고 a로감 a는 메인(익셉션)으로감
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		try {
			a();  //a호출 -> a를찾아감
		} catch (Exception e) { 
			System.out.println(e.getMessage() + " 에러발생2"); //여기선 12행의 메세지가 출력됨
		}
		System.out.println("프로그램 정상 종료");
	}
}
