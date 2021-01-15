package source;
//아우터안에 이너가 멤버변수 선언됨
//
public class TestOuter {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.innerCreate();

		
		//2. Outer밖에서 Inner 생성==>반드시 Outer부터생성한다. //이 방법을 많이 씀
		
		//아우터 안에 이너 클래스가 있어야됨
		//우선 아우터를 만들고, 아우터의 참조변수를 이너에 사용
		Outer outer2 = new Outer();  // outer를 new 하고있음 
		outer2.n=10;
		Outer.Inner inner = outer2.new Inner();//outer2.안에있는 이너 클래스 비교
		//↑받을 때 아우터 클래스에 있는 이너 라고 타입 지정해야함
		inner.info();		 //이너클래스를 지칭하고있는 클래스는 이너
							//16행의  inner참조변수 활용해서 18행에서 info()출력
	}

}
