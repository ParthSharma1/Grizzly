<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="springform"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="<c:url value="stylesheet/home.css" />"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"/>

<script type="text/javascript">
		
</script>
<script>
function fn(event) {
	var quantity_1 = document.getElementById("quantity_1").value;
	if (quantity_1 == 0 || quantity_1 == "")
	{
		alert("Please Enter Valid Quantity.");
		return false;
	}
	
	return true;
}

function alphaOnly(event) {
	  var key = event.keyCode;
	  return ((key >= 65 && key <= 90) || key == 8 || (key>=97 && key<=122) || key==32);
	}
	function numberOnly(event)
	{
		  var charCode = event.keyCode;
	   if (charCode > 31 && (charCode < 48 || charCode > 57)) {
	        return false;
	    }
	    return true;
	}
	function getDate() {
		var today = new Date();
		var dd = String(today.getDate()).padStart(2, '0');
		var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
		var yyyy = today.getFullYear();
		today = mm + '/' + dd + '/' + yyyy;
	
				document.getElementById("datepicker").value = today;
				
			}
$(document).ready(function(){
		$("#second").hide();
		$("#third").hide();
		$("#fourth").hide();
		$("#bb1").hide();
		$("#bb2").hide();
		$("#bb3").hide();
		$("#bb4").hide();
	    $(".med2").hide();
	    $(".med3").hide();
	    $(".med4").hide();
	    $(".med5").hide();
	  });
$(document).ready(function(){
	  $("#first").click(function(){
	    $(".med1").hide("slow");
	    $(".med2").show("slow");
	    $("#first").hide("fast");
	    $("#second").show("fast");
	    $("#bb1").show("fast");
	 
	  });
	});

$(document).ready(function(){
	  $("#second").click(function(){
	    $(".med2").hide("slow");
	    $(".med3").show("slow");
	    $("#second").hide("fast");
	    $("#third").show("fast");
	    $("#bb1").hide("fast");
	    $("#bb2").show("fast");
	  });
	});
$(document).ready(function(){
	  $("#third").click(function(){
	    $(".med3").hide("slow");
	    $(".med4").show("slow");
	    $("#third").hide("fast");
	    $("#fourth").show("fast");
	    $("#bb2").hide("fast");
	    $("#bb3").show("fast");
	  });
	});
$(document).ready(function(){
	  $("#fourth").click(function(){
	    $(".med4").hide("slow");
	    $(".med5").show("slow");
	    $("#fourth").hide("fast");
	    $("#bb3").hide("fast");
	    $("#bb4").show("fast");
	    $("#nextlab").hide("fast");
	  });
	});
$(document).ready(function(){
	  $("#bb4").click(function(){
	    $(".med5").hide("slow");
	    $(".med4").show("slow");
	    $("#bb4").hide("fast");
	    $("#bb3").show("fast");
	    $("#fourth").show("fast");
	  });
	});
$(document).ready(function(){
	  $("#bb3").click(function(){
	    $(".med4").hide("slow");
	    $(".med3").show("slow");
	    $("#bb3").hide("fast");
	    $("#bb2").show("fast");
	    $("#fourth").hide("fast");
	    $("#third").show("fast");
	  });
	});
$(document).ready(function(){
	  $("#bb2").click(function(){
	    $(".med3").hide("slow");
	    $(".med2").show("slow");
	    $("#bb2").hide("fast");
	    $("#bb1").show("fast");
	    $("#third").hide("fast");
	    $("#second").show("fast");
	  });
	});
$(document).ready(function(){
	  $("#bb1").click(function(){
	    $(".med2").hide("slow");
	    $(".med1").show("slow");
	    $("#bb1").hide("fast");
	    
	    $("#second").hide("fast");
	    $("#first").show("fast");
	  });
	});
</script>
<style>
body {
	background: url(images/back10.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;

}
/* Control the right side */
.right {
	position: absolute;
	bottom: 150px;
	right: 50px;
	text-align: right;
	transform: scale(1.25, 1);
	color: #2F4F4F;
}
img {
	width: 200px;
}
option, select {
	/* Whatever color  you want */
	background-color: #2F4F4F;
	color: white;
}
input[type=text], [type=date] {
	background-color: #2F4F4F;
	color: white;
}
input[type=submit] {
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
.name {
	color: #2F4F4F;
	font-size: 60px;
	position: absolute;
	height: 50px;
	/*  width: 50px;  */
	top: 0;
	right: 15px;
	font-style: oblique;
	font-weight: bold;
}
.AddRequest{
	position: absolute;
	bottom: 75px;
	right: 390px;
	text-align: right;
	align: right;
}
.login:hover {
	background-color: #3e8e41;
}
.login:active {
	background-color: #3e8e41;
	box-shadow: 0 5px #666;
	transform: translateY(4px);
}
.login {
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
.form {
	position: absolute;
	width:30%;
	height:400px;
	
	margin: 0px 00px;
	top: 100px;
	right: 0;
	bottom: 0;
	left: 40%;
	color: #2F4F4F;
	font-weight: bold;
	font-size: 18px;
}
#backb{
margin-top:250px;
margin-left:400px;
}
#nackb{
margin-top:-30px;
margin-left:1000px;
}
label{
	background-color: #ededed;
	color: #2F4F4F;
}
.lab{
	
	background-color: #ededed;
	color: #2F4F4F;
}
#nextlab{
margin-top:-70px;
margin-left:950px;
}
#nextb{
margin-top:-40px;
margin-left:1100px;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Request</title>
</head>
<body onload="getDate()">


