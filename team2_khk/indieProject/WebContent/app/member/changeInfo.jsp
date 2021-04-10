<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

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
		@media screen and (max-width: 980px) {
			#sidebarDiv {
				display: none;
			}
		}
		
		@media screen and (min-width: 737px) {
			#step2 .row div:first-child {
				border-right: solid;
				text-align: right;
				padding-right: 1rem;
			}
			
			#step2 .row div {
				padding-bottom:1rem;
			}
			
			.checkBtn{
				padding:0;
			}
			.checkBtn li{
				width:67%;
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
									<h2>내 정보 수정</h2>
									<p>개인정보를 안전하게 보호하기 위해 비밀번호 확인 후 변경할 수 있습니다.</p>
								</header>
								<fieldset style="padding: 15px; margin-bottom: 0; border-width: 3px; background:#8080800f;">
	      				 				<section id="step1">
		      				 				<div class="row">
		      				 					<div class="col-2 col-12-small" style="margin: 1.5rem 0 0 auto;">
		      				 						<label>로그인 비밀번호</label>
		      				 					</div>
		      				 					<div class="col-5 col-12-small" style="margin: 1.25rem 0 0 0;">
		      				 						<input type="text">
		      				 					</div>
		      				 					<div class="col-2 col-12-small" style="margin:1.25rem auto 0 0;">
		      				 						<ul class="actions stacked">
		      											<li><a href="javascript:confirm()" class="button alt fit small" >확인</a></li>
		      										</ul>
		      				 					</div>
		      				 				</div>
	      				 				</section>
	      				 				<section id="step2" style="display:none;">
	      				 					<br>
		      				 				<div class="row">
												<div class="col-2 col-12-small" style="margin-left:auto;">								
													<h5>아이디</h5>																		
												</div>
												<div class="col-6 col-12-small" style="display: inherit;">								
													<textarea rows="1" style="height:90%; resize:none; overflow:hidden; padding:0.25rem 0 0.5rem 1rem;" readonly>indieProject</textarea>				
												</div>
												<div class="col-1 col-12-small" style="margin-right:auto;">											
												</div>
											</div>
											<div class="row">
												<div class="col-2 col-12-small" style="margin-left:auto;">								
													<h5>비밀번호</h5>																		
												</div>
												<div class="col-6 col-12-small">								
													<input type="password" name="" id="name" value=""/>		
												</div>
												<div class="col-1 col-12-small" style="margin-right:auto;">											
												</div>
											</div>
											<div class="row">
												<div class="col-2 col-12-small" style="margin-left:auto;">								
													<h5>비밀번호 확인</h5>																		
												</div>
												<div class="col-6 col-12-small">								
													<input type="password" name="" id="name" value=""/>	
												</div>
												<div class="col-1 col-12-small" style="margin-right:auto;">											
												</div>
											</div>
											
											<div class="row">
												<div class="col-2 col-12-small" style="margin-left:auto;">								
													<h5>이메일</h5>																		
												</div>
												<div class="col-3 col-12-small" style="display: inherit;">								
													<input type="text" name="" id="datepicker" value="기존 이메일"/>				
												</div>
												<div class="col-3 col-12-small">											
													<select name="category" id="category">
														<option value="">메일 선택</option>
														<option value="1">@naver.com</option>
														<option value="1">@daum.net</option>
														<option value="1">@gmail.com</option>
														<option value="1">@hotmail.com</option>
													</select>
												</div>
												<div class="col-1 col-12-small" style="margin-right:auto;">											
												</div>
											</div>
											<div class="row" id="sendEmail">
												<div class="col-2 col-12-small" style="margin-left:auto;">																									
												</div>
												<div class="col-6 col-12-small">								
													<ul class="actions stacked" style="margin-bottom:0;">
		      											<li><a href="javascript: sendEmail()" class="button alt small" style="width:100%" >이메일 인증 번호 전송</a></li>
		      										</ul>			
												</div>
												<div class="col-1 col-12-small" style="margin-right:auto;">											
												</div>
											</div>
											<div class="row" id="checkEmail" style="display:none;">
												<div class="col-2 col-12-small" style="margin-left:auto;">																									
												</div>
												<div class="col-4 col-12-small">								
													<input type="text" placeholder="인증 번호">			
												</div>
												<div class="col-3 col-12-small checkBtn" style="margin-right:auto;">
													<ul class="actions stacked" style="margin-bottom:0;">
		      											<li><a href="#" class="button small fit alt" >확인</a></li>
		      										</ul>										
												</div>
											</div>
											<br>
											<br>
											<div class="row">
												<div class="col-2 col-12-small" style="margin:auto; border:none;">											
													<ul class="actions stacked" style="margin-bottom:0;">
		      											<li><a href="#" class="button small fit" >완료</a></li>
		      										</ul>
												</div>
											</div>
										</section>
										
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
		<script src="${pageContext.request.contextPath}/assets/js/changeInfo.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/floatMenu.js"></script>
		
	</body>
</html>