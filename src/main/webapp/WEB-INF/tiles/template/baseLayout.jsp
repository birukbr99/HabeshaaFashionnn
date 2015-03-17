<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title><tiles:insertAttribute name="title" /></title>

<link href="<c:url value='/resources/css/navigation.css' />" rel="stylesheet" />
<script type="text/javascript" src="<c:url value='/resources/javascript/navigation.js' />"></script>
<link href="<c:url value='/resources/css/layout.css' />" rel="stylesheet" />
<link href="<c:url value="/resources/css/form.css" />" rel="stylesheet">

</head>

<body>
       <div >
       <p>
		  <tiles:insertAttribute name="tester" />
		  </p>
		</div>
       <div >
       <p>
		  <tiles:insertAttribute name="heading" />
		  </p>
		</div>
		
		<div>
		   <p>
			<tiles:insertAttribute name="navigation" />		
			</p>	
		</div>


		

		<div >
		<p>
			<tiles:insertAttribute name="content" />
			</p>
		</div>

		<div >
		<p>
			<tiles:insertAttribute name="footer" />
			</p>
		</div>
	
</body>
 
</html>
