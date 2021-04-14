package com.indieProject.app.board;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;
import com.indieProject.app.board.dao.BoardDAO;

public class BoardDeleteAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
	
		PrintWriter out=resp.getWriter();
		BoardDAO b_dao=new BoardDAO();
		
		int boardNum=Integer.parseInt(req.getParameter("boardNum"));
		
		b_dao.deleteBoard(boardNum);
		out.print("ok");
		
		return null;
	}
	
	
	

}
