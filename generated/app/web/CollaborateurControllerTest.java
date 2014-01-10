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
 * Unit test for the <code>CollaborateurController</code> controller.
 *
 * @see app.web.CollaborateurController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class CollaborateurControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editCollaborateurBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCollaborateurBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCollaborateurBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCollaborateurBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCollaborateurBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCollaborateurBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCollaborateurBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCollaborateurBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCollaborateurBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCollaborateurBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCollaborateurBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCollaborateurBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCollaborateurBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCollaborateurBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCollaborateurBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCollaborateurBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCollaborateurBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCollaborateurBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCollaborateurBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCollaborateurBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCollaborateurBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCollaborateurSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCollaborateurSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCollaborateurSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCollaborateurSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCollaborateurSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCollaborateurSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCollaborateurSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCollaborateurSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCollaborateurSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCollaborateurSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCollaborateurSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCollaborateurSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCollaborateurSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCollaborateurSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCollaborateurSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCollaborateurSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCollaborateurSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCollaborateurSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCollaborateurSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCollaborateurSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCollaborateurSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCollaborateur()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCollaborateur() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCollaborateur");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>collaborateurControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcollaborateurControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/collaborateurController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CollaborateurController controller = (CollaborateurController) context.getBean("CollaborateurController");

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