
public class Ex05_8 {

	public static void change(int[] num) {
		num[0]=100;
	}
	
	public static void main(String[] args) {
		int []num = { 1,2,3,4};
		System.out.println("원래 배열");
		for(int i :num) {
			System.out.println(i);
			
		}
change(num);

System.out.println("수정된 배열");
for (int i : num) {
	System.out.println(i);
}


	}

}
