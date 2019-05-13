<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>{
  box-sizing: border-box;
}

/* Create three columns of equal width */
.columns {
  float: left;
  width: 25%;
  padding: 8px;
}

/* Style the list */
.price {
  list-style-type: none;
  border: 1px solid #eee;
  margin: 0;
  padding: 0;
  -webkit-transition: 0.3s;
  transition: 0.3s;
}

/* Add shadows on hover */
.price:hover {
  box-shadow: 0 8px 12px 0 rgba(0,0,0,0.2)
}

/* Pricing header */
.price .header {
  background-color: #111;
  color: white;
  font-size: 25px;
}

/* List items */
.price li {
  border-bottom: 1px solid #eee;
  padding: 20px;
  text-align: center;
}

/* Grey list item */
.price .grey {
  background-color: #eee;
  font-size: 20px;
}

/* The "Sign Up" button */
.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 10px 25px;
  text-align: center;
  text-decoration: none;
  font-size: 18px;
}

/* Change the width of the three columns to 100% 
(to stack horizontally on small screens) */
@media only screen and (max-width: 600px) {
  .columns {
    width: 100%;
  }
}</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "Serv" method = "Post">
<p> Bienvenue client numéro
<%
int n = (Integer)request.getAttribute("numClient");
%>
"<%=n %>". Veuillez choisir la formule qui vous intéresse.
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%
List<Integer> ListSea = new ArrayList<Integer>();
ListSea = (List<Integer>)request.getAttribute("ListeSeance"); %>
<input type = hidden name = "ListSe" value = <%=ListSea%> >
</p>

<div class="columns">
  <ul class="price">
    <li class="header">Basic</li>
    <li class="grey">20 euros / mois</li>
    <li>1 activité</li>
    <li>Pas d'accès au Sauna</li>
    <li>Pas de suivi personnalisé</li>
    <input hidden type="text" name="n" value="<%=n%>">
    <input type = "hidden" name = "op" value = "SignUpBasic"> 
    <li class="grey"><input type ="submit" value = "Sign Up"></li>
    
  </ul>
</div>
</form>


<form action = "Serv" method = "Post">
<div class="columns">
  <ul class="price">
    <li class="header">Premium</li>
    <li class="grey">30 euros / mois</li>
    <li>2 activités</li>
    <li>Accès au sauna</li>
    <li>Pas de suivi personnalisé</li>
    <li class="grey"><a href="#" class="button">Sign Up</a></li>
  </ul>
</div>
<input type = "hidden" name = "op" value = "SignUpPremium">
</form>

<form action = "Serv" method = "Post">
<div class="columns">
  <ul class="price">
    <li class="header">Gold</li>
    <li class="grey">50 euros / mois</li>
    <li>accès illimité à toutes les activitès</li>
    <li>Accès au Sauna</li>
    <li>Suivi spersonnalisé</li>
    <li class="grey"><a href="#" class="button">Sign Up</a></li>
  </ul>
</div>
<input type = "hidden" name = "op" value = "SignUpGold">
</form>
</body>
</html>