<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<!--
	Gravity by Pixelarity
	pixelarity.com | hello@pixelarity.com
	License: pixelarity.com/license
-->
<html>
<head>
<title>인디프로젝트</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/main.css" />
</head>
<style>
.button {
	width: 100%;
}

li {
	padding: 0 0 !important;
}

.poptrox-popup .closer:before {
	right: 0px !important;
	top: 0px !important;
	z-index: 9999 !important;
}

.poptrox-popup .closer {
	z-index: 9999;
	border-radius: 20px;
	right: 0px !important;
}

.poptrox-popup {
	top: 25px;
	padding-bottom: 0 !important;
}

.caption {
	display: none !important;
}

@media screen and (max-width: 980px) {
	#sidebarDiv {
		display: none;
	}
}

@media screen and (max-width: 1280px) {
	.col-poster {
		margin-left: auto !important;
		margin-right: auto !important;
	}
}

@media screen and (max-width: 683px) {
	.searchZone {
		width: 100%;
	}
	.oneLine1 {
		width: 100% !important;
	}
	.oneLine2 {
		width: 100% !important;
	}
	.searchBtn {
		width: 100% !important;
	}
	.row>.col-poster {
		width: 33.33333%;
	}
	.pagingTable {
		width: 100%;
	}
	.image {
		width: 80%;
	}
	.col-poster {
		margin-left: auto !important;
		margin-right: auto !important;
	}
}

@media screen and (max-width: 480px) {
	iframe {
		max-width: 330px !important;
	}
	.image {
		width: 40%;
	}
	.col-poster {
		margin-left: auto !important;
		margin-right: auto !important;
	}
}
</style>
<body class="is-preload">
	<c:set var="movies" value="${movies}"/>
	<c:set var="poster" value="${poster}"/>

	<!-- Header -->
	<jsp:include page="${pageContext.request.contextPath}/../header.jsp" />

	<!-- Main -->
	<section id="main">
		<div class="container">

			<div class="row gtr-200">
				<jsp:include page="floatMenu.jsp" />
				<div class="col-9 col-12-medium imp-medium">
					<!-- Content -->
					<section id="content">
						<header class="major">
							<h2>마이페이지</h2>
							<p>내가 올린 영화</p>
						</header>
						<div style="text-align: center;">
							<fieldset style="padding-left: 5%; margin-bottom: 0; border-width: 3px; background: white;">
								<div class="row" style="width: 100%;">
									<%-- <c:choose>
										<c:when test="${movies eq null}">
											<div style="height:400px; margin:0 auto;">
												<p>
													내가 올린 영화가 없습니다.
												</p>
											</div>
										</c:when>
										<c:otherwise> --%>
											<div class="col-poster" style="width: 30%; height: 10%; margin: 10px;">
												<div class="image fit posterTag" style="margin-bottom: 0px;">
													<img src="${pageContext.request.contextPath}/images/amaMovie/poster/testPoster1.jpg" alt="" style="" onclick=""/>
													<p>영화제목</p>
												</div>
											</div>
											<div class="col-poster" style="width: 30%; height: 10%; margin: 10px;">
												<div class="image fit posterTag" style="margin-bottom: 0px;">
													<img src="${pageContext.request.contextPath}/images/amaMovie/poster/testPoster1.jpg" alt="" style="" onclick=""/>
													<p>영화제목</p>
												</div>
											</div>
											<div class="col-poster" style="width: 30%; height: 10%; margin: 10px;">
												<div class="image fit posterTag" style="margin-bottom: 0px;">
													<img src="${pageContext.request.contextPath}/images/amaMovie/poster/testPoster1.jpg" alt="" style="" onclick=""/>
													<p>영화제목</p>
												</div>
											</div>
										<%-- </c:otherwise>
									
									</c:choose> --%>
									
								</div>
							</fieldset>
						</div>
					</section>
				</div>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<jsp:include page="${pageContext.request.contextPath}/../footer.jsp" />

	<!-- Scripts -->
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.dropotron.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.poptrox.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/floatMenu.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/myPageMovie.js"></script>
	<script>$("#mm").css("background", "rgba(144, 144, 144, 0.075)");</script>

	<script>
			if(window.matchMedia('(max-width: 9999px)').matches){
			}
		</script>

	<script src="https://unpkg.com/swiper@6.5.0/swiper-bundle.min.js"></script>

	<script>
		if(window.matchMedia('(max-width: 736px)').matches){}
	</script>

</body>
</html>