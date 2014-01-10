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
 * Unit test for the <code>TechnologiesMaitriseesController</code> controller.
 *
 * @see app.web.TechnologiesMaitriseesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class TechnologiesMaitriseesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editTechnologiesMaitriseesTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTechnologiesMaitriseesTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTechnologiesMaitriseesTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTechnologiesMaitriseesTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTechnologiesMaitriseesTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTechnologiesMaitriseesTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTechnologiesMaitriseesTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTechnologiesMaitriseesTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTechnologiesMaitriseesTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTechnologiesMaitriseesTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTechnologiesMaitriseesTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTechnologiesMaitriseesTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTechnologiesMaitriseesTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTechnologiesMaitriseesTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTechnologiesMaitriseesTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTechnologiesMaitriseesTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTechnologiesMaitriseesTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTechnologiesMaitriseesTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTechnologiesMaitriseesTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTechnologiesMaitriseesTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTechnologiesMaitriseesTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexTechnologiesMaitrisees()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexTechnologiesMaitrisees() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTechnologiesMaitrisees");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTechnologiesMaitrisees()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTechnologiesMaitrisees() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTechnologiesMaitrisees");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTechnologiesMaitrisees()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTechnologiesMaitrisees() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTechnologiesMaitrisees");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTechnologiesMaitrisees()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTechnologiesMaitrisees() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTechnologiesMaitrisees");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTechnologiesMaitrisees()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTechnologiesMaitrisees() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTechnologiesMaitrisees");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTechnologiesMaitrisees()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTechnologiesMaitrisees() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTechnologiesMaitrisees");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTechnologiesMaitrisees()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTechnologiesMaitrisees() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTechnologiesMaitrisees");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>technologiesmaitriseesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GettechnologiesmaitriseesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/technologiesmaitriseesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologiesMaitriseesController controller = (TechnologiesMaitriseesController) context.getBean("TechnologiesMaitriseesController");

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