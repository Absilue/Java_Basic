<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">	
$(document).ready(function() {
	$('#b1').click(function() {
		$.ajax({
			url: "https://api.openweathermap.org/data/2.5/weather?lat=35.1362607&lon=129.1027527&appid=3c10de6a5078d94fa7907fe4ae596a65", 
			dataType: 'json',
			success: function(weather) {
				$('#d1').html("위치 : " + weather.name + "<br>"+
									"날씨 : " + weather.weather[0].description + "<br>"+
									"풍속 : " + weather.wind.speed + "<br>" +
									"최고기온 : " + weather.main.temp_max + "<br>"+
									"최저기온 : " + weather.main.temp_min + "<br>"+
									"체감온도 : " + weather.main.feels_like + "<br>"+
									"구름 : " + weather.clouds.all + "<br>")
			}
		});
	}); 
	
	$('#b2').click(function() {
		$.ajax({
			url : "https://api.openweathermap.org/data/2.5/weather?q=suwon&appid=3c10de6a5078d94fa7907fe4ae596a65", 
			dataType : 'json',
			success : function(weather) {
				$('#d1').html("위치 : "+weather.name+"<br>"+
				"날씨 : " + weather.weather[0].description + "<br>"+
				"풍속 : " + weather.wind.speed + "<br>" +
				"최고기온 : " + weather.main.temp_max + "<br>" +
				"최저기온 : " + weather.main.temp_min + "<br>" +
				"체감온도 : " + weather.main.feels_like + "<br>" +
				"구름 : " + weather.clouds.all + "<br>")
			}
		});
	});
});	
</script>
</head>
<body>
	<button id="b1">위도와 경도로 날씨 검색</button>
	<button id="b2">수원 날씨 검색</button>
	<br><br>
	<div id="d1" style="background: pink"></div>
	<br><br>
	<div id="d2" style="background: pink"></div>
</body>
</html>