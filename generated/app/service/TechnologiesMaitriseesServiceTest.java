package app.service;

import app.domain.Technologie;
import app.domain.TechnologiesMaitrisees;

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
public class TechnologiesMaitriseesServiceTest {

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
	protected TechnologiesMaitriseesService service;

	/**
	 * Instantiates a new TechnologiesMaitriseesServiceTest.
	 *
	 */
	public TechnologiesMaitriseesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all TechnologiesMaitrisees entity
	 * 
	 */
	@Test
	public void findAllTechnologiesMaitriseess() {
		// TODO: JUnit - Populate test inputs for operation: findAllTechnologiesMaitriseess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<TechnologiesMaitrisees> response = null;
		response = service.findAllTechnologiesMaitriseess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTechnologiesMaitriseess
	}

	/**
	 * Operation Unit Test
	 * Load an existing TechnologiesMaitrisees entity
	 * 
	 */
	@Test
	public void loadTechnologiesMaitriseess() {
		Set<TechnologiesMaitrisees> response = null;
		response = service.loadTechnologiesMaitriseess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTechnologiesMaitriseess
	}

	/**
	 * Operation Unit Test
	 * Return a count of all TechnologiesMaitrisees entity
	 * 
	 */
	@Test
	public void countTechnologiesMaitriseess() {
		Integer response = null;
		response = service.countTechnologiesMaitriseess();
		// TODO: JUnit - Add assertions to test outputs of operation: countTechnologiesMaitriseess
	}

	/**
	 * Operation Unit Test
	 * Save an existing Technologie entity
	 * 
	 */
	@Test
	public void saveTechnologiesMaitriseesTechnologie() {
		// TODO: JUnit - Populate test inputs for operation: saveTechnologiesMaitriseesTechnologie 
		Integer technologieField = 0;
		Integer collaborateur = 0;
		Technologie related_technologie = new app.domain.Technologie();
		TechnologiesMaitrisees response = null;
		response = service.saveTechnologiesMaitriseesTechnologie(technologieField, collaborateur, related_technologie);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTechnologiesMaitriseesTechnologie
	}

	/**
	 * Operation Unit Test
	 * Save an existing TechnologiesMaitrisees entity
	 * 
	 */
	@Test
	public void saveTechnologiesMaitrisees() {
		// TODO: JUnit - Populate test inputs for operation: saveTechnologiesMaitrisees 
		TechnologiesMaitrisees technologiesmaitrisees = new app.domain.TechnologiesMaitrisees();
		service.saveTechnologiesMaitrisees(technologiesmaitrisees);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing TechnologiesMaitrisees entity
	 * 
	 */
	@Test
	public void deleteTechnologiesMaitrisees() {
		// TODO: JUnit - Populate test inputs for operation: deleteTechnologiesMaitrisees 
		TechnologiesMaitrisees technologiesmaitrisees_1 = new app.domain.TechnologiesMaitrisees();
		service.deleteTechnologiesMaitrisees(technologiesmaitrisees_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findTechnologiesMaitriseesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTechnologiesMaitriseesByPrimaryKey 
		Integer technologieField_1 = 0;
		Integer collaborateur_1 = 0;
		TechnologiesMaitrisees response = null;
		response = service.findTechnologiesMaitriseesByPrimaryKey(technologieField_1, collaborateur_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findTechnologiesMaitriseesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Technologie entity
	 * 
	 */
	@Test
	public void deleteTechnologiesMaitriseesTechnologie() {
		// TODO: JUnit - Populate test inputs for operation: deleteTechnologiesMaitriseesTechnologie 
		Integer technologiesmaitrisees_technologieField = 0;
		Integer technologiesmaitrisees_collaborateur = 0;
		Integer related_technologie_id = 0;
		TechnologiesMaitrisees response = null;
		response = service.deleteTechnologiesMaitriseesTechnologie(technologiesmaitrisees_technologieField, technologiesmaitrisees_collaborateur, related_technologie_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTechnologiesMaitriseesTechnologie
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
