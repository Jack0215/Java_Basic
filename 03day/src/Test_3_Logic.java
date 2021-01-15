
public class Test_3_Logic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name = null;
		//System.out.println( (4 < 2) && (name.length()== 4)); //f, name이 null이란 결과를 보여줘야하는데 결과를 수행하지 않음
		//System.out.println( (4 > 2) && (name.length()== 4));
		
		//System.out.println( (4 < 2) || (name.length()== 4));
		//System.out.println( (4 > 2) || (name.length()== 4));  //t, 위 와 동일
	
		//6. 3항연산자
//		int xxx =(3==4)?100:200;
//		String xxx2 =(3!=4)?"A":"B";
//		System.out.println(xxx);
//		System.out.println(xxx2);
		
//		int a = 10;
//		int b = 20;
//		int max = (a > b)?a:b;
//		System.out.println(max);
		
		int a = 10;
		int b = 20;
		int c = 30;
		int max = ( a > b ) ? a: b;
		 max = ( max > c) ? max : c;
		System.out.println("최대값은"+ max);
		
//		int max = ((a < b) && ( b < c))?c:a;
//		
//		float result=9/2f;
//		int result_int=9/2;
//		System.out.println(result);
//		System.out.println(result_int);
//		char c='A';
//		int int_c=c+1;
//		char c2=(char)(c+1);
//		System.out.println(result);
//		System.out.println(c+"\t"+int_c+"\t"+c2);
	}
}
