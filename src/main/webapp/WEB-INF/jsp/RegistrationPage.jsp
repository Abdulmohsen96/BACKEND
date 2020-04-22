<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Spring Boot</title>
<style type="text/css">
h1, h2, h3 {
    color: #ffffff;
    font-family: consolas;
    font-size: 62px;
    font-weight: 800;
    line-height: 72px;
    margin: 0 0 24px;
    text-align: center;
    text-shadow: 3px 2px black;
}
body {
    margin:0;
    background-color: #808080;
}
.icon-bar {
  width: 100%;
  background-color: #555;
  overflow: auto;
}
.icon-bar a {
  float: left;
  width: 20%;
  text-align: center;
  padding: 12px 0;
  transition: all 0.3s ease;
  color: white;
  font-size: 36px;
  text-decoration: none;
  font-family: consolas;
  font-weight: bold;
}
.icon-bar a:hover {
  background-color: #000;
}
.active {
  background-color: #4CAF50;
}
</style>
</head>
<body>

    <div class="icon-bar">
    <a href="HomePage"><i class="fa fa-home"></i> Home </a>
    <a class="active" href="RegistrationPage"><i class="fa fa-user-plus"></i> Registration </a>
    <a href="LoginPage"><i class="fa fa-sign-in"></i> Login </a>
    </div>
<h1><a href="IndividualsRegistrationPage">Individuals</a> | <a href="OrganizationsRegistrationChoice">Organizations</a></h1>
</body>
</html>