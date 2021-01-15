
public class Test_1_For_statment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum = 0;
		int oddsum = 0;
		for(int n=0; n <= 10; n++) {
			 if (n%2==0) {
				 //System.out.println(n+"=짝수");
				 evensum+=n;
			 } else {
				// System.out.println(n+"홀수");
				 oddsum+=n; //oddsum=oddsum+n
			 }
			//System.out.println(sum);
	}
	 System.out.println("홀수 합"+oddsum+"짝수합"+evensum);
		
  } 
}
//1부터100까지 돌면서 3의 배수의 총 합

