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




/* Control the right side */
.split{
margin-top:100px;
margin-left:300px;
width:50%;

}
#editb{

	margin-top:500px;
	margin-left:500px;
}
#ide{
margin-left:250px;
}
input[type=submit],[type=button] {
	background-color: #2F4F4F;
	border: none;
	color: white;
	padding: 10px 20px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 16px;
}

/* If you want the content centered horizontally and vertically */
.centered {
	position: absolute;
	top: 40%;
	left : 80%;
	transform: translate(-50%, -50%);
	text-align: center;
}
label{
color:#0a29d8;
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
  
<div id="ide"><label>ID :</label><c:out value="${branchAdminUpdate.branchAdminId}"/></div>
<table class="tabledetails" >
<tr>
<td><label> FirstName :</label><c:out value="${branchAdminUpdate.branchAdminFirstName}"/>

<td><label>LastName :</label><c:out value="${branchAdminUpdate.branchAdminLastName}"/>
</tr>
<tr>
<td><label>Age :</label><c:out value="${branchAdminUpdate.branchAdminAge}"/>
<td><label>Gender :</label><c:out value="${branchAdminUpdate.branchAdminGender}"/></td>
</tr>
<tr>
<td><label>DOB :</label><c:out value="${branchAdminUpdate.branchAdminDOB}"/></td>
<td><label>BranchName :</label><c:out value="${branchAdminUpdate.branchName}"/></td>
</tr>
<tr>
 <td><label>ContactNo :</label><c:out value="${branchAdminUpdate.branchAdminContactNo}"/></td>
<td><label>AltContactNo :</label><c:out value="${branchAdminUpdate.branchAdminAltContactNo}"/></td>
</tr>
<tr>
<td><label>EmailId :</label><c:out value="${branchAdminUpdate.branchAdminEmailId}"/></td>

<td><label>Address Line1:</label><c:out value="${branchAdminUpdate.addressLine1}"/></td>
</tr>
<tr>
<td><label>Address Line2:</label><c:out value="${branchAdminUpdate.addressLine2}"/></td>
<td><label>City :</label><c:out value="${branchAdminUpdate.city}"/></td>
</tr>
<tr>
<td><label>State :</label><c:out value="${branchAdminUpdate.state}"/></td>
<td><label>ZipCode :</label><c:out value="${branchAdminUpdate.zipCode}"/></td>
</tr>



</table>

</div>
<div id="editb">
<form action="showUpdateBranchAdminPage.htm" method="get" style="margin-left:500px;">
<input class="listed" type="Submit" value="Edit"/>

</form>
</div>


</body>
</html>