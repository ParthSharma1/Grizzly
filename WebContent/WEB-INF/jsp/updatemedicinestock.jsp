<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="springcore" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link type="text/css" rel="stylesheet" href="<c:url value="stylesheet/home.css" />" />
<link type="text/css" rel="stylesheet" href="<c:url value="stylesheet/background.css" />" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<style>
body {
	background: url(images/back10.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
.split {
	height : 100%;
	width: 70%;
	position: relative;
	overflow-x: hidden;
	margin-top: -70px;
	margin-left: 300px;
}
/* Control the left side */
.left {
	width: 80%;
	font-size : 30px;
	text-shadow: 1px 1px #FF0000;
}
/* Control the right side */
.right {
	width: 80%;
	right: 20%;
}
/* If you want the content centered horizontally and vertically */
.centered {
	position: absolute;
	top: 30%;
	left : 70%;
	transform: translate(-50%, -50%);
	text-align: center;
}

.centered img {
  width: 150px;
  border-radius: 50%;
}
#addmed{
align:right;
margin-left:0px;

margin-top:-100px;
}
#searchinput{
background-color:#f2f2f2;
border-radius:16px;
border-color:#2F4F4F;
}
</style>
<script>
$(document).ready(function(){
  $("#searchinput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#medicinetable #tabletr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="<c:url value='back10.jpg' />">



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
   
   

</div>
</div>
<div id="right" class="dropdown "  >
  <a class="font">Branch Admin</a>
  <div class="dropdown-content">
    <a href="showbranchadminpage.htm">Available BA</a>
    <a href="createbranchadmin.htm">Create New</a>
</div>
</div>
<div class="outer-div"><div class="inner-div">
</div></div>

<div class="outer-div"><div class="inner-div">
</div></div>


<div class="split lefti">
   
    
  </div>
<div class="split">
  
  <table class="tabledetails" id="medicinetable">
<tr>
<th>MedicineId</th><th>  Quantity </th>

</tr>
<tr>
<input id="searchinput" type="text" name="searchelement" autocomplete="off" placeholder="search..."/><br></br>
</tr>
<tr>
</tr>
<c:forEach items="${stockList}" var="stockList">
<c:url var= "updateStock" value="updatestockhere.htm">
<c:param name="MedicineId" value="${stockList.medicineId}"></c:param>
</c:url>
  
<tr id="tabletr">
<td><a class="idcolor"  href="${updateStock}">${stockList.medicineId}</a></td>

<td><c:out value="${stockList.quantity}"/></td>


</tr>
</c:forEach>


</table>

</div>

</body>
</html>