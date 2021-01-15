package Workshop7_5_2;
import java.util.ArrayList;
public class ListTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service sc = new Service();
		ArrayList<Integer> list1 = sc.makeRandomInt();
		ArrayList<Integer> list2 = sc.makeRandomInt();		
		sc.RandomService(list1, list2);		
	}
}


