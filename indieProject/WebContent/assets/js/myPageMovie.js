/**
 * 
 */
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
		url : contextPath + "/member/MemberLoadMyMovieListOk.me",
		type : "post",
		data : {"session_id" : session_id, "startRow" : startRow, "endRow" : endRow},
		dataType : "json",
		success : showPage,
		error:function(){//통신 오류 시
			console.log("오류");
		}
	})
}

function showPage(movies){
	if(movies != null && movies.length != 0){
		$.each(movies, function(index, movie){
			var text = "<div class='col-poster' style='width: 30%; height: 10%; margin: 10px;' onclick='moveDetail("+movie.amaNum+")'>"+
					"<div class='image fit posterTag' style='margin-bottom: 0px;'>"+
					"<img src='"+contextPath+"/images/amaMovie/"+movie.fileName+"' alt='"+movie.fileName+"'/>"+
					"<p>"+movie.amaTitleKor+"</p>"+
					"</div>"+
					"</div>";
			nowPage++;
			$("#posterRow").append(text);
			
		})
	}
}

function moveDetail(amaNum){
	location.href = contextPath+"/amaMovie/AmaMovieDetail.ama?amaNum="+amaNum;
}