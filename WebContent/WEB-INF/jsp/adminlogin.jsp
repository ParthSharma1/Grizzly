<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="springform"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<script type="text/javascript">
	function fn(event) {
		var user_name = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		if (user_name == null || user_name == "") {
			alert("Please Enter Admin Id.");
			return false;
		} else if (password == null || password == "") {
			alert("Password can't be blank");
			return false;
		}
		return true;
	}
</script>

<style>
body {
	background: url(images/back10.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
	background-color:rgba(0,0,0,0.4);
}
input[type=text], [type=password] {
	background-color: #2F4F4F;
	color: white;
	border-radius: 16px;
	
}
/* #2F4F4FControl the right side */
.right {
	position: absolute;
	bottom: 150px;
	right: 350px;
	text-align: right;
	transform: scale(1.25, 1);
	color: #2F4F4F;
	
}
img {
	width: 200px;
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
.login {
	position: absolute;
	bottom: -30px;
	right: 50px;
	text-align: right;
	align: right;
}
.register:hover {
	background-color: #3e8e41;
}
.register:active {
	background-color: #3e8e41;
	box-shadow: 0 5px #666;
	transform: translateY(4px);
}
.register {
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
input[type=submit] {
	background-color: #2F4F4F;
	border: 16px;
	border-color: #2F4F4F;
	color: white;
	padding: 5px 15px;
	display: inline-block;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 16px;
}
</style>
<title>Login Page</title>

</head>
<body >
	<div class="name">Medicine Monitoring System</div>
	<div class="right">
		<springform:form modelAttribute="admin" method="post"
			action="loginadmin.htm">
			<table>
				<tr>

					<td><springform:input path="adminId" id="username"
							maxlength="10" placeholder="Admin Id" style="height : 30px;"
							autocomplete="off" /> 
							
				</tr>
				<tr>
				<springform:errors path="adminId"
							style="color:red"></springform:errors>
				</tr>
				<tr>
					
					<td><springform:password path="adminPassword" id="password"
							maxlength="10" placeholder="Password" style="height : 30px;"
							autocomplete="off" />
							
				</tr>
				<tr>			 <springform:errors path="adminPassword"
							style="color:red"></springform:errors>
				</tr>
				<tr>
					<div class="login">
						<input type="submit" value="login" onclick="return fn(event)" />
					</div>
				</tr>
			</table>
		</springform:form>
	</div>
	<form method="post" action="register.htm">
		<button class="register">Register</button>
	</form>
</body>
</html>