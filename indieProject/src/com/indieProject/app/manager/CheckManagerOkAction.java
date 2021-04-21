package com.indieProject.app.manager;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;

public class CheckManagerOkAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String memberId = (String)req.getSession().getAttribute("session_id");
		String [] arManager = {"heekng", "abc1234"};//배열에 관리자 이름 추가
		if(memberId != null) {
			for (int i = 0; i < arManager.length; i++) {
				if(memberId.equals(arManager[i])) {
					
					out.print("ok");
					break;
				}
			}
		}
		out.close();
		return null;
	}
}
