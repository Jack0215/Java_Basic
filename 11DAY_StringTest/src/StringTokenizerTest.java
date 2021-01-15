import java.util.StringTokenizer;

public class StringTokenizerTest { //유틸패키지에 들어가있음

	public static void main(String[] args) {
		
		// "aa/bb/cc" ==> / 구분자로 값을 반환
		String data = "aa/bb/cc,dd/ee/xx,kk/yy/zz";
		
		
		// for문이 아님
		StringTokenizer st = new StringTokenizer(data, "/ ,"); //슬래쉬랑 쉼표 짤림
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		//1. String의 split()
		String [] d = data.split("/ ,");
		for (String s : d) {
			System.out.println(s);
		}
		

	}

}
