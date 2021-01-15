import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.stream.Stream;

public class Ex11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("데이터를 입력하시오");
		InputStream is = System.in; // inputstream으로 is에 넣어줌, 실제 데이터를 가져오는 애(node 계열)
		InputStreamReader reader = null; // is를가지고 reader를 new 해서 reader인자에 is를 넣어줌
		BufferedReader buffer = null;
		try {
			//필터(InputStreamReader)사용1 : byte -> char로 변경, 필터는 값을 직접 in,out 안되지만 데이터 변형, 라인별 읽기/쓰기 가능
			reader = new InputStreamReader(is);
			//필터(BufferedReader)사용2 : 한 줄(line)읽기
			buffer = new BufferedReader(reader);
			String mesg = buffer.readLine();
			System.out.println(mesg); //표준출력
			int n = reader.read();
			PrintStream xxx = System.out;
			xxx.print("asdad"); //출력된값을 저장된 문장으로 변경
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
