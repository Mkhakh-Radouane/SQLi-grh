package app.service;

import app.domain.Droit;
import app.domain.Profile;

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
public class DroitServiceTest {

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
	protected DroitService service;

	/**
	 * Instantiates a new DroitServiceTest.
	 *
	 */
	public DroitServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Droit entity
	 * 
	 */
	@Test
	public void deleteDroit() {
		// TODO: JUnit - Populate test inputs for operation: deleteDroit 
		Droit droit = new app.domain.Droit();
		service.deleteDroit(droit);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Droit entity
	 * 
	 */
	@Test
	public void countDroits() {
		Integer response = null;
		response = service.countDroits();
		// TODO: JUnit - Add assertions to test outputs of operation: countDroits
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findDroitByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findDroitByPrimaryKey 
		Integer id = 0;
		Droit response = null;
		response = service.findDroitByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findDroitByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Droit entity
	 * 
	 */
	@Test
	public void loadDroits() {
		Set<Droit> response = null;
		response = service.loadDroits();
		// TODO: JUnit - Add assertions to test outputs of operation: loadDroits
	}

	/**
	 * Operation Unit Test
	 * Return all Droit entity
	 * 
	 */
	@Test
	public void findAllDroits() {
		// TODO: JUnit - Populate test inputs for operation: findAllDroits 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Droit> response = null;
		response = service.findAllDroits(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllDroits
	}

	/**
	 * Operation Unit Test
	 * Save an existing Profile entity
	 * 
	 */
	@Test
	public void saveDroitProfiles() {
		// TODO: JUnit - Populate test inputs for operation: saveDroitProfiles 
		Integer id_1 = 0;
		Profile related_profiles = new app.domain.Profile();
		Droit response = null;
		response = service.saveDroitProfiles(id_1, related_profiles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveDroitProfiles
	}

	/**
	 * Operation Unit Test
	 * Save an existing Droit entity
	 * 
	 */
	@Test
	public void saveDroit() {
		// TODO: JUnit - Populate test inputs for operation: saveDroit 
		Droit droit_1 = new app.domain.Droit();
		service.saveDroit(droit_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Profile entity
	 * 
	 */
	@Test
	public void deleteDroitProfiles() {
		// TODO: JUnit - Populate test inputs for operation: deleteDroitProfiles 
		Integer droit_id = 0;
		Integer related_profiles_id = 0;
		Droit response = null;
		response = service.deleteDroitProfiles(droit_id, related_profiles_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteDroitProfiles
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
