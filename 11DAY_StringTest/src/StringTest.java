
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "Hello";
//		String b = "Hello";
//		System.out.println("a==b"+"\t" +(a == b));
//		System.out.println("a.equals(b)"+"\t"+a.equals(b));
//		String c = new String("Hello");
//		String d = new String("Hello");
//		System.out.println("c==d"+"\t"+(c==d));
//		System.out.println("a.equals(d)"+"\t"+c.equals(d));

		String mesg="홍길동/이순신/유관순";
		String [] n = mesg.split("/");
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		//System.out.println(n[3]);
		System.out.println(n.length);
		for(int x=0;x<n.length;x++) {
			System.out.println(n[x]);
		}
		
		System.out.printf("%s%d%s","홍길동",20,"홍길동");
		
		String mesg1="홍길동,이순신,유관순";
		String [] n1 = mesg1.split(",");
		System.out.println(n1[0]);
		System.out.println(n1[1]);
		System.out.println(n1[2]);
		System.out.println(n1.length);
		for(int x1=0; x1<n1.length; x1++) {
			System.out.println(n1[x1]);
		}
	}

}
