<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/form.css" />" rel="stylesheet">
<title>Registration Form</title>

</head>
<body>
<div class="keywords">
<header>

</header>
</div>

<div class="outer">

<div class="add-box">
<div>
<h2>Contact Us At</h2>
W3 Course Web Designing Solution<br/>
P-4/1, Near Akashpuram
Pilibhit Road,<br/> Bareilly,Uttar Pradesh, 243001</div>
<div style="padding-left:40px;">
<h2>Call Us At</h2>Designer Of Page <a href="http://www.w3course.com/md-ashraf-malik" title="Md Ashraf Malik">"+91-8439203407</a><br/><br/>
Publisher Of Page <a href="http://www.w3course.com" title="W3 Course">+91-9760849715</a></div>
</div>

<div class="contact-div">

<div class="contact-form">
<form:form modelAttribute="customer"  action= "addCustomer" method="post">
<fieldset>
<legend>Customer Information</legend>

<form:input path="firstName" class="input input1" />
<form:errors path="firstName" cssStyle="color : red;" /> <br/>

<form:input path="lastName" class="input input1"   placeholder="Your Phone" />
<form:errors path="lastName" cssStyle="color : red;" /> 

<!-- <input type="email" required placeholder="Your Email" class="input email" /><br/>
<textarea placeholder="Your Massage" id="textarea" class="input tarea" required></textarea><br/>
<input type="reset" id="btn" class="input sbtn"  value="Reset" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="submit" id="btn1" class="input sbtn" value="Send" /> -->
</form:form>
</div>



</div>
</div>

</body>
</html>