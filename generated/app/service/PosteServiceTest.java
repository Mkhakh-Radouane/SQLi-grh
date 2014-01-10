package app.service;

import app.domain.Poste;
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
public class PosteServiceTest {

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
	protected PosteService service;

	/**
	 * Instantiates a new PosteServiceTest.
	 *
	 */
	public PosteServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findPosteByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findPosteByPrimaryKey 
		Integer idPoste = 0;
		Poste response = null;
		response = service.findPosteByPrimaryKey(idPoste);
		// TODO: JUnit - Add assertions to test outputs of operation: findPosteByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Salaire entity
	 * 
	 */
	@Test
	public void deletePosteSalaires() {
		// TODO: JUnit - Populate test inputs for operation: deletePosteSalaires 
		Integer poste_idPoste = 0;
		Integer related_salaires_id = 0;
		Integer related_salaires_collaborateurMatricule = 0;
		Integer related_salaires_posteIdPoste = 0;
		Poste response = null;
		response = service.deletePosteSalaires(poste_idPoste, related_salaires_id, related_salaires_collaborateurMatricule, related_salaires_posteIdPoste);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePosteSalaires
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Poste entity
	 * 
	 */
	@Test
	public void deletePoste() {
		// TODO: JUnit - Populate test inputs for operation: deletePoste 
		Poste poste = new app.domain.Poste();
		service.deletePoste(poste);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Poste entity
	 * 
	 */
	@Test
	public void countPostes() {
		Integer response = null;
		response = service.countPostes();
		// TODO: JUnit - Add assertions to test outputs of operation: countPostes
	}

	/**
	 * Operation Unit Test
	 * Return all Poste entity
	 * 
	 */
	@Test
	public void findAllPostes() {
		// TODO: JUnit - Populate test inputs for operation: findAllPostes 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Poste> response = null;
		response = service.findAllPostes(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllPostes
	}

	/**
	 * Operation Unit Test
	 * Save an existing Salaire entity
	 * 
	 */
	@Test
	public void savePosteSalaires() {
		// TODO: JUnit - Populate test inputs for operation: savePosteSalaires 
		Integer idPoste_1 = 0;
		Salaire related_salaires = new app.domain.Salaire();
		Poste response = null;
		response = service.savePosteSalaires(idPoste_1, related_salaires);
		// TODO: JUnit - Add assertions to test outputs of operation: savePosteSalaires
	}

	/**
	 * Operation Unit Test
	 * Load an existing Poste entity
	 * 
	 */
	@Test
	public void loadPostes() {
		Set<Poste> response = null;
		response = service.loadPostes();
		// TODO: JUnit - Add assertions to test outputs of operation: loadPostes
	}

	/**
	 * Operation Unit Test
	 * Save an existing Poste entity
	 * 
	 */
	@Test
	public void savePoste() {
		// TODO: JUnit - Populate test inputs for operation: savePoste 
		Poste poste_1 = new app.domain.Poste();
		service.savePoste(poste_1);
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
