
public class Ex09_5_3 {

	public static void a() throws Exception {
		b(); 
	}

	public static void b() throws Exception {
									//Exception 으로 하나만 바꿀 경우 성립이 안됨 
		String name = null;
		System.out.println(name.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		try {
			a();
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 에러발생2");
		}
		System.out.println("프로그램 정상 종료");
	}
}
