/**
 * 
 */

// 우경씨 코드
$('.posterTag').on('mouseover', function(){
					$(this).children('#detailText').css('display', 'block');
					$(this).children('#detailText').toggleClass("on");
				})
				
				$('.posterTag').on('mouseout', function(){
					$(this).children('#detailText').css('display', 'none');
					$(this).children('#detailText').toggleClass("on");
				})
				
				
				
				var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";  
  }

  slides[slideIndex-1].style.display = "block";  
}

function showplay() {
 		        var flag = $('#hidTempSynopsis');
 		        var SynopsisDiv = $('#SynopsisDiv');
 		        var flagValue = flag.val();
 		        if (flag != null) {
 		            if (flagValue == "0") {
 		                SynopsisDiv.css("height", "320px");
 		                SynopsisDiv.css("display", "block");
 		                $("#synopMore").text("닫기");
 		                flag.val("1");
 		            }
 		            else {
 		              	SynopsisDiv.css("height", "17px");
 		                SynopsisDiv.css("display", "-webkit-box");
 		                $("#synopMore").text("더보기");
 		                flag.val("0");
 		            }
 		        }
 		        else {
 		            alert("[더보기] 추가 정보가 없습니다.");
 		        }
 		    }

//-----------------------------------------------------------
$(document).ready(function(){getBoardReplies();});

// 댓글 목록
function getBoardReplies(){
	console.log(boardNum);
	$.ajax({
		url : pageContext + "/board/BoardReplyList.bo?boardNum="+ boardNum,
		type : "get",
		dataType : "json",
		success : showBoardReplies
	});
}

function showBoardReplies(replies){
	console.log(replies);
		var text = "";
		
		if(replies != null && replies.length != 0){
			$.each(replies, function(index, reply){
				text += "<tr style='background:transparent;'><td style='padding:10px;'>" + reply.memberId + "</td>";
				text += "<td valign='top' style='text-align:left;'>";
				text += "<div name='content" + (index + 1) + "' id='" + (index + 1) + "' class='re' style='width:750px; height:85px; resize:none;' readonly>" + reply.replyContent + "</div>";
				console.log(reply.memberId);
				
				if(sessionId == reply.memberId){
					console.log("여기 왜 안 들어와")
						text += "<a id='ready" + (index + 1) + "' href='javascript:updateReply(" + (index + 1) + ")style='float:right; text-decoration:none;'>[수정]</a>";
						text += "<a id='ok"+ (index + 1) + "' href='javascript:updateOkReply(" + reply.replyNum + ", " + (index + 1) + ")' style='display:none;'>[수정 완료]</a>";
						text += "<a href='javascript:deleteReply(" + reply.replyNum + ") style='float:right; text-decoration:none;'>[삭제]</a>"
				}
				text += "</td></tr>";
			});
		}else{
			text += "<tr align='center'><td align='center' width='150px' colspan='2'>댓글이 없습니다.</td></tr>";
		}
		
		$("#replyTable").html(text);
//		autosize($("textarea.re"));
}

// 댓글 등록
function insertReply(){
	var replyContent = $("textarea[name='replyContent']").val();
		$.ajax({
			url : pageContext + "/board/BoardReply.bo",
			type : "post",
			data : {"replyContent" : replyContent, "boardNum" : boardNum},
			dataType : "text",
			success : function(result){
				alert(result);
				getList();
			}
		});
}