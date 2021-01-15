import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Random  ran  = new Random();  
	       int n = ran.nextInt(6)+1;
	       int m = ran.nextInt(100)+1;
	       int z= ran.nextInt(100);
	       boolean b = ran.nextBoolean();
	       System.out.println("임의의 논리값:"+b);
	       System.out.println(n);
	       System.out.println(m);
	       System.out.println(z);
	       

	}

}


