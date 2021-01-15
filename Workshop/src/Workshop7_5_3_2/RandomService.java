package Workshop7_5_3_2;

import java.util.ArrayList;

public class RandomService {

	ArrayList<Integer> list1; // 얘는 null값으로 채워짐, 직접 new를 하던가 생성자 안에서
	ArrayList<Integer> list2;

	public RandomService() {
		super();
		// TODO Auto-generated constructor stub
		list1 = new ArrayList<Integer>(); // 얘가 makeRandom 밑으로 들어가면 값을 두번 받게됨
		list2 = new ArrayList<Integer>();
	}

	public void makeRandomInt() {
		list1 = new ArrayList<>();
		list2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list1.add((int) (Math.random() * 10));
			list2.add((int) (Math.random() * 10));
		}
	}

	public void printArrayList() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(list1.get(i) + "/" + list2.get(i));
				System.out.println(list1.get(i) / list2.get(i));
			} catch (Exception e) {
				System.out.println("분모가 0입니다");
			}
		}
	}
}
