package com.indieProject.app.amamovie;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;
import com.indieProject.app.amamovie.dao.AmaMovieDAO;
import com.indieProject.app.amamovie.vo.AmaMovieActorVO;
import com.indieProject.app.amamovie.vo.AmaMovieMakerVO;
import com.indieProject.app.amamovie.vo.AmaMoviePosterVO;
import com.indieProject.app.amamovie.vo.AmaMovieStillCutVO;
import com.indieProject.app.amamovie.vo.AmaMovieVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sun.mail.handlers.multipart_mixed;

public class AmaMovieWriteOkAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = null;
		AmaMovieVO a_vo = new AmaMovieVO();
		AmaMovieMakerVO [] a_m_vo_ar = null;
		AmaMovieActorVO [] a_a_vo_ar = null;
		AmaMoviePosterVO a_p_vo = new AmaMoviePosterVO();
		AmaMovieStillCutVO a_s_vo = new AmaMovieStillCutVO();

		AmaMovieDAO a_dao = new AmaMovieDAO();
		
		int movieNum;
		
		String saveFolder =req.getSession().getServletContext().getRealPath("/")+"../../../../../../indieProject/WebContent/images/amaMovie";
		
		int fileSize = 5 * 1024 * 1024; //5MB
		
		MultipartRequest multi = new MultipartRequest(req, saveFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		
		a_vo.setAmaTitleEng(multi.getParameter("amaTitleEng"));
		a_vo.setAmaTitleKor(multi.getParameter("amaTitleKor"));
		a_vo.setAmaMakeDate(multi.getParameter("amaMakeDate"));
		a_vo.setAmaMovieLength(multi.getParameter("amaMovieLength"));
		a_vo.setAmaDirector(multi.getParameter("amaDirector"));
		a_vo.setGenre(multi.getParameter("genre"));
		a_vo.setRating(multi.getParameter("rating"));
		a_vo.setLink(multi.getParameter("link"));
		a_vo.setPopcorn(multi.getParameter("popcorn"));
		a_vo.setSynopsis(multi.getParameter("synopsis"));
		a_vo.setTheme(multi.getParameter("theme"));
		a_vo.setMemberId((String)req.getSession().getAttribute("session_id"));
		
		if(a_dao.insertMovie(a_vo)) {
			System.out.println("영화입력 성공");
			movieNum = a_dao.getMovieNum(a_vo);

			String makerPositionAr[] = multi.getParameterValues("makerPosition");
			String makerNameAr [] = multi.getParameterValues("makerName");
			a_m_vo_ar = new AmaMovieMakerVO[makerPositionAr.length];
			for (int i = 0; i < makerPositionAr.length; i++) {
				a_m_vo_ar[i].setAmaNum(movieNum);
				a_m_vo_ar[i].setMakerPosition(makerPositionAr[i]);
				a_m_vo_ar[i].setMakerName(makerNameAr[i]);
			}
			
			String actorCastAr [] = multi.getParameterValues("actorCast");
			String actorNameAr [] = multi.getParameterValues("actorName");
			a_m_vo_ar = new AmaMovieMakerVO[makerPositionAr.length];
			for (int i = 0; i < makerPositionAr.length; i++) {
				a_m_vo_ar[i].setAmaNum(movieNum);
				a_m_vo_ar[i].setMakerPosition(makerPositionAr[i]);
				a_m_vo_ar[i].setMakerName(makerNameAr[i]);
			}
		
			
		
			
		}else {
			System.out.println("영화입력 실패");
		}
		
		return null;
	}
}