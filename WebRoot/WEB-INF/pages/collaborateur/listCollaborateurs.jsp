<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.collaborateur-resources"/>
<html>
<head>
<title>List <fmt:message key="collaborateur.title"/>s</title>
</head>
<body>


<div class="span12">

				<!-- Pie: Top Bar -->
				<div class="top-bar">
					<h3><i class="icon-eye-open"></i> Liste des Collaborateurs</h3>
				</div>
				<!-- / Pie: Top Bar -->

				<!-- Pie: Content -->
				<div class="well no-padding">
					
					<table class="data-table">
						<thead>
							<tr>
					
					
					
					<th class="center"><fmt:message key="collaborateur.nom.title"/></th>
					<th class="center"><fmt:message key="collaborateur.prenom.title"/></th>									
					<th class="center"><fmt:message key="collaborateur.site.title"/></th>					
					<th class="center"><fmt:message key="collaborateur.actualmanagerrh.title"/></th>				
					<th class="center"><fmt:message key="collaborateur.email.title"/></th>
					<th class="center">Actions</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${collaborateurs}" var="current" varStatus="i">
								<tr>
								
								
								
								
					
					<td class="center">
						
							${current.nom}
						&nbsp;
					</td>
					<td class="center">
						
							${current.prenom}
						&nbsp;
					</td>
				
					<td class="center">
						
							${current.site}
						&nbsp;
					</td>
					<td class="center">
						
							${current.actualManagerRh}
						&nbsp;
					</td>
					<td class="center">
						
							${current.email}
						&nbsp;
					</td>
					
									
									<td class="right">
										<a href="${pageContext.request.contextPath}/confirmDeleteCollaborateur?matriculeKey=${current.matricule}&" ><button type="button" class="btn btn-danger" >Delete</button></a>
										<a href="${pageContext.request.contextPath}/selectCollaborateur?matriculeKey=${current.matricule}&"><button type="button" class="btn btn-succes" >Affiche</button></a>
										<a href="${pageContext.request.contextPath}/editCollaborateur?matriculeKey=${current.matricule}&"><button type="button" class="btn btn-info" >Edit</button></a>
										
									</td>
					</tr>
							</c:forEach>	
					
						</tbody>
						
					</table>

				</div>
				<!-- / Pie: Content -->

			</div>

</body>
</html>