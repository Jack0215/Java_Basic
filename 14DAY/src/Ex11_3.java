import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("데이터를 입력하시오");
		InputStream is = System.in; // inputstream으로 is에 넣어줌
		InputStreamReader reader = null; // is를가지고 reader를 new 해서 reader인자에 is를 넣어줌
		//byte를 char로 변환시키는 작업
		try {
			reader = new InputStreamReader(is);
			int n = reader.read();
			System.out.println((char) n);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
