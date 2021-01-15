package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Domestic;

public class OracleMyBatisDAO {

	public OracleMyBatisDAO() {

	}

	public List<Domestic> select(SqlSession session) {
		// <select id="selectAll" resultType="com.dto.dept">
		List<Domestic> list = session.selectList("select");
		return list;
	}

	public List selectAllHash(SqlSession session) {
		List list = session.selectList("selectAllHash");
		return list;

}
}
