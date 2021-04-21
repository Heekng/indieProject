
package com.indieProject.app.amamovie;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Synthesizer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;
import com.indieProject.app.amamovie.dao.AmaMovieDAO;
import com.indieProject.app.amamovie.vo.AmaMoviePosterVO;
import com.indieProject.app.amamovie.vo.AmaMovieVO;


public class AmaMovieSearchListOk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		AmaMovieDAO m_dao=new AmaMovieDAO();
		PrintWriter out= resp.getWriter();
		String keyword=req.getParameter("keyword");
		char[] ch = new char[keyword.length()];
		System.out.println(keyword + " keyword");
		
		List<AmaMovieVO>amaMovieKorList=new ArrayList<AmaMovieVO>();
		List<AmaMovieVO>amaMovieEngList=new ArrayList<AmaMovieVO>();
		JSONArray arMovieKorResult=new JSONArray();
		JSONArray arMovieEngResult=new JSONArray();
		JSONArray noResult=new JSONArray();
		
		for(int i = 0; i < keyword.length(); i++) {
			ch[i] = keyword.charAt(i);
			System.out.println(ch[i]);
		}
		System.out.println(ch);
		
		for (int j = 0; j < ch.length; j++) {
		if(ch[j]>='가' || ch[j]<='힣') {
			System.out.println("받아온한글제목"+keyword);
			amaMovieKorList=m_dao.amaMovieKorList(keyword);
			//한글 제목으로 검색할때			
		for(AmaMovieVO m_vo: amaMovieKorList) {
			JSONObject list=new JSONObject();
			
			list.put("amaNum", m_vo.getAmaNum());
			list.put("amaTitleKor" ,m_vo.getAmaTitleKor());
			list.put("synopis",m_vo.getSynopsis());
			list.put("fileName",m_vo.getFileName());
			
		
			arMovieKorResult.add(list);
			System.out.println(m_vo.getSynopsis());
			}
		out.print(arMovieKorResult.toJSONString());
		System.out.println("영화출력 성공");

		
		}else if(ch[j]>='a' || ch[j]<='z' || ch[j]>='A' && ch[j]<='Z') {
			amaMovieEngList=m_dao.amaMovieEngList(keyword);
			System.out.println("영어제목"+keyword);
		//영어 제목으로 검색 할떄
		for(AmaMovieVO m_vo: 	amaMovieEngList) {
			JSONObject list=new JSONObject();
			
			list.put("amaNum", m_vo.getAmaNum());
			list.put("amaTitleKor" ,m_vo.getAmaTitleKor());
			list.put("synopis",m_vo.getSynopsis());
			list.put("fileName",m_vo.getFileName());
			
			arMovieEngResult.add(list);
			System.out.println(m_vo.getAmaTitleEng());
			System.out.println(m_vo.getAmaTitleKor());
			System.out.println(m_vo.getSynopsis());
		}
		out.print(arMovieEngResult.toJSONString());
		System.out.println("영화찾기 성공 2");
	
		
	}else {
		System.out.println("검색결과 없음");
		out.print(noResult.toJSONString());
	}
		}//for end 
		out.close();
		return null;
	}
}
