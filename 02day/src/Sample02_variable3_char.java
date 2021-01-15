
public class Sample02_variable3_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// /t=tab(4칸이동), /'=작은 따옴표 출력, /"큰 따옴표 출력, // 슬래쉬 출력
		//char c ='A';
		//char c2 ='홍';
		//char c3 ='\uD64D';
		//System.out.println(c+" "+c2+""+c3);
		//escape문자
		//System.out.println("aaa\tbbb");
		//System.out.println("aaa\nbbb");
		//System.out.println("aaa\'bbb");
		//System.out.println("aaa\"bbb");
		//System.out.println("aaa\\bbb");
		
		int c = 10;
		float f = 20.3f;
		double d = c + f;
		System.out.println(d);
		
		short s = 10;
		short s1 = 20;
		short s2 = (short)(s + s1);  //해결법 : short->를 int로 or 명시적 형변환 : int를 지정 형으로 변환
		System.out.println(s2);
		
		//int n = 10;
		//short n2 = (short)n;
		//System.out.println(n2);
		
		//short x = 10;
		//short x2 = 20;
		//short x3 =(short) (x + x2);
		//System.out.println(x3);
	

		//데이터 타입 변경(자동으로 변경된다)
		// 1. byte ->short->int->long->float->double
		
		byte b = 10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		float b5 = b4;
		double b6 = b5;
		
		
		//2.char --> int
		char n = 'A';
		int n2 = n+1;
		System.out.println(n2);

		//3.int보다 작은 타입의 연산결과는 int로 출력된다
		short x = 10;
		short x2 = 20;
		int x3 = x + x2;
		
		
		//4. 문자열과 + 문자열이 아닌 데이터 => 연결된 문자열로 반환
		System.out.println("10"+1+2+3);
		System.out.println(1+2+3+"10");
		//System.out.println("10"-1); 에러남
		//Integer.parseInt(k)문자 10을 정수 10으로 변환한다.
		
		//"10" ---->1-
		//자바스크립트 : Number.parseInt("10")==>10
		//자바: Integer.parseInt("10") ===>10
		String k ="10";
		System.out.println(k+20); //1020
		int k2 = Integer.parseInt(k); //문자->정수 int변환
		System.out.println(k2+20);
		
		//10==>"10"
		//자바스크립트:toString()
		//자바: String.valueOf(10)==>"10"
		//자바: String.valueOf(3.14)==>"3.14"
		//자바: String.valueOf(true)==>"true"
		System.out.println(String.valueOf(10)+10); //문자10과 숫자 10이 붙음

		//5. 작은타입과 큰타입이 연산==> 큰타입
		int p =100;
		double p2 = 3.14;
		double p3=p+p2;
		
		//상수: 값 변경 불가, 전부 대문자로
		//Byte.MIN_VALUE, Byte.MAX_VALUE
		final int SIZE=100;
		//SIZE=200; //값 변경불가
		System.out.println(SIZE);

		int num = 10;
		System.out.println(num+SIZE);
		num=20;
		System.out.println(num*SIZE);
	}
}
