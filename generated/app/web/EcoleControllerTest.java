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
 * Unit test for the <code>EcoleController</code> controller.
 *
 * @see app.web.EcoleController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class EcoleControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editEcoleDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditEcoleDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editEcoleDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newEcoleDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewEcoleDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newEcoleDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveEcoleDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveEcoleDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveEcoleDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteEcoleDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteEcoleDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteEcoleDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteEcoleDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteEcoleDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteEcoleDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectEcoleDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectEcoleDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectEcoleDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listEcoleDiplomes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistEcoleDiplomes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listEcoleDiplomes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>ecoleControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetecoleControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/ecoleController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EcoleController controller = (EcoleController) context.getBean("EcoleController");

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