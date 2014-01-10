package app.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>SalaireController</code> controller.
 *
 * @see app.web.SalaireController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class SalaireControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editSalaireCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditSalaireCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editSalaireCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newSalaireCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewSalaireCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newSalaireCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveSalaireCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveSalaireCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveSalaireCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteSalaireCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteSalaireCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteSalaireCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteSalaireCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteSalaireCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteSalaireCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectSalaireCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectSalaireCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectSalaireCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listSalaireCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistSalaireCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listSalaireCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editSalairePoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditSalairePoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editSalairePoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newSalairePoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewSalairePoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newSalairePoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveSalairePoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveSalairePoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveSalairePoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteSalairePoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteSalairePoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteSalairePoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteSalairePoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteSalairePoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteSalairePoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectSalairePoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectSalairePoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectSalairePoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listSalairePoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistSalairePoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listSalairePoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexSalaire()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexSalaire() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexSalaire");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectSalaire()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectSalaire() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectSalaire");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editSalaire()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditSalaire() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editSalaire");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveSalaire()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveSalaire() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveSalaire");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newSalaire()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewSalaire() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newSalaire");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteSalaire()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteSalaire() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteSalaire");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteSalaire()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteSalaire() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteSalaire");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>salaireControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsalaireControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/salaireController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		SalaireController controller = (SalaireController) context.getBean("SalaireController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}