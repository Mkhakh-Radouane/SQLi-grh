<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.managerrhstatus-resources"/>
<html>
<head>
<title>View <fmt:message key="managerrhstatus.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="managerrhstatus.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexManagerRhStatus"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="managerrhstatus.id.title"/>:
						</td>
						<td>
							${managerrhstatus.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="managerrhstatus.collaborateur.title"/>:
						</td>
						<td>
							${managerrhstatus.collaborateur}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="managerrhstatus.activation.title"/>:
						</td>
						<td>
							${managerrhstatus.activation}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="compte.title"/></h1>
					
						<c:if test='${managerrhstatus.compte != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="compte.id.title"/>:
						</td>
						<td>
							${managerrhstatus.compte.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="compte.login.title"/>:
						</td>
						<td>
							${managerrhstatus.compte.login}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="compte.password.title"/>:
						</td>
						<td>
							${managerrhstatus.compte.password}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="compte.email.title"/>:
						</td>
						<td>
							${managerrhstatus.compte.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="compte.activation.title"/>:
						</td>
						<td>
							${managerrhstatus.compte.activation}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editManagerRhStatusCompte?managerrhstatus_id=${managerrhstatus.id}&compte_id=${managerrhstatus.compte.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteManagerRhStatusCompte?managerrhstatus_id=${managerrhstatus.id}&related_compte_id=${managerrhstatus.compte.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${managerrhstatus.compte == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newManagerRhStatusCompte?managerrhstatus_id=${managerrhstatus.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="compte.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>