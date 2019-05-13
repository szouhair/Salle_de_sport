<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>

<p/>
<p> Veuillez saisir vos disponibilités de la semaine.</p>
<form action = "Serv" method = "Post">
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
 <td> <INPUT type="checkbox" name="choix1" value="1"> Foot</td>
 <td> <INPUT type="checkbox" name="choix2" value="1"> Muscu</td>
 <td> <INPUT type="checkbox" name="choix3" value="1"> Foot</td>
 <td> <INPUT type="checkbox" name="choix4" value="1"> Maths </td>
 <td> <INPUT type="checkbox" name="choix5" value="1"> Muscu</td>
 <td> <INPUT type="checkbox" name="choix6" value="1"> Foot </td>
 <td> <INPUT type="checkbox" name="choix7" value="1"> Foot </td>
</tr>

<tr>
<td rowspan="1"> 10h-12h </td>
 <td> <INPUT type="checkbox" name="choix8" value="1"> Muscu </td>
 <td> <INPUT type="checkbox" name="choix9" value="1"> Foot</td>
 <td> <INPUT type="checkbox" name="choix10" value="1"> Muscu</td>
 <td> <INPUT type="checkbox" name="choix11" value="1"> Maths </td>
 <td> <INPUT type="checkbox" name="choix12" value="1"> Foot</td>
 <td> <INPUT type="checkbox" name="choix13" value="1"> CrossFit </td>
 <td> <INPUT type="checkbox" name="choix14" value="1"> Muscu </td>
</tr>

<tr>
<td rowspan="1"> 12h-14h </td>
 <th colspan="7"> Musculation </th>
</tr>

<tr>
<td rowspan="1"> 14h-16h </td>
 <td> <INPUT type="checkbox" name="choix15" value="1"> Foot </td>
 <td> <INPUT type="checkbox" name="choix16" value="1"> Maths</td>
 <td> <INPUT type="checkbox" name="choix17" value="1"> CrossFit</td>
 <td> <INPUT type="checkbox" name="choix18" value="1"> Muscu </td>
 <td> <INPUT type="checkbox" name="choix19" value="1"> Foot </td>
 <td> <INPUT type="checkbox" name="choix20" value="1"> Muscu </td>
 <td> <INPUT type="checkbox" name="choix21" value="1"> Boxe </td>
</tr>

<tr>
<td rowspan="1"> 16h-18h </td>
 <td> <INPUT type="checkbox" name="choix22" value="1"> CrossFit </td>
 <td> <INPUT type="checkbox" name="choix23" value="1"> Foot</td>
 <td> <INPUT type="checkbox" name="choix24" value="1"> Foot</td>
 <td> <INPUT type="checkbox" name="choix25" value="1"> CrossFit </td>
 <td> <INPUT type="checkbox" name="choix26" value="1"> Foot </td>
 <td> <INPUT type="checkbox" name="choix27" value="1"> Muscu </td>
 <td> <INPUT type="checkbox" name="choix28" value="1"> Foot </td>
</tr>

<tr>
<td rowspan="1"> 18h-20h </td>
 <td> <INPUT type="checkbox" name="choix29" value="1"> Foot </td>
 <td> <INPUT type="checkbox" name="choix30" value="1"> Boxe</td>
 <td> <INPUT type="checkbox" name="choix31" value="1"> CrossFit</td>
 <td> <INPUT type="checkbox" name="choix32" value="1"> Foot </td>
 <td> <INPUT type="checkbox" name="choix33" value="1"> Muscu </td>
 <td> <INPUT type="checkbox" name="choix34" value="1"> Foot </td>
 <td> <INPUT type="checkbox" name="choix35" value="1"> Muscu </td>
</tr>
</table>


<input type = hidden name = "op" value = "ChoixCoach">
<p> <input type="submit" value="EnregistrerSonChoix"></p>
</form>
</body>

</body>
</html>