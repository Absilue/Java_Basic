<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function age() {
	alert('나이계산처리할 예정');
	
	//input중에서 year를 입력한 정보를 가지고 와야함.
	//name=year를 이용해서 입력한 정보를 가지고 오는것이 맞을까
	//가지고 올 수 있으나 잘쓰지 않음
	// ==> name은 여러개가  될수 있어서 배열로 가지고 온다.
	//자바스크립트에서 특정한 태그를 인식하고 싶으면 id속성을 이용하는 것이 좋다.
	var yearTag = document.getElementById('year') //id가 year인 input인 태그 인식
	let yearValue = yearTag.value; //'100' , window.parseInt(), parseFloat()
	let year2 = 2023;
	let age = year2 - parseInt(yearValue);
	alert('당신의 나이는 '+ age)
}
function rec() {
	alert('사각형의 면적 계산처리할 예정');
	let wTag = document.getElementById('w')
	let wValue = wTag.value
	let hTag = document.getElementById('h')
	let hValue = hTag.value
	let result = parseFloat(wValue) * parseFloat(hValue)
	alert('사각형의 면적은 ' + result)
}
</script>
</head>
<body>
	태어난 해 입력:
	<input name="year" id="year" value="2000">
	<button onclick="age()">나이계산</button>
	<br> 사각형의 면적 가로:
	<input name="w" id="w"> 세로:
	<input name="h" id="h">
	<button onclick="rec()">사각형의 면적계산</button>
</body>
</html>