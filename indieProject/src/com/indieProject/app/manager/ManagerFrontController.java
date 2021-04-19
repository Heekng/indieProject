package com.indieProject.app.manager;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indieProject.action.ActionForward;
import com.indieProject.app.amamovie.AmaMovieAction;

public class ManagerFrontController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		
		String command = requestURI.substring(contextPath.length());
		System.out.println(command);
		ActionForward forward = null;
		if(command.equals("/manager/managerRefunds.ma")) {
			try {
				forward = null;
			} catch (Exception e) {e.printStackTrace();}
		}else if(command.equals("/manager/managerNoneRefunds.ma")) {
			try {
				forward = new managerNonRefundsAction().execute(req, resp);
			} catch (Exception e) {e.printStackTrace();}
		}
		
		
		if(forward != null) {
			if(forward.isRedirect()) {
				resp.sendRedirect(forward.getPath());
			}else {
				RequestDispatcher dispatcher = req.getRequestDispatcher(forward.getPath());
				dispatcher.forward(req, resp);
			}
		}
	}
}
