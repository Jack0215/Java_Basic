
public class Test {

//	public static void main(String[] args) {
//	 ExTest test= new ExTest();
//	 test.a(10, 20); //a함수 호출
//	 
//	}
//}


//트라이캐치 지우고 throws 처리 할 경우 메인에서 트라이캐치 해줘야함
	public static void main(String[] args) {
	 ExTest test= new ExTest();
	 try {
	 test.a(1, 0); //a함수 호출
	 } catch (Exception e) {
		 System.out.println(e.getMessage());
		 e.printStackTrace();
		 //만약 print 쓸려면 형변형 해줘야함
		 UserException e1 = (UserException)e;
		 e1.print();
	 }
	 System.out.println();
	} 
}


