<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	// body 태그에 있는 것 중에서 특정한 것을 선택한 이후에, 그 선택한 것이 이벤트가 발생했을때
	// 입력값으로 사용한 이름없는 함수를 실행(call back 함수)
	
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "data/car.json",
				success : function(json) {
					// console.log(json)  ==> [{ }, { }, { }, { }...]
					// console.log(json[0])
					// console.log(json[0].email)
					//for(let i = 0; i < json.length; i++){
					//		console.log(json[i].email)
					//		}
					
					// $(여러개 데이터가 들어있는 변수, 배열).each(function(인덱스, 하나))
					$(json).each(function(i, one) {
						// console.log(one.email)
						let idValue = one.id
						let emailValue = one.email
						let carValue = one.car
						console.log(idValue + " " + emailValue + " " + carValue)
						
						$.ajax({
							url : "db_create.jsp",
							data : {
								id : idValue,
								email : emailValue,
								car : carValue
							},
							success : function(result) {
								console.log(result) // '1'
								console.log(result.length)
								if(result.trim() == '1'){
									console.log('db저장 성공')
								}else{
									console.log('db저장 실패')
								}
							}
						})
					})
				}
			}); // ajax
		}); // b1
		
		$('#b2').click(function() {
			$('#d1').empty()
			$.ajax({
				url: "data/car.xml",
				success: function(xml) {
					let list = $(xml).find('record') 
					for(let i = 0; i< list.length; i++){
						let id = $(list[i]).find('id').text()
						let email = $(list[i]).find('email').text()
						let car = $(list[i]).find('car').text()
						$('#d1').append(id + " " + email + " " + car + "<br>")
					}//for 
				} //success
			}); //ajax
		}); //b2
		
	});//$		
	
	
</script>
</head>
<body>
	<button id="b1">car.json 추출하기</button>
	<button id="b2">car.xml 추출하기</button>
	<br><br>
	<div id="d1" style="background: pink"></div>
</body>
</html>