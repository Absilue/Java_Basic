<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() { 
		$.ajax({
			url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fsports%2F%3FoutputType%3Dxml&api_key=rooa9cfdnkctmsnpiftxnozlzfyaunxvudzwajoq",
			success : function(x) {
				console.log(x)
				// 브라우저의 콘솔에 출력
				let list = x.items
				// [{tilte.... , content....}, { },{ }]
				
				for(let i = 0; i< list.length; i++){
					console.log(list[i].title)
					console.log(list[i].link)
					console.log(list[i].content)
					aTag = "<a href=" + list[i].link + ">" + list[i].title + "</a>"
					$('#d1').append(aTag + " " + list[i].content)
				}
			},
			error : function(e) {
				alert('에러 발생')
			}//success
		}) // ajax
	}) // $
</script>
</head>
<body>
	<div id= "d1"></div>
</body>
</html>