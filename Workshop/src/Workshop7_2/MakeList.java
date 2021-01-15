package Workshop7_2;

import java.util.ArrayList;
//메이크어레이에 몇개의 방을 만들지 직접 배열 크기를 입력해줄것. ex10을 받아서 add를 10번
//10~19까지의 숫자를 랜덤하게 넣어줌
// 방에있는거 꺼내와서 평균
// 리스트를 받아와서

// 메이크어레이리스트 : 10~19 랜덤숫자 생성 후 add
// getaverage
public class MakeList {
	ArrayList<Integer> list = new ArrayList<Integer>();

	public MakeList() {	}

	public void makeArrayList(int size) {
		for (int i = 0; i < size; i++) {
			int num = (int) ((Math.random() * 10) + 10);
			System.out.println(num);
			list.add(num);
		}
	}

	public double getAverage() {
		double result = 0;
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).intValue(); // .int
		}

		result = sum / list.size();
		return result;
	}

	public ArrayList<Integer> getList() {
		return list;
	}
}
