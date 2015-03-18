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

<form:input type="date" path="dob" class="input date"  />
<form:errors path="dob" cssStyle="color : red;" /> 
</fieldset>

<fieldset>
<legend>Address Information</legend>

<form:input path="address.zip" class="input date" placeholder="Zip" />
<form:errors path="address.zip" cssStyle="color : red;" /> 

<form:input path="address.street" class="input input1" placeholder="Street"/>
<form:errors path="address.street" cssStyle="color : red;" /> 

<form:input path="address.city" class="input input1"   placeholder="City" />
<form:errors path="address.city" cssStyle="color : red;" /><br/> 

<form:input path="address.state" class="input input1"   placeholder="State" />
<form:errors path="address.state" cssStyle="color : red;" /> 

<form:input path="address.country" class="input email"   placeholder="Country" />
<form:errors path="address.country" cssStyle="color : red;" /> 

</fieldset>

<fieldset>
<legend>Payment Details</legend>

<form:input path="paymentDetails.ownerName" class="input input1" placeholder="Owner Name" />
<form:errors path="paymentDetails.ownerName" cssStyle="color : red;" /> 

<form:input path="paymentDetails.billingAddress" class="input input1" placeholder="Billing Address"/>
<form:errors path="paymentDetails.billingAddress" cssStyle="color : red;" /> 

<form:input path="paymentDetails.cardNumber" class="input input1"   placeholder="Card Number" />
<form:errors path="paymentDetails.cardNumber" cssStyle="color : red;" /><br/> 

<form:input path="paymentDetails.cvv" class="input input1"   placeholder="CVV" />
<form:errors path="paymentDetails.cvv" cssStyle="color : red;" /> 

<form:input path="paymentDetails.exipryDate" type="Date" class="input date"   placeholder="Expiry Date" />
<form:errors path="paymentDetails.exipryDate" cssStyle="color : red;" /> 

</fieldset>

<input type="reset" id="btn" class="input sbtn"  value="Reset" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="submit" id="btn1" class="input sbtn" value="Submit" /> 
</form:form>
</div>



</div>
</div>

