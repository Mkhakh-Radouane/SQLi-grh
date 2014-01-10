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
 * Unit test for the <code>ProfileController</code> controller.
 *
 * @see app.web.ProfileController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Gestion_ressource_humaine-security-context.xml",
		"file:./resources/Gestion_ressource_humaine-service-context.xml",
		"file:./resources/Gestion_ressource_humaine-dao-context.xml",
		"file:./resources/Gestion_ressource_humaine-web-context.xml" })
public class ProfileControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editProfileDroits()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProfileDroits() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProfileDroits");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProfileDroits()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProfileDroits() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProfileDroits");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProfileDroits()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProfileDroits() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProfileDroits");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProfileDroits()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProfileDroits() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProfileDroits");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProfileDroits()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProfileDroits() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProfileDroits");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProfileDroits()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProfileDroits() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProfileDroits");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProfileDroits()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProfileDroits() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProfileDroits");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProfileComptes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProfileComptes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProfileComptes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProfileComptes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProfileComptes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProfileComptes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProfileComptes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProfileComptes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProfileComptes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProfileComptes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProfileComptes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProfileComptes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProfileComptes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProfileComptes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProfileComptes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProfileComptes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProfileComptes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProfileComptes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listProfileComptes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistProfileComptes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listProfileComptes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteProfile()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteProfile() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteProfile");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>profileControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetprofileControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/profileController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ProfileController controller = (ProfileController) context.getBean("ProfileController");

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