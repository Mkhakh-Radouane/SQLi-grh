package app.service;

import app.domain.Diplome;
import app.domain.Niveau;

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
public class NiveauServiceTest {

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
	protected NiveauService service;

	/**
	 * Instantiates a new NiveauServiceTest.
	 *
	 */
	public NiveauServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findNiveauByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findNiveauByPrimaryKey 
		Integer id = 0;
		Niveau response = null;
		response = service.findNiveauByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findNiveauByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Diplome entity
	 * 
	 */
	@Test
	public void saveNiveauDiplomes() {
		// TODO: JUnit - Populate test inputs for operation: saveNiveauDiplomes 
		Integer id_1 = 0;
		Diplome related_diplomes = new app.domain.Diplome();
		Niveau response = null;
		response = service.saveNiveauDiplomes(id_1, related_diplomes);
		// TODO: JUnit - Add assertions to test outputs of operation: saveNiveauDiplomes
	}

	/**
	 * Operation Unit Test
	 * Save an existing Niveau entity
	 * 
	 */
	@Test
	public void saveNiveau() {
		// TODO: JUnit - Populate test inputs for operation: saveNiveau 
		Niveau niveau = new app.domain.Niveau();
		service.saveNiveau(niveau);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Diplome entity
	 * 
	 */
	@Test
	public void deleteNiveauDiplomes() {
		// TODO: JUnit - Populate test inputs for operation: deleteNiveauDiplomes 
		Integer niveau_id = 0;
		Integer related_diplomes_id = 0;
		Niveau response = null;
		response = service.deleteNiveauDiplomes(niveau_id, related_diplomes_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteNiveauDiplomes
	}

	/**
	 * Operation Unit Test
	 * Load an existing Niveau entity
	 * 
	 */
	@Test
	public void loadNiveaus() {
		Set<Niveau> response = null;
		response = service.loadNiveaus();
		// TODO: JUnit - Add assertions to test outputs of operation: loadNiveaus
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Niveau entity
	 * 
	 */
	@Test
	public void deleteNiveau() {
		// TODO: JUnit - Populate test inputs for operation: deleteNiveau 
		Niveau niveau_1 = new app.domain.Niveau();
		service.deleteNiveau(niveau_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Niveau entity
	 * 
	 */
	@Test
	public void countNiveaus() {
		Integer response = null;
		response = service.countNiveaus();
		// TODO: JUnit - Add assertions to test outputs of operation: countNiveaus
	}

	/**
	 * Operation Unit Test
	 * Return all Niveau entity
	 * 
	 */
	@Test
	public void findAllNiveaus() {
		// TODO: JUnit - Populate test inputs for operation: findAllNiveaus 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Niveau> response = null;
		response = service.findAllNiveaus(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllNiveaus
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
