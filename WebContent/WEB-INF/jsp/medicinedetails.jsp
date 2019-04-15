<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"  media="screen"  href="<c:url value="stylesheet/home.css" />" />
 <link type="text/css" rel="stylesheet"  media="screen"  href="<c:url value="stylesheet/background.css" />" />
 <style>
body {
	background: url(images/back10.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
input[type=submit],[type=button] {
	background-color: #2F4F4F;
	border: none;
	color: white;
	padding: 10px 20px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	margin: 400px 500px;
	cursor: pointer;
	border-radius: 16px;
}
label{
color:#0a29d8;
}


/* Control the right side */
.split{
	margin: 100px -400px;
	top : 15%;
	width: 40%;
	height:230px;
	right: 60%;
}



.centered img {
  width: 150px;
  border-radius: 50%;
}
</style>
</head>
<body class="body">

<div class="dropdown" id="rights">

    
    <a href="logoutadmin.htm">Logout</a>
   

</div>
<br><br>
<div  class="dropdown" id="right">
<a class="font" >Request</a>
<div  class="dropdown-content">
    <a href="showmedicinerequests.htm">Branch Admin Requests </a>
    <a href="showcreaterequestpage.htm">Create Request</a>
   

</div>
</div>
<div  class="dropdown" id="right">
<a class="font">Stocks</a>
<div class="dropdown-content">
    <a href="updateStock.htm">Stocks</a>
   

</div>
</div>
<div id="right" class="dropdown" >
<a class="font">Medicines</a>
<div  class="dropdown-content">
    <a href="medicines.htm">Available Medicine</a>
    <a href="addMedicine.htm">Create Medicine</a>
   

</div>
</div>
<div id="right" class="dropdown "  >
  <a class="font">Branch Admin</a>
  <div class="dropdown-content">
    <a href="showbranchadminpage.htm">Available BA</a>
    <a href="createbranchadmin.htm">Create New</a>
</div>
</div>

 
 <div class="split">
  
  <table class="tabledetails" >


<tr>
<td><label>Medicine Description :</label><c:out value="${updateMedicine.medicineDescription}"/></td>
</tr>

<tr>
<td><label>Cure For :</label><c:out value="${updateMedicine.cureFor}"/></td>
</tr>

<tr>
<td><label>Prescribed For :</label><c:out value="${updateMedicine.prescribedFor}"/></td>
</tr>

<tr>
<td><label>Manufacturing Company :</label><c:out value="${updateMedicine.manufacturingCompany}"/></td>
</tr>
<tr>
<td><label>Dosage :</label><c:out value="${updateMedicine.dosage}"/></td>
</tr>
<tr>
<td><label>Quantity :</label><c:out value="${updateMedicine.quantity}"/></td>
</tr>

</table>
 
</div>
<div>
<form action="updateMedicine.htm" method="get"  style="margin-left:500px;">

<input class="createbutton" type="submit" value="edit"></form>

</form>
</div>
</body>
</html>