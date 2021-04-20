package com.indieProject.app.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;
import com.indieProject.app.amamovie.vo.AmaMovieVO;
import com.indieProject.app.member.dao.MemberDAO;

public class MemberDeleteMovieOkAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		
		MemberDAO m_dao = new MemberDAO();
		
		String memberId = (String)req.getSession().getAttribute("session_id");
		int amaNum = Integer.parseInt(req.getParameter("amaNum"));
		
		AmaMovieVO a_vo = m_dao.getMovie(memberId, amaNum);
		
		//일치하는 영화정보가 없을 때
		if(a_vo == null) {
			out.print("not-ok");
			out.close();
			return null;
		}
		
		
		
		
		return null;
		
		
	}
}
