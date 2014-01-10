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
 * Unit test for the <code>CompteController</code> controller.
 *
 * @see app.web.CompteController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class CompteControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editCompteProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCompteProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCompteProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCompteProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCompteProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCompteProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCompteProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCompteProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCompteProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCompteProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCompteProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCompteProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCompteProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCompteProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCompteProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCompteProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCompteProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCompteProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCompteProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCompteProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCompteProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCompteManagerRhStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCompteManagerRhStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCompteManagerRhStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCompteManagerRhStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCompteManagerRhStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCompteManagerRhStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCompteManagerRhStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCompteManagerRhStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCompteManagerRhStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCompteManagerRhStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCompteManagerRhStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCompteManagerRhStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCompteManagerRhStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCompteManagerRhStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCompteManagerRhStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCompteManagerRhStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCompteManagerRhStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCompteManagerRhStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listCompteManagerRhStatuses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistCompteManagerRhStatuses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listCompteManagerRhStatuses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteCompte()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteCompte() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteCompte");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>compteControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetcompteControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/compteController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		CompteController controller = (CompteController) context.getBean("CompteController");

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