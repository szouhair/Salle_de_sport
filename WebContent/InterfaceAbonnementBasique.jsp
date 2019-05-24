<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
Bienvenue 
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="java.util.Collections"%>
<%
String n = (String)request.getAttribute("usernameClient");

%>
"<%=n %>"


à l'interface d'abonnement classique.

<p> Voici le planning de la semaine </p>

<% 
//String choix1 = (String)request.getAttribute("choix1");
//String listCho = (String)request.getAttribute("ListeDesChoix"); %>
<p>
<p>

<table border=1 cellspacing="1">

<tr> 
 <th colspan="12"> Time Table </th>
</tr>

<tr>
 <td rowspan="1">  </td>
 <th> Lundi </th>
 <th> Mardi </th>
 <th> Mercredi </th>
 <th> Jeudi</th>
 <th> Vendredi </th>
  <th> Samedi </th>
  <th> Dimanche </th>
</tr>
 
<tr>
<td rowspan="1"> 08h-10h </td>
<% 


List<String> list = (ArrayList<String>)request.getAttribute("ListeDesChoix");
/**
if ((ArrayList<String>)request.getAttribute("ListeDesChoix") == null) {
	list = new ArrayList<String>(Collections.nCopies(40, "0"));
}
else {
	list = 
};**/ %>
 
 <td> <%
 if (list.get(0).equals("1")) { %>
	Foot <%}%>  </td>
	 
 <td> <%
 if (list.get(1).equals("1")) { %>
	Foot <%}%>  </td>
	
 <td> <%
 if (list.get(2).equals("1")) { %>
	Foot <%}%>  </td>
 <td> <%
 if (list.get(3).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(4).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(5).equals("1")) { %>
	Foot <%}%>  </td>
 <td>  <%
 if (list.get(6).equals("1")) { %>
	Foot <%}%> </td>
</tr>

<tr>
<td rowspan="1"> 10h-12h </td>

 <td> <%
 if (list.get(7).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(8).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(9).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(10).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(11).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(12).equals("1")) { %>
	Foot <%}%>  </td>
 <td> <%
 if (list.get(13).equals("1")) { %>
	Foot <%}%>  </td>
</tr>

<tr>
<td rowspan="1"> 12h-14h </td>
 <th colspan="7"> Musculation </th>
</tr>

<tr>
<td rowspan="1"> 14h-16h </td>
 <td> <%
 if (list.get(14).equals("1")) { %>
	Foot <%}%>  </td>
 <td> <%
 if (list.get(15).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(16).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(17).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(18).equals("1")) { %>
	Foot <%}%>  </td>
 <td> <%
 if (list.get(19).equals("1")) { %>
	Foot <%}%>  </td>
 <td > <%
 if (list.get(20).equals("1")) { %>
	Foot <%}%></td>
</tr>

<tr>
<td rowspan="1"> 16h-18h </td>
 <td> <%
 if (list.get(21).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(22).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(23).equals("1")) { %>
	Foot <%}%></td>
 <td> <%
 if (list.get(24).equals("1")) { %>
	Foot <%}%>  </td>
 <td> <%
 if (list.get(25).equals("1")) { %>
	Foot <%}%>  </td>
 <td> <%
 if (list.get(26).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(27).equals("1")) { %>
	Foot <%}%> </td>
</tr>

<tr>
<td rowspan="1"> 18h-20h </td>
 <td> <%
 if (list.get(28).equals("1")) { %>
	Foot <%}%> </td>
 <td><%
 if (list.get(29).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(30).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(31).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(32).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(33).equals("1")) { %>
	Foot <%}%> </td>
 <td> <%
 if (list.get(34).equals("1")) { %>
	Foot <%}%> </td>
</tr>
</table>

</body>


<p> Choisissez les deux sports qui vous conviennent </p>

<style>
.boutonmenuprincipal {
background-color: #e83737;
color: white;
border: none;
cursor: pointer;
padding:20px;
margin-top:20px;
font-size: 30px;
}
.boutonmenuprincipal:hover {
background-color: #ff4444;
}
.dropdown {
position: relative;
display: inline-block;
}
.dropdown-child {
display: none;
background-color: #f28c8c;
min-width: 50px;
}
.dropdown-child a {
color: white;
padding: 20px;
text-decoration: none;
display: block;
}
.dropdown:hover .dropdown-child {
display: block;
}
</style>
</head>
<body>
<p> Bienvenuee sur la platforme de votre salle. </p>
<p> Veuillez choisir parmis la selection ci-dessous le sport qui vous intéresse ainsi que le cours de la semaine qui vous convient. </p>

<div class="dropdown">
 <button class="boutonmenuprincipal">Selection  de sport</button>
 <div class="dropdown-child">
 <a href="FootballDeSalle.html">Football de salle</a>
 <a href="Natation.html">Natation</a>
 <a href="Musculation.html">Musculation</a>
 <a href="Crossfit.html">Crossfit</a>
 <a href="Boxe.html">Boxe anglaise</a>
 </div>
 </div>

</body>

</body>
</html>