package app.web;

import app.dao.DroitDAO;
import app.dao.ProfileDAO;

import app.domain.Droit;
import app.domain.Profile;

import app.service.DroitService;

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
 * Spring MVC controller that handles CRUD requests for Droit entities
 * 
 */

@Controller("DroitController")
public class DroitController {

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
	 * Service injected by Spring that provides CRUD operations for Droit entities
	 * 
	 */
	@Autowired
	private DroitService droitService;

	/**
	 * Delete an existing Droit entity
	 * 
	 */
	@RequestMapping("/deleteDroit")
	public String deleteDroit(@RequestParam Integer idKey) {
		Droit droit = droitDAO.findDroitByPrimaryKey(idKey);
		droitService.deleteDroit(droit);
		return "forward:/indexDroit";
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
	 * Entry point to show all Droit entities
	 * 
	 */
	public String indexDroit() {
		return "redirect:/indexDroit";
	}

	/**
	 * Create a new Profile entity
	 * 
	 */
	@RequestMapping("/newDroitProfiles")
	public ModelAndView newDroitProfiles(@RequestParam Integer droit_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("droit_id", droit_id);
		mav.addObject("profile", new Profile());
		mav.addObject("newFlag", true);
		mav.setViewName("droit/profiles/editProfiles.jsp");

		return mav;
	}

	/**
	 * Select the Droit entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDroit")
	public ModelAndView confirmDeleteDroit(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("droit", droitDAO.findDroitByPrimaryKey(idKey));
		mav.setViewName("droit/deleteDroit.jsp");

		return mav;
	}

	/**
	 * Select an existing Droit entity
	 * 
	 */
	@RequestMapping("/selectDroit")
	public ModelAndView selectDroit(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("droit", droitDAO.findDroitByPrimaryKey(idKey));
		mav.setViewName("droit/viewDroit.jsp");

		return mav;
	}

	/**
	 * Edit an existing Droit entity
	 * 
	 */
	@RequestMapping("/editDroit")
	public ModelAndView editDroit(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("droit", droitDAO.findDroitByPrimaryKey(idKey));
		mav.setViewName("droit/editDroit.jsp");

		return mav;
	}

	/**
	 * View an existing Profile entity
	 * 
	 */
	@RequestMapping("/selectDroitProfiles")
	public ModelAndView selectDroitProfiles(@RequestParam Integer droit_id, @RequestParam Integer profiles_id) {
		Profile profile = profileDAO.findProfileByPrimaryKey(profiles_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("droit_id", droit_id);
		mav.addObject("profile", profile);
		mav.setViewName("droit/profiles/viewProfiles.jsp");

		return mav;
	}

	/**
	 * Save an existing Profile entity
	 * 
	 */
	@RequestMapping("/saveDroitProfiles")
	public ModelAndView saveDroitProfiles(@RequestParam Integer droit_id, @ModelAttribute Profile profiles) {
		Droit parent_droit = droitService.saveDroitProfiles(droit_id, profiles);

		ModelAndView mav = new ModelAndView();
		mav.addObject("droit_id", droit_id);
		mav.addObject("droit", parent_droit);
		mav.setViewName("droit/viewDroit.jsp");

		return mav;
	}

	/**
	 * Edit an existing Profile entity
	 * 
	 */
	@RequestMapping("/editDroitProfiles")
	public ModelAndView editDroitProfiles(@RequestParam Integer droit_id, @RequestParam Integer profiles_id) {
		Profile profile = profileDAO.findProfileByPrimaryKey(profiles_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("droit_id", droit_id);
		mav.addObject("profile", profile);
		mav.setViewName("droit/profiles/editProfiles.jsp");

		return mav;
	}

	/**
	 * Show all Profile entities by Droit
	 * 
	 */
	@RequestMapping("/listDroitProfiles")
	public ModelAndView listDroitProfiles(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("droit", droitDAO.findDroitByPrimaryKey(idKey));
		mav.setViewName("droit/profiles/listProfiles.jsp");

		return mav;
	}

	/**
	 * Save an existing Droit entity
	 * 
	 */
	@RequestMapping("/saveDroit")
	public String saveDroit(@ModelAttribute Droit droit) {
		droitService.saveDroit(droit);
		return "forward:/indexDroit";
	}

	/**
	 */
	@RequestMapping("/droitController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Droit entity
	 * 
	 */
	@RequestMapping("/newDroit")
	public ModelAndView newDroit() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("droit", new Droit());
		mav.addObject("newFlag", true);
		mav.setViewName("droit/editDroit.jsp");

		return mav;
	}

	/**
	 * Select the child Profile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDroitProfiles")
	public ModelAndView confirmDeleteDroitProfiles(@RequestParam Integer droit_id, @RequestParam Integer related_profiles_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("profile", profileDAO.findProfileByPrimaryKey(related_profiles_id));
		mav.addObject("droit_id", droit_id);
		mav.setViewName("droit/profiles/deleteProfiles.jsp");

		return mav;
	}

	/**
	 * Delete an existing Profile entity
	 * 
	 */
	@RequestMapping("/deleteDroitProfiles")
	public ModelAndView deleteDroitProfiles(@RequestParam Integer droit_id, @RequestParam Integer related_profiles_id) {
		ModelAndView mav = new ModelAndView();

		Droit droit = droitService.deleteDroitProfiles(droit_id, related_profiles_id);

		mav.addObject("droit_id", droit_id);
		mav.addObject("droit", droit);
		mav.setViewName("droit/viewDroit.jsp");

		return mav;
	}

	/**
	 * Show all Droit entities
	 * 
	 */
	@RequestMapping("/indexDroit")
	public ModelAndView listDroits() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("droits", droitService.loadDroits());

		mav.setViewName("droit/listDroits.jsp");

		return mav;
	}
}