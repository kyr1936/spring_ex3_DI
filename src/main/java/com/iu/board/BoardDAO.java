package com.iu.board;

import org.springframework.stereotype.Repository;

import com.iu.util.DBConnector;


// 계층이 다름. DB와 관련
// new BoardDAO
public class BoardDAO {
	private DBConnector dbConnector;
	
	public BoardDAO(DBConnector dbConnector) {
		// TODO Auto-generated constructor stub
		this.dbConnector=dbConnector;
	}
	
	public void insert() throws Exception{
		System.out.println(dbConnector.getConnect());
		System.out.println("DAO Insert");
		
	}
}
