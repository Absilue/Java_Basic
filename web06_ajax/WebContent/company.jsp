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
			url: "data/company.json",
			success: function(arr) { //{json, json, json}
			//json배열 추출해서 프린트 
				alert(arr.length)
				for(let i = 0; i < arr.length; i++){
					console.log(arr[i].addr)
					console.log(arr[i].domain)
					console.log('------------')
					$.ajax({
						url: "db_create2.jsp",
						data: {
							name: arr[i].name,
							addr: arr[i].addr,
							tel: arr[i].tel,
							domain: arr[i].domain
						},
						success: function(result) {
							console.log(result)
						}
					})
				}
			//db에 넣고 싶다. ??????????
			}
		}) //ajax
	})//b1
	
	$('#b2').click(function() {
		$('#d1').empty()
		$.ajax({
			url: "data/company.xml",
			success: function(xml) {
				let list = $(xml).find('record') 
				for(let i = 0; i< list.length; i++){
					let name = $(list[i]).find('id').text()
					let addr = $(list[i]).find('addr').text()
					let tel = $(list[i]).find('tel').text()
					let domain = $(list[i]).find('domain').text()
					$('#d1').append(name + " " + addr + " " + tel + " " + domain + "<br>")
				}//for 
			} //success
		}); //ajax
	}); //b2
	
})//$
</script>
</head>
<body>
<button id="b1">company 추출하기</button>
<button id="b2">company  추출하기</button>
<div id="d1" style="background: pink"></div>
</body>
</html>