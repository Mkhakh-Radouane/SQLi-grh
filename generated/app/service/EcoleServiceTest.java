package app.service;

import app.domain.Diplome;
import app.domain.Ecole;

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
public class EcoleServiceTest {

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
	protected EcoleService service;

	/**
	 * Instantiates a new EcoleServiceTest.
	 *
	 */
	public EcoleServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Diplome entity
	 * 
	 */
	@Test
	public void deleteEcoleDiplomes() {
		// TODO: JUnit - Populate test inputs for operation: deleteEcoleDiplomes 
		Integer ecole_id = 0;
		Integer related_diplomes_id = 0;
		Ecole response = null;
		response = service.deleteEcoleDiplomes(ecole_id, related_diplomes_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteEcoleDiplomes
	}

	/**
	 * Operation Unit Test
	 * Save an existing Ecole entity
	 * 
	 */
	@Test
	public void saveEcole() {
		// TODO: JUnit - Populate test inputs for operation: saveEcole 
		Ecole ecole = new app.domain.Ecole();
		service.saveEcole(ecole);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Ecole entity
	 * 
	 */
	@Test
	public void countEcoles() {
		Integer response = null;
		response = service.countEcoles();
		// TODO: JUnit - Add assertions to test outputs of operation: countEcoles
	}

	/**
	 * Operation Unit Test
	 * Load an existing Ecole entity
	 * 
	 */
	@Test
	public void loadEcoles() {
		Set<Ecole> response = null;
		response = service.loadEcoles();
		// TODO: JUnit - Add assertions to test outputs of operation: loadEcoles
	}

	/**
	 * Operation Unit Test
	 * Save an existing Diplome entity
	 * 
	 */
	@Test
	public void saveEcoleDiplomes() {
		// TODO: JUnit - Populate test inputs for operation: saveEcoleDiplomes 
		Integer id = 0;
		Diplome related_diplomes = new app.domain.Diplome();
		Ecole response = null;
		response = service.saveEcoleDiplomes(id, related_diplomes);
		// TODO: JUnit - Add assertions to test outputs of operation: saveEcoleDiplomes
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findEcoleByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findEcoleByPrimaryKey 
		Integer id_1 = 0;
		Ecole response = null;
		response = service.findEcoleByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findEcoleByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all Ecole entity
	 * 
	 */
	@Test
	public void findAllEcoles() {
		// TODO: JUnit - Populate test inputs for operation: findAllEcoles 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Ecole> response = null;
		response = service.findAllEcoles(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllEcoles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Ecole entity
	 * 
	 */
	@Test
	public void deleteEcole() {
		// TODO: JUnit - Populate test inputs for operation: deleteEcole 
		Ecole ecole_1 = new app.domain.Ecole();
		service.deleteEcole(ecole_1);
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
