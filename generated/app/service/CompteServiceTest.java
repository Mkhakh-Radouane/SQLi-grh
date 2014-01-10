package app.service;

import app.domain.Compte;
import app.domain.ManagerRhStatus;
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
public class CompteServiceTest {

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
	protected CompteService service;

	/**
	 * Instantiates a new CompteServiceTest.
	 *
	 */
	public CompteServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Compte entity
	 * 
	 */
	@Test
	public void deleteCompte() {
		// TODO: JUnit - Populate test inputs for operation: deleteCompte 
		Compte compte = new app.domain.Compte();
		service.deleteCompte(compte);
	}

	/**
	 * Operation Unit Test
	 * Return all Compte entity
	 * 
	 */
	@Test
	public void findAllComptes() {
		// TODO: JUnit - Populate test inputs for operation: findAllComptes 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Compte> response = null;
		response = service.findAllComptes(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllComptes
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findCompteByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findCompteByPrimaryKey 
		Integer id = 0;
		Compte response = null;
		response = service.findCompteByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findCompteByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Compte entity
	 * 
	 */
	@Test
	public void loadComptes() {
		Set<Compte> response = null;
		response = service.loadComptes();
		// TODO: JUnit - Add assertions to test outputs of operation: loadComptes
	}

	/**
	 * Operation Unit Test
	 * Save an existing Profile entity
	 * 
	 */
	@Test
	public void saveCompteProfile() {
		// TODO: JUnit - Populate test inputs for operation: saveCompteProfile 
		Integer id_1 = 0;
		Profile related_profile = new app.domain.Profile();
		Compte response = null;
		response = service.saveCompteProfile(id_1, related_profile);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCompteProfile
	}

	/**
	 * Operation Unit Test
	 * Save an existing ManagerRhStatus entity
	 * 
	 */
	@Test
	public void saveCompteManagerRhStatuses() {
		// TODO: JUnit - Populate test inputs for operation: saveCompteManagerRhStatuses 
		Integer id_2 = 0;
		ManagerRhStatus related_managerrhstatuses = new app.domain.ManagerRhStatus();
		Compte response = null;
		response = service.saveCompteManagerRhStatuses(id_2, related_managerrhstatuses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveCompteManagerRhStatuses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Compte entity
	 * 
	 */
	@Test
	public void saveCompte() {
		// TODO: JUnit - Populate test inputs for operation: saveCompte 
		Compte compte_1 = new app.domain.Compte();
		service.saveCompte(compte_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing ManagerRhStatus entity
	 * 
	 */
	@Test
	public void deleteCompteManagerRhStatuses() {
		// TODO: JUnit - Populate test inputs for operation: deleteCompteManagerRhStatuses 
		Integer compte_id = 0;
		Integer related_managerrhstatuses_id = 0;
		Compte response = null;
		response = service.deleteCompteManagerRhStatuses(compte_id, related_managerrhstatuses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCompteManagerRhStatuses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Profile entity
	 * 
	 */
	@Test
	public void deleteCompteProfile() {
		// TODO: JUnit - Populate test inputs for operation: deleteCompteProfile 
		Integer compte_id_1 = 0;
		Integer related_profile_id = 0;
		Compte response = null;
		response = service.deleteCompteProfile(compte_id_1, related_profile_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteCompteProfile
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Compte entity
	 * 
	 */
	@Test
	public void countComptes() {
		Integer response = null;
		response = service.countComptes();
		// TODO: JUnit - Add assertions to test outputs of operation: countComptes
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
