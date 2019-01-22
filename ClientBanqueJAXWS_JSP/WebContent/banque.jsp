<%@page import="service.BanqueServiceService"%>
<%@page import="service.BanqueWSProxy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	double mt=0; 
	double res=0;
	
	if(request.getParameter("montant")!=null){
		
		/*
			A partir de la requête http je recupère 
			le montant.
		*/
		mt=Double.parseDouble(request.getParameter("montant"));
		
		//Je crée le proxy 
		BanqueWSProxy stub = new BanqueWSProxy();
		
		//Je recupère le resultat
		res = stub.conversionEuroToHTG(mt);
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<form action="banque.jsp">
		<label>Montant: </label>
		<input type="text" name="montant" value='<%=mt%>' />
		<button type="submit">Ok</button>
	</form>
	<%=mt%> en euros = <%=res%> en HTG
</body>
</html>