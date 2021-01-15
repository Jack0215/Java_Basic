package source;
public class TestOuter3 {

	public static void main(String[] args) {
		// static inner클래스는 Outer3 클래스명으로 접근
		Outer3.Inner i = new Outer3.Inner(); //아우터3의 이너를 쓰겠다.
		i.info();
	}

}



//자세하게까지 알지 않아도 됨
