<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path2" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상점 등록</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
	<div class="form">
    <input type="number" name="stdNumber1" class="num" placeholder="번호 입력" /><br>
    <input type="text" name="name1" class="name" placeholder="학생명 입력" /><br>
    <input type="number" name="age1" class="age" placeholder="나이 입력" /><br><br>
	</div>
	<div class="form">
	    <input type="number" name="stdNumber2" class="num" placeholder="번호 입력" /><br>
	    <input type="text" name="name2" class="name" placeholder="학생명 입력" /><br>
	    <input type="number" name="age2" class="age" placeholder="나이 입력" /><br><br>
	</div>
	<div class="form">
	    <input type="number" name="stdNumber3" class="num" placeholder="번호 입력" /><br>
	    <input type="text" name="name3" class="name" placeholder="학생명 입력" /><br>
	    <input type="number" name="age3" class="age" placeholder="나이 입력" /><br><br>
	</div>
	
	<button type="button" id="btn1">등록</button>
	
	
<script>
    $(document).ready(function(){
        $("#btn1").click(function(){
            var stds = [];
            $.each($(".form"), function(index, value){
                var num = $(this).find(".num").val();
                var name = $(this).find(".name").val();
                var age = $(this).find(".age").val();
                
                var student = {stdNumber: num, name: name, age: age};
                stds.push(student);
            });
            
            $.ajax({
                type: "post",
                url: "${path2}/api/api7.do",
                data: JSON.stringify(stds),
                dataType: "json",
                contentType: 'application/json; charset=utf-8', 
                success: function(data) {}
            });
        });
    });
</script>
</body>
</html>