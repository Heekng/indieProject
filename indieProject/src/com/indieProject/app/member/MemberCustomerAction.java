package com.indieProject.app.member;

import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;
import com.indieProject.app.member.dao.MemberDAO;

public class MemberCustomerAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String memberId=req.getParameter("memberId");
		String email=req.getParameter("email");
		String category=req.getParameter("category");
		String message=req.getParameter("message");
		
		MemberDAO m_dao=new MemberDAO();
		PrintWriter out=resp.getWriter();
		
		System.out.println(memberId);
		System.out.println(email);
		System.out.println(category);
		System.out.println(message);
		
		if(!m_dao.checkId(memberId) || !m_dao.checkEmail(email)) {
			//없는 회원
			out.println("no");
		} else {
			//사용가능한 이메일
			System.out.println("사용가능한 이메일");
			
			//mail server 설정
           String host = "smtp.naver.com";
           String user = "swe0014@naver.com"; //자신의 네이버 계정
           String password = "";//자신의 네이버 패스워드
           
           //문의 내용 받을 메일 받을 주소
           String to_email ="we0014@naver.com";
           
           //SMTP 서버 정보를 설정한다.
           Properties props = new Properties();
           props.put("mail.smtp.host", host);
           props.put("mail.smtp.port", 587);
           props.put("mail.smtp.auth", "true");
           
           Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication() {
                   return new PasswordAuthentication(user,password);
               }
           });
           
           //email 전송
           try {
               MimeMessage msg = new MimeMessage(session);
               msg.setFrom(new InternetAddress(user, "IndieProject"));
               msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to_email));
               
               //메일 제목
               msg.setSubject(memberId+"님의"+category+"문의");
               //메일 내용
               msg.setText(message);
               
               Transport.send(msg);
               System.out.println("이메일 전송완료");
               
           }catch (Exception e) {
        	   out.println("fail");
        	   System.out.println("전송 실패");
               e.printStackTrace();// TODO: handle exception    
		}
         out.println("ok");	
		}
		
		return null;
	}

}