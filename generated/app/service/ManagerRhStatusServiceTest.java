package app.service;

import app.domain.Compte;
import app.domain.ManagerRhStatus;

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
public class ManagerRhStatusServiceTest {

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
	protected ManagerRhStatusService service;

	/**
	 * Instantiates a new ManagerRhStatusServiceTest.
	 *
	 */
	public ManagerRhStatusServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing ManagerRhStatus entity
	 * 
	 */
	@Test
	public void loadManagerRhStatuss() {
		Set<ManagerRhStatus> response = null;
		response = service.loadManagerRhStatuss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadManagerRhStatuss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Compte entity
	 * 
	 */
	@Test
	public void deleteManagerRhStatusCompte() {
		// TODO: JUnit - Populate test inputs for operation: deleteManagerRhStatusCompte 
		Integer managerrhstatus_id = 0;
		Integer related_compte_id = 0;
		ManagerRhStatus response = null;
		response = service.deleteManagerRhStatusCompte(managerrhstatus_id, related_compte_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteManagerRhStatusCompte
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ManagerRhStatus entity
	 * 
	 */
	@Test
	public void deleteManagerRhStatus() {
		// TODO: JUnit - Populate test inputs for operation: deleteManagerRhStatus 
		ManagerRhStatus managerrhstatus = new app.domain.ManagerRhStatus();
		service.deleteManagerRhStatus(managerrhstatus);
	}

	/**
	 * Operation Unit Test
	 * Save an existing ManagerRhStatus entity
	 * 
	 */
	@Test
	public void saveManagerRhStatus() {
		// TODO: JUnit - Populate test inputs for operation: saveManagerRhStatus 
		ManagerRhStatus managerrhstatus_1 = new app.domain.ManagerRhStatus();
		service.saveManagerRhStatus(managerrhstatus_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Compte entity
	 * 
	 */
	@Test
	public void saveManagerRhStatusCompte() {
		// TODO: JUnit - Populate test inputs for operation: saveManagerRhStatusCompte 
		Integer id = 0;
		Compte related_compte = new app.domain.Compte();
		ManagerRhStatus response = null;
		response = service.saveManagerRhStatusCompte(id, related_compte);
		// TODO: JUnit - Add assertions to test outputs of operation: saveManagerRhStatusCompte
	}

	/**
	 * Operation Unit Test
	 * Return a count of all ManagerRhStatus entity
	 * 
	 */
	@Test
	public void countManagerRhStatuss() {
		Integer response = null;
		response = service.countManagerRhStatuss();
		// TODO: JUnit - Add assertions to test outputs of operation: countManagerRhStatuss
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findManagerRhStatusByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findManagerRhStatusByPrimaryKey 
		Integer id_1 = 0;
		ManagerRhStatus response = null;
		response = service.findManagerRhStatusByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findManagerRhStatusByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all ManagerRhStatus entity
	 * 
	 */
	@Test
	public void findAllManagerRhStatuss() {
		// TODO: JUnit - Populate test inputs for operation: findAllManagerRhStatuss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<ManagerRhStatus> response = null;
		response = service.findAllManagerRhStatuss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllManagerRhStatuss
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
