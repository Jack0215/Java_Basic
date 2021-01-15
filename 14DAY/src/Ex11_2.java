import java.io.IOException;
import java.io.InputStream;

public class Ex11_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		
		try {
			byte[] b = new byte[5];
			System.out.println("데이터를 입력하시오");
			is = System.in;
			int n = is.read(b);
			System.out.println("입력 개수:"+n);
			for (byte bb:b) {
				System.out.println("입력값:"+(char)bb);
			}
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
