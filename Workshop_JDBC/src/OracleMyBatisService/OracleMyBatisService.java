package OracleMyBatisService;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Domestic;
public class OracleMyBatisService {

	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleMyBatisDAO();
	}

	public List<Domestic> select() {

		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Domestic> list = null;
		try {
			list = dao.select(session);
		} finally {
			session.close();
		}
		return list;
	}
	
	public List selectAllHash() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List list = null;
		try {
			list= dao.selectAllHash(session);
		} finally {
			session.close();
		}
		return list;
	}	
}
