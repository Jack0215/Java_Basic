package Workshop7_5_3_1;

import java.util.ArrayList;

public class RandomService {
	// 멤버변수로 변경
	ArrayList<Integer> list1; // 초기값은 null
	ArrayList<Integer> list2;

	// 출력문을 쓰면 아무값도 리턴이 되면 안됨, 무조건 VOID다
	public void makeRandomInt() {
		list1 = new ArrayList<>();
		list2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list1.add((int) (Math.random() * 10));
			list2.add((int) (Math.random() * 10));
		}
	}
	// makeRandomInt 끝

	// list1,2는 이미 들어가서 인자 필요없음
	public void printArrayList() {

		for (int i = 0; i < 10; i++) {
			try {
				System.out.print(list1.get(i) + "/" + list2.get(i) + " ");
				System.out.println(list1.get(i) / list2.get(i));

			} catch (Exception e) {
				System.out.println("분모가 0입니다");
			}
		}
	}
}
