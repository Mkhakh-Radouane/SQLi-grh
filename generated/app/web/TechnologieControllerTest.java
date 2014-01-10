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
 * Unit test for the <code>TechnologieController</code> controller.
 *
 * @see app.web.TechnologieController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class TechnologieControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editTechnologieTechnologiesMaitriseeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTechnologieTechnologiesMaitriseeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTechnologieTechnologiesMaitriseeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTechnologieTechnologiesMaitriseeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTechnologieTechnologiesMaitriseeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTechnologieTechnologiesMaitriseeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTechnologieTechnologiesMaitriseeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTechnologieTechnologiesMaitriseeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTechnologieTechnologiesMaitriseeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTechnologieTechnologiesMaitriseeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTechnologieTechnologiesMaitriseeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTechnologieTechnologiesMaitriseeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTechnologieTechnologiesMaitriseeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTechnologieTechnologiesMaitriseeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTechnologieTechnologiesMaitriseeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTechnologieTechnologiesMaitriseeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTechnologieTechnologiesMaitriseeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTechnologieTechnologiesMaitriseeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listTechnologieTechnologiesMaitriseeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistTechnologieTechnologiesMaitriseeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listTechnologieTechnologiesMaitriseeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTechnologie()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTechnologie() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTechnologie");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>technologieControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GettechnologieControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/technologieController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TechnologieController controller = (TechnologieController) context.getBean("TechnologieController");

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