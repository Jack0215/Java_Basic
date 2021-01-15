import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOETest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Test\\xyz.java");
		PrintWriter out = null;
		try {									  //↓기존에 파일이 들어있으면 덮어쓰라는 뜻
			FileWriter writer = new FileWriter(f, true);
			// 필터
			out = new PrintWriter(writer);
			out.print("happy");
			// out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
	}
}
