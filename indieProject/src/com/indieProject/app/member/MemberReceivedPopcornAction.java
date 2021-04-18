package com.indieProject.app.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;
import com.indieProject.app.member.dao.MemberDAO;

public class MemberReceivedPopcornAction  implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		MemberDAO m_dao=new MemberDAO();
		HttpSession session = req.getSession();
		PrintWriter out=resp.getWriter();

		String memberId = (String)session.getAttribute("member_id");
		int changePopcorn = Integer.parseInt(req.getParameter("changePopcorn"));
		int myReceivedPopcornNum = m_dao.myReceivedPopcornNum(memberId);
		
		if(changePopcorn > myReceivedPopcornNum) {
			//혹시몰라 한번더 확인
			out.print("not-ok");
		}else {
			
		}
		
		
		out.print("ok");
		return null;
	}

}
