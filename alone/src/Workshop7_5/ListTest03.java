package Workshop7_5;

import java.util.ArrayList;

public class ListTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++ ) {
		int num1 = (int)(Math.random()*10);
		int num2 =(int)(Math.random()*10);
		list1.add(num1);
		list2.add(num2);
		}
		for(int j = 0; j<list1.size(); j++) {
			try {
				int sum = list1.get(j)/list2.get(j);
				System.out.println(list1.get(j)+"/"+list2.get(j)+"\t"+sum);
			} catch(ArithmeticException e) {
				System.out.println("분모가 0입니다.");
			}
		}
	}
}
