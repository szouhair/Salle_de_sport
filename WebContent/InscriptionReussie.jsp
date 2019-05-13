<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription réussie</title>
</head>
<body>
<p> Vous avez réussi votre inscription, voici vos identifiants de connexion :</p>

<p>

<%
String n = (String)request.getAttribute("username_Client");
String m = (String)request.getAttribute("mdp_Client");
int i = (Integer)request.getAttribute("numclient");
%>
Identifiant : <%=n %><br>
Mot de passe : <%=m %><br>
</p>

<a href ="IdentificationClient.html">Cliquez ici pour vous connecter</a>

</body>
</html>