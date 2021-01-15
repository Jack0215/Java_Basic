package com.notice.biz;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.employee.exception.DataNotFoundException;
import com.notice.entity.Notice;




public class NoticeBiz implements INoticeBiz {

  
	//공지사항 목록보기
	public List<Notice> selectAllNotice() {
		List<Notice> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
	
		return list;
	}
	
	//공지사항 자세히 보기
	public Notice selectDetailNotice(String noticeNum)throws DataNotFoundException{
		Notice notice = null;
		SqlSession session = MySqlSessionFactory.getSession();
	
		
		return notice;
	}
	
	
	 //공지사항 수정하기
	 public void noticeUpdate(Notice notice){

		 SqlSession session = MySqlSessionFactory.getSession();
		
		
		}//noticeUpdate
	 
	 //공지사항 삭제
	 public void noticeDelete(String inputNum) throws DataNotFoundException{
		
		 SqlSession session = MySqlSessionFactory.getSession();
		
	 }
	 
}//end class
