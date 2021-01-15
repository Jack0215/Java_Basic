package Workshop6_3;

import java.util.StringTokenizer;

public class tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//쉼표를 기준으로 토큰을 자른다.
		//while문 써서 has랑 next가져오는거 했음
		//가져오는 값이 string이니 int로 누적시켜야함
		
		String str = "4,2,4,6,7";
		StringTokenizer st = new StringTokenizer(str,",");
		int sum =0;
		while(st.hasMoreElements()) {
			sum += Integer.parseInt(st.nextToken());
	}
		System.out.println(sum);
}
}

