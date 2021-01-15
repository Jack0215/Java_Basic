
public class CallByValue_Test2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] num = {1, 2, 3, 4};
		System.out.println("원래 배열");
		for (int i : num) {
			System.out.println(i);
		}
		change(num);
		System.out.println("수정된 배열");
		for (int i : num) {
			System.out.println(i);
		}
	}//end main
	public static void change(int[] num) {
		num[0]=100;
	}
}