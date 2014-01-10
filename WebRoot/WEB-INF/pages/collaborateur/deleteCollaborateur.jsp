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
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteCollaborateur?matriculeKey=${collaborateur.matricule}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>