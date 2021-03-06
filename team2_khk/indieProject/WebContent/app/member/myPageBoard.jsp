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
		
		.poptrox-popup .closer:before {
	right: 0px !important;
	top: 0px !important;
	z-index:9999 !important;
}
.poptrox-popup .closer {
	z-index: 9999;
	border-radius: 20px;
	right: 0px !important;
}
.poptrox-popup {
	top:25px;
	padding-bottom:0 !important;
}
.caption {
	display:none !important;
}
		
		@media screen and (max-width: 980px) {
			#sidebarDiv {
				display: none;
			}
		
		}
		
@media screen and (max-width: 1280px){
	
	.col-poster{
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

	.image{
		width:80%;
	}
	
	.col-poster{
		margin-left: auto !important;
		margin-right: auto !important;
	}
	
}


@media screen and (max-width: 480px) {
	iframe {
		max-width: 330px !important;
	}
	
	.image{
		width:40%;
	}
	
	.col-poster{
		margin-left: auto !important;
		margin-right: auto !important;
	}
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
							<fieldset style="border:solid; padding:10px; border-radius: 10px; display:block; border-width: 3px;">
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
									<p>내 게시물</p>
								</header>
							<div id="gallery" style="text-align: center;">

								<!-- <div style="text-align: center;">
									<h2 style="font-size: 2.5em;">마이페이지</h2>
									<h3 style="font-size: 1.5em;">나의 게시물 상세보기</h3>
								</div> -->
																
								<fieldset style="padding-left:5%;  margin-bottom: 0; border-width: 3px; background:white;">


								<div class="row" style=" width:100%;">
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
											
										</div>
										
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>								
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
									<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
								<div class="col-poster" style="width:30%; height:10%; margin:10px;">
									<div class="image fit posterTag" style="margin-bottom: 0px;">
										<img src="${pageContext.request.contextPath}/images/testImage.jpg" alt=""
											style="" />
										<div id="detailText"
											style="padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;">
											
											<a class="button primary small" href="${pageContext.request.contextPath}/app/board/boardView.jsp"
												data-poptrox="iframe,800x500"
												style="width:80%; height:100%; background:transparent;">
												
											</a>
										</div>
									</div>
								<a href="#" data-poptrox="ignore" style="text-decoration: none;">삭제</a>
								</div>
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
		<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/jquery.dropotron.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/jquery.poptrox.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
		
		<script>
			if(window.matchMedia('(max-width: 9999px)').matches){
			}
		</script>
		
				<script src="https://unpkg.com/swiper@6.5.0/swiper-bundle.min.js"></script>
			
	<script>
		$('.posterTag').on('mouseover', function(){
			//event.stopPropagation();
			$(this).children('#detailText').css('display', 'block');
			$(this).children('#detailText').toggleClass("on");
		})
		
		$('.posterTag').on('mouseout', function(){
			$(this).children('#detailText').css('display', 'none');
			$(this).children('#detailText').toggleClass("on");
		})
	
		$('.moveBtn').on('mouseover', function(){
			$(this).toggleClass("btnMouseOver");
		})
		$('.moveBtn').on('mouseout', function(){
			$(this).toggleClass("btnMouseOver");
		})
		
		$('.detailText').on('click', function(){
			
		});
		
		if(window.matchMedia('(max-width: 736px)').matches){}
		
		
		var swiper = new Swiper('.swiper-container', {
			spaceBetween : 10,
			loop : false,
			loopFillGroupWithBlank : true,
			allowTouchMove: false,
			pagination : {
				el : '.swiper-pagination',
				clickable : true,
			},
			navigation : {
				nextEl : '.swiper-button-next',
				prevEl : '.swiper-button-prev',
			},
			breakpoints : { // 반응형 설정이 가능 width값으로 조정
				768: {
					slidesPerView : 5,
					slidesPerGroup : 5
				},
				1: {
					slidesPerView : 3,
					slidesPerGroup : 3
				}
			}
		});

		//poptrox
		$(function() {
			$('#gallery').poptrox({
				usePopupCaption : true,
				usePopupNav : true,
				popupPadding : 0
			});
		});
		
	
	</script>
		
	</body>
</html>