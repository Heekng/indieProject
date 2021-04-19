package com.indieProject.app.manager.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.indieProject.app.manager.vo.PopcornExchangeDataVO;
import com.indieProject.mybatis.config.SqlMapConfig;

public class ManagerDAO {
	SqlSessionFactory sessionf = SqlMapConfig.getSqlMapInstance();
	SqlSession session;
	
	public ManagerDAO() {
		session = sessionf.openSession(true);
	}
	
	//행별로 값 가져오기
	public List<PopcornExchangeDataVO> getNoneExchangeData(){
		return session.selectList("Manager.getNoneExchangeData");
	}
}
