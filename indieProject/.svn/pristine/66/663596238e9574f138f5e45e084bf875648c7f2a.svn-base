
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
		
		
		char ch=' ';
		AmaMovieDAO m_dao=new AmaMovieDAO();
		PrintWriter out= resp.getWriter();
		String keyword=req.getParameter("keyword");
		System.out.println(keyword);
		
		List<AmaMovieVO>amaMovieKorList=new ArrayList<AmaMovieVO>();
		List<AmaMovieVO>amaMovieEngList=new ArrayList<AmaMovieVO>();
		JSONArray arMovieKorResult=new JSONArray();
		JSONArray arMovieEngResult=new JSONArray();
		

		for (int i = 0; i < keyword.length(); i++) {
			ch=keyword.charAt(i);
		}
		System.out.println(ch);
		
		
		if(ch>='가' && ch<='힣') {
			System.out.println(ch);
			amaMovieKorList=m_dao.amaMovieKorList(keyword);
			//한글 제목으로 검색할때			
		for(AmaMovieVO m_vo: amaMovieKorList) {
			JSONObject list=new JSONObject();
			
			list.put("amaNum", m_vo.getAmaNum());
			list.put("amaTitleKor" ,m_vo.getAmaTitleKor());
			list.put("synopis",m_vo.getSynopsis());
			list.put("fileName",m_vo.getFileName());
			
			arMovieKorResult.add(list);
			}
		out.print(arMovieKorResult.toJSONString());
		
		}else if(ch>='a' && ch<='z'&&ch>='A' && ch<='Z') {
			amaMovieEngList=m_dao.amaMovieEngList(keyword);
			System.out.println(ch);
		//영어 제목으로 검색 할떄
		for(AmaMovieVO m_vo: 	amaMovieEngList) {
			JSONObject list=new JSONObject();
			
			list.put("amaNum", m_vo.getAmaNum());
			list.put("amaTitleKor" ,m_vo.getAmaTitleKor());
			list.put("synopis",m_vo.getSynopsis());
			list.put("fileName",m_vo.getFileName());
			
			arMovieEngResult.add(list);
			System.out.println(m_vo.getAmaTitleEng());
		}
		out.print(arMovieEngResult.toJSONString());
		
	}else {
		System.out.println("검색결과 없음");
		out.print("no");
	}
		out.close();
		return null;
	}
}
