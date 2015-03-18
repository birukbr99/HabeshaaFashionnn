<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<div class="outer">

<!-- <div class="add-box">
<div>
<h2>Group</h2>
Jemaw Group<br/></div>
<div style="padding-left:40px;">
</div>
</div> -->

<div class="contact-div">

<div class="contact-form">
 <form:form modelAttribute="customer"  action= "addCustomer" method="post">
<fieldset>
<legend>Customer Information</legend>

<form:input path="firstName" class="input input1" />
<form:errors path="firstName" cssStyle="color : red;" /> 

<form:input path="lastName" class="input input1"   placeholder="Last Name" />
<form:errors path="lastName" cssStyle="color : red;" /><br/> 

<form:input path="phoneNumber" class="input input1"   placeholder="Phone Number" />
<form:errors path="phoneNumber" cssStyle="color : red;" /> 

<form:input path="email" class="input email"   placeholder="Email" />
<form:errors path="email" cssStyle="color : red;" /> 

<form:input type="date" path="birthDate" class="input date"  />
<form:errors path="birthDate" cssStyle="color : red;" /> 

<input type="email" required placeholder="Your Email" class="input email" /><br/>
<textarea placeholder="Your Massage" id="textarea" class="input tarea" required></textarea><br/>
<input type="reset" id="btn" class="input sbtn"  value="Reset" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="submit" id="btn1" class="input sbtn" value="Send" /> 
</form:form>
</div>



</div>
</div>

