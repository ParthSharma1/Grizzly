<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="springcore" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link type="text/css" rel="stylesheet" href="<c:url value="stylesheet/home.css" />" />

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
	margin-left: 120px;
	background-color: rgb(0,0,0,0.4);
	
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
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  background="<c:url value='back10.jpg' />">



<div class="dropdown" id="rights">

    
    <a href="logoutadmin.htm">Logout</a>
   

</div>
   
 
<br><br>
<div  class="dropdown" id="right">
<a class="font" >Request<sup style="color:red;"><c:out value="${pendingCount}"/></sup></a>
<div  class="dropdown-content">
    <a href="showmedicinerequests.htm">Branch Admin Requests </a>
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



<div class="split">
  
  <table cellspacing="3" cellpadding="3">
<tr>
<th class="listh"> RequestID </th><th class="listh">  BranchAdminID  </th><th class="listh"> MedicineId</th><th cellspacing="2" class="listh">  Quantity  </th><th class="listh"> Status </th>
</tr>
<tr>
</tr>
<tr>
</tr>
<c:forEach items="${medicineRequestList}" var="medList">

<c:url var = "requestMedicineLink" value="updatestatusrequest.htm">
  <c:param name="requestId" value="${medList.requestId}"></c:param>
  </c:url>

<tr class="listd">
<td align="center"><a class="listd" href="${requestMedicineLink}">${medList.requestId}</a></td>

<td  align="center"><c:out value="${medList.branchAdminId}"/></td>

<td  align="center"><c:out value="${medList.medicine1Id}"/></td>

<td  align="center"><c:out value="${medList.quantity1}"/></td>

<td  align="center"><c:out value="${medList.adminResponse}"/></td>

</tr>
</c:forEach>

<tr>
<td>
</td>
<td>

</td>
<td  align="center">

</tr>
</table>
<c:out value="${pendingCount}"/>
</div>

</body>
</html>