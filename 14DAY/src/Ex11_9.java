import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.Buffer;

public class Ex11_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("데이터를 입력하시오.");
		BufferedReader buffer = null;
		PrintWriter out = null;
		try {
			File f = new File("c:\\Test", "output.txt");
			buffer = new BufferedReader(new InputStreamReader(System.in));
			FileWriter writer = new FileWriter(f, true);
			out = new PrintWriter(writer);
			out.print(buffer.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
				out.checkError();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
