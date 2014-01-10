package app.web;

import app.dao.CompteDAO;
import app.dao.DroitDAO;
import app.dao.ProfileDAO;

import app.domain.Compte;
import app.domain.Droit;
import app.domain.Profile;

import app.service.ProfileService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Profile entities
 * 
 */

@Controller("ProfileController")
public class ProfileController {

	/**
	 * DAO injected by Spring that manages Compte entities
	 * 
	 */
	@Autowired
	private CompteDAO compteDAO;

	/**
	 * DAO injected by Spring that manages Droit entities
	 * 
	 */
	@Autowired
	private DroitDAO droitDAO;

	/**
	 * DAO injected by Spring that manages Profile entities
	 * 
	 */
	@Autowired
	private ProfileDAO profileDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Profile entities
	 * 
	 */
	@Autowired
	private ProfileService profileService;

	/**
	 * Delete an existing Droit entity
	 * 
	 */
	@RequestMapping("/deleteProfileDroits")
	public ModelAndView deleteProfileDroits(@RequestParam Integer profile_id, @RequestParam Integer related_droits_id) {
		ModelAndView mav = new ModelAndView();

		Profile profile = profileService.deleteProfileDroits(profile_id, related_droits_id);

		mav.addObject("profile_id", profile_id);
		mav.addObject("profile", profile);
		mav.setViewName("profile/viewProfile.jsp");

		return mav;
	}

