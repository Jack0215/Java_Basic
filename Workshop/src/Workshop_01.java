import java.util.Scanner;

public class Workshop_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//	//1번문제	
//	String s1 = "1";
//	String s2 = "2";
//	boolean bnx = false;
//	char c1 ='A';
//	char c2 ='B';
//	char c3='1';
//	char c4='2';
//	int inx = 2;
//	int c5 = c1+c2;
//	int c6 = c3+inx;
//	System.out.println(s1+s2);
//	System.out.println(! bnx);
//	System.out.println(c5);
//	System.out.println(c6);
//	System.out.println(c3+c4);
	
//	//2번문제
//		int num = 456;
//		int result = (num/10)*10;
//		System.out.println(result);
	//3번문제
//		char ch = 'z';
//		//boolean b = (ch > 'z' || ch > 'Z' );
//		boolean b = ( ch >= 'a' && ch <= 'z') || ('A' <= ch && ch <='Z');
//		boolean bb = ( ch >= 'A' && ch <= 'Z');
//		System.out.println(b);
//		System.out.println(bb);
		
	//4번문제
//		int fahrenheit = 100;
//		float celcius = 5/9f * (fahrenheit-32);
//		System.out.println("Fahrenheit:"+fahrenheit);
//		System.out.println("Celcius:"+celcius);
	//5번문제
//		byte a = 10;
//		byte b = 20; 
//		byte c = (byte)(a + b);
//		char ch = 'A';
//		ch = (char)(ch+2);
//		float f = 3/2f;
//		        // 3/2해서 f의 1.5
//		float f2 = 0.1f;  //f의 0.1과 d의 0.1을 비교해서 같으면 t
//		double d = 0.1;
//		boolean result = (float) d == f2;
//		
//		System.out.println("c="+c);
//		//6번문제
//		int i =5;
//		i%=2;
//		String result = (i % 2 == 0) ? "짝수":"홀수";
//		System.out.println("숫자"+i+"은(는)"+result+"입니다.");
		//3과5의 배수
//		int i = 30;
//		String result = (i % 3 == 0 && i % 5 == 0)? " 3과 5의 최소공배수이다.":" 3과 5의 최소공배수가 아니다.";
//		System.out.println("입력한 값 "+i+"는(은)"+result);
		//7번문제
//		Scanner	scan  = new Scanner(System.in);
//		System.out.println("1.이름을 입력하세요.");
//		String name = scan.next();
//		System.out.println("2.나이를 입력하세요.");
//		String age = scan.next();
//		
//		System.out.println(name+'\t'+age);
//		
//		scan.close();
		//8번문제
//		Scanner	scan  = new Scanner(System.in);
//		System.out.println("1.정수 입력하세요.");
//		String a = scan.next();
//		System.out.println("2.정수 입력하세요.");
//		String b = scan.next();
//		int a1 = Integer.parseInt(a);
//		int b1 = Integer.parseInt(b);
//		System.out.println("정수 "+a1+" 과 "+"정수 "+b1+" 의 합계:"+(a1+b1));
//		scan.close();
		//간단하게=--------------------------------------
//		Scanner	scan  = new Scanner(System.in);
//		System.out.println("1.정수 입력하세요.");
//		String num_1 = scan.next();
//		System.out.println("2.정수 입력하세요.");	
//		int intnum1=Integer.parseInt(num_1);
//		int intnum2=scan.nextInt();
//		int result = intnum1+intnum2;
//		System.out.println("intnum1 \t intnum2\t 최대값");
//		System.out.println("======================================");
//		System.out.println(intnum1+"                  "+intnum2+"              "+result);
//		scan.close();
		
		
		//9번문제
//		 Scanner scan = new Scanner(System.in);
//		 System.out.println("1.정수 입력하세요.");
//		 String a = scan.next();
//		 System.out.println("2.정수 입력하세요.");
//		 String b = scan.next();
//		 int a1 = Integer.parseInt(a);
//		 int b1 = Integer.parseInt(b);
//		 int max = (a1 >  b1)? a1:b1;
//		 System.out.println("정수"+a1+" 과 "+"정수 "+b1+"중에서 최대값 :"+max);
//		 scan.close();
		 
		 //10번문제
//		 Scanner scan = new Scanner(System.in);
//		 System.out.println("주소를 입력하시오");
//		 String addr = scan.next();
//		 String addr2 = scan.next();
//		 String addr3 = scan.next();
//		 System.out.printf("도명: %s \n시명: %s \n구명: %s", addr,addr2,addr3);
		
		//11번문제 (한 줄로 받아서 단어를 3개로 쪼갬)
//		Scanner scan = new Scanner(System.in);
//		 System.out.println("주소를 입력하시오");
//		 String mesg = scan.nextLine(); //scan 할 것을 한 줄로 표시할 수 있게
//		 System.out.printf("문자 갯수(공백포함):"+mesg.length());
//		 System.out.println("단어 갯수:"+mesg.split(" ").length); // 띄어쓰기 된 것을 잘라내서 잘라낸 거싱 총 몇개인지 표시
//		 scan.close();
		
		//12번문제(String 클래스로 할 수 있음)
//		String mesg = "heLLO"; 
//		System.out.println("대문자로: " + mesg.toUpperCase());
//		System.out.println("소문자로: " + mesg.toLowerCase());
//		System.out.println("문자열길이: " + mesg.length());
//		System.out.println("1번 째 위치 문자: " + mesg.charAt(1));
//		System.out.println("문자열 연결: " + mesg.concat(" ~~"));
//		System.out.println("h 문자열 포함여부: " + mesg.contains("h"));
//		System.out.println("he 문자열 포함여부: " + mesg.contains("he"));
//		System.out.println("hw 문자열 포함여부: " + mesg.contains("hw"));
//		System.out.println("h 문자로 끝나는지 여부: " + mesg.endsWith("h"));
//		System.out.println("h 문자로 시작하는지 여부: " + mesg.startsWith("h"));
//		System.out.println("O 문자를 X 문자로 변경: " + mesg.replace("O","X"));
//		System.out.println("heLLO 문자열인지 비교: " + mesg.equals("heLLO"));
//		System.out.println("HELLO 문자열인지 비교(대소무낮 무시): " + mesg. equalsIgnoreCase("heLLO"));
//		
		
	}
}