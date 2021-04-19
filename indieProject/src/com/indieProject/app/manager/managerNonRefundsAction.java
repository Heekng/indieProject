package com.indieProject.app.manager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;
import com.indieProject.app.manager.dao.ManagerDAO;
import com.indieProject.app.manager.vo.PopcornExchangeDataVO;

public class managerNonRefundsAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		
		ManagerDAO ma_dao = new ManagerDAO();
		
		
		List<PopcornExchangeDataVO> nonExchangeList = ma_dao.getNoneExchangeData();
		req.setAttribute("noneExchangeList", nonExchangeList);
		
		forward.setRedirect(false);
		forward.setPath("/app/manager/managerNoneRefunds.jsp");
		
		return forward;
	}
}
