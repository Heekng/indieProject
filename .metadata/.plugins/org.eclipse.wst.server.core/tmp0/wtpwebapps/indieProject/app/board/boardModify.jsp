<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
	
<!DOCTYPE html>
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
fieldset {
	border-radius: 7%;
	margin: 0 auto;
	padding-right: 0%;
}

.poster {
	border: dotted;
	/* width: 100%;
	height: 70%; */
}

.image.fit {
	margin: 0 0;
}
@media screen and (max-width: 480px) {
	.button {
		padding: 0 32px !important;
	}
}
</style>
<body class="is-preload">
	<c:set var="b_vo"  value="${b_vo}"/>
	<c:set var="boardImages" value="${boardImages}"/>

	<c:if test="${session_id eq null}">
		<script>
			alert("로그인 후 이용해주세요");
			location
					.replace("${pageContext.request.contextPath}/member/Login.me");
		</script>
	</c:if>

	<!-- Header -->
	<jsp:include page="${pageContext.request.contextPath}/../header.jsp" />

	<!-- Main -->
	<section id="main">
		<div class="container">
			<header class="major">
				<h2>게시글 수정</h2>
				<p>작성된 게시글은 자유 게시판에 등록됩니다.</p>
			</header>
			<div class="row">
				<!-- Text -->
				<div class="col-8 col-10-medium col-12-small" style="margin: 0 auto;">
					<fieldset
						style="border: solid; border-style: outset; padding-left: 4%; padding-top: 4%; padding-bottom: 4%; padding-right: 4%;">
						<br>
						<section style="margin-right: auto; margin-left: auto;">
							<form action="${pageContext.request.contextPath}/board/BoardModifyOk.bo" method="post" name="boardForm" enctype="multipart/form-data">
								<input type="hidden" name="boardNum" value="${b_vo.getBoardNum()}">

											<div class="photos" style="display: flex;">
								<%-- 	 <div class="col-4 col-3-small photo"
													style="text-align: center; margin-right: auto; margin-left: auto; width: 40%;">
													<div class="poster image fit" style="padding-left: 0;">
														<img id="firstImg" class="img" alt="" src=""
															style="display: none; width: 100%; height: 100%;">
														<span id="span1" class="image fit"
															style="padding-bottom: 30%;"> <label
															for="first-file-input"> <img id="firstImg2"
																class="camera"
																src="${pageContext.request.contextPath}/images/board/${images.getImageName()}"
																alt="영화 포스터"
																style="width: 50px; margin: 47% auto auto auto; cursor: pointer;" />
														</label> <input name="boardImage1" id="first-file-input"
															type="file" onchange="preview1()" style="display: none;" />
														</span>

													</div>
													<a href="#" onclick="delete1()">삭제</a>
												</div> 
												<div class="col-4 col-3-small photo"
													style="text-align: center; margin-right: auto; margin-left: auto; width: 40%;">
													<div class="poster image fit" style="padding-left: 0;">
														<img id="secondImg" alt="" src="${pageContext.request.contextPath}/images/board/${images.getImageName()}" class="img"
															style="display: none; width: 100%; height: 100%;">
														<span id="span2" class="image fit"
															style="padding-bottom: 30%;"> <label
															for="second-file-input"> <img id="secondImg2"
																class="camera"
																src="${pageContext.request.contextPath}/images/add.png"
																alt="영화 포스터"
																style="width: 50px; margin: 47% auto auto auto; cursor: pointer;" />
														</label> <input name="boardImage2" id="second-file-input"
															type="file" onchange="preview2()" style="display: none;" />
														</span>

													</div>
													<a href="#" onclick="delete2()">삭제</a>
												</div>
												<div class="col-4 col-3-small photo"
													style="text-align: center; margin-right: auto; margin-left: auto; width: 40%;">
													<div class="poster image fit" style="padding-left: 0;">
														<img id="thirdImg" alt="" src="${pageContext.request.contextPath}/images/board/${images.getImageName()}" class="img"
															style="display: none; width: 100%; height: 100%;">
														<span id="span3" class="image fit"
															style="padding-bottom: 30%;"> <label
															for="third-file-input"> <img id="thirdImg2"
																class="camera"
																src="${pageContext.request.contextPath}/images/add.png"
																alt="영화 포스터"
																style="width: 50px; margin: 47% auto auto auto; cursor: pointer;" />
														</label> <input name="boardImage3" id="third-file-input"
															type="file" onchange="preview3()" style="display: none;" />
														</span>

													</div>
													<a href="#" onclick="delete3()">삭제</a>
												</div> --%>
								</div>

								<div>
									<h3>문구입력</h3>
									<textarea name="boardContent" maxlength="50" id="boardContent"
										style="width: 100%; resize: none; margin-left: auto; margin-right: auto; margin-bottom: 1%;">${b_vo.getBoardContent()}</textarea>
									<div id="count">
									<%-- 내가 작성한 텍스트 길이 값  --%>
									<input type="hidden" id="contentCnt" value="${fn:length(b_vo.getBoardContent())}">
										<span id="current_count">0</span> <span id="maximum_count">/
											50</span> 
									<a href="javascript:boardForm.submit();" class="button" style="float: right;">수정완료</a>
									</div>
								</div>
							</form>
						</section>
					</fieldset>
				</div>
			</div>
		</div>

			<form name="deleteBoard" method="post" action="${pageContext.request.contextPath}/board/BoardDeleteOk.bo">
				<input type="hidden" name="boardNum" value="${b_vo.getBoardNum()}">
			</form>

	</section>



	<!-- Footer -->
	<jsp:include page="${pageContext.request.contextPath}/../footer.jsp" />

	<!-- Scripts -->
	<script>var photos=$(".photos");</script>
	<script>var boardNum = "${b_vo.getBoardNum()}";</script>
	<script>var contextPath = "${pageContext.request.contextPath}"; </script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.dropotron.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.poptrox.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/browser.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/breakpoints.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/util.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/boardModify.js"></script>
	<script>
	
		var contentCnt=$('#contentCnt').val();
		
		
		function preview1() {
			var firstImg1 = document.getElementById("firstImg1");
			var span1 = document.getElementById("span1");
			firstImg1.src = URL.createObjectURL(event.target.files[0]);
			firstImg1.style.display = "block";
			firstImg1.style.objectFit = "cover";
			span1.style.display = "none";

		}
		function preview2() {
			var firstImg2 = document.getElementById("firstImg2");
			var span2 = document.getElementById("span2");
			if (window.getComputedStyle(document.getElementById("firstImg1")).display == "block") {

				firstImg2.src = URL.createObjectURL(event.target.files[0]);
				firstImg2.style.display = "block";
				firstImg2.style.objectFit = "cover";

				span2.style.display = "none";
			} else {
				alert("첫번째 앨범을 채워주세요.");
			}

		}
		function preview3() {
			var firstImg3 = document.getElementById("firstImg3");
			var span3 = document.getElementById("span3");
			if (window.getComputedStyle(document.getElementById("firstImg2")).display == "block") {

				firstImg3.src = URL.createObjectURL(event.target.files[0]);
				
				firstImg3.style.display = "block";
				firstImg3.style.objectFit = "cover";

				span3.style.display = "none";
			} else {
				alert("두번째 앨범을 채워주세요.");
			}
		}

		function delete1() {
			var firstImg1 = document.getElementById("firstImg1");
			var span1 = document.getElementById("span1");
			console.log("1")
			firstImg1.style.display = "none";
			span1.style.display = "block";
		}
		function delete2() {
			var firstImg2 = document.getElementById("firstImg2");
			var span2 = document.getElementById("span2");
			console.log("2")
			firstImg2.style.display = "none";
			span2.style.display = "block";
		}
		function delete3() {
			var firstImg3 = document.getElementById("firstImg3");
			var span3 = document.getElementById("span3");
			console.log("3");
			firstImg3.style.display = "none";
			span3.style.display = "block";
		}
		
		$(document).ready(function(){
			var cnt = document.getElementById("current_count");
			cnt.innerHTML= document.getElementById("boardContent").value.length;	
		});
		

		$('textarea')
				.keyup(
						function() {
							var characterCount = document.getElementById("boardContent").value.length, current_count =document.getElementById("current_count"), maximum_count = $('#maximum_count'), count =$('#count');

							current_count.innerHTML = document.getElementById("boardContent").value.length;
						});
	</script> 
</body>
</html>