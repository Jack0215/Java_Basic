
public class EnumTest3 {


	//public enum 타입 {상수값,상수값2,상수값3}
	public enum Color {BLUE,RED,YELLOW}  //클래스 이름, 안에 들어가는 값을 대문자로
										//이름.안에 들어가있는 값으로 써야함(11~13행)
	
	public static void main(String[] args) {
		 // 타입.상수값
		Color c = Color.BLUE;  //출력 : BLUE값이 나옴
		Color c2 = Color.RED;
		Color c3 = Color.YELLOW;
		//Color c4 = Color.GREEN;
		System.out.println(c); //BLUE
		
		Color[] xx = Color.values();
		for (Color p : xx) {
			System.out.println(p);
			System.out.println(p.name()+"\t"+p.ordinal());
		}
		
	}//end main0
}//end class




