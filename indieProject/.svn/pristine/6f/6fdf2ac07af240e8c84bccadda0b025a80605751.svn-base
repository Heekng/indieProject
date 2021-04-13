package com.indieProject.app.amamovie;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;
import com.indieProject.app.amamovie.dao.AmaMovieDAO;
import com.indieProject.app.amamovie.vo.AmaMovieReviewVO;
import com.indieProject.app.amamovie.vo.AmaMovieVO;

public class AmaMovieWatchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		AmaMovieDAO a_dao = new AmaMovieDAO();

		int amaNum = Integer.parseInt(req.getParameter("amaNum"));
		AmaMovieVO a_vo = a_dao.getAmaData(amaNum);
		
		// 유투브 영상 주소 변환
		String link = "https://www.youtube.com/embed";
		String temp = a_vo.getLink();
		String movie = temp.substring(temp.lastIndexOf("/"));
		link += movie;
		
		String tempPage = req.getParameter("page");
		int page = tempPage == null ? 1 : Integer.parseInt(tempPage);
		
		//페이지 사이즈
		int pageSize=10;
		//끝나는 행
		int endRow=page*pageSize;
		//시작하는 행
		int startRow=endRow-(pageSize-1);
		//시작 페이지
		int startPage=((page-1)/pageSize)*pageSize+1;
		//끝나는 페이지
		int endPage=startPage+(pageSize-1);
		
		List<AmaMovieReviewVO> amaReviews = a_dao.getAmaReview(amaNum);
		
		int totalCnt = amaReviews.size();
		int realEndPage=(totalCnt-1)/pageSize+1;
	
		endPage= endPage >realEndPage ? realEndPage : endPage;
		
		
		req.setAttribute("ama_vo", a_vo);
		req.setAttribute("movieLink", link);
		req.setAttribute("amaReviews", amaReviews);
		req.setAttribute("totalCnt", totalCnt);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		req.setAttribute("nowPage", page);
		req.setAttribute("realEndPage",realEndPage);
		
		forward.setRedirect(false);
		forward.setPath("/app/amaMovie/watchMovie.jsp");
		
		return forward;
	}

}
