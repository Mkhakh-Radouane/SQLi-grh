<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.poste-resources"/>
<html>
<head>
<title>View <fmt:message key="poste.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="poste.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexPoste"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="poste.idposte.title"/>:
						</td>
						<td>
							${poste.idPoste}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="poste.postefield.title"/>:
						</td>
						<td>
							${poste.posteField}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="salaire.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newPosteSalaires?poste_idPoste=${poste.idPoste}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="salaire.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="salaire.salairefield.title"/></th>
						<th class="thead"><fmt:message key="salaire.dateelevation.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${poste.salaires}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectPosteSalaires?poste_idPoste=${poste.idPoste}&salaires_id=${current.id}&salaires_collaborateurMatricule=${current.collaborateurMatricule}&salaires_posteIdPoste=${current.posteIdPoste}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editPosteSalaires?poste_idPoste=${poste.idPoste}&salaires_id=${current.id}&salaires_collaborateurMatricule=${current.collaborateurMatricule}&salaires_posteIdPoste=${current.posteIdPoste}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeletePosteSalaires?poste_idPoste=${poste.idPoste}&related_salaires_id=${current.id}&related_salaires_collaborateurMatricule=${current.collaborateurMatricule}&related_salaires_posteIdPoste=${current.posteIdPoste}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.salaireField}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.dateElevation.time}"/>
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>