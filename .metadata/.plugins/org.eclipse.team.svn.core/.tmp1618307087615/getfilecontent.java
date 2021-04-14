package com.indieProject.app.amamovie.dao;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.indieProject.app.amamovie.vo.AmaMovieActorVO;
import com.indieProject.app.amamovie.vo.AmaMovieMakerVO;
import com.indieProject.app.amamovie.vo.AmaMoviePosterVO;
import com.indieProject.app.amamovie.vo.AmaMovieReviewVO;
import com.indieProject.app.amamovie.vo.AmaMovieStillCutVO;
import com.indieProject.app.amamovie.vo.AmaMovieVO;
import com.indieProject.app.amamovie.vo.PopcornVO;
import com.indieProject.app.board.vo.BoardReplyVO;
import com.indieProject.mybatis.config.SqlMapConfig;
import com.oreilly.servlet.MultipartRequest;

public class AmaMovieDAO {
	SqlSessionFactory sessionf = SqlMapConfig.getSqlMapInstance();
	SqlSession session;
	
	public AmaMovieDAO() {
		session = sessionf.openSession(true);
	}
	//영화 정보 입력
	public boolean insertMovie(AmaMovieVO a_vo) {
		System.out.println(a_vo.getMemberId());
		return session.insert("AmaMovie.insertMovie", a_vo) == 1;
	}
	//영화 입력 후 번호 가져오기
	public int getMovieNum(AmaMovieVO a_vo) {
		return session.selectOne("AmaMovie.getMovieNum", a_vo);
	}
	//제작진 입력
	public boolean insertMaker(AmaMovieMakerVO [] a_m_vo_ar) {
		boolean check = true;
		for (int i = 0; i < a_m_vo_ar.length; i++) {
			if(session.insert("AmaMovie.insertMaker", a_m_vo_ar[i]) != 1) {
				check = false;
			}
		}
		return check;
	}
	//출연진 입력
	public boolean insertActor(AmaMovieActorVO [] a_a_vo_ar) {
		boolean check = true;
		for (int i = 0; i < a_a_vo_ar.length; i++) {
			if(session.insert("AmaMovie.insertActor", a_a_vo_ar[i]) != 1) {
				check = false;
			}
		}
		return check;
	}
	//포스터/스틸컷 정보 입력
	public boolean insertPoster(int movieNum, MultipartRequest multi) {
		boolean check = true;
		AmaMoviePosterVO poster = new AmaMoviePosterVO();
		
		Enumeration<String> datas = multi.getFileNames();
		
		while(datas.hasMoreElements()) {
			String data = datas.nextElement();
			String systemName = null;
			if(data.equals("posterImgMain")) {
				systemName = "main_" + multi.getFilesystemName(data);
			}else if(data.substring(0, 9).equals("posterImg")) {
				systemName = multi.getFilesystemName(data);
			}
			if(systemName == null) {
				continue;
			}
			poster.setAmaNum(movieNum);
			poster.setFileName(systemName);
			if(session.insert("AmaMovie.insertPoster", poster) != 1) {
				check = false;
			}
		}
		
		return check;
	}
	//스틸컷 정보 입력
	public boolean insertStillCut(int movieNum, MultipartRequest multi) {
		boolean check = true;
		AmaMovieStillCutVO stillCut = new AmaMovieStillCutVO();
		
		Enumeration<String> datas = multi.getFileNames();
		
		while(datas.hasMoreElements()) {
			String data = datas.nextElement();
			String systemName = null;
			if(data.substring(0, 8).equals("stillCut")) {
				systemName = multi.getFilesystemName(data);
			}
			if(systemName == null) {
				continue;
			}
			stillCut.setAmaNum(movieNum);
			stillCut.setFileName(systemName);
			if(session.insert("AmaMovie.insertStillCut", stillCut) != 1) {
				check = false;
			}
		}
		
		return check;
	}
	
	// 영화 정보 가져오기
	public AmaMovieVO getAmaData(int amaNum) {
		return session.selectOne("AmaMovie.getAmaData", amaNum);
	}
	
	// 영화 포스터 가져오기
	public List<AmaMoviePosterVO> getAmaPoster(int amaNum) {
		return session.selectList("AmaMovie.getAmaPoster", amaNum);
	}
	
	// 영화 스틸컷 가져오기
	public List<AmaMovieStillCutVO> getAmaStillcut(int amaNum) {
		return session.selectList("AmaMovie.getAmaStillcut", amaNum);
	}
	
	// 영화 제작진 가져오기
	public List<AmaMovieMakerVO> getAmaMaker(int amaNum) {
		return session.selectList("AmaMovie.getAmaMaker", amaNum);
	}
	
	// 영화 출연 가져오기
	public List<AmaMovieActorVO> getAmaActor(int amaNum) {
		return session.selectList("AmaMovie.getAmaActor", amaNum);
	}
	
	// 영화 감상평 최근 5개 가져오기
	public List<AmaMovieReviewVO> getAmaReviewRe5(int amaNum){
		return session.selectList("AmaMovie.getAmaReviewRe5", amaNum);
	}
	
	// 영화 감상평 가져오기
	public List<AmaMovieReviewVO> getAmaReview(int amaNum, int startRow, int endRow){
		HashMap<String, Integer> amaReview = new HashMap<>();
		amaReview.put("amaNum", amaNum);
		amaReview.put("startRow", startRow);
		amaReview.put("endRow", endRow);
		return session.selectList("AmaMovie.getAmaReview", amaReview);
	}
	// 영화 감상평 총 개수 가져오기
	public int getAmaReviewNum(int amaNum) {
		return (Integer) session.selectOne("AmaMovie.getAmaReviewNum", amaNum);
	}
	
	// 영화 평균 별점 가져오기
	public double getStarAvg(int amaNum) {
		return session.selectOne("AmaMovie.getStarAvg", amaNum);
	}
	
	// 팝콘 후원자들 가져오기
	public List<PopcornVO> getPopcornSender(int amaNum){
		return session.selectList("AmaMovie.getPopcornSender", amaNum);
	}
	// 영화 감상평 아이디 중복 확인
	public boolean checkReviewId(int amaNum, String memberId) {
		HashMap<String, Object> review = new HashMap<>();
		review.put("amaNum", amaNum);
		review.put("memberId", memberId);
		return (Integer) session.selectOne("AmaMovie.checkReviewId", review) == 1;
	}
	// 영화 감상평 등록
	public boolean insertAmaReview(AmaMovieReviewVO mr_vo) {
		return session.insert("AmaMovie.insertAmaReview", mr_vo) == 1;
	}

}