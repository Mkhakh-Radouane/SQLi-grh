package app.service;

import app.domain.Diplome;
import app.domain.Ecole;
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
public class DiplomeServiceTest {

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
	protected DiplomeService service;

	/**
	 * Instantiates a new DiplomeServiceTest.
	 *
	 */
	public DiplomeServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Diplome entity
	 * 
	 */
	@Test
	public void saveDiplome() {
		// TODO: JUnit - Populate test inputs for operation: saveDiplome 
		Diplome diplome = new app.domain.Diplome();
		service.saveDiplome(diplome);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Niveau entity
	 * 
	 */
	@Test
	public void deleteDiplomeNiveau() {
		// TODO: JUnit - Populate test inputs for operation: deleteDiplomeNiveau 
		Integer diplome_id = 0;
		Integer related_niveau_id = 0;
		Diplome response = null;
		response = service.deleteDiplomeNiveau(diplome_id, related_niveau_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteDiplomeNiveau
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Diplome entity
	 * 
	 */
	@Test
	public void countDiplomes() {
		Integer response = null;
		response = service.countDiplomes();
		// TODO: JUnit - Add assertions to test outputs of operation: countDiplomes
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Ecole entity
	 * 
	 */
	@Test
	public void deleteDiplomeEcole() {
		// TODO: JUnit - Populate test inputs for operation: deleteDiplomeEcole 
		Integer diplome_id_1 = 0;
		Integer related_ecole_id = 0;
		Diplome response = null;
		response = service.deleteDiplomeEcole(diplome_id_1, related_ecole_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteDiplomeEcole
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Diplome entity
	 * 
	 */
	@Test
	public void deleteDiplome() {
		// TODO: JUnit - Populate test inputs for operation: deleteDiplome 
		Diplome diplome_1 = new app.domain.Diplome();
		service.deleteDiplome(diplome_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Diplome entity
	 * 
	 */
	@Test
	public void findAllDiplomes() {
		// TODO: JUnit - Populate test inputs for operation: findAllDiplomes 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Diplome> response = null;
		response = service.findAllDiplomes(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllDiplomes
	}

	/**
	 * Operation Unit Test
	 * Save an existing Niveau entity
	 * 
	 */
	@Test
	public void saveDiplomeNiveau() {
		// TODO: JUnit - Populate test inputs for operation: saveDiplomeNiveau 
		Integer id = 0;
		Niveau related_niveau = new app.domain.Niveau();
		Diplome response = null;
		response = service.saveDiplomeNiveau(id, related_niveau);
		// TODO: JUnit - Add assertions to test outputs of operation: saveDiplomeNiveau
	}

	/**
	 * Operation Unit Test
	 * Save an existing Ecole entity
	 * 
	 */
	@Test
	public void saveDiplomeEcole() {
		// TODO: JUnit - Populate test inputs for operation: saveDiplomeEcole 
		Integer id_1 = 0;
		Ecole related_ecole = new app.domain.Ecole();
		Diplome response = null;
		response = service.saveDiplomeEcole(id_1, related_ecole);
		// TODO: JUnit - Add assertions to test outputs of operation: saveDiplomeEcole
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findDiplomeByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findDiplomeByPrimaryKey 
		Integer id_2 = 0;
		Diplome response = null;
		response = service.findDiplomeByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findDiplomeByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Diplome entity
	 * 
	 */
	@Test
	public void loadDiplomes() {
		Set<Diplome> response = null;
		response = service.loadDiplomes();
		// TODO: JUnit - Add assertions to test outputs of operation: loadDiplomes
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
