package app.service;

import app.domain.Compte;
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
public class ProfileServiceTest {

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
	protected ProfileService service;

	/**
	 * Instantiates a new ProfileServiceTest.
	 *
	 */
	public ProfileServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Compte entity
	 * 
	 */
	@Test
	public void saveProfileComptes() {
		// TODO: JUnit - Populate test inputs for operation: saveProfileComptes 
		Integer id = 0;
		Compte related_comptes = new app.domain.Compte();
		Profile response = null;
		response = service.saveProfileComptes(id, related_comptes);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProfileComptes
	}

	/**
	 * Operation Unit Test
	 * Save an existing Profile entity
	 * 
	 */
	@Test
	public void saveProfile() {
		// TODO: JUnit - Populate test inputs for operation: saveProfile 
		Profile profile = new app.domain.Profile();
		service.saveProfile(profile);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Droit entity
	 * 
	 */
	@Test
	public void saveProfileDroits() {
		// TODO: JUnit - Populate test inputs for operation: saveProfileDroits 
		Integer id_1 = 0;
		Droit related_droits = new app.domain.Droit();
		Profile response = null;
		response = service.saveProfileDroits(id_1, related_droits);
		// TODO: JUnit - Add assertions to test outputs of operation: saveProfileDroits
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Profile entity
	 * 
	 */
	@Test
	public void countProfiles() {
		Integer response = null;
		response = service.countProfiles();
		// TODO: JUnit - Add assertions to test outputs of operation: countProfiles
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findProfileByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findProfileByPrimaryKey 
		Integer id_2 = 0;
		Profile response = null;
		response = service.findProfileByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findProfileByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Droit entity
	 * 
	 */
	@Test
	public void deleteProfileDroits() {
		// TODO: JUnit - Populate test inputs for operation: deleteProfileDroits 
		Integer profile_id = 0;
		Integer related_droits_id = 0;
		Profile response = null;
		response = service.deleteProfileDroits(profile_id, related_droits_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProfileDroits
	}

	/**
	 * Operation Unit Test
	 * Load an existing Profile entity
	 * 
	 */
	@Test
	public void loadProfiles() {
		Set<Profile> response = null;
		response = service.loadProfiles();
		// TODO: JUnit - Add assertions to test outputs of operation: loadProfiles
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Profile entity
	 * 
	 */
	@Test
	public void deleteProfile() {
		// TODO: JUnit - Populate test inputs for operation: deleteProfile 
		Profile profile_1 = new app.domain.Profile();
		service.deleteProfile(profile_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Compte entity
	 * 
	 */
	@Test
	public void deleteProfileComptes() {
		// TODO: JUnit - Populate test inputs for operation: deleteProfileComptes 
		Integer profile_id_1 = 0;
		Integer related_comptes_id = 0;
		Profile response = null;
		response = service.deleteProfileComptes(profile_id_1, related_comptes_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteProfileComptes
	}

	/**
	 * Operation Unit Test
	 * Return all Profile entity
	 * 
	 */
	@Test
	public void findAllProfiles() {
		// TODO: JUnit - Populate test inputs for operation: findAllProfiles 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Profile> response = null;
		response = service.findAllProfiles(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllProfiles
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
