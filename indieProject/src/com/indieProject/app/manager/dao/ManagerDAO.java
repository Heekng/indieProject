package com.indieProject.app.manager.dao;

import java.util.HashMap;
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
	
	//전체 미처리 환전신청 가져오기
	public List<PopcornExchangeDataVO> getNoneExchangeData(){
		return session.selectList("Manager.getNoneExchangeData");
	}
	//행별로 값 가져오기
	public List<PopcornExchangeDataVO> getExchangeData(int startRow, int endRow){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		return session.selectList("Manager.getExchangeData", map);
	}
	
	//입금상태 변경
	public boolean setExchangeYes(String exchangeNum) {
		return session.update("Manager.setExchangeYes", exchangeNum) == 1;
	}
}