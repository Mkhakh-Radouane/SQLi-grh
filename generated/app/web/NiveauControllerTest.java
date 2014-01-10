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
 * Unit test for the <code>NiveauController</code> controller.
 *
 * @see app.web.NiveauController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class NiveauControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editNiveauDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditNiveauDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editNiveauDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newNiveauDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewNiveauDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newNiveauDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveNiveauDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveNiveauDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveNiveauDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteNiveauDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteNiveauDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteNiveauDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteNiveauDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteNiveauDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteNiveauDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectNiveauDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectNiveauDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectNiveauDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listNiveauDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistNiveauDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listNiveauDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>niveauControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetniveauControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/niveauController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		NiveauController controller = (NiveauController) context.getBean("NiveauController");

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