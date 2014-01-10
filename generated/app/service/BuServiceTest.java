package app.service;

import app.domain.Bu;
import app.domain.Collaborateur;

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
public class BuServiceTest {

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
	protected BuService service;

	/**
	 * Instantiates a new BuServiceTest.
	 *
	 */
	public BuServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing Bu entity
	 * 
	 */
	@Test
	public void loadBus() {
		Set<Bu> response = null;
		response = service.loadBus();
		// TODO: JUnit - Add assertions to test outputs of operation: loadBus
	}

	/**
	 * Operation Unit Test
	 * Save an existing Collaborateur entity
	 * 
	 */
	@Test
	public void saveBuCollaborateurs() {
		// TODO: JUnit - Populate test inputs for operation: saveBuCollaborateurs 
		Integer id = 0;
		Collaborateur related_collaborateurs = new app.domain.Collaborateur();
		Bu response = null;
		response = service.saveBuCollaborateurs(id, related_collaborateurs);
		// TODO: JUnit - Add assertions to test outputs of operation: saveBuCollaborateurs
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findBuByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findBuByPrimaryKey 
		Integer id_1 = 0;
		Bu response = null;
		response = service.findBuByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findBuByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Bu entity
	 * 
	 */
	@Test
	public void countBus() {
		Integer response = null;
		response = service.countBus();
		// TODO: JUnit - Add assertions to test outputs of operation: countBus
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Collaborateur entity
	 * 
	 */
	@Test
	public void deleteBuCollaborateurs() {
		// TODO: JUnit - Populate test inputs for operation: deleteBuCollaborateurs 
		Integer bu_id = 0;
		Integer related_collaborateurs_matricule = 0;
		Bu response = null;
		response = service.deleteBuCollaborateurs(bu_id, related_collaborateurs_matricule);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteBuCollaborateurs
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Bu entity
	 * 
	 */
	@Test
	public void deleteBu() {
		// TODO: JUnit - Populate test inputs for operation: deleteBu 
		Bu bu = new app.domain.Bu();
		service.deleteBu(bu);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Bu entity
	 * 
	 */
	@Test
	public void saveBu() {
		// TODO: JUnit - Populate test inputs for operation: saveBu 
		Bu bu_1 = new app.domain.Bu();
		service.saveBu(bu_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Bu entity
	 * 
	 */
	@Test
	public void findAllBus() {
		// TODO: JUnit - Populate test inputs for operation: findAllBus 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Bu> response = null;
		response = service.findAllBus(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllBus
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
