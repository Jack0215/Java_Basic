import java.util.Scanner;

public class Workshop_02 {
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//1-1번
//		int inx = 15;
//		if(inx > 10 && inx <20) 
//			{
//			System.out.println("true");
//			}
//		//1-2번
//		char ch = ' ';
//		if(ch != ' ' || ch != '\t'){
//		System.out.println("true");}
//		
//		//1-3번
//		char ch2 ='x';
//		if(ch2 == 'x' || ch2 =='X')
//		{
//		System.out.println("true");
//		}		
//		//1-4번
//		
//		//4번
//		int i;
//		int j;
//		int k;
//		for( i=1; i<6; i++) {
//			for( j=1; j<=6; j++) {
//				for (k=1; k<=6; k++) { 
//				if((i+j+k)==6) //if문 걸어서 두개 더했을 때 6이면 출력하게끔
//				System.out.println(i+ "+" + j + "+" + k +"="+ (i+j+k));
//				}
//			}
//        	} //end for2
		
		//7번
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("한 자리 정수값을 입력하시오");
//		int a = scan.nextInt();
//	//100이면 +가 안나오고 100이 아니면 +가 나옴
//		int sum=0;
//		for(int i=1; i<=20; i++) {
//			sum+=a*i;
//			if(a*i!=100) {
//				
//				System.out.print(a*i+"+");
//				}
//			else if(a*i ==100) {
//				System.out.print(a*i);
//			}
//			
//			} System.out.print("="+sum);
//			 scan.close();
//		 
		
		//while문을 계속 반복하면서 b값이 a값보다 작으면 다시 입력, b값이 a값보다 크면 break;
//		Scanner scan = new Scanner(System.in);
		
//		System.out.println("a의 값:");
//		int a = scan.nextInt();
//		System.out.println("b의 값:");
//		int b = scan.nextInt();
//
//		while( a > b) {
//			System.out.println("a보다 큰 값을 입력하세요!");
//			if ( a < b) {
//				System.out.println("b-a는"+(b-a)+"입니다.");
//			}
//					break;
//		}
		//문제11
//		Scanner scan = new Scanner(System.in);
//		System.out.println("a의 값:");
//		int a = scan.nextInt();
//		int b = 0;
//		while(true) {
//			System.out.println("b의 값:");
//			b = scan.nextInt();
//			if(b>a)
//				break;
//			System.out.println("a보다 큰 값을 입력하세요!");
//		}
//		System.out.println("b-a는"+(b-a)+"입니다.");
//		scan.close();
//		}
		
		//12문제
		//나누기 10을 카운팅하면 자릿수가 나옴
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수 구하기");
		int n;
		do {
			System.out.println("양수 정수 값 입력:");
			n=scan.nextInt();
		} while( n <= 0);
		int count = 0;
		while ( n > 0) {
			n /= 10;
			count ++;
		}
		System.out.println("그 수는" + count + "자리입니다.");
		scan.close();
	} 
}
