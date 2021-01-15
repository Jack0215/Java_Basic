
public class WrapperTest2 {

	public static void main(String[] args) {
		
		//Wrapper 클래스 : 기본형 8개에 해당하는 클래스들.
		/*
		 *   Byte
		 *   Short
		 *   Integer
		 *   Long
		 *   
		 *   Float
		 *   Double
		 *   
		 *   Character
		 *   
		 *   Boolean
		 * 
		 */
		
	  // 오토박싱, 언박싱
	  
	  int n =10;
	  
	  Integer n2 =new Integer(10);
	  System.out.println(n);	
	  System.out.println(n2); //  toString()	
	  System.out.println(n==n2);//자동 언박싱
	  //int n3 = n2.intValue();
	  // Integer --> int : 오토 언박싱
	  int n4 = n2;  
	//  int--> Integer : 오토박싱
	  Integer n5 = n4;
	  
	  Object [] kkk = {10,20 }; //오토박싱
	  for(Object k: kkk) {
		  System.out.print(k);
	  }
	}//end main
}//end class
