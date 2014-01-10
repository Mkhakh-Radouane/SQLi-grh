<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.salaire-resources"/>
<html>
<head>
<title>View <fmt:message key="salaire.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="salaire.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexSalaire"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="salaire.id.title"/>:
						</td>
						<td>
							${salaire.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="salaire.collaborateurmatricule.title"/>:
						</td>
						<td>
							${salaire.collaborateurMatricule}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="salaire.posteidposte.title"/>:
						</td>
						<td>
							${salaire.posteIdPoste}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="salaire.salairefield.title"/>:
						</td>
						<td>
							${salaire.salaireField}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="salaire.dateelevation.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${salaire.dateElevation.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="collaborateur.title"/></h1>
					
						<c:if test='${salaire.collaborateur != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.matricule.title"/>:
						</td>
						<td>
							${salaire.collaborateur.matricule}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.ancienmanagerrh.title"/>:
						</td>
						<td>
							${salaire.collaborateur.ancienManagerRh}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.actualmanagerrh.title"/>:
						</td>
						<td>
							${salaire.collaborateur.actualManagerRh}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.nom.title"/>:
						</td>
						<td>
							${salaire.collaborateur.nom}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.prenom.title"/>:
						</td>
						<td>
							${salaire.collaborateur.prenom}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.abreviation.title"/>:
						</td>
						<td>
							${salaire.collaborateur.abreviation}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.sexe.title"/>:
						</td>
						<td>
							${salaire.collaborateur.sexe}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.site.title"/>:
						</td>
						<td>
							${salaire.collaborateur.site}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.dateembauche.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${salaire.collaborateur.dateEmbauche.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.moisbap.title"/>:
						</td>
						<td>
							${salaire.collaborateur.moisBap}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.datedepart.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${salaire.collaborateur.dateDepart.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.anciencollaborateur.title"/>:
						</td>
						<td>
							${salaire.collaborateur.ancienCollaborateur}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.seminaireparticipation.title"/>:
						</td>
						<td>
							${salaire.collaborateur.seminaireParticipation}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.dateparticipation.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${salaire.collaborateur.dateParticipation.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="collaborateur.email.title"/>:
						</td>
						<td>
							${salaire.collaborateur.email}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editSalaireCollaborateur?salaire_id=${salaire.id}&salaire_collaborateurMatricule=${salaire.collaborateurMatricule}&salaire_posteIdPoste=${salaire.posteIdPoste}&collaborateur_matricule=${salaire.collaborateur.matricule}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteSalaireCollaborateur?salaire_id=${salaire.id}&salaire_collaborateurMatricule=${salaire.collaborateurMatricule}&salaire_posteIdPoste=${salaire.posteIdPoste}&related_collaborateur_matricule=${salaire.collaborateur.matricule}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${salaire.collaborateur == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newSalaireCollaborateur?salaire_id=${salaire.id}&salaire_collaborateurMatricule=${salaire.collaborateurMatricule}&salaire_posteIdPoste=${salaire.posteIdPoste}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="collaborateur.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="poste.title"/></h1>
					
						<c:if test='${salaire.poste != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="poste.postefield.title"/>:
						</td>
						<td>
							${salaire.poste.posteField}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editSalairePoste?salaire_id=${salaire.id}&salaire_collaborateurMatricule=${salaire.collaborateurMatricule}&salaire_posteIdPoste=${salaire.posteIdPoste}&poste_idPoste=${salaire.poste.idPoste}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteSalairePoste?salaire_id=${salaire.id}&salaire_collaborateurMatricule=${salaire.collaborateurMatricule}&salaire_posteIdPoste=${salaire.posteIdPoste}&related_poste_idPoste=${salaire.poste.idPoste}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${salaire.poste == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newSalairePoste?salaire_id=${salaire.id}&salaire_collaborateurMatricule=${salaire.collaborateurMatricule}&salaire_posteIdPoste=${salaire.posteIdPoste}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="poste.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>