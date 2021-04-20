/**
 * 게시글 수정
 */

$(document).ready(function(){
	imageList();});


//이미지 목록 가져오기 

function imageList(){
	console.log("들어왔니");
	$.ajax({
		url :contextPath +"/board/BoardImageListOK.bo?boardNum="+boardNum,
		type:"get",
		dataType:"json",
		
		success : showImage
	});
}

	
	function showImage(boardImages){

		var i=0;		
					
		var img = "";
		for(let j = 0; j < 3; j++){
			if(boardImages[j] == null){
				console.log("if"+ i);
				i++;
				console.log("if"+ i);
				img += "<div id='img"+i+"' class='col-4 col-3-small photo'	style='text-align: center; margin-right: auto; margin-left: auto; width: 40%;'>"
					+"<div class='poster image fit' style='padding-left: 0;'>"
					+"<img id='upImg"+i+"' class='img' alt='' src='' style='display: none; width: 100%; height: 100%;'>"
					+"<span id='span"+i+"' class='image fit'  style='padding-bottom: 30%;'> "
					+"<label for='file-input"+i+"'>"
					+"<img id='Img"+(i+1)+"' class='camera' src='"+contextPath+"/images/add.png' alt='영화 포스터' style='width: 50px; margin: 47% auto auto auto; cursor: pointer;' />"
					+"</label>"
					+"<input name='boardImage"+i+"' id='file-input"+i+"' type='file' onchange='preview"+i+"()' style='display: none;' />"
					+"</span></div>"
					+"<a onclick='delete"+i+"()' style='cursor: pointer;'>삭제</a>"
					+"</div>";
			}	
			else{
				console.log("처음은 여기일 듯"+ i);
					i++;
				console.log("else"+ i);
					img+="<div id='img"+i+"' class='col-4 col-3-small photo'	style='text-align: center; margin-right: auto; margin-left: auto; width: 40%;'>"
						+"<div class='poster image fit' style='padding-left: 0;'>"
						+"<img id='upImg"+i+"'class='img' alt='' src='"+contextPath+"/images/board/"+boardImages[j].imageName+"'style='display: block; width: 100%; height: 100%; object-fit:cover;'>"
						+"<span id='span"+i+"' class='image fit'  style='padding-bottom: 30%; display:none;'> "
						+"<label for='file-input"+i+"'>"
						+"<img id='Img"+(i+1)+"' class='camera' src='"+contextPath+"/images/add.png' alt='영화 포스터' style=' width: 50px; margin: 47% auto auto auto; cursor: pointer;' />"
						+"</label>"
						+"<input name='boardImage"+i+"' id='file-input"+i+"' type='file' onchange='preview"+i+"()' style='display: none;' />"
						+"</span></div>"
						+"<a onclick='delete"+i+"()' style='cursor: pointer;'>삭제</a>"
						+"</div>";
			}
		
			photos.html(img);
		}	
		
//		
//		if(boardImages!= null && boardImages.length != 0 ){
//			$.each(boardImages, function(index, boardImage){
//				console.log(boardImage.imageName);
//				i++;
//				image+="<div class='col-4 col-3-small photo'	style='text-align: center; margin-right: auto; margin-left: auto; width: 40%;'>"
//					+"<div class='poster image fit' style='padding-left: 0;''>"
//					+"<img id='firstImg"+i+"'class='img' alt='' src='"+contextPath+"/images/board/"+boardImage.imageName+"'style='display: block; width: 100%; height: 100%; object-fit:cover;'>"
//					+"<span id='span"+i+"' class='image fit'  style='padding-bottom: 30%; display:none;'> "
//					+"<label for='first-file-input'>"
//					+"<img id='firstImg2' class='camera' src='"+contextPath+"/images/add.png' alt='영화 포스터' style=' width: 50px; margin: 47% auto auto auto; cursor: pointer;' />"
//					+"</label>"
//					+"<input name='boardImage1' id='first-file-input' type='file' onchange='preview"+i+"()' style='display: none;' />"
//					+"</span></div>"
//					+"<a  onclick='delete"+i+"()'>삭제</a>"
//					+"</div>"
//
//					console.log(i);
//				
//				if(boardImages== null){
//					photos.html(noimage);	
//				}
//			});
//		}else{
//			photos.html(noimage);
//		}	
//		photos.html(image);
		console.log("출력");


	}//showImage end 

