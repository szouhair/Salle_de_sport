<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> Vous avez réussi votre inscription, veuillez noter votre identifiant qui vous sera demandé à chaque connexion



<%
int n = (Integer)request.getAttribute("numCoach");

%>
Voilà votre id : "<%=n %>"

<p> <a href = IdentificationCoach.html> <input type = submit value = "Identifiez vous"> </a> 
</p>
</body>
</html>