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
public class TechnologieServiceTest {

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
	protected TechnologieService service;

	/**
	 * Instantiates a new TechnologieServiceTest.
	 *
	 */
	public TechnologieServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing Technologie entity
	 * 
	 */
	@Test
	public void loadTechnologies() {
		Set<Technologie> response = null;
		response = service.loadTechnologies();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTechnologies
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findTechnologieByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTechnologieByPrimaryKey 
		Integer id = 0;
		Technologie response = null;
		response = service.findTechnologieByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findTechnologieByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing TechnologiesMaitrisees entity
	 * 
	 */
	@Test
	public void saveTechnologieTechnologiesMaitriseeses() {
		// TODO: JUnit - Populate test inputs for operation: saveTechnologieTechnologiesMaitriseeses 
		Integer id_1 = 0;
		TechnologiesMaitrisees related_technologiesmaitriseeses = new app.domain.TechnologiesMaitrisees();
		Technologie response = null;
		response = service.saveTechnologieTechnologiesMaitriseeses(id_1, related_technologiesmaitriseeses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveTechnologieTechnologiesMaitriseeses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Technologie entity
	 * 
	 */
	@Test
	public void saveTechnologie() {
		// TODO: JUnit - Populate test inputs for operation: saveTechnologie 
		Technologie technologie = new app.domain.Technologie();
		service.saveTechnologie(technologie);
	}

	/**
	 * Operation Unit Test
	 * Return all Technologie entity
	 * 
	 */
	@Test
	public void findAllTechnologies() {
		// TODO: JUnit - Populate test inputs for operation: findAllTechnologies 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Technologie> response = null;
		response = service.findAllTechnologies(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTechnologies
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Technologie entity
	 * 
	 */
	@Test
	public void countTechnologies() {
		Integer response = null;
		response = service.countTechnologies();
		// TODO: JUnit - Add assertions to test outputs of operation: countTechnologies
	}

	/**
	 * Operation Unit Test
	 * Delete an existing TechnologiesMaitrisees entity
	 * 
	 */
	@Test
	public void deleteTechnologieTechnologiesMaitriseeses() {
		// TODO: JUnit - Populate test inputs for operation: deleteTechnologieTechnologiesMaitriseeses 
		Integer technologie_id = 0;
		Integer related_technologiesmaitriseeses_technologieField = 0;
		Integer related_technologiesmaitriseeses_collaborateur = 0;
		Technologie response = null;
		response = service.deleteTechnologieTechnologiesMaitriseeses(technologie_id, related_technologiesmaitriseeses_technologieField, related_technologiesmaitriseeses_collaborateur);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteTechnologieTechnologiesMaitriseeses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Technologie entity
	 * 
	 */
	@Test
	public void deleteTechnologie() {
		// TODO: JUnit - Populate test inputs for operation: deleteTechnologie 
		Technologie technologie_1 = new app.domain.Technologie();
		service.deleteTechnologie(technologie_1);
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
