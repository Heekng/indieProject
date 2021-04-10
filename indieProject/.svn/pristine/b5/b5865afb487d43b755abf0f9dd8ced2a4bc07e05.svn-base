/**
 * 
 */

			function search(){
				var date1 = document.getElementById("date1").value.toString();
				var date2 = document.getElementById("date2").value.toString();
				var newDate1 = new Date(date1);
				var newDate2 = new Date(date2);
				console.log(newDate1.getTime());
				console.log(newDate2.getTime());
				if(date1 == "" || date2 == ""){
					alert("기간이 올바르지 않습니다.");
					return false;
				}
				else if(newDate2.getTime() <= newDate1.getTime()){
					alert("기간이 올바르지 않습니다.");
					return false;
				}
				else{
					
					console.log(date1);
					console.log(date2);
					$.ajax({
						url: contextPath + "/member/MemberMyPopcornDateSearchAction.me",
					    type: "POST",
						data: {"date1" : date1,"date2" :date2},
						dataType: "text",
						success:function(result){
							var table = document.getElementById("table");							
							if(result.trim() != null){
								console.log("if 들어옴");
								console.log(result + "result");
								var k = 1;

								for(let i = 0; i < result.length; i++){
									var popCorn = result.trim().split(",");
									
									var row = table.insertRow(i+1);
									
									console.log(popCorn);
									var popCornEl;
									for (let j = 0; j < popCorn[i].length; j++) {
										console.log("for 들어옴");
										popCornEl = popCorn[i].split("+");
										

										

									}
									  var cell1 = row.insertCell(0);
									  var cell2 = row.insertCell(1);
									  var cell3 = row.insertCell(2);
									  var cell4 = row.insertCell(3);
									  var cell5 = row.insertCell(4);
									  var cell6 = row.insertCell(5);
									  cell1.innerHTML = k;
									  cell2.innerHTML = popCornEl[0];
									  cell3.innerHTML = popCornEl[1];
									  cell4.innerHTML = popCornEl[2] * 1000;
									  cell5.innerHTML = popCornEl[3];
									  cell6.innerHTML = popCornEl[4];
									k++;
								}
							}else{
								popCornTr.innerHTML = "후원 내역이 업습니다.";
							}
						},
						error:function(data){
					    	  console.log(data);
					    	console.log("기간 조회 오류");
					    }
					});
				}
				
			}
	
			$("#check_module1").click(function () {
				var IMP = window.IMP; // 생략가능
				IMP.init('imp35108939');
				// 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
				// i'mport 관리자 페이지 -> 내정보 -> 가맹점식별코드
				IMP.request_pay({
					pg: 'inicis', // version 1.1.0부터 지원.
					/*
					'kakao':카카오페이,
					html5_inicis':이니시스(웹표준결제)
					'nice':나이스페이
					'jtnet':제이티넷
					'uplus':LG유플러스
					'danal':다날
					'payco':페이코
					'syrup':시럽페이
					'paypal':페이팔
					*/
					pay_method: 'card',
					/*
					'samsung':삼성페이,
					'card':신용카드,
					'trans':실시간계좌이체,
					'vbank':가상계좌,
					'phone':휴대폰소액결제
					*/
					merchant_uid: 'merchant_' + new Date().getTime(),
					/*
					merchant_uid에 경우
					https://docs.iamport.kr/implementation/payment
					위에 url에 따라가시면 넣을 수 있는 방법이 있습니다.
					참고하세요.
					나중에 포스팅 해볼게요.
					*/
					name: '주문명:결제테스트',
					//결제창에서 보여질 이름
					amount: 100,
					//가격
					buyer_email: 'iamport@siot.do',
					buyer_name: '구매자이름',
					buyer_tel: '010-1234-5678',
					buyer_addr: '서울특별시 강남구 삼성동',
					buyer_postcode: '123-456',
					m_redirect_url: 'https://www.yourdomain.com/payments/complete'
				/*
				모바일 결제시,
				결제가 끝나고 랜딩되는 URL을 지정
				(카카오페이, 페이코, 다날의 경우는 필요없음. PC와 마찬가지로 callback함수로 결과가 떨어짐)
				*/
				}, function (rsp) {
					console.log(rsp);
						if (rsp.success) {
							var msg = '결제가 완료되었습니다.';
							$.ajax({
								url: contextPath + "/member/MemberMyPopcornCharge.me?popcorn="+100,
							    type: "get",
								dataType: "text",
								success:function(result){
									alert(msg);
									location.reload();
								},
								error:function(data){
							    	  console.log(data);
							    	console.log("팝콘 충전 오류");
							    }
							});
						} else {
						var msg = '결제에 실패하였습니다.';
					msg += '에러내용 : ' + rsp.error_msg;
					alert(msg);
				}
					
				});
			});
			$("#check_module2").click(function () {
				var IMP = window.IMP; // 생략가능
				IMP.init('imp35108939');
				// 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
				// i'mport 관리자 페이지 -> 내정보 -> 가맹점식별코드
				IMP.request_pay({
					pg: 'inicis', // version 1.1.0부터 지원.
					/*
					'kakao':카카오페이,
					html5_inicis':이니시스(웹표준결제)
					'nice':나이스페이
					'jtnet':제이티넷
					'uplus':LG유플러스
					'danal':다날
					'payco':페이코
					'syrup':시럽페이
					'paypal':페이팔
					*/
					pay_method: 'card',
					/*
					'samsung':삼성페이,
					'card':신용카드,
					'trans':실시간계좌이체,
					'vbank':가상계좌,
					'phone':휴대폰소액결제
					*/
					merchant_uid: 'merchant_' + new Date().getTime(),
					/*
					merchant_uid에 경우
					https://docs.iamport.kr/implementation/payment
					위에 url에 따라가시면 넣을 수 있는 방법이 있습니다.
					참고하세요.
					나중에 포스팅 해볼게요.
					*/
					name: '주문명:결제테스트',
					//결제창에서 보여질 이름
					amount: 5000,
					//가격
					buyer_email: 'iamport@siot.do',
					buyer_name: '구매자이름',
					buyer_tel: '010-1234-5678',
					buyer_addr: '서울특별시 강남구 삼성동',
					buyer_postcode: '123-456',
					m_redirect_url: 'https://www.yourdomain.com/payments/complete'
				/*
				모바일 결제시,
				결제가 끝나고 랜딩되는 URL을 지정
				(카카오페이, 페이코, 다날의 경우는 필요없음. PC와 마찬가지로 callback함수로 결과가 떨어짐)
				*/
				}, function (rsp) {
					console.log(rsp);
						if (rsp.success) {
						var msg = '결제가 완료되었습니다.';
						
						} else {
						var msg = '결제에 실패하였습니다.';
					msg += '에러내용 : ' + rsp.error_msg;
				}
					alert(msg);
				});
			});
			$("#check_module3").click(function () {
				var IMP = window.IMP; // 생략가능
				IMP.init('imp35108939');
				// 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
				// i'mport 관리자 페이지 -> 내정보 -> 가맹점식별코드
				IMP.request_pay({
					pg: 'inicis', // version 1.1.0부터 지원.
					/*
					'kakao':카카오페이,
					html5_inicis':이니시스(웹표준결제)
					'nice':나이스페이
					'jtnet':제이티넷
					'uplus':LG유플러스
					'danal':다날
					'payco':페이코
					'syrup':시럽페이
					'paypal':페이팔
					*/
					pay_method: 'card',
					/*
					'samsung':삼성페이,
					'card':신용카드,
					'trans':실시간계좌이체,
					'vbank':가상계좌,
					'phone':휴대폰소액결제
					*/
					merchant_uid: 'merchant_' + new Date().getTime(),
					/*
					merchant_uid에 경우
					https://docs.iamport.kr/implementation/payment
					위에 url에 따라가시면 넣을 수 있는 방법이 있습니다.
					참고하세요.
					나중에 포스팅 해볼게요.
					*/
					name: '주문명:결제테스트',
					//결제창에서 보여질 이름
					amount: 10000,
					//가격
					buyer_email: 'iamport@siot.do',
					buyer_name: '구매자이름',
					buyer_tel: '010-1234-5678',
					buyer_addr: '서울특별시 강남구 삼성동',
					buyer_postcode: '123-456',
					m_redirect_url: 'https://www.yourdomain.com/payments/complete'
				/*
				모바일 결제시,
				결제가 끝나고 랜딩되는 URL을 지정
				(카카오페이, 페이코, 다날의 경우는 필요없음. PC와 마찬가지로 callback함수로 결과가 떨어짐)
				*/
				}, function (rsp) {
					console.log(rsp);
						if (rsp.success) {
						var msg = '결제가 완료되었습니다.';
						
						} else {
						var msg = '결제에 실패하였습니다.';
					msg += '에러내용 : ' + rsp.error_msg;
				}
					alert(msg);
				});
			});
			$("#check_module4").click(function () {
				var IMP = window.IMP; // 생략가능
				IMP.init('imp35108939');
				// 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
				// i'mport 관리자 페이지 -> 내정보 -> 가맹점식별코드
				IMP.request_pay({
					pg: 'inicis', // version 1.1.0부터 지원.
					/*
					'kakao':카카오페이,
					html5_inicis':이니시스(웹표준결제)
					'nice':나이스페이
					'jtnet':제이티넷
					'uplus':LG유플러스
					'danal':다날
					'payco':페이코
					'syrup':시럽페이
					'paypal':페이팔
					*/
					pay_method: 'card',
					/*
					'samsung':삼성페이,
					'card':신용카드,
					'trans':실시간계좌이체,
					'vbank':가상계좌,
					'phone':휴대폰소액결제
					*/
					merchant_uid: 'merchant_' + new Date().getTime(),
					/*
					merchant_uid에 경우
					https://docs.iamport.kr/implementation/payment
					위에 url에 따라가시면 넣을 수 있는 방법이 있습니다.
					참고하세요.
					나중에 포스팅 해볼게요.
					*/
					name: '주문명:결제테스트',
					//결제창에서 보여질 이름
					amount: 50000,
					//가격
					buyer_email: 'iamport@siot.do',
					buyer_name: '구매자이름',
					buyer_tel: '010-1234-5678',
					buyer_addr: '서울특별시 강남구 삼성동',
					buyer_postcode: '123-456',
					m_redirect_url: 'https://www.yourdomain.com/payments/complete'
				/*
				모바일 결제시,
				결제가 끝나고 랜딩되는 URL을 지정
				(카카오페이, 페이코, 다날의 경우는 필요없음. PC와 마찬가지로 callback함수로 결과가 떨어짐)
				*/
				}, function (rsp) {
					console.log(rsp);
						if (rsp.success) {
						var msg = '결제가 완료되었습니다.';
						
						} else {
						var msg = '결제에 실패하였습니다.';
					msg += '에러내용 : ' + rsp.error_msg;
				}
					alert(msg);
				});
			});
