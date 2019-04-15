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
	margin-top: -10px;
	margin-left: 300px;
	
	
	padding-top: 10px;
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
<body  background="<c:url value='back10.jpg' />">



<div class="dropdown" id="rights">

    
   <form action="logoutadmin.htm" method="get" >
<input class="createbutton" type="submit" value="logout"/> 
   </form>

</div>
   
 
<br><br>
<div  class="dropdown" id="right">
<a class="font" >Request<sup style="color:red;"><c:out value="${pendingCount}"/></sup></a>
<div  class="dropdown-content">
    
    <a href="showcreaterequestpage.htm">Add Request</a>
    
   

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
    <a href="addMedicine.htm">Add Medicine</a>
   

</div>
</div>
<div id="right" class="dropdown "  >
  <a class="font">Branch Admin</a>
  <div class="dropdown-content">
    <a href="showbranchadminpage.htm">Available BA</a>
    <a href="createbranchadmin.htm">Add New</a>
</div>
</div>

<div class="outer-div"><div class="inner-div">
</div></div>
<div >
<form action="showcreaterequestpage.htm" method="get" >
<input  class="createbutton" type="submit" value="Add Branch Admin Request"/>
</form> 
</div>


<div class="split">
  
  <table class="tabledetails" id="medicinetable">
  <tr>
<input id="searchinput" type="text" name="searchelement" autocomplete="off" placeholder="search..."/><br></br>
</tr>
<tr>
<tr>
</tr>
<th > RequestID </th><th>  BranchAdminID  </th><th> MedicineId</th><th>  Quantity  </th><th> Status </th>
</tr>


<c:forEach items="${medicineRequestList}" var="medList">

<c:url var = "requestMedicineLink" value="updatestatusrequest.htm">
  <c:param name="requestId" value="${medList.requestId}"></c:param>
  </c:url>

<tr id="tabletr">
<td align="center"><a class="idcolor" href="${requestMedicineLink}">${medList.requestId}</a></td>

<td  align="center"><c:out value="${medList.branchAdminId}"/></td>

<td  align="center"><c:out value="${medList.medicine1Id}"/></td>

<td  align="center"><c:out value="${medList.quantity1}"/></td>

<td  align="center"><c:out value="${medList.adminResponse}"/></td>

</tr>
</c:forEach>

<tr>

</tr>
</table>


</body>
</html>