package Workshop7_2;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeList makelist = new MakeList();
		int size = 10;
		makelist.makeArrayList(size);
		
		double avg = makelist.getAverage();
		System.out.println("평균값 :"+avg);
	}

}
