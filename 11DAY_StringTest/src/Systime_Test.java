
public class Systime_Test {

	public static void main(String[] args) {
		Systime_Test t = new Systime_Test();
		t.aaa();		
		t.bbb();
		t.ccc();
		
	}
	public  void ccc() {
		long start=System.currentTimeMillis();
		String x= "";
		for (int i = 0; i < 10000; i++) {
			x=x.concat("aaaaaaaaaaaaa");
		}
		System.out.println("x.length()="+x.length());
		System.out.println("aaa()"+((System.currentTimeMillis()-start)/1000.0));
		
	}
	public  void bbb() {
		long start=System.currentTimeMillis();
		StringBuffer x= new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			x.append("aaaaaaaaaaaaa"); //기존에 있던거에 붙임 나머지는 새로 만들어서붙임 =시간이 오래걸림
 		}
		System.out.println("x.length()="+x.length());
		System.out.println("aaa()"+((System.currentTimeMillis()-start)/1000.0));
		
	}
	public  void aaa() {
		long start=System.currentTimeMillis();
		String x= "";
		for (int i = 0; i < 10000; i++) {
			x+="aaaaaaaaaaaaa";
		}
		System.out.println("x.length()="+x.length());
		System.out.println("aaa()"+((System.currentTimeMillis()-start)/1000.0));
		
	}

}
