<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>아이디/비밀번호 찾기</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css" />
	</head>
	<style>

ul{
   list-style:none;
   }
.ec-base-tab { position:relative; min-width:500px; }
.ec-base-tab .menu {
    margin:0 0 20px; border-bottom-color:#202020; border-left:0; 
    box-sizing:border-box; -webkit-box-sizing:border-box; -moz-box-sizing:border-box;
}
.ec-base-tab .menu:after { content:""; display:block; clear:both; }
.ec-base-tab .menu li { float:left; }
.ec-base-tab .menu li a { display:block; min-width:187px; margin:0 0 0 -1px; padding:12px 5px 11px; border-right:1px solid #cbcdce; color:#707070; text-decoration:none; outline:0; text-align:center; word-break:break-all; background:#f2f2f2; font-weight:bold; }
.ec-base-tab .menu li:first-child a { margin-left:0; }
.ec-base-tab .menu li.selected a { position:relative; top:-1px; left:-1px; margin:0 0 -1px; border-bottom:0; color:#fff; font-weight:bold; background:#4a5164; }
.ec-base-tab .right { position:absolute; top:8px; right:10px; line-height:24px; color:#909090; }


@media screen and (max-width:500px) {

			
			#id_button{
				
				margin:0 !important;
			}
			
			#parent_tabCont1_1{
				margin-left:3% !important;
				
			}
			
			h1{
				width:100% !important;
				margin: 0 !important;	
			}
		}
		
@media screen and (max-width:480px) {
			.container{
				width: 70% !important;
				margin-left:5% !important;
				margin-right: auto !important;
			}
			
			.major{
				margin-right:auto !important;
				margin-left:35% !important;
				width: 70% !important;
			}
			
			#id_button{
				
				margin:0 !important;
			}
			
			
			
			#parent_tabCont1_1{
				margin-left:3% !important;
				
			}
			
			h1{
				width:100% !important;
				margin: 0 !important;	
			}
			
			#id_name{
				width:90% !important;
			}
			
			#email{
				width:70% !important;
			}
			
			#btn{
				width: 20% !important;
			}
			
			#btnPw{
				width: 20% !important;
			}
			
			#pwH1{
				font-size:10px !important;
			}
		}		

	</style> 
	<body class="is-preload">

		<!-- Header -->
			<jsp:include page="${pageContext.request.contextPath}/../header.jsp" />


		<!-- Main -->
			<section id="main">
				<div class="container" >
					<header class="major">
						<h2>아이디/비밀번호 찾기</h2>
					</header>

					<!-- Content -->
				<div class="ec-base-tab eTab" style="width:40%; margin:0 auto;">
			
					<ul class="menu">
						<li class="selected"><a onclick="id_find()" id="id_button" style="margin-left:40px;">아이디 찾기</a></li>
						<li><a onclick="pw_find()" id="pw_buttom">비밀번호 찾기</a></li>
					</ul>
		
					<div id="parent_tabCont1_1" style="width:80%; margin:0 auto;">
					<div id="tabCont1_1" class="tabCont" style="display: block;  margin-bottom:89px; width:110%">
					<br>
						<h1>회원정보에 등록된 이메일로  아이디가 발송됩니다.</h1>
						<br>
							<label style="margin-bottom:0px;" >이름</label>
            	      	<input type="text" name="id_name" id="id_name" value="" style="width:90%; display:inline; padding-top:27px;" />
							<label for="id_eamil" style="margin-bottom:0px;" >이메일</label>
									<div style="display:flex;">
            	      	<input type="text" name="email" id="email" value="" style="width:74%; display:inline; padding-top:27px;" />
						<a href="#" id="btn" class="button alt small"  onclick="location.href='idfindPage.jsp'">전송</a>
						</div>
						<br>
						</div>
						
					<div id="tabCont1_2" class="tabCont" style="display: none;  width:110%; ">
					<br>
						<h1 id="pwH1">회원정보에 등록된 이메일로 임시비밀번호가 발송됩니다.</h1>
						<br>
						<label style="margin-bottom:0px;" >이름</label>
            	      	<input type="text" name="pw_name" id="pw_name" value="" style="width:90%; display:inline; padding-top:27px;" />
						<label style="margin-bottom:0px;" >아이디</label>
            	      	<input type="text" name="pw_id" id="pw_id" value="" style="width:90%; display:inline; padding-top:27px;" />
							<label for="id_eamil" style="margin-bottom:0px;" >이메일</label>
									<div style="display:flex;">
            	      	<input type="text" name="email" id="email" value="" style="width:74%; display:inline; padding-top:27px;" />
						<a href="#" id="btnPw" class="button alt small"  onclick="location.href='pwfindPage.jsp'">전송</a>			
						</div>	
						</div>
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
			<script src="${pageContext.request.contextPath}/assets/js/findIdPw.js"></script>
			<script src="//code.jquery.com/jquery-3.5.1.min.js"></script>
			<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
			<script>var contextPath = "${pageContext.request.contextPath}";</script>
			

	</body>
</html>