package com.indieProject.app.board;

import java.io.File;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.indieProject.action.Action;
import com.indieProject.action.ActionForward;
import com.indieProject.app.board.dao.BoardDAO;
import com.indieProject.app.board.dao.FilesDAO;
import com.indieProject.app.board.vo.BoardImageVO;
import com.indieProject.app.board.vo.BoardVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardModifyActionOk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
			
			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");
		
			ActionForward forward=null;
			
			BoardDAO b_dao=new BoardDAO();
			FilesDAO f_dao=new FilesDAO();
			
			MultipartRequest multi=null;
			String saveFolder =req.getSession().getServletContext().getRealPath("/")+"../../../../../../indieProject/WebContent/images/board";;
			int fileSize = 5 * 1024 * 1204; // 5MB
			
			try {
				BoardVO b_vo=new BoardVO();
				multi = new MultipartRequest(req, saveFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());

				//게시글 번호와 페이지 번호 받기 
				int page= Integer.parseInt(multi.getParameter("page"));
				int boardNum=Integer.parseInt(multi.getParameter("boardNum"));
				//게시글에 업로드된 이미지 파일 가져오기
			    Enumeration<String> fileNames = multi.getFileNames();
			    if(fileNames.hasMoreElements()) {
			    	String imageNam=fileNames.nextElement();
			    	String updateImage=multi.getFilesystemName(imageNam);
			    	
			    }
				for(BoardImageVO image: b_dao.getBoardImages(boardNum)) {
					File img=new File(saveFolder, image.getImageName());
					
					if(img.exists()) {
						img.delete();
					}
				}
				
				//f_dao.deleteImages(boardNum);
				//추가한 첨부파일 넣기
			//	b_dao.insertBoardImages(boardNum, multi);
				
				b_vo.setBoardNum(boardNum);
				b_vo.setBoardContent(multi.getParameter("boardContent"));
				b_vo.setBoardImage(multi.getFilesystemName("boardImage1"));
				b_dao.updateBoard(b_vo);
				
				forward.setRedirect(true);
				forward.setPath(req.getContextPath()+"/board/BoardView.bo?boardNum="+b_vo.getBoardNum()+"&page="+page);
			
			} catch (Exception e) {
				PrintWriter out=resp.getWriter();
				resp.setContentType("text/html;charset=UTF-8");
				out.print("<script>");
				out.println("alert('게시글 수정 실패. 다시 시도해주세요.');");
				out.println("history.back();");
				out.print("</script>");
				e.printStackTrace();
				return null;
			}
				return forward;
	}

}
