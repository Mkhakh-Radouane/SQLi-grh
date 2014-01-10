package app.service;

import app.domain.Collaborateur;
import app.domain.Poste;
import app.domain.Salaire;

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
public class SalaireServiceTest {

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
	protected SalaireService service;

	/**
	 * Instantiates a new SalaireServiceTest.
	 *
	 */
	public SalaireServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Poste entity
	 * 
	 */
	@Test
	public void deleteSalairePoste() {
		// TODO: JUnit - Populate test inputs for operation: deleteSalairePoste 
		Integer salaire_id = 0;
		Integer salaire_collaborateurMatricule = 0;
		Integer salaire_posteIdPoste = 0;
		Integer related_poste_idPoste = 0;
		Salaire response = null;
		response = service.deleteSalairePoste(salaire_id, salaire_collaborateurMatricule, salaire_posteIdPoste, related_poste_idPoste);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteSalairePoste
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findSalaireByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findSalaireByPrimaryKey 
		Integer id = 0;
		Integer collaborateurMatricule = 0;
		Integer posteIdPoste = 0;
		Salaire response = null;
		response = service.findSalaireByPrimaryKey(id, collaborateurMatricule, posteIdPoste);
		// TODO: JUnit - Add assertions to test outputs of operation: findSalaireByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Load an existing Salaire entity
	 * 
	 */
	@Test
	public void loadSalaires() {
		Set<Salaire> response = null;
		response = service.loadSalaires();
		// TODO: JUnit - Add assertions to test outputs of operation: loadSalaires
	}

	/**
	 * Operation Unit Test
	 * Return all Salaire entity
	 * 
	 */
	@Test
	public void findAllSalaires() {
		// TODO: JUnit - Populate test inputs for operation: findAllSalaires 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Salaire> response = null;
		response = service.findAllSalaires(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllSalaires
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Salaire entity
	 * 
	 */
	@Test
	public void countSalaires() {
		Integer response = null;
		response = service.countSalaires();
		// TODO: JUnit - Add assertions to test outputs of operation: countSalaires
	}

	/**
	 * Operation Unit Test
	 * Save an existing Poste entity
	 * 
	 */
	@Test
	public void saveSalairePoste() {
		// TODO: JUnit - Populate test inputs for operation: saveSalairePoste 
		Integer id_1 = 0;
		Integer collaborateurMatricule_1 = 0;
		Integer posteIdPoste_1 = 0;
		Poste related_poste = new app.domain.Poste();
		Salaire response = null;
		response = service.saveSalairePoste(id_1, collaborateurMatricule_1, posteIdPoste_1, related_poste);
		// TODO: JUnit - Add assertions to test outputs of operation: saveSalairePoste
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Collaborateur entity
	 * 
	 */
	@Test
	public void deleteSalaireCollaborateur() {
		// TODO: JUnit - Populate test inputs for operation: deleteSalaireCollaborateur 
		Integer salaire_id_1 = 0;
		Integer salaire_collaborateurMatricule_1 = 0;
		Integer salaire_posteIdPoste_1 = 0;
		Integer related_collaborateur_matricule = 0;
		Salaire response = null;
		response = service.deleteSalaireCollaborateur(salaire_id_1, salaire_collaborateurMatricule_1, salaire_posteIdPoste_1, related_collaborateur_matricule);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteSalaireCollaborateur
	}

	/**
	 * Operation Unit Test
	 * Save an existing Salaire entity
	 * 
	 */
	@Test
	public void saveSalaire() {
		// TODO: JUnit - Populate test inputs for operation: saveSalaire 
		Salaire salaire = new app.domain.Salaire();
		service.saveSalaire(salaire);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Salaire entity
	 * 
	 */
	@Test
	public void deleteSalaire() {
		// TODO: JUnit - Populate test inputs for operation: deleteSalaire 
		Salaire salaire_1 = new app.domain.Salaire();
		service.deleteSalaire(salaire_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Collaborateur entity
	 * 
	 */
	@Test
	public void saveSalaireCollaborateur() {
		// TODO: JUnit - Populate test inputs for operation: saveSalaireCollaborateur 
		Integer id_2 = 0;
		Integer collaborateurMatricule_2 = 0;
		Integer posteIdPoste_2 = 0;
		Collaborateur related_collaborateur = new app.domain.Collaborateur();
		Salaire response = null;
		response = service.saveSalaireCollaborateur(id_2, collaborateurMatricule_2, posteIdPoste_2, related_collaborateur);
		// TODO: JUnit - Add assertions to test outputs of operation: saveSalaireCollaborateur
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
