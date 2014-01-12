<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.collaborateur-resources"/>
<html>
<head>
<title><fmt:message key="collaborateur.title"/></title>
</head>
<body>

<!-- Forms: Box -->
			<div class="span12">

				<!-- Forms: Top Bar -->
				<div class="top-bar">
					<h3><i class="icon-cog"></i> <fmt:message key="collaborateur.title"/></h3>
				</div>
				<!-- / Forms: Top Bar -->

				<!-- Forms: Content -->
				<div class="well no-padding">

					<!-- Forms: Form -->
					
					<form:form action="${pageContext.request.contextPath}/saveCollaborateur" method="POST" modelAttribute="collaborateur">
					
						
				<div class="control-group">
					<label class="control-label" for="inputName"><i class="icon-user"></i> Nom</label>
					<div class="controls">
					<input id="collaborateur_nom" name="nom" type="text" style="width:300px;"/>
					
					</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" for="inputName"><i class="icon-user"></i> Prenom</label>
					<div class="controls">
						<input id="collaborateur_prenom" name="prenom" type="text" Style="width:300px;" />
					</div>
				</div>
				<div class="control-group">
								<label class="control-label" for="inputGender"><i class="icon-user"></i> Sexe</label>
								<div class="controls">
									<div class="btn-group" data-toggle="buttons-radio">
										<button type="button" class="btn" value="M" id="collaborateur_sexe" name="sexe">Female</button>
										<button type="button" class="btn" value="F" id="collaborateur_sexe" name="sexe">Male</button>
									</div>
								</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" for="inputName"><i class="icon-circle"></i> Site</label>
					<div class="controls">
						<form:input id="collaborateur_site" path="site" cssStyle="width:300px;"/>
					</div>
				</div>
						<div class="control-group">
							<label class="control-label"><i class="icon-circle"></i>Date embauche</label>
							<div class="controls">
								<input id="collaborateur_dateEmbauche" name="dateEmbauche" type="text" value="<fmt:formatDate value="${collaborateur.dateEmbauche.time}" pattern="MM/dd/yyyy h:mm a" />" Style="width:300px;" />
								<span class="help-inline"></span>
							</div>
				</div>
				<div class="control-group">
							<label class="control-label"><i class="icon-circle"></i>Email</label>
							<div class="controls">
								<div class="input-prepend"><span class="add-on">@</span><form:input id="collaborateur_email" path="email" cssStyle="width:275px;"/></div>
							</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" for="inputName"><i class="icon-user"></i> Actual Manager</label>
					<div class="controls">
						<form:input id="collaborateur_actualManagerRh" path="actualManagerRh" cssStyle="width:300px;" />
					</div>
				</div>
				<div class="control-group">
							<label class="control-label"><i class="icon-circle"></i>Participation ?</label>
							<div class="controls">
								<label class="radio"><span><input type="radio" id="collaborateur_seminaireParticipation" name="seminaireParticipation" value="1"></span> Oui</label>
								<label class="radio"><span><input type="radio" id="collaborateur_seminaireParticipation" name="seminaireParticipation" value="0" checked=""></span> Non</label>  
								
							</div>
				</div>
				<div class="control-group">
							<label class="control-label"><i class="icon-circle"></i>Date participation</label>
							<div class="controls">
								<input id="collaborateur_dateParticipation" name="dateParticipation" type="text" value="<fmt:formatDate value="${collaborateur.dateParticipation.time}" pattern="MM/dd/yyyy h:mm a"/>" Style="width:300px;"/>
								<span class="help-inline"></span>
							</div>
				</div>
				
						

						<div class="form-actions">
							<button type="submit" class="btn btn-primary">Enregistrer</button>
							<button type="button" class="btn">Cancel</button>     
						</div>

					</form:form>
					<!-- / Forms: Form -->           

				</div>
				<!-- / Forms: Content -->

			</div>
			<!-- / Forms: Box -->




































</div>
</body>
</html>