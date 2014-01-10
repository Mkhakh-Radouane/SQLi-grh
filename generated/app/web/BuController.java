package app.web;

import app.dao.BuDAO;
import app.dao.CollaborateurDAO;

import app.domain.Bu;
import app.domain.Collaborateur;

import app.service.BuService;

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
 * Spring MVC controller that handles CRUD requests for Bu entities
 * 
 */

@Controller("BuController")
public class BuController {

	/**
	 * DAO injected by Spring that manages Bu entities
	 * 
	 */
	@Autowired
	private BuDAO buDAO;

	/**
	 * DAO injected by Spring that manages Collaborateur entities
	 * 
	 */
	@Autowired
	private CollaborateurDAO collaborateurDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Bu entities
	 * 
	 */
	@Autowired
	private BuService buService;

	/**
	 * Create a new Collaborateur entity
	 * 
	 */
	@RequestMapping("/newBuCollaborateurs")
	public ModelAndView newBuCollaborateurs(@RequestParam Integer bu_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bu_id", bu_id);
		mav.addObject("collaborateur", new Collaborateur());
		mav.addObject("newFlag", true);
		mav.setViewName("bu/collaborateurs/editCollaborateurs.jsp");

		return mav;
	}

	/**
	 * Save an existing Bu entity
	 * 
	 */
	@RequestMapping("/saveBu")
	public String saveBu(@ModelAttribute Bu bu) {
		buService.saveBu(bu);
		return "forward:/indexBu";
	}

	/**
	 * Select an existing Bu entity
	 * 
	 */
	@RequestMapping("/selectBu")
	public ModelAndView selectBu(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bu", buDAO.findBuByPrimaryKey(idKey));
		mav.setViewName("bu/viewBu.jsp");

		return mav;
	}

	/**
	 * Edit an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/editBuCollaborateurs")
	public ModelAndView editBuCollaborateurs(@RequestParam Integer bu_id, @RequestParam Integer collaborateurs_matricule) {
		Collaborateur collaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(collaborateurs_matricule, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bu_id", bu_id);
		mav.addObject("collaborateur", collaborateur);
		mav.setViewName("bu/collaborateurs/editCollaborateurs.jsp");

		return mav;
	}

	/**
	 * Select the Bu entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBu")
	public ModelAndView confirmDeleteBu(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bu", buDAO.findBuByPrimaryKey(idKey));
		mav.setViewName("bu/deleteBu.jsp");

		return mav;
	}

	/**
	 * View an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/selectBuCollaborateurs")
	public ModelAndView selectBuCollaborateurs(@RequestParam Integer bu_id, @RequestParam Integer collaborateurs_matricule) {
		Collaborateur collaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(collaborateurs_matricule, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bu_id", bu_id);
		mav.addObject("collaborateur", collaborateur);
		mav.setViewName("bu/collaborateurs/viewCollaborateurs.jsp");

		return mav;
	}

	/**
	 * Edit an existing Bu entity
	 * 
	 */
	@RequestMapping("/editBu")
	public ModelAndView editBu(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bu", buDAO.findBuByPrimaryKey(idKey));
		mav.setViewName("bu/editBu.jsp");

		return mav;
	}

	/**
	 * Delete an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/deleteBuCollaborateurs")
	public ModelAndView deleteBuCollaborateurs(@RequestParam Integer bu_id, @RequestParam Integer related_collaborateurs_matricule) {
		ModelAndView mav = new ModelAndView();

		Bu bu = buService.deleteBuCollaborateurs(bu_id, related_collaborateurs_matricule);

		mav.addObject("bu_id", bu_id);
		mav.addObject("bu", bu);
		mav.setViewName("bu/viewBu.jsp");

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
	 */
	@RequestMapping("/buController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select the child Collaborateur entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteBuCollaborateurs")
	public ModelAndView confirmDeleteBuCollaborateurs(@RequestParam Integer bu_id, @RequestParam Integer related_collaborateurs_matricule) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("collaborateur", collaborateurDAO.findCollaborateurByPrimaryKey(related_collaborateurs_matricule));
		mav.addObject("bu_id", bu_id);
		mav.setViewName("bu/collaborateurs/deleteCollaborateurs.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Bu entities
	 * 
	 */
	public String indexBu() {
		return "redirect:/indexBu";
	}

	/**
	 * Show all Collaborateur entities by Bu
	 * 
	 */
	@RequestMapping("/listBuCollaborateurs")
	public ModelAndView listBuCollaborateurs(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bu", buDAO.findBuByPrimaryKey(idKey));
		mav.setViewName("bu/collaborateurs/listCollaborateurs.jsp");

		return mav;
	}

	/**
	 * Save an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/saveBuCollaborateurs")
	public ModelAndView saveBuCollaborateurs(@RequestParam Integer bu_id, @ModelAttribute Collaborateur collaborateurs) {
		Bu parent_bu = buService.saveBuCollaborateurs(bu_id, collaborateurs);

		ModelAndView mav = new ModelAndView();
		mav.addObject("bu_id", bu_id);
		mav.addObject("bu", parent_bu);
		mav.setViewName("bu/viewBu.jsp");

		return mav;
	}

	/**
	 * Create a new Bu entity
	 * 
	 */
	@RequestMapping("/newBu")
	public ModelAndView newBu() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bu", new Bu());
		mav.addObject("newFlag", true);
		mav.setViewName("bu/editBu.jsp");

		return mav;
	}

	/**
	 * Delete an existing Bu entity
	 * 
	 */
	@RequestMapping("/deleteBu")
	public String deleteBu(@RequestParam Integer idKey) {
		Bu bu = buDAO.findBuByPrimaryKey(idKey);
		buService.deleteBu(bu);
		return "forward:/indexBu";
	}

	/**
	 * Show all Bu entities
	 * 
	 */
	@RequestMapping("/indexBu")
	public ModelAndView listBus() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bus", buService.loadBus());

		mav.setViewName("bu/listBus.jsp");

		return mav;
	}
}