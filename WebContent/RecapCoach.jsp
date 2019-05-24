<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>


<%//String nomCoach = (String) request.getAttribute("nCoach");
String nomCoach = (String) session.getAttribute("nomcoach");
%>
Bienvenue <%=nomCoach %>. Voici la liste des cours que vous devrez assurer cette semaine:
<%List<Integer> List_Seance = new ArrayList<Integer>();

List_Seance = (List<Integer>)request.getAttribute("Lseance");

List<String> CL = new ArrayList<String>();
CL.add(0, "8h à 10h");
CL.add(1, "10h à 12h");
CL.add(2, "14h à 16h");
CL.add(3, "16h à 18h");
CL.add(4, "18h à 20h");
	
List<String> JL = new ArrayList<String>();
JL.add(0, "Lundi de ");
JL.add(1, "Mardi de ");
JL.add(2, "Mercredi de ");
JL.add(3, "Jeudi de ");
JL.add(4, "Vendredi de ");
JL.add(5, "Samedi de ");
JL.add(6, "Dimanche de ");


int n =0;
for (int i = 0; i<List_Seance.size() ; i++) {
	%> <p><%=JL.get(((List_Seance.get(i))%7))%>
	<% 
	if (List_Seance.get(i)<7) {
		%> <%=CL.get(0) %> 
	<% }
	if (List_Seance.get(i)>=7 && List_Seance.get(i)<14) {
		%> <%=CL.get(1) %>
	<% }
	if (List_Seance.get(i)>=14 && List_Seance.get(i)<21) {
		%> <%=CL.get(2) %>
	<% }
	if (List_Seance.get(i)>=21 && List_Seance.get(i)<28) {
		%> <%=CL.get(3) %>
	<% }
	if (List_Seance.get(i)>=28 && List_Seance.get(i)<35) {
		%> <%=CL.get(4) %>
	<% 
	} }
%>




</body>
</html>