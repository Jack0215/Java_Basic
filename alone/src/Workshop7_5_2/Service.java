package Workshop7_5_2;

import java.util.ArrayList;

public class Service {
	public void RandomService(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for (int i = 0; i < 10; i++) {
			try {
				int result = list1.get(i) / list2.get(i);
				System.out.println(list1.get(i) + "/" + list2.get(i) + "\t" + result);
			} catch (ArithmeticException e) {
				System.out.println("분모가 0입니다.");
			}
		}
	}
	public ArrayList<Integer> makeRandomInt() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 10));
		}
		return list;
	}
}
