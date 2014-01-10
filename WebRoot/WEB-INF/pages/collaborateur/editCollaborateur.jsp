<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.collaborateur-resources"/>
<html>
<head>
<title>Edit <fmt:message key="collaborateur.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="collaborateur.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexCollaborateur"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveCollaborateur" method="POST" modelAttribute="collaborateur">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.ancienmanagerrh.title"/>:
						</td>
						<td>
							<form:input id="collaborateur_ancienManagerRh" path="ancienManagerRh" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_ancienManagerRh",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="collaborateur.ancienmanagerrh.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.actualmanagerrh.title"/>:
						</td>
						<td>
							<form:input id="collaborateur_actualManagerRh" path="actualManagerRh" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_actualManagerRh",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="collaborateur.actualmanagerrh.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.nom.title"/>:
						</td>
						<td>
							<form:input id="collaborateur_nom" path="nom" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_nom",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="collaborateur.nom.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.prenom.title"/>:
						</td>
						<td>
							<form:input id="collaborateur_prenom" path="prenom" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_prenom",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="collaborateur.prenom.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.abreviation.title"/>:
						</td>
						<td>
							<form:input id="collaborateur_abreviation" path="abreviation" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_abreviation",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="collaborateur.abreviation.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.sexe.title"/>:
						</td>
						<td>
							<form:input id="collaborateur_sexe" path="sexe" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_sexe",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="collaborateur.sexe.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.site.title"/>:
						</td>
						<td>
							<form:input id="collaborateur_site" path="site" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_site",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="collaborateur.site.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.dateembauche.title"/>:
						</td>
						<td>
							<input id="collaborateur_dateEmbauche" name="dateEmbauche" type="text" value="<fmt:formatDate value="${collaborateur.dateEmbauche.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_dateEmbauche",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.moisbap.title"/>:
						</td>
						<td>
							<form:input id="collaborateur_moisBap" path="moisBap" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_moisBap",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="collaborateur.moisbap.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.datedepart.title"/>:
						</td>
						<td>
							<input id="collaborateur_dateDepart" name="dateDepart" type="text" value="<fmt:formatDate value="${collaborateur.dateDepart.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_dateDepart",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.anciencollaborateur.title"/>:
						</td>
						<td>
							<form:checkbox id="collaborateur_ancienCollaborateur" path="ancienCollaborateur" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_ancienCollaborateur",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.seminaireparticipation.title"/>:
						</td>
						<td>
							<form:checkbox id="collaborateur_seminaireParticipation" path="seminaireParticipation" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_seminaireParticipation",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.dateparticipation.title"/>:
						</td>
						<td>
							<input id="collaborateur_dateParticipation" name="dateParticipation" type="text" value="<fmt:formatDate value="${collaborateur.dateParticipation.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_dateParticipation",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="collaborateur.email.title"/>:
						</td>
						<td>
							<form:input id="collaborateur_email" path="email" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "collaborateur_email",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="collaborateur.email.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>