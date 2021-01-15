import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class IOETest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Test\\IOTest5.java");
		BufferedReader buffer = null;
		try {
			FileReader reader = new FileReader(f);
			buffer = new BufferedReader(reader);
			String data = buffer.readLine();
			while(data != null) {
				System.out.println(data);
				data = buffer.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffer.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
