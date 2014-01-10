<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.diplome-resources"/>
<html>
<head>
<title>View <fmt:message key="diplome.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="diplome.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexDiplome"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diplome.id.title"/>:
						</td>
						<td>
							${diplome.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diplome.promotion.title"/>:
						</td>
						<td>
							${diplome.promotion}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diplome.collaborateurmatricule.title"/>:
						</td>
						<td>
							${diplome.collaborateurMatricule}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="ecole.title"/></h1>
					
						<c:if test='${diplome.ecole != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="ecole.id.title"/>:
						</td>
						<td>
							${diplome.ecole.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="ecole.nom.title"/>:
						</td>
						<td>
							${diplome.ecole.nom}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="ecole.type.title"/>:
						</td>
						<td>
							${diplome.ecole.type}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editDiplomeEcole?diplome_id=${diplome.id}&ecole_id=${diplome.ecole.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteDiplomeEcole?diplome_id=${diplome.id}&related_ecole_id=${diplome.ecole.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${diplome.ecole == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newDiplomeEcole?diplome_id=${diplome.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="ecole.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="niveau.title"/></h1>
					
						<c:if test='${diplome.niveau != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="niveau.id.title"/>:
						</td>
						<td>
							${diplome.niveau.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="niveau.niveaufield.title"/>:
						</td>
						<td>
							${diplome.niveau.niveauField}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editDiplomeNiveau?diplome_id=${diplome.id}&niveau_id=${diplome.niveau.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteDiplomeNiveau?diplome_id=${diplome.id}&related_niveau_id=${diplome.niveau.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${diplome.niveau == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newDiplomeNiveau?diplome_id=${diplome.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="niveau.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>