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
		$('#b1').click(function() {
			$.ajax({
				url: "data/rank.xml" ,
				success: function(xml) {
					console.log(xml)

					list = $(xml).find('rank')
					$('#d1').empty()
					for (let i = 0; i < list.length; i++) {
						name = $(list[i]).find('name').text()
						tel = $(list[i]).find('tel').text()
						console.log(name + " " + tel)
						$('#d1').append(name + " " + tel + "<br>")
					}
				}
			})
		}) //b1
	}) //$
</script>
</head>
<body>
<button id="b1">rank.xml읽어오기</button>
<br><br>
<div id="d1" style = "background:pink"></div>
</body>
</html>