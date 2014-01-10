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
 * Unit test for the <code>ManagerRhStatusController</code> controller.
 *
 * @see app.web.ManagerRhStatusController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class ManagerRhStatusControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editManagerRhStatusCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditManagerRhStatusCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editManagerRhStatusCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newManagerRhStatusCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewManagerRhStatusCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newManagerRhStatusCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveManagerRhStatusCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveManagerRhStatusCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveManagerRhStatusCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteManagerRhStatusCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteManagerRhStatusCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteManagerRhStatusCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteManagerRhStatusCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteManagerRhStatusCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteManagerRhStatusCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectManagerRhStatusCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectManagerRhStatusCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectManagerRhStatusCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listManagerRhStatusCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistManagerRhStatusCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listManagerRhStatusCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexManagerRhStatus()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexManagerRhStatus() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexManagerRhStatus");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectManagerRhStatus()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectManagerRhStatus() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectManagerRhStatus");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editManagerRhStatus()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditManagerRhStatus() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editManagerRhStatus");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveManagerRhStatus()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveManagerRhStatus() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveManagerRhStatus");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newManagerRhStatus()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewManagerRhStatus() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newManagerRhStatus");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteManagerRhStatus()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteManagerRhStatus() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteManagerRhStatus");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteManagerRhStatus()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteManagerRhStatus() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteManagerRhStatus");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>managerrhstatusControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetmanagerrhstatusControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/managerrhstatusController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ManagerRhStatusController controller = (ManagerRhStatusController) context.getBean("ManagerRhStatusController");

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