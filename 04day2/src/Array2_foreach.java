
public class Array2_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int[3];
		num[0] =10;
		num[1] =20;
		num[2] =30;
		num = new int[4];
		num[0] =10;
		num[1] =20;
		num[2] =30;
		num[3] =40;
		//foreach
//		for(int x: num) {
//			System.out.print(x);
			
		for(int i=0; i<num.length; i++)
			System.out.print(num[i]);
		}
	}
