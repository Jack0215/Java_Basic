


import java.sql.SQLException;
import java.util.ArrayList;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;




public class EmpTest {

	
	public static void main(String[] args) throws SQLException, DataNotFoundException {
		
		EmpBiz empBiz = new EmpBiz();  //Biz를 호출 비즈에있는게 초기화, 커넥션, 템플릿에서 커넥션얻어오고 dao에 넘겨줌
		ArrayList<EmpDTO> list = empBiz.selectAllEmp();
		for (EmpDTO e : list) {
			System.out.println(e);
		}
		
		
//		try {
//			EmpDTO list2 = empBiz.selectDetailEmp("7839");
//			System.out.println(list2);
//		} catch (DataNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		empBiz.empDelete("106");
		
		
//		try {
//			empBiz.selectAllEmp();
//		} catch (Exception e) {
//			e.printStackTrace();.
//		}
	}//end main
}//end class