<div id="backb">
<input id="bb1" type="submit" value="back">
<input id="bb2" type="submit" value="back">
<input id="bb3" type="submit" value="back">
<input id="bb4" type="submit" value="back">
</div>
<div id="nackb">
<input id="first" type="submit" value="next">
<input id="second" type="submit" value="next">
<input id ="third" type="submit" value="next">
<input id="fourth" type="submit" value="next">
</div>
<div id="nextlab"><lable class="lab">click to add another medicine</lable></div>

	<div class="form">
		<springform:form modelAttribute="medicinerequest" method="post"
			action="createmedicinerequest.htm">
			<table cellpadding="10">

				<tr>
					<td><springform:label path="branchAdminId">Branch Admin Id :</springform:label>
					<td><springform:select path="branchAdminId">
							<springform:options items="${branchAdminIdList}" />
						</springform:select>
				</tr>
				<tr>
					<td><springform:label path="requestDate">Request Date :</springform:label>
					<td><springform:input path="requestDate" id="datepicker"
							style="height : 30px;"
							 readonly="true" />
				</tr>
				
				
				<tr class="med1">
				<td><springform:label path="medicine1Id">Medicine 1 Id :</springform:label>
				<td><springform:select path="medicine1Id">
						<springform:options items="${medicineIdList}" />
											</springform:select>
				</tr>
				<tr class="med1">
					<td><springform:label path="quantity1">Quantity 1 :</springform:label>
					<td><springform:input path="quantity1" placeholder="Quantity" style="height : 30px;" id="quantity_1"
							autocomplete="off" maxlength="3"
							onkeypress="return numberOnly(event)"/>
						
					
				</tr>
				
			
				<tr class="med2">
					<td><springform:label path="medicine2Id">Medicine 2 Id :</springform:label>
					<td><springform:select path="medicine2Id">
							<springform:options items="${medicineIdList}" />
							
						</springform:select>
				</tr>
				<tr class="med2">
					<td><springform:label path="quantity2">Quantity 2 :</springform:label>
					<td><springform:input path="quantity2" placeholder="Quantity" style="height : 30px;" id="quantity_2"
							autocomplete="off" maxlength="3"
							onkeypress="return numberOnly(event)"/>
							
				</tr>
				
				<tr class="med3">
					<td><springform:label path="medicine3Id">Medicine 3 Id :</springform:label>
					<td><springform:select path="medicine3Id">
							<springform:options items="${medicineIdList}" />
							
						</springform:select>
				</tr>
				<tr class="med3">
					<td><springform:label path="quantity3">Quantity 3 :</springform:label>
					<td><springform:input path="quantity3" placeholder="Quantity" style="height : 30px;" id="quantity_3"
							autocomplete="off" maxlength="3"
							onkeypress="return numberOnly(event)"/>
							
				</tr>
				
				<tr class="med4">
					<td><springform:label path="medicine4Id">Medicine 4 Id :</springform:label>
					<td><springform:select path="medicine4Id">
							<springform:options items="${medicineIdList}" />
							
						</springform:select>
				</tr>
				<tr class="med4">
					<td><springform:label path="quantity4">Quantity 4 :</springform:label>
					<td><springform:input path="quantity4" placeholder="Quantity" style="height : 30px;" id="quantity_4"
							autocomplete="off" maxlength="3"
							onkeypress="return numberOnly(event)"/>
							
				</tr>
				
				
				<tr class="med5">
					<td><springform:label path="medicine5Id">Medicine 5 Id :</springform:label>
					<td><springform:select path="medicine5Id">
							<springform:options items="${medicineIdList}" />
						</springform:select>
				</tr>
				<tr class="med5">
				
					<td><springform:label path="quantity5">Quantity 5 :</springform:label>
					<td><springform:input path="quantity5" placeholder="Quantity" style="height : 30px;" id="quantity_5"
							autocomplete="off" maxlength="3"
							onkeypress="return numberOnly(event)"/>
				</tr>
				<tr>
				</tr>
				<tr>
				</tr>
				<tr>
				</tr>
				<tr>
					<td><springform:label path="otherInfo">Other Info :</springform:label>
					<td><springform:input path="otherInfo" placeholder="Other Info" style="height : 30px;" id="other_info"
							autocomplete="off" maxlength="200"
							onkeypress="return alphaOnly(event)"/>
				</tr>
				<tr>
				<td>
				<div >
				<input type="submit" value="Add Request" onclick="return fn(event)">
				</div>
				</td>
				</tr>
			</table>
		</springform:form>
	</div>
</body>
</html>