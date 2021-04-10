<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />
	</head>
	<style>
		.button {
			width:100%;
		}
		li {
			padding:0 0 !important;
		}
		.popcornDisplay {
			display:inline-block;
			margin-left:30px;
			text-align: center;
			border:solid;
			border-radius: 10px;
			padding: 10px;
			vertical-align: text-bottom;
		}
		@media screen and (max-width: 980px) {
			#sidebarDiv {
				display: none;
			}
		}
		@media screen and (max-width: 736px) {
			.myDiv {
				width: 32% !important;
			}
			#popcornBtnDiv {
				width:70%;
				margin-left: 0 !important;
			}
		}
		@media screen and (max-width: 480px) {
			.popcornDisplay {
				margin-left:0;
			}
			#popcornBtnDiv {
				width:100%;
				margin-left: 0 !important;
			}
		}
		
		#floatMenu {
			position:absolute;
			width:18%;
		}
		
	</style>
	<body class="is-preload">

		<!-- Header -->
		<jsp:include page="${pageContext.request.contextPath}/../header.jsp" />

		<!-- Main -->
			<section id="main">
				<div class="container">
					
					<div class="row gtr-200">
						<div id="sidebarDiv" class="col-3 col-12-medium" style="order:-2;">
							<fieldset id="floatMenu" style="border:solid; padding:10px; border-radius: 10px; display:block; border-width: 3px;">
								<!-- Sidebar -->
								<section id="sidebar">
										<h3>나의 인디프로젝트</h3>
										<ul class="actions stacked">
											<li><a href="#" class="button small alt">내 정보 수정</a></li>
											<li><a href="#" class="button small alt">나의 팝콘</a></li>
											<li><a href="#" class="button small alt">내가 올린 영화</a></li>
											<li><a href="#" class="button small alt">내가 쓴 게시글</a></li>
											<li><a href="#" class="button small alt">내가 쓴 댓글</a></li>
										</ul>
								</section>
							</fieldset>
						</div>
						<div class="col-9 col-12-medium imp-medium">
							<!-- Content -->
							<section id="content">
								<header class="major">
									<h2>마이페이지</h2>
									<p>ㅇㅇㅇ님 안녕하세요!</p>
								</header>
								<div class="image fit" style="margin:0;">
									<img alt="" src="${pageContext.request.contextPath}/images/film.png">
								</div>
								<fieldset style="padding: 15px; margin-bottom: 0; border-width: 3px; background:#8080800f;">
									<div style="height:60px;">
										<div style="float: left;"><h2 style="margin-bottom:0;">내 정보</h2></div>
										<div style="text-align: right; margin-right: 11px;"><a href="#" style="text-decoration:none;">내 정보 수정하기 ></a></div>
									</div>
									<div>
										<div style="text-align: center;">
											<div class="myDiv" style="border:solid; padding:20px 10px; display:inline-block; border-radius: 10px; width:23%">
												<h3>내가 올린 영화</h3>
												<span style="font-size: 2em;">5개</span>
											</div>
											<div class="myDiv" style="border:solid; padding:20px 10px; display:inline-block; border-radius: 10px; width:23%">
												<h3>내가 작성한 리뷰</h3>
												<span style="font-size: 2em;">13개</span>
											</div>
											<div class="myDiv" style="border:solid; padding:20px 10px; display:inline-block; border-radius: 10px; width:23%">
												<h3>내가 작성한 댓글</h3>
												<span style="font-size: 2em;">363개</span>
											</div>
										</div>
									</div>
								</fieldset>
								<div class="image fit" style="margin:0;">
									<img alt="" src="${pageContext.request.contextPath}/images/film.png">
								</div>
								<hr style="margin-bottom:0;">
								<fieldset style="padding: 15px; border-radius: 10px; margin-bottom: 15px;">
									<div style="height:60px;">
										<div style="float: left;"><h2 style="margin-bottom:0;">나의 팝콘</h2></div>
										<!-- <div style="text-align: right; margin-right: 11px;"><a href="#" style="text-decoration:none;">자세히 보기 ></a></div> -->
									</div>
									<div style="text-align: center;">
										<div style="display:inline-block; vertical-align: text-bottom;">
											<img style="width:100px;" alt="" src="${pageContext.request.contextPath}/images/popcorn_icon.png">
										</div>
										<div class="popcornDisplay">
											<h3 style="font-size: 1.5em;">보유 팝콘</h3>
											<span style="font-size:2em;">123개</span>
										</div>
										<div class="popcornDisplay">
											<h3 style="font-size: 1.5em;">받은 팝콘</h3>
											<span style="font-size:2em;">234개</span>
										</div>
										<div id="popcornBtnDiv" style="display:inline-block;  margin-left:30px; text-align: center; vertical-align: text-bottom;">
											<a href="#" class="button primary small">충전하기</a>
											<a href="#" class="button primary small">자세히 보기</a>
										</div>
									</div>
								</fieldset>
								<hr style="margin-bottom: 0;">
								<fieldset style="padding: 15px; border-radius: 10px; margin-bottom: 15px;">
									<div style="height:60px;">
										<div style="float: left;"><h2>내가 올린 영화</h2></div>
										<div style="text-align: right; margin-right: 11px;"><a href="#" style="text-decoration:none;">더보기 ></a></div>
									</div>
									<table style="margin-bottom: 0;">
										<thead>
											<tr>
												<th>영화 제목</th>
												<th>작성자</th>
												<th>조회수</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>영화제목입니다.</td>
												<td>ㅇㅇㅇ</td>
												<td>1</td>
											</tr>
											<tr>
												<td>영화제목입니다.</td>
												<td>ㅇㅇㅇ</td>
												<td>1</td>
											</tr>
											<tr>
												<td>영화제목입니다.</td>
												<td>ㅇㅇㅇ</td>
												<td>1</td>
											</tr>
											<tr>
												<td>영화제목입니다.</td>
												<td>ㅇㅇㅇ</td>
												<td>1</td>
											</tr>
											<tr>
												<td>영화제목입니다.</td>
												<td>ㅇㅇㅇ</td>
												<td>1</td>
											</tr>
										</tbody>
									</table>
								</fieldset>
								<hr style="margin-bottom: 0;">
								<fieldset style="padding: 15px; border-radius: 10px; margin-bottom: 15px;">
									<div style="height:60px;">
										<div style="float: left;"><h2>내가 작성한 게시글</h2></div>
										<div style="text-align: right; margin-right: 11px;"><a href="#" style="text-decoration:none;">더보기 ></a></div>
									</div>
									<table style="margin-bottom: 0;">
										<thead>
											<tr>
												<th>번호</th>
												<th>제목</th>
												<th>작성자</th>
												<th>조회수</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>N</td>
												<td>내가 작성한 게시글 내용입니다.</td>
												<td>ㅇㅇㅇ</td>
												<td>1</td>
											</tr>
											<tr>
												<td>N</td>
												<td>내가 작성한 게시글 내용입니다.</td>
												<td>ㅇㅇㅇ</td>
												<td>1</td>
											</tr>
											<tr>
												<td>N</td>
												<td>내가 작성한 게시글 내용입니다.</td>
												<td>ㅇㅇㅇ</td>
												<td>1</td>
											</tr>
											<tr>
												<td>N</td>
												<td>내가 작성한 게시글 내용입니다.</td>
												<td>ㅇㅇㅇ</td>
												<td>1</td>
											</tr>
											<tr>
												<td>N</td>
												<td>내가 작성한 게시글 내용입니다.</td>
												<td>ㅇㅇㅇ</td>
												<td>1</td>
											</tr>
										</tbody>
									</table>
								</fieldset>
								<hr style="margin-bottom: 0;">
								<fieldset style="padding: 15px; border-radius: 10px; margin-bottom: 15px;">
									<div style="height:60px;">
										<div style="float: left;"><h2>내가 작성한 댓글</h2></div>
										<div style="text-align: right; margin-right: 11px;"><a href="#" style="text-decoration:none;">더보기 ></a></div>
									</div>
									<table style="margin-bottom: 0;">
										<thead>
											<tr>
												<th>글 번호</th>
												<th>글 제목</th>
												<th>내용</th>
												<th>작성시간</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>N</td>
												<td>내가 댓글을 작성한 글 제목</td>
												<td>내가 작성한 댓글 내용입니다.</td>
												<td>ㅇㅇㅇ</td>
											</tr>
											<tr>
												<td>N</td>
												<td>내가 댓글을 작성한 글 제목</td>
												<td>내가 작성한 댓글 내용입니다.</td>
												<td>ㅇㅇㅇ</td>
											</tr>
											<tr>
												<td>N</td>
												<td>내가 댓글을 작성한 글 제목</td>
												<td>내가 작성한 댓글 내용입니다.</td>
												<td>ㅇㅇㅇ</td>
											</tr>
											<tr>
												<td>N</td>
												<td>내가 댓글을 작성한 글 제목</td>
												<td>내가 작성한 댓글 내용입니다.</td>
												<td>ㅇㅇㅇ</td>
											</tr>
											<tr>
												<td>N</td>
												<td>내가 댓글을 작성한 글 제목</td>
												<td>내가 작성한 댓글 내용입니다.</td>
												<td>ㅇㅇㅇ</td>
											</tr>
										</tbody>
									</table>
								</fieldset>
								
								
								
								
							</section>
						</div>
					</div>
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
		<script src="${pageContext.request.contextPath}/assets/js/floatMenu.js"></script>
		
		<script>
			if(window.matchMedia('(max-width: 9999px)').matches){
			}
		</script>
		
	</body>
</html>