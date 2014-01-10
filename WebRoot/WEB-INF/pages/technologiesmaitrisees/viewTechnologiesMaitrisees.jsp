<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.technologiesmaitrisees-resources"/>
<html>
<head>
<title>View <fmt:message key="technologiesmaitrisees.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="technologiesmaitrisees.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexTechnologiesMaitrisees"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="technologiesmaitrisees.technologiefield.title"/>:
						</td>
						<td>
							${technologiesmaitrisees.technologieField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="technologiesmaitrisees.collaborateur.title"/>:
						</td>
						<td>
							${technologiesmaitrisees.collaborateur}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="technologiesmaitrisees.niveauexpertise.title"/>:
						</td>
						<td>
							${technologiesmaitrisees.niveauExpertise}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="technologie.title"/></h1>
					
						<c:if test='${technologiesmaitrisees.technologie != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="technologie.id.title"/>:
						</td>
						<td>
							${technologiesmaitrisees.technologie.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="technologie.technologiefield.title"/>:
						</td>
						<td>
							${technologiesmaitrisees.technologie.technologieField}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editTechnologiesMaitriseesTechnologie?technologiesmaitrisees_technologieField=${technologiesmaitrisees.technologieField}&technologiesmaitrisees_collaborateur=${technologiesmaitrisees.collaborateur}&technologie_id=${technologiesmaitrisees.technologie.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteTechnologiesMaitriseesTechnologie?technologiesmaitrisees_technologieField=${technologiesmaitrisees.technologieField}&technologiesmaitrisees_collaborateur=${technologiesmaitrisees.collaborateur}&related_technologie_id=${technologiesmaitrisees.technologie.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${technologiesmaitrisees.technologie == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newTechnologiesMaitriseesTechnologie?technologiesmaitrisees_technologieField=${technologiesmaitrisees.technologieField}&technologiesmaitrisees_collaborateur=${technologiesmaitrisees.collaborateur}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="technologie.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>