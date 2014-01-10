<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.technologie-resources"/>
<html>
<head>
<title>View <fmt:message key="technologie.title"/> <fmt:message key="technologiesmaitrisees.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="technologiesmaitrisees.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectTechnologie?idKey=${technologie_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
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
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteTechnologieTechnologiesMaitriseeses?technologie_id=${technologie_id}&related_technologiesmaitriseeses_technologieField=${technologiesmaitrisees.technologieField}&related_technologiesmaitriseeses_collaborateur=${technologiesmaitrisees.collaborateur}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
