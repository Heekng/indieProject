package com.indieProject.app.amamovie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;
import com.indieProject.app.amamovie.vo.AmaMovieMakerVO;
import com.indieProject.app.amamovie.vo.AmaMoviePosterVO;
import com.indieProject.app.amamovie.vo.AmaMovieStillCutVO;
import com.indieProject.app.amamovie.vo.AmaMovieVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class AmaMovieWriteOkAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = null;
		AmaMovieVO a_vo = new AmaMovieVO();
		AmaMovieMakerVO a_m_vo = new AmaMovieMakerVO();
		AmaMovieAction a_a_vo = new AmaMovieAction();
		AmaMoviePosterVO a_p_vo = new AmaMoviePosterVO();
		AmaMovieStillCutVO a_s_vo = new AmaMovieStillCutVO();

		String posterSaveFolder =req.getSession().getServletContext().getRealPath("/")+"../../../../../../indieProject/WebContent/images/amaMovie/poster";
		String stillCutSaveFolder =req.getSession().getServletContext().getRealPath("/")+"../../../../../../indieProject/WebContent/images/amaMovie/stillCut";
		
		int fileSize = 5 * 1024 * 1024; //5MB
		
		MultipartRequest multi = new MultipartRequest(req, posterSaveFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		
		
		
		
		
		
		
		
		return null;
	}
}