	/**
	 * Show all Droit entities by Profile
	 * 
	 */
	@RequestMapping("/listProfileDroits")
	public ModelAndView listProfileDroits(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("profile", profileDAO.findProfileByPrimaryKey(idKey));
		mav.setViewName("profile/droits/listDroits.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/profileController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Profile entity
	 * 
	 */
	@RequestMapping("/editProfile")
	public ModelAndView editProfile(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("profile", profileDAO.findProfileByPrimaryKey(idKey));
		mav.setViewName("profile/editProfile.jsp");

		return mav;
	}

	/**
	 * Select the child Droit entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProfileDroits")
	public ModelAndView confirmDeleteProfileDroits(@RequestParam Integer profile_id, @RequestParam Integer related_droits_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("droit", droitDAO.findDroitByPrimaryKey(related_droits_id));
		mav.addObject("profile_id", profile_id);
		mav.setViewName("profile/droits/deleteDroits.jsp");

		return mav;
	}

	/**
	 * Save an existing Compte entity
	 * 
	 */
	@RequestMapping("/saveProfileComptes")
	public ModelAndView saveProfileComptes(@RequestParam Integer profile_id, @ModelAttribute Compte comptes) {
		Profile parent_profile = profileService.saveProfileComptes(profile_id, comptes);

		ModelAndView mav = new ModelAndView();
		mav.addObject("profile_id", profile_id);
		mav.addObject("profile", parent_profile);
		mav.setViewName("profile/viewProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing Droit entity
	 * 
	 */
	@RequestMapping("/editProfileDroits")
	public ModelAndView editProfileDroits(@RequestParam Integer profile_id, @RequestParam Integer droits_id) {
		Droit droit = droitDAO.findDroitByPrimaryKey(droits_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("profile_id", profile_id);
		mav.addObject("droit", droit);
		mav.setViewName("profile/droits/editDroits.jsp");

		return mav;
	}

	/**
	 * Delete an existing Profile entity
	 * 
	 */
	@RequestMapping("/deleteProfile")
	public String deleteProfile(@RequestParam Integer idKey) {
		Profile profile = profileDAO.findProfileByPrimaryKey(idKey);
		profileService.deleteProfile(profile);
		return "forward:/indexProfile";
	}

	/**
	 * Entry point to show all Profile entities
	 * 
	 */
	public String indexProfile() {
		return "redirect:/indexProfile";
	}

	/**
	 * Create a new Droit entity
	 * 
	 */
	@RequestMapping("/newProfileDroits")
	public ModelAndView newProfileDroits(@RequestParam Integer profile_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("profile_id", profile_id);
		mav.addObject("droit", new Droit());
		mav.addObject("newFlag", true);
		mav.setViewName("profile/droits/editDroits.jsp");

		return mav;
	}

	/**
	 * View an existing Droit entity
	 * 
	 */
	@RequestMapping("/selectProfileDroits")
	public ModelAndView selectProfileDroits(@RequestParam Integer profile_id, @RequestParam Integer droits_id) {
		Droit droit = droitDAO.findDroitByPrimaryKey(droits_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("profile_id", profile_id);
		mav.addObject("droit", droit);
		mav.setViewName("profile/droits/viewDroits.jsp");

		return mav;
	}

	/**
	 * Select an existing Profile entity
	 * 
	 */
	@RequestMapping("/selectProfile")
	public ModelAndView selectProfile(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("profile", profileDAO.findProfileByPrimaryKey(idKey));
		mav.setViewName("profile/viewProfile.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Select the child Compte entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProfileComptes")
	public ModelAndView confirmDeleteProfileComptes(@RequestParam Integer profile_id, @RequestParam Integer related_comptes_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("compte", compteDAO.findCompteByPrimaryKey(related_comptes_id));
		mav.addObject("profile_id", profile_id);
		mav.setViewName("profile/comptes/deleteComptes.jsp");

		return mav;
	}

	/**
	 * Create a new Compte entity
	 * 
	 */
	@RequestMapping("/newProfileComptes")
	public ModelAndView newProfileComptes(@RequestParam Integer profile_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("profile_id", profile_id);
		mav.addObject("compte", new Compte());
		mav.addObject("newFlag", true);
		mav.setViewName("profile/comptes/editComptes.jsp");

		return mav;
	}

	/**
	 * Save an existing Droit entity
	 * 
	 */
	@RequestMapping("/saveProfileDroits")
	public ModelAndView saveProfileDroits(@RequestParam Integer profile_id, @ModelAttribute Droit droits) {
		Profile parent_profile = profileService.saveProfileDroits(profile_id, droits);

		ModelAndView mav = new ModelAndView();
		mav.addObject("profile_id", profile_id);
		mav.addObject("profile", parent_profile);
		mav.setViewName("profile/viewProfile.jsp");

		return mav;
	}

	/**
	 * Edit an existing Compte entity
	 * 
	 */
	@RequestMapping("/editProfileComptes")
	public ModelAndView editProfileComptes(@RequestParam Integer profile_id, @RequestParam Integer comptes_id) {
		Compte compte = compteDAO.findCompteByPrimaryKey(comptes_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("profile_id", profile_id);
		mav.addObject("compte", compte);
		mav.setViewName("profile/comptes/editComptes.jsp");

		return mav;
	}

	/**
	 * Show all Compte entities by Profile
	 * 
	 */
	@RequestMapping("/listProfileComptes")
	public ModelAndView listProfileComptes(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("profile", profileDAO.findProfileByPrimaryKey(idKey));
		mav.setViewName("profile/comptes/listComptes.jsp");

		return mav;
	}

	/**
	 * Create a new Profile entity
	 * 
	 */
	@RequestMapping("/newProfile")
	public ModelAndView newProfile() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("profile", new Profile());
		mav.addObject("newFlag", true);
		mav.setViewName("profile/editProfile.jsp");

		return mav;
	}

	/**
	 * Show all Profile entities
	 * 
	 */
	@RequestMapping("/indexProfile")
	public ModelAndView listProfiles() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("profiles", profileService.loadProfiles());

		mav.setViewName("profile/listProfiles.jsp");

		return mav;
	}

	/**
	 * Delete an existing Compte entity
	 * 
	 */
	@RequestMapping("/deleteProfileComptes")
	public ModelAndView deleteProfileComptes(@RequestParam Integer profile_id, @RequestParam Integer related_comptes_id) {
		ModelAndView mav = new ModelAndView();

		Profile profile = profileService.deleteProfileComptes(profile_id, related_comptes_id);

		mav.addObject("profile_id", profile_id);
		mav.addObject("profile", profile);
		mav.setViewName("profile/viewProfile.jsp");

		return mav;
	}

	/**
	 * Select the Profile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteProfile")
	public ModelAndView confirmDeleteProfile(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("profile", profileDAO.findProfileByPrimaryKey(idKey));
		mav.setViewName("profile/deleteProfile.jsp");

		return mav;
	}

	/**
	 * View an existing Compte entity
	 * 
	 */
	@RequestMapping("/selectProfileComptes")
	public ModelAndView selectProfileComptes(@RequestParam Integer profile_id, @RequestParam Integer comptes_id) {
		Compte compte = compteDAO.findCompteByPrimaryKey(comptes_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("profile_id", profile_id);
		mav.addObject("compte", compte);
		mav.setViewName("profile/comptes/viewComptes.jsp");

		return mav;
	}

	/**
	 * Save an existing Profile entity
	 * 
	 */
	@RequestMapping("/saveProfile")
	public String saveProfile(@ModelAttribute Profile profile) {
		profileService.saveProfile(profile);
		return "forward:/indexProfile";
	}
}