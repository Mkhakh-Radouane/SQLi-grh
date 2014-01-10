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
 * Unit test for the <code>DiplomeController</code> controller.
 *
 * @see app.web.DiplomeController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class DiplomeControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editDiplomeEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDiplomeEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDiplomeEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDiplomeEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDiplomeEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDiplomeEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDiplomeEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDiplomeEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDiplomeEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDiplomeEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDiplomeEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDiplomeEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDiplomeEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDiplomeEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDiplomeEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDiplomeEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDiplomeEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDiplomeEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDiplomeEcole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDiplomeEcole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDiplomeEcole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDiplomeNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDiplomeNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDiplomeNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDiplomeNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDiplomeNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDiplomeNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDiplomeNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDiplomeNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDiplomeNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDiplomeNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDiplomeNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDiplomeNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDiplomeNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDiplomeNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDiplomeNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDiplomeNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDiplomeNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDiplomeNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listDiplomeNiveau()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistDiplomeNiveau() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listDiplomeNiveau");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexDiplome()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexDiplome() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexDiplome");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectDiplome()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectDiplome() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectDiplome");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editDiplome()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditDiplome() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editDiplome");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveDiplome()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveDiplome() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveDiplome");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newDiplome()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewDiplome() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newDiplome");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteDiplome()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteDiplome() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteDiplome");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteDiplome()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteDiplome() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteDiplome");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>diplomeControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdiplomeControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/diplomeController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		DiplomeController controller = (DiplomeController) context.getBean("DiplomeController");

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