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
				i++;
				img += "<div class='col-4 col-3-small photo'	style='text-align: center; margin-right: auto; margin-left: auto; width: 40%;'>"
					+"<div class='poster image fit' style='padding-left: 0;'>"
					+"<img id='firstImg"+i+"' class='img' alt='' src=''style='display: none; width: 100%; height: 100%;'>"
					+"<span id='span"+i+"' class='image fit'  style='padding-bottom: 30%;'> "
					+"<label for='file-input"+i+"'>"
					+"<img id='firstImg"+i+"' class='camera' src='"+contextPath+"/images/add.png' alt='영화 포스터' style='width: 50px; margin: 47% auto auto auto; cursor: pointer;' />"
					+"</label>"
					+"<input name='boardImage"+i+"' id='file-input"+i+"' type='file' onchange='preview"+i+"()' style='display: none;' />"
					+"</span></div>"
					+"<a href='#' onclick='delete"+i+"()'>삭제</a>"
					+"</div>";
			}	
			else{
				
					i++;
					img+="<div class='col-4 col-3-small photo'	style='text-align: center; margin-right: auto; margin-left: auto; width: 40%;'>"
						+"<div class='poster image fit' style='padding-left: 0;'>"
						+"<img id='firstImg"+i+"'class='img' alt='' src='"+contextPath+"/images/board/"+boardImages[j].imageName+"'style='display: block; width: 100%; height: 100%; object-fit:cover;'>"
						+"<span id='span"+i+"' class='image fit'  style='padding-bottom: 30%; display:none;'> "
						+"<label for='file-input"+i+"'>"
						+"<img id='firstImg"+i+"' class='camera' src='"+contextPath+"/images/add.png' alt='영화 포스터' style=' width: 50px; margin: 47% auto auto auto; cursor: pointer;' />"
						+"</label>"
						+"<input name='boardImage"+i+"' id='file-input"+i+"' type='file' onchange='preview"+i+"()' style='display: none;' />"
						+"</span></div>"
						+"<a href='#' onclick='delete"+i+"()'>삭제</a>"
						+"</div>";
			}
		
		}	
		photos.html(img);
		
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

