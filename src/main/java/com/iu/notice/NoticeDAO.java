package com.iu.notice;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.iu.util.DBConnector;
@Repository
public class NoticeDAO {
	
	@Inject //만들어진 클래스객체를 넣어라 setter getter 필요없음
	private DBConnector dbConnector;
	
	public void insert() throws Exception {
		System.out.println(dbConnector);
		System.out.println("Notice DAO");
	}
}
