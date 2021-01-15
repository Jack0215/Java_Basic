
public class Test_2_operator_test {

	public static void main(String[] args) {

//		int x = 10;
//		int x2 = x;
//		x2 += x; //x2= x2+x;
//		System.out.println(x2);
//		x2 -= x; //x2= x2-x;
//		System.out.println(x2);
//		x2 *=x; //x2= x2*x;
//		System.out.println(x2);
//		x2 /=x; //x2= x2/x;
//		System.out.println(x2);
//		x2 %= x; //x2= x2/x의 나머지 값
//		System.out.println(x2);

		// 3.증감연산자(증가/감소 연산자)
//		int k = 10;
//		++k; //전치
//		System.out.println(k);
//		k++; // 후치
//		System.out.println(k);
//		
//		int k1 = 10;
//		int a = ++k1; //k1=k1+1, int a=k1
//		System.out.println(a);
//		int b = k1++;
//		System.out.println(b+"  "+k);
//		
//		int k2 =10;
//		int a1 = --k2;
//		System.out.println(a1);
//		int b1 = k2--;
//		System.out.println(b1+"  "+k2);
//		
//		
//		//4. 비교연산자 ==> 실행결과는 논리값
//		int xyz=5;
//		int xyz2=3;
//		boolean result = xyz == xyz2;
//		System.out.println(xyz == xyz2); //값이 같은가? 다르다.(true)
//		System.out.println(xyz != xyz2);
//		System.out.println(xyz > xyz2);
//		System.out.println(xyz >= xyz2);
//		System.out.println(xyz < xyz2);
//		System.out.println(xyz <= xyz2);
//		System.out.println(result);
//		
//		System.out.println( 3==4 && 4>3);
//		System.out.println(! true);
//		System.out.println(! false);
//		System.out.println(true || true);
//		System.out.println(true || false);
//		System.out.println(false || true);
//		System.out.println(false || false);
//		
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);

		int x = 10;
		int y = 15;
		System.out.println(x > 5 && x < 25); // t
		System.out.println(x > 8 && y < 10); // f

		System.out.println(x > 15 || x < 25); // t
		System.out.println(x > 8 || y < 25); // t
	}
}
