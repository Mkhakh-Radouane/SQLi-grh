package app.service;

import app.domain.Bu;
import app.domain.Collaborateur;
import app.domain.Salaire;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
@Transactional
public class CollaborateurServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected CollaborateurService service;

	/**
	 * Instantiates a new CollaborateurServiceTest.
	 *
	 */
	public CollaborateurServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Collaborateur entity
	 * 
	 */
	@Test
	public void saveCollaborateur() {
		// TODO: JUnit - Populate test inputs for operation: saveCollaborateur 
		Collaborateur collaborateur = new app.domain.Collaborateur();
		service.saveCollaborateur(collaborateur);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Collaborateur entity
	 * 
	 */
	@Test
	public void countCollaborateurs() {
		Integer response = null;
		response = service.countCollaborateurs();
		// TODO: JUnit - Add assertions to test outputs of operation: countCollaborateurs
	}

	/**
	 * Operation Unit Test
	 * Return all Collaborateur entity
	 * 
	 */
	@Test
	public void findAllCollaborateurs() {
		// TODO: JUnit - Populate test inputs for operation: findAllCollaborateurs 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Collaborateur> response = null;
		response = service.findAllCollaborateurs(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllCollaborateurs
	}

	/**
	 * Operation Unit Test
	 * Save an existing Bu entity
	 * 
	 */
	@Test
	public void saveCollaborateurBu() {
		// TODO: JUnit - Populate test inputs for operation: saveCollaborateurBu 
		Integer matricule = 0;
		Bu related_bu = new app.domain.Bu();
		Collaborateur response = null;
		response = service.saveCollaborateurBu(matricule, related_bu);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCollaborateurBu
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCollaborateurByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCollaborateurByPrimaryKey 
		Integer matricule_1 = 0;
		Collaborateur response = null;
		response = service.findCollaborateurByPrimaryKey(matricule_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findCollaborateurByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Salaire entity
	 * 
	 */
	@Test
	public void saveCollaborateurSalaires() {
		// TODO: JUnit - Populate test inputs for operation: saveCollaborateurSalaires 
		Integer matricule_2 = 0;
		Salaire related_salaires = new app.domain.Salaire();
		Collaborateur response = null;
		response = service.saveCollaborateurSalaires(matricule_2, related_salaires);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCollaborateurSalaires
	}

	/**
	 * Operation Unit Test
	 * Load an existing Collaborateur entity
	 * 
	 */
	@Test
	public void loadCollaborateurs() {
		Set<Collaborateur> response = null;
		response = service.loadCollaborateurs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadCollaborateurs
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Bu entity
	 * 
	 */
	@Test
	public void deleteCollaborateurBu() {
		// TODO: JUnit - Populate test inputs for operation: deleteCollaborateurBu 
		Integer collaborateur_matricule = 0;
		Integer related_bu_id = 0;
		Collaborateur response = null;
		response = service.deleteCollaborateurBu(collaborateur_matricule, related_bu_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCollaborateurBu
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Collaborateur entity
	 * 
	 */
	@Test
	public void deleteCollaborateur() {
		// TODO: JUnit - Populate test inputs for operation: deleteCollaborateur 
		Collaborateur collaborateur_1 = new app.domain.Collaborateur();
		service.deleteCollaborateur(collaborateur_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Salaire entity
	 * 
	 */
	@Test
	public void deleteCollaborateurSalaires() {
		// TODO: JUnit - Populate test inputs for operation: deleteCollaborateurSalaires 
		Integer collaborateur_matricule_1 = 0;
		Integer related_salaires_id = 0;
		Integer related_salaires_collaborateurMatricule = 0;
		Integer related_salaires_posteIdPoste = 0;
		Collaborateur response = null;
		response = service.deleteCollaborateurSalaires(collaborateur_matricule_1, related_salaires_id, related_salaires_collaborateurMatricule, related_salaires_posteIdPoste);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCollaborateurSalaires
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
