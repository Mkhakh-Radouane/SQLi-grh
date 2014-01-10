<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.bu-resources"/>
<html>
<head>
<title>View <fmt:message key="bu.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="bu.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexBu"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bu.id.title"/>:
						</td>
						<td>
							${bu.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="bu.bufield.title"/>:
						</td>
						<td>
							${bu.buField}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="collaborateur.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newBuCollaborateurs?bu_id=${bu.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="collaborateur.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="collaborateur.matricule.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.ancienmanagerrh.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.actualmanagerrh.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.nom.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.prenom.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.abreviation.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.sexe.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.site.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.dateembauche.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.moisbap.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.datedepart.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.anciencollaborateur.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.seminaireparticipation.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.dateparticipation.title"/></th>
						<th class="thead"><fmt:message key="collaborateur.email.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${bu.collaborateurs}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectBuCollaborateurs?bu_id=${bu.id}&collaborateurs_matricule=${current.matricule}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editBuCollaborateurs?bu_id=${bu.id}&collaborateurs_matricule=${current.matricule}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteBuCollaborateurs?bu_id=${bu.id}&related_collaborateurs_matricule=${current.matricule}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.matricule}
						&nbsp;
						</td>
						<td>
							${current.ancienManagerRh}
						&nbsp;
						</td>
						<td>
							${current.actualManagerRh}
						&nbsp;
						</td>
						<td>
							${current.nom}
						&nbsp;
						</td>
						<td>
							${current.prenom}
						&nbsp;
						</td>
						<td>
							${current.abreviation}
						&nbsp;
						</td>
						<td>
							${current.sexe}
						&nbsp;
						</td>
						<td>
							${current.site}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.dateEmbauche.time}"/>
						&nbsp;
						</td>
						<td>
							${current.moisBap}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.dateDepart.time}"/>
						&nbsp;
						</td>
						<td>
							${current.ancienCollaborateur}
						&nbsp;
						</td>
						<td>
							${current.seminaireParticipation}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.dateParticipation.time}"/>
						&nbsp;
						</td>
						<td>
							${current.email}
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