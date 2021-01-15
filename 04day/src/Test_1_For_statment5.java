
public class Test_1_For_statment5 {

	public static void main(String[] args) {
		int sum = 0;
		for(int n=0; n<=100; n+=3 ) {
			sum+=n;
//          3의 배수만 출력하고 싶을때
//			if(n % 3 == 0)
//				System.out.println(n);
		} System.out.println(sum);
	}
}

//1부터 100까지 3의 배수만 더해서 값을 출력하라
