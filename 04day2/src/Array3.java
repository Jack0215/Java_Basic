
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int  [] kor= new int [3];
//		kor[0] = 100;		kor[1] = 80;		kor[2] = 80;
		int [] kor = {100, 80, 80};
		int  [] eng= new int [3];
		eng[0] = 90;		eng[1] = 75;		eng[2] = 60;
		int kor_sum=0;
		int eng_sum=0;
	
//		//for문
//		for (int i=0; i<kor.length; i++) {
//			kor_sum+=kor[i];
//			eng_sum+=eng[i];
//		}
//		System.out.println((kor_sum/kor.length)+"\t"+(eng_sum/eng.length));
		//foreach
		int engl_sum=0; int kore_sum=0;
		for (int x : eng) {
			engl_sum += x;
		}
		for (int y : kor) {
		    kore_sum += y;
		}
		 System.out.println((kore_sum/kor.length)+"\t"+(engl_sum/eng.length));
	}
  }
