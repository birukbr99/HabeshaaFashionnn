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
</fieldset>

<fieldset>
<legend>Address Information</legend>

<form:input path="customer.zip" class="input date" placeholder="Zip" />
<form:errors path="customer.zip" cssStyle="color : red;" /> 

<form:input path="customer.street" class="input input1" placeholder="Street"/>
<form:errors path="customer.street" cssStyle="color : red;" /> 

<form:input path="customer.city" class="input input1"   placeholder="City" />
<form:errors path="customer.city" cssStyle="color : red;" /><br/> 

<form:input path="customer.state" class="input input1"   placeholder="State" />
<form:errors path="customer.state" cssStyle="color : red;" /> 

<form:input path="customer.country" class="input email"   placeholder="Country" />
<form:errors path="customer.country" cssStyle="color : red;" /> 

</fieldset>

<fieldset>
<legend>Payment Details</legend>

<form:input path="customer.ownerName" class="input input1" placeholder="Owner Name" />
<form:errors path="customer.ownerName" cssStyle="color : red;" /> 

<form:input path="customer.billingAddress" class="input input1" placeholder="Billing Address"/>
<form:errors path="customer.billingAddress" cssStyle="color : red;" /> 

<form:input path="customer.cardNumber" class="input input1"   placeholder="Card Number" />
<form:errors path="customer.cardNumber" cssStyle="color : red;" /><br/> 

<form:input path="customer.cvv" class="input input1"   placeholder="CVV" />
<form:errors path="customer.cvv" cssStyle="color : red;" /> 

<form:input path="customer.exipryDate" type="Date" class="input date"   placeholder="Expiry Date" />
<form:errors path="customer.exipryDate" cssStyle="color : red;" /> 

</fieldset>

<input type="reset" id="btn" class="input sbtn"  value="Reset" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="submit" id="btn1" class="input sbtn" value="Submit" /> 
</form:form>
</div>



</div>
</div>

