package com.iu.board;


// 서비스 계층 new BoardService();
public class BoardService {

	private BoardDAO boardDAO;

	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
	
	public void insert() throws Exception{
		System.out.println("Board Service");
		boardDAO.insert();
		
		
	}
}
