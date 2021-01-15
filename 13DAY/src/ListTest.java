import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("홍길동1");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동2");
		list.add("홍길동3");
		
		List<String> list2= 								//new Array하지 않고 직접 값을 입력해서 생성
				Arrays.asList("홍길동","이순신","세종","문종");
		System.out.println(list);
		
		System.out.println("길이(크기)"+list.size());
		System.out.println("값 포함여부"+list.contains("세종"));
		System.out.println("특정값 위치"+list.indexOf("홍길동"));
		System.out.println("값이 있냐"+list.isEmpty());
		
		System.out.println(list);
		List<String> sub = list.subList(0, 3);
		System.out.println("sub>>"+sub);
		for(String x:list) {
			System.out.println(x);
		}
		
		
		Object[]obj=list.toArray();
		for(Object x : obj) {
	}
	}
}
