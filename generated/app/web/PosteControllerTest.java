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
 * Unit test for the <code>PosteController</code> controller.
 *
 * @see app.web.PosteController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class PosteControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editPosteSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPosteSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPosteSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPosteSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPosteSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPosteSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePosteSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePosteSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePosteSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePosteSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePosteSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePosteSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePosteSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePosteSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePosteSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPosteSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPosteSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPosteSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listPosteSalaires()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistPosteSalaires() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listPosteSalaires");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexPoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexPoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexPoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editPoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePoste()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePoste() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePoste");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>posteControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetposteControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/posteController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PosteController controller = (PosteController) context.getBean("PosteController");

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