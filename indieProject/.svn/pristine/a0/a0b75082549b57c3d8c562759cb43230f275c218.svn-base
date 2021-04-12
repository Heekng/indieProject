/**
 * 고객센터
 */

 
function submit(){
	var id = $("input[name='memberId']").val();
	var email = $("input[name='email']").val();
	var message = $("textarea[name='message']").attr('value');
	//카테고리 값 가져오기
	var category=$("category[name='category']").val();
	var form=document.customerForm;
	
	
	if(id=""){
		alert("아이디를 입력해주세요.");
		return false;
	}else if(email=""){
		alert("이메일을 입력해주세요.");
		return false;
	}else if(category==""){
		alert("문의내용을 선택해주세요");
		return false;
	}else if(message=""){
		alert("문의내용을 입력해주세요.");
		return false;
	}else {
		form.submit();
		$.ajax({
		url:contextPath+"/member/MemberCustomerAction.me",
		type:"post",
		data:({"mamberId":memberId, "email":email,"message":message,"category":category}),
		datatype:"text",
		success:function(result){
			if(result.trim="no"){
				alert("없는 회원입니다.");
			}else{
				alert("문의내역이 정상적으로 접수되었습니다.");
				//창 새로고침 해주기 
			}
		},
		error:function(){//통신 오류 시
			console.log("오류");
		}
	})
}
	
	
	
}