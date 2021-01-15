package Workshop7_5_3;

import java.util.ArrayList;

public class RandomService {

	ArrayList<Integer> list1;
	ArrayList<Integer> list2;
	
	public void makeRandomInt() {
		list1 = new ArrayList<>();
		list2 = new ArrayList<>();
		for(int i=0; i<10; i++) {
			list1.add((int)(Math.random()*10));
			list2.add((int)(Math.random()*10));
		}
	}
	
	public void printArrayList() {
		for(int i=0; i<10; i++) {
			try {
				System.out.println(list1.get(i)+"/"+list2.get(i)+"\t"+ (list1.get(i)/list2.get(i)));
			}catch (ArithmeticException e) {
				System.out.println("분모가 0입니다.");
			}
		}
	}
}
