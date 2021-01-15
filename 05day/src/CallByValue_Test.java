
public class CallByValue_Test {
	public void change(int num) { //CallByValue:
		//참조변수가 아니면 모두 인자변수에 복사됨, pdt 변수들
		num=100;
		System.out.println("change num "+num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		System.out.println("호출 전 "+num);
		CallByValue_Test test = new CallByValue_Test();
		test.change(num);
		System.out.println("호출 후 "+num);
	}
}