//---------------------------------------------------------------------
function preview1() {
	upImg1.src = URL.createObjectURL(event.target.files[0]);
	upImg1.style.display = "block";
	upImg1.style.objectFit = "cover";
	span1.style.display = "none";
	img2.style.visibility = "visible";
}
function preview2() {
	upImg2.src = URL.createObjectURL(event.target.files[0]);
	upImg2.style.display = "block";
	upImg2.style.objectFit = "cover";
	span2.style.display = "none";
	img3.style.visibility = "visible";
}
function preview3() {
	upImg3.src = URL.createObjectURL(event.target.files[0]);
	upImg3.style.display = "block";
	upImg3.style.objectFit = "cover";
	span3.style.display = "none";
}

function delete1() {
	console.log("Img1"+upImg1);
	console.log("Img2"+upImg2);
	console.log("Img3"+upImg3);
	upImg1.style.display = "none";
	upImg1.src = "";
	span1.style.display = "block";
	if(upImg2.style.display == "none" & upImg3.style.display == "none"){		
		img2.style.visibility = "hidden";
		img3.style.visibility = "hidden";
	}
	var agent = navigator.userAgent.toLowerCase();
	if ( (navigator.appName == 'Netscape' && navigator.userAgent.search('Trident') != -1) || (agent.indexOf("msie") != -1) ){
	    // ie 일때 input[type=file] init.
	    $("#file-input1").replaceWith( $("#file-input1").clone(true) );
	} else {
	    //other browser 일때 input[type=file] init.
	    $("#file-input1").val("");
	}
}
function delete2() {
	upImg2.style.display = "none";
	upImg2.src = "";
	span2.style.display = "block";
	console.log($("#file-input3").val());
	if(upImg3.style.display == "none"){		
		img3.style.visibility = "hidden";
	}
	var agent = navigator.userAgent.toLowerCase();
	if ( (navigator.appName == 'Netscape' && navigator.userAgent.search('Trident') != -1) || (agent.indexOf("msie") != -1) ){
	    $("#file-input2").replaceWith( $("#file-input2").clone(true) );
	} else {
	    $("#file-input2").val("");
	}
}
function delete3() {
	upImg3.style.display = "none";
	upImg3.src = "";
	span3.style.display = "block";
	if(upImg2.style.display == "none"){		
		img3.style.visibility = "hidden";
	}
	var agent = navigator.userAgent.toLowerCase();
	if ( (navigator.appName == 'Netscape' && navigator.userAgent.search('Trident') != -1) || (agent.indexOf("msie") != -1) ){
	    // ie 일때 input[type=file] init.
	    $("#file-input3").replaceWith( $("#file-input3").clone(true) );
	} else {
	    //other browser 일때 input[type=file] init.
	    $("#file-input3").val("");
	}
}

$('textarea')
	.keyup(
		function() {
			var characterCount = $(this).val().length, current_count = $('#current_count'), maximum_count = $('#maximum_count'), count = $('#count');
			current_count.text(characterCount);
		});

function submit(){
	console.log($("#file-input1").val());
	if($("#file-input1").val() == ""){
		alert("대표 사진 첨부는 필수입니다.");
		return;
	}
	if($('textarea').val() == ""){
		alert("내용을 입력해 주십시오.");
		$('textarea').focus();
		return;
	}
	
	boardForm.submit();
}

$(document).ready(function(){
	  //Show contextmenu:
	$("#bImg").on("mouseover", function(e){
	  //Get window size:
	  var winWidth = $(document).width();
	  var winHeight = $(document).height();
	  //Get pointer position:
	  var posX = e.pageX;
	  var posY = e.pageY;
	  //Get contextmenu size:
	  var menuWidth = $("#bImgHelp").width();
	  var menuHeight = $("#bImgHelp").height();
	  //Security margin:
	  var secMargin = 10;
	  //Prevent page overflow:
	  if(posX + menuWidth + secMargin >= winWidth
	  && posY + menuHeight + secMargin >= winHeight){
	    //Case 1: right-bottom overflow:
	    posLeft = posX - menuWidth - secMargin + "px";
	    posTop = posY - menuHeight - secMargin + "px";
	  }
	  else if(posX + menuWidth + secMargin >= winWidth){
	    //Case 2: right overflow:
	    posLeft = posX - menuWidth - secMargin + "px";
	    posTop = posY + secMargin + "px";
	  }
	  else if(posY + menuHeight + secMargin >= winHeight){
	    //Case 3: bottom overflow:
	    posLeft = posX + secMargin + "px";
	    posTop = posY - menuHeight - secMargin + "px";
	  }
	  else {
	    //Case 4: default values:
	    posLeft = posX + secMargin + "px";
	    posTop = posY + secMargin + "px";
	  };
	  //Display contextmenu:
	  $("#bImgHelp").css({
	    "left": posLeft,
	    "top": posTop
	  }).show();
	  //Prevent browser default contextmenu.
	  return false;
	});
	//Hide contextmenu:
	$("#bImg").on("mouseout", function(){
	  $("#bImgHelp").hide();
	});
});
