package com.indieProject.app.amamovie.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.indieProject.app.amamovie.vo.AmaMovieMakerVO;
import com.indieProject.app.amamovie.vo.AmaMovieVO;
import com.indieProject.mybatis.config.SqlMapConfig;

public class AmaMovieDAO {
	SqlSessionFactory sessionf = SqlMapConfig.getSqlMapInstance();
	SqlSession session;
	
	public AmaMovieDAO() {
		session = sessionf.openSession(true);
	}
	//영화 정보 입력
	public boolean insertMovie(AmaMovieVO a_vo) {
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
			if(session.insert("AmaMovie.insertMaker", a_m_vo_ar[i]) == 1) {
				check = false;
			}
		}
		return check;
	}
}
