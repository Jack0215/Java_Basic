
public class Test_6_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수 입력하시오");
//		int num = 90;
//		switch (num) {
//		case 10:
//			System.out.println("10");// break; //케이스는 값과 딱 일치하는지 안하는지만 판단함
//		case 20:
//			System.out.println("20");// break;
//		case 30:
//			System.out.println("30");// break;
//		case 40:
//			System.out.println("40");// break;
//		default:
//			System.out.println("default");
//		}
//		System.out.println("프로그램종료");

//		char xxx2 = 'F';
//		switch (xxx2) {
//		case 'A' :
//			System.out.println("A");
//			break;
//		case 'B' :
//			System.out.println("A2");
//			break;
//		case 'C' :
//			System.out.println("A3");
//			break;
//		case 'D' :
//			System.out.println("A4");
//			break;
//		default:
//			System.out.println("default");
//			System.out.println("문장3");

		char xxx2 = 'A';
		if (xxx2 == 'A') {
			System.out.println("A");
		} else if (xxx2 == 'B') {
			System.out.println("A2");
		} else if (xxx2 == 'C') {
			System.out.println("A3");
		} else if (xxx2 == 'D') {
			System.out.println("A4");
		} else {
			System.out.println("default");
			System.out.println("문장3");
		}

	}
}
