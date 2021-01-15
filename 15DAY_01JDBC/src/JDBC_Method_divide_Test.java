import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Method_divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	//커넥션을 연결하고있으면 다른 사람이 사용을 못함.
	public JDBC_Method_divide_Test() {
		try {
			Class.forName(driver);
			System.out.println("로딩성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getdeptAdata(int deptno) {
		//deptno를 select 하기 위한 sql문 작성
		//현 부서의 정보를 string으로 리턴
				//여기서 드라이버 로딩되면, 다른 함수 있을 경우 또 연결해야하므로 16행으로 이동
				//sql만들고 prepared만들면 크로스 해줘야함 다른데서 다른함수 만들면 다른데서 드라이버 로딩 해줘야함
				//getconnection 해줘야함
				//드라이버 로딩과 커넥션을 어떻게 할지 생각해봐야함
				//커넥션은 사용자가 제일 짧게 갖고있는게 좋음
				//하나 사용하고 바로 끊어지게
				//함수 실행 할 때 마다 커넥션 맺고 쿼리 실행하고 끊어주면 됨.
		String data = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select * from dept where deptno=?"; //?=변수자리
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			data = null;
			while (rs.next()) {
				int deptno1 = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				data = dname+ "\t" + dname + "\t" + loc;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data;
	}
	public int delAdata(int deptno) {
		//부서 번호를 가지고 부서 삭제 후 처리한 레코드 갯수 리턴
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "delete from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			System.out.println("ddd");
			num = pstmt.executeUpdate();
			System.out.println("update 후");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return num;
	}
	public static void main(String[] args) {
		//객체생성
		//deptAdata 호출 검색 deptno전송 검색 결과 문자열로 받아서 출력
		JDBC_Method_divide_Test test = new JDBC_Method_divide_Test();
		System.out.println(test.getdeptAdata(90));
		System.out.println(test.delAdata(18));
	}
}
