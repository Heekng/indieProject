$(document).on("mouseover", ".posterTag", function(){
	$(this).children().children('#detailText').css('display', 'block');
	$(this).children().children('#detailText').toggleClass("on");
})

$(document).on("mouseout", ".posterTag", function(){
	$(this).children().children('#detailText').css('display', 'none');
	$(this).children().children('#detailText').toggleClass("on");
})

//poptrox
$(function() {
	$('.gallery').poptrox({
		usePopupCaption : true,
		usePopupNav : true,
		popupPadding : 0
	});
});

function link(boardNum){
	console.log(sessionId);
	if (sessionId == ""){
		alert("로그인 후 이용해주세요");
		location.replace(contextPath+"/member/Login.me");
	}else{
		$(".LinkBoardView").attr("href", contextPath + "/board/BoardView.bo?boardNum="+boardNum);
	}
}

var nowPage = 1;

$(window).scroll(function(){   //스크롤이 최하단 으로 내려가면 리스트를 조회하고 page를 증가시킨다.
	if($(window).scrollTop() >= $(document).height() - $(window).height()){
		loadPage();
	}
});

function loadPage(){
	var startRow = (nowPage * boardSize) + 1;
	var endRow;
	if(totalPageCnt <= nowPage){
		return false;
	}
	if(totalPageCnt == (nowPage+1)){
		endRow = totalCnt;
	}else{
		endRow = (startRow + boardSize) - 1;
	}
	
	$.ajax({
		url : contextPath + "/board/LoadBoardList.bo",
		type : "post",
		data : {"startRow" : startRow, "endRow" : endRow},
		dataType : "json",
		success : showPage,
		error:function(){//통신 오류 시
			console.log("오류");
		}
	})
}

function showPage(boards){
	if(boards != null && boards.length != 0){
		$.each(boards, function(index, board){
			var text = "<div class='col-poster' style='width: 30%; height: 10%; margin: 10px;'>"+
					"<div class='image fit posterTag gallery' style='margin-bottom: 0px;'>"+
					"<img src='"+contextPath+"/images/board/"+board.boardImage+"'/>"+
					"<a href='"+contextPath+"/board/BoardView.bo?boardNum="+board.boardNum+"'"+
					"onclick='link("+board.boardNum+")'"+
					"data-poptrox='iframe,800x500' style='width: 80%; height: 100%; background: transparent;'>"+
					"<span id='detailText' style='padding: 5px; display: none; position: absolute; top: 0; left: 0; bottom: 0; right: 0; color: white; background-color: rgba(0, 0, 0, 0.69); border-radius: 10px;'>"+
					board.boardContent+"</span></a></div></div>";
			$("#posterRow").append(text);
			$(function() {
				$('.gallery').poptrox({
					usePopupCaption : true,
					usePopupNav : true,
					popupPadding : 0
				});
			});
		});
		nowPage++;
	}
}