<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.collaborateur-resources"/>
<html>
<head>
<title>View <fmt:message key="collaborateur.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="collaborateur.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexCollaborateur"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.matricule.title"/>:
						</td>
						<td>
							${collaborateur.matricule}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.ancienmanagerrh.title"/>:
						</td>
						<td>
							${collaborateur.ancienManagerRh}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.actualmanagerrh.title"/>:
						</td>
						<td>
							${collaborateur.actualManagerRh}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.nom.title"/>:
						</td>
						<td>
							${collaborateur.nom}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.prenom.title"/>:
						</td>
						<td>
							${collaborateur.prenom}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.abreviation.title"/>:
						</td>
						<td>
							${collaborateur.abreviation}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.sexe.title"/>:
						</td>
						<td>
							${collaborateur.sexe}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.site.title"/>:
						</td>
						<td>
							${collaborateur.site}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.dateembauche.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${collaborateur.dateEmbauche.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.moisbap.title"/>:
						</td>
						<td>
							${collaborateur.moisBap}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.datedepart.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${collaborateur.dateDepart.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.anciencollaborateur.title"/>:
						</td>
						<td>
							${collaborateur.ancienCollaborateur}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.seminaireparticipation.title"/>:
						</td>
						<td>
							${collaborateur.seminaireParticipation}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.dateparticipation.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${collaborateur.dateParticipation.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.email.title"/>:
						</td>
						<td>
							${collaborateur.email}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="bu.title"/></h1>
					
						<c:if test='${collaborateur.bu != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="bu.bufield.title"/>:
						</td>
						<td>
							${collaborateur.bu.buField}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCollaborateurBu?collaborateur_matricule=${collaborateur.matricule}&bu_id=${collaborateur.bu.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCollaborateurBu?collaborateur_matricule=${collaborateur.matricule}&related_bu_id=${collaborateur.bu.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${collaborateur.bu == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCollaborateurBu?collaborateur_matricule=${collaborateur.matricule}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="bu.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="salaire.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCollaborateurSalaires?collaborateur_matricule=${collaborateur.matricule}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="salaire.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="salaire.salairefield.title"/></th>
						<th class="thead"><fmt:message key="salaire.dateelevation.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${collaborateur.salaires}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCollaborateurSalaires?collaborateur_matricule=${collaborateur.matricule}&salaires_id=${current.id}&salaires_collaborateurMatricule=${current.collaborateurMatricule}&salaires_posteIdPoste=${current.posteIdPoste}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCollaborateurSalaires?collaborateur_matricule=${collaborateur.matricule}&salaires_id=${current.id}&salaires_collaborateurMatricule=${current.collaborateurMatricule}&salaires_posteIdPoste=${current.posteIdPoste}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCollaborateurSalaires?collaborateur_matricule=${collaborateur.matricule}&related_salaires_id=${current.id}&related_salaires_collaborateurMatricule=${current.collaborateurMatricule}&related_salaires_posteIdPoste=${current.posteIdPoste}&"><img src="images/icons/delete.gif" /></a>
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