import java.io.IOException;
import java.io.InputStream;

public class Ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("데이터 입력");
		InputStream is = System.in;
		try {
			int n = is.read();
			System.out.println((char)n);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
