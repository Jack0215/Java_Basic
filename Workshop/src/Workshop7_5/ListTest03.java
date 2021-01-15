package Workshop7_5;
import java.util.ArrayList;
import java.util.List;
import org.omg.CORBA.UserException;

import Workshop7_4.Ship;
public class ListTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		for(int i=0; i<10; i++) {
//		int num = ((int)((Math.random()*10)));
//		list1.add(num);
//		}
//		for(int i=0; i<10; i++) {
//			int num = ((int)((Math.random()*10)));
//			list2.add(num);
//			}

		for (int i = 0; i < 10; i++) {
			int num1 = ((int) ((Math.random() * 10)));
			int num2 = ((int) ((Math.random() * 10)));
			list1.add(num1);
			list2.add(num2);
		}
		for (int i = 0; i < list1.size(); i++) {
			try {
				int result = list1.get(i) / list2.get(i);
				System.out.println(list1.get(i) + "/" + list2.get(i) + "\t" + result);
			} catch (ArithmeticException e) {
				System.out.println("분모가 0입니다.");
			}
		}
	}
}