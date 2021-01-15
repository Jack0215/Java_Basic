import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MakeFILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path newFile = Paths.get("c:\\Test\\xxx.txt");
		Path xx2 = Paths.get("c:\\Test\\xxx.txt");
		 // XX2를 복사해서 붙여줌
//		try {								//재생성하면 오류발생
//			xx2= Files.createFile(newFile);			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		삭제관련코드
//		try {
//			Files.deleteIfExists(xx2); // xxx.txt파일 삭제
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Path original = Paths.get("c:\\Test\\IOTest5.java");
		Path copy= Paths.get("c:\\Test\\IOTest5Copy.java");
		try {
			Path yyy= Files.copy(original, copy, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(yyy);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
