
public class workshop_00 {
	public static void main(String[] args) {
		//이름(s),나이(int),주소(s)
		String name ="홍길동";
		int age = 20;
		String address="서울";
		System.out.println("이름은 "+name);
		System.out.println("나이는 "+age+" 이고 주소는 "+address);
		
		System.out.print("이름은"+name);
		System.out.print("\n나이는 "+age+" 이고 주소는 "+address);
		
		System.out.printf("\n이름은%s \n나이는 %d 이고 주소는 %s", name, age, address);
		
		
		//2번문제: 주민번호 13자리를 정수형 변수에 담아서 화면에 출력
		long ssn = 9202151057834l;
		System.out.println("\n나의 주민번호:"+ssn);
		
		//3번문제
		
		int n = 10;
		int n2 = 20;
		
		int temp = n;  //n과 n2자리 변경해도 결과 값 동일
		n = n2;   
		n2 = temp;
		
		System.out.println("n값은" +n);
		System.out.println("n2값은"+n2);
		
		
	}
}
