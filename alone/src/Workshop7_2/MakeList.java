package Workshop7_2;

import java.util.ArrayList;

public class MakeList {
	public MakeList() {}

	ArrayList<Integer> list = new ArrayList<Integer>();

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
			sum += list.get(i).intValue();
		}
		result = sum / list.size();
		return result;
	}

	public ArrayList<Integer> getList() {
		return list;
	}
}
