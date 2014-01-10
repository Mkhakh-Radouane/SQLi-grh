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
 * Unit test for the <code>DroitController</code> controller.
 *
 * @see app.web.DroitController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class DroitControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editDroitProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDroitProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDroitProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDroitProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDroitProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDroitProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDroitProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDroitProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDroitProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDroitProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDroitProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDroitProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDroitProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDroitProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDroitProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDroitProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDroitProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDroitProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDroitProfiles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDroitProfiles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDroitProfiles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexDroit()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexDroit() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexDroit");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDroit()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDroit() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDroit");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDroit()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDroit() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDroit");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDroit()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDroit() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDroit");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDroit()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDroit() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDroit");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDroit()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDroit() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDroit");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDroit()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDroit() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDroit");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>droitControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdroitControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/droitController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DroitController controller = (DroitController) context.getBean("DroitController");

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