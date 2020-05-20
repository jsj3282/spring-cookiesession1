<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script>
		var cookies = [];
		var i = 0;
		while(i < 100){
			cookies[i] = document.cookie;
			if(cookies[i] == null){
				window.open('popup.jsp', 'winopen', 'width=500, height=500, left=10, top=10, scrollbars=no');
				cookies[i] = setCookie("myCookie", 5)
				i = 0;
				break;
				
			}
			console.log(i + ":" + cookies[i])
			setTimeout(function(){
				console.log("hello~~");
			}, 1000)
			i++;
			
		}
		
		function getCookie(){
			alert(document.cookie);
		}
	
	
	</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	cookie페이지 입니다.

</body>
</html>