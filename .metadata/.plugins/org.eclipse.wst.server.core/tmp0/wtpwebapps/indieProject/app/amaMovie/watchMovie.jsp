<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<style>
	.embed-container { 
		position: relative; 
		padding-bottom: 56.25%; 
		height: 0; overflow: 
		hidden; max-width: 100%; } 
	.embed-container iframe, .embed-container object, .embed-container embed { 
		position: absolute; 
		top: 0; 
		left: 0; 
		width: 100%; 
		height: 100%; }
		
	@media screen and (max-width: 480px) {
		.date{
			display:none;
		}
	}
	@media screen and (max-width: 741px) {

	}
	
</style>
	<head>
		<title>인디프로젝트</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />
	</head>
	<body class="is-preload">
		<c:set var="ama_vo" value="${ama_vo}" />
		<c:set var="amaReviews" value="${amaReviews}" />
		<c:set var="movieLink" value="${movieLink}" />
		<!-- Header -->
			<jsp:include page="${pageContext.request.contextPath}/../header.jsp" />

		<!-- Movie -->
			<section id="banner" class="wrapper style1 special">
				<div class="container">
						<h2><c:out value="${ama_vo.getAmaTitleKor()}"/></h2>
						<br>
						<section id="content">
							<div class="embed-container">
								<div class="col-8 col-12-medium" style="margin:auto;">
									<iframe src='${movieLink}' frameborder='0' allowfullscreen></iframe>
								</div>
							</div>
						</section>
				</div>
			</section>
		
		<!-- Review -->
			<section class="wrapper style1 special" style="padding-bottom:0;">
				<div class="container">
					<header class="major">
						<h2>영화 후기</h2>
						<p>솔직한 후기를 남겨주세요!</p>
					</header>
					<section>
						<div class="row">
							<div style="width:80%">								
								<input type="text">			
							</div>
							<div style="padding:0; width:20%">
								<ul class="actions stacked">
									<li><a href="#" class="button small fit alt" >내 감상평 남기기</a></li>
								</ul>										
							</div>
						</div>
						<div class="row">
							<div style="text-align:left;">								
								<h2>⭐5.0</h2>
							</div>
							<div>
								<ul class="actions special">
									<li><a href="#" class="button small fit">팝콘 보내기</a></li>
								</ul>			
							</div>
						</div>
					</section>
				</div>
			</section>
			<section>
				<div class="container">
					<section>
						<fieldset id="movie" style="padding: 15px; border-radius: 10px; margin-bottom: 15px;">
							<table style="margin-bottom: 0;">
								<thead>
									<tr>
										<th>아이디</th>
										<th>별점</th>
										<th>내용</th>
										<th>작성시간</th>
									</tr>
								</thead>
								<tbody>
									<c:choose>
										<c:when test="${amaReviews !=null and fn:length(amaReviews) > 0 }">
											<c:forEach var="mr_vo"  items="${amaReviews}" >
									 			<tr>
	               								<td>${mr_vo.getMemberId()}</td>
												<td>
													<c:choose>
														<c:when test="${mr_vo.getStars() eq 1}">⭐</c:when>
														<c:when test="${mr_vo.getStars() eq 2}">⭐⭐</c:when>
														<c:when test="${mr_vo.getStars() eq 3}">⭐⭐⭐</c:when>
														<c:when test="${mr_vo.getStars() eq 4}">⭐⭐⭐⭐</c:when>
														<c:when test="${mr_vo.getStars() eq 5}">⭐⭐⭐⭐⭐</c:when>
													</c:choose>
												</td>	
												<td>${mr_vo.getReplyContent()}</td>
												<td>${mr_vo.getReplyDate()}</td>
												</tr>
											</c:forEach>
										</c:when>
										<c:otherwise>
											<td colspan="4" align="center"><strong>아직 등록된 감상평이 없습니다.</strong></td>
										</c:otherwise>
									</c:choose>		
								</tbody>
							</table>
							<div style="text-align: center;">
							<c:if test="${nowPage>1}">
								<a href="${pageContext.request.contextPath}/member/memberMyReview.me?page=${nowPage-1}">[이전]</a>
							</c:if>
	
							<c:forEach var="i" begin="${startPage}" end="${endPage}">
							<c:choose>
							<c:when test="${i eq nowPage}">
								${i}&nbsp;&nbsp;
								</c:when>
								<c:otherwise>
								<a href="${pageContext.request.contextPath}/member/memberMyReview.me?page=${i}">${i}&nbsp;</a>
							</c:otherwise>
							</c:choose>
						</c:forEach>
						<c:if test="${realEndPage != nowPage}">
       							<a href="${pageContext.request.contextPath}/member/memberMyReview.me?page=${nowPage + 1}">[다음]</a>
       						</c:if>
							</div>
						</fieldset>
					</section>
				</div>
			</section>


		<!-- Footer -->
			<jsp:include page="${pageContext.request.contextPath}/../footer.jsp" />

		<!-- Scripts -->
			<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
			<script src="${pageContext.request.contextPath}/assets/js/jquery.dropotron.min.js"></script>
			<script src="${pageContext.request.contextPath}/assets/js/jquery.poptrox.min.js"></script>
			<script src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
			<script src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
			<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
			<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>

	</body>
</html>