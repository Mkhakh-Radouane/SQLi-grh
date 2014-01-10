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
 * Unit test for the <code>BuController</code> controller.
 *
 * @see app.web.BuController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class BuControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editBuCollaborateurs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBuCollaborateurs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBuCollaborateurs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBuCollaborateurs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBuCollaborateurs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBuCollaborateurs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBuCollaborateurs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBuCollaborateurs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBuCollaborateurs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBuCollaborateurs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBuCollaborateurs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBuCollaborateurs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBuCollaborateurs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBuCollaborateurs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBuCollaborateurs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBuCollaborateurs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBuCollaborateurs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBuCollaborateurs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listBuCollaborateurs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistBuCollaborateurs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listBuCollaborateurs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteBu()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteBu() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteBu");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>buControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetbuControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/buController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		BuController controller = (BuController) context.getBean("BuController");

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