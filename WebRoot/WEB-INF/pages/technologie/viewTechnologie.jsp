<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.technologie-resources"/>
<html>
<head>
<title>View <fmt:message key="technologie.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="technologie.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexTechnologie"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="technologie.id.title"/>:
						</td>
						<td>
							${technologie.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="technologie.technologiefield.title"/>:
						</td>
						<td>
							${technologie.technologieField}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="technologiesmaitrisees.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newTechnologieTechnologiesMaitriseeses?technologie_id=${technologie.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="technologiesmaitrisees.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="technologiesmaitrisees.technologiefield.title"/></th>
						<th class="thead"><fmt:message key="technologiesmaitrisees.collaborateur.title"/></th>
						<th class="thead"><fmt:message key="technologiesmaitrisees.niveauexpertise.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${technologie.technologiesMaitriseeses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectTechnologieTechnologiesMaitriseeses?technologie_id=${technologie.id}&technologiesmaitriseeses_technologieField=${current.technologieField}&technologiesmaitriseeses_collaborateur=${current.collaborateur}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editTechnologieTechnologiesMaitriseeses?technologie_id=${technologie.id}&technologiesmaitriseeses_technologieField=${current.technologieField}&technologiesmaitriseeses_collaborateur=${current.collaborateur}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteTechnologieTechnologiesMaitriseeses?technologie_id=${technologie.id}&related_technologiesmaitriseeses_technologieField=${current.technologieField}&related_technologiesmaitriseeses_collaborateur=${current.collaborateur}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.technologieField}
						&nbsp;
						</td>
						<td>
							${current.collaborateur}
						&nbsp;
						</td>
						<td>
							${current.niveauExpertise}
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