import java.util.Scanner;

public class Test_5_Scanner_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("1.이름을 입력하세요.");
		String name = scan.next();
		System.out.println("2.나이를 입력하세요.");
		String age = scan.next();

		System.out.println(name + '\t' + age);

		scan.close(); // 7번으로 열었던 것을 닫아줌
	}
}