import java.util.Scanner;

public class Test_4_IFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 단일 if문
//		System.out.println("문장1");
//		int num = 0;
//		if(3==13){
//			 num=10;
//			System.out.println("문장2");
//			System.out.println("문장2-1");
//		}
//		System.out.println(num);
//		System.out.println("문장3");

		// 2. if~else문
//		System.out.println("문장1");
//		int num =0; //변수선언
//		if(3!=3) {
//			num=3; //초기화
//			System.out.println("참");
//			System.out.println("참2");
//			System.out.println(num);
//		}
//		else {
//			System.out.println(num);
//			System.out.println("거짓");
//			System.out.println("거짓2");
//		}
//		System.out.println(num);
//		System.out.println("문장3");

		// 3.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		String a = scan.next();
//		int a1 = Integer.parseInt(a);
//		String result = "홀수";
//		if (a1 % 2 == 0) {
//			result = "짝수";
//		System.out.println("숫자"+a1+"은(는) "+result+" 입니다.");
//		}else {
//		System.out.println("숫자"+a1+"은(는) "+result+" 입니다.");
//		}
//		scan.close();
//		
		int num = 6;
		String result = "홀수";
		if (num % 2 == 0) {
			result = "짝수";
			System.out.println(num+"은(는)"+result);
		} else {
			System.out.println(num+"은(는)"+result);
		}
		// p.66 단일 if문 사용하기
//		int n = 10;
//		if(n>5) {
//			System.out.println(n+"은(는) 5보다 크다");
//		}
//		System.err.println("프로그램종료");

//		System.out.println("점수를 입력하세요");
//		Scanner scan =new Scanner(System.in);
//		int num = scan.nextInt();
//		if(num>=90) {
//			System.out.println("A");
//		} else if(num >=80) {
//			System.out.println("B");
//		} else if(num >=70) {
//			System.out.println("C");
//		} else {
//			System.out.println("F");
//		}
//		scan.close();
//		System.out.println("축하합니다.");
//
//		char ch = 'Z';
//		String result;
//		if ( 'a' <= ch && ch <= 'z') {
//			result = "는 소문자 입니다";
//			System.out.println("입력하신"+ch+ result);
//		} 
//		else  {
//			result = "는 대문자 입니다";
//			System.out.println("입력하신"+ch+ result);
//			}
		// 1. 문자열 비교 new를 사용
//		String s = new String("Hello");
//		String s2 = new String("Hello");
//		System.out.println(s == s2); // false
//		boolean result1 = s.equals(s2); // 내용비교
//		System.out.println(result1); // true
//
//		// 2.
//		String n = "hello"; // hello라는 글자가 담겨있는 주소가 담겨져있음
//		String n2 = "hello"; // n과n2 주소가 똑같음
//		System.out.println(n == n2); // true
//		System.out.println(n.equals(n2)); // 내용비교
	}

}
