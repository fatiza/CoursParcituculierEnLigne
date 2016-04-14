
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="EnteteAdmin.jsp" />
<jsp:include page="EnteteAdminMenu.jsp" />

  
 <div class="col-sm-9">
   
<h1>Liste des Eleves</h1>
	<table class="table table-hover">
	 <thead>
		<tr>
			<th>Nom</th>
			<th>prenom</th>
			<th>date de naissance</th>
			<th>e-mail</th>
			<th>telephone</th>
			<th>supp / mod</th>
		</tr>
		 </thead>
		 <tbody>
		<c:forEach items="${ listeEleve }" var="e">
			<tr>
				<td>${e.getNom()}</td>
				<td>${e.prenom}</td>
				<td>${e.dateNaissance}</td>
				<td>${e.email}</td>
				<td>${e.telephone}</td>
				<td><input type="button" value="supprime"
					onclick="self.location.href='http://localhost:8080/security/admin/sup?id=${e.getIdUtilisateur()}'" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
  </div>
  


	
</body>
</html>