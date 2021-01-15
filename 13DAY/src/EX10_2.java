import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

class Box2<T>{
	T obj;  //String 타입이됨, 아래 get,set도 string으로 바뀜, getvalue가 string이므로 형변환이 필요없음
	public void setValue(T obj) {
		this.obj=obj;
	}
	public T getValue(){
		return obj;
	}
}
public class EX10_2 {

	public static void main(String[] args) {
//		HashMap<K, V>   //HashMap은 기본으로 2개를 설정하게 되어있음. key, value 입력해줘야함
//		ArrayList<E>  //객체들 안에 들어가는 것을  element라 부름
		
		// TODO Auto-generated method stub
		Box2<String> b = new Box2<String>();  //여기 선언해주면 4라인 T가 String으로 바뀜
		b.setValue("Hello");
		String x = b.getValue();
		System.out.println(x);
//		b.setValue(new Date());  //위에서 string으로 바꿨는데 Date에 넣을려하니 안됨 그래서 21라인도 실행안됨
//		Date xx = (Date)b.getValue();
		
		Box2<Date> b2 = new Box2();
		b2.setValue(new Date());
		Date d=b2.getValue();
		System.out.println(d);
		
		Box2<Integer> b3 = new Box2<>();
		b3.setValue(100);
		int xxx = b3.getValue();
		System.out.println(xxx);
	}

}
