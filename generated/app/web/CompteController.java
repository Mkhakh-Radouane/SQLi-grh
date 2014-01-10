package app.web;

import app.dao.CompteDAO;
import app.dao.ManagerRhStatusDAO;
import app.dao.ProfileDAO;

import app.domain.Compte;
import app.domain.ManagerRhStatus;
import app.domain.Profile;

import app.service.CompteService;

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
 * Spring MVC controller that handles CRUD requests for Compte entities
 * 
 */

@Controller("CompteController")
public class CompteController {

	/**
	 * DAO injected by Spring that manages Compte entities
	 * 
	 */
	@Autowired
	private CompteDAO compteDAO;

	/**
	 * DAO injected by Spring that manages ManagerRhStatus entities
	 * 
	 */
	@Autowired
	private ManagerRhStatusDAO managerRhStatusDAO;

	/**
	 * DAO injected by Spring that manages Profile entities
	 * 
	 */
	@Autowired
	private ProfileDAO profileDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Compte entities
	 * 
	 */
	@Autowired
	private CompteService compteService;

	/**
	 * Show all Compte entities
	 * 
	 */
	@RequestMapping("/indexCompte")
	public ModelAndView listComptes() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("comptes", compteService.loadComptes());

		mav.setViewName("compte/listComptes.jsp");

		return mav;
	}

	/**
	 * Edit an existing ManagerRhStatus entity
	 * 
	 */
	@RequestMapping("/editCompteManagerRhStatuses")
	public ModelAndView editCompteManagerRhStatuses(@RequestParam Integer compte_id, @RequestParam Integer managerrhstatuses_id) {
		ManagerRhStatus managerrhstatus = managerRhStatusDAO.findManagerRhStatusByPrimaryKey(managerrhstatuses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("compte_id", compte_id);
		mav.addObject("managerrhstatus", managerrhstatus);
		mav.setViewName("compte/managerrhstatuses/editManagerRhStatuses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Compte entity
	 * 
	 */
	@RequestMapping("/editCompte")
	public ModelAndView editCompte(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("compte", compteDAO.findCompteByPrimaryKey(idKey));
		mav.setViewName("compte/editCompte.jsp");

		return mav;
	}

	/**
	 * Save an existing Profile entity
	 * 
	 */
	@RequestMapping("/saveCompteProfile")
	public ModelAndView saveCompteProfile(@RequestParam Integer compte_id, @ModelAttribute Profile profile) {
		Compte parent_compte = compteService.saveCompteProfile(compte_id, profile);

		ModelAndView mav = new ModelAndView();
		mav.addObject("compte_id", compte_id);
		mav.addObject("compte", parent_compte);
		mav.setViewName("compte/viewCompte.jsp");

		return mav;
	}

	/**
	 * Delete an existing Compte entity
	 * 
	 */
	@RequestMapping("/deleteCompte")
	public String deleteCompte(@RequestParam Integer idKey) {
		Compte compte = compteDAO.findCompteByPrimaryKey(idKey);
		compteService.deleteCompte(compte);
		return "forward:/indexCompte";
	}

	/**
	 * Create a new ManagerRhStatus entity
	 * 
	 */
	@RequestMapping("/newCompteManagerRhStatuses")
	public ModelAndView newCompteManagerRhStatuses(@RequestParam Integer compte_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("compte_id", compte_id);
		mav.addObject("managerrhstatus", new ManagerRhStatus());
		mav.addObject("newFlag", true);
		mav.setViewName("compte/managerrhstatuses/editManagerRhStatuses.jsp");

		return mav;
	}

	/**
	 * Save an existing Compte entity
	 * 
	 */
	@RequestMapping("/saveCompte")
	public String saveCompte(@ModelAttribute Compte compte) {
		compteService.saveCompte(compte);
		return "forward:/indexCompte";
	}

	/**
	 * View an existing ManagerRhStatus entity
	 * 
	 */
	@RequestMapping("/selectCompteManagerRhStatuses")
	public ModelAndView selectCompteManagerRhStatuses(@RequestParam Integer compte_id, @RequestParam Integer managerrhstatuses_id) {
		ManagerRhStatus managerrhstatus = managerRhStatusDAO.findManagerRhStatusByPrimaryKey(managerrhstatuses_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("compte_id", compte_id);
		mav.addObject("managerrhstatus", managerrhstatus);
		mav.setViewName("compte/managerrhstatuses/viewManagerRhStatuses.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/compteController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Profile entity
	 * 
	 */
	@RequestMapping("/editCompteProfile")
	public ModelAndView editCompteProfile(@RequestParam Integer compte_id, @RequestParam Integer profile_id) {
		Profile profile = profileDAO.findProfileByPrimaryKey(profile_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("compte_id", compte_id);
		mav.addObject("profile", profile);
		mav.setViewName("compte/profile/editProfile.jsp");

		return mav;
	}

	/**
	 * Delete an existing Profile entity
	 * 
	 */
	@RequestMapping("/deleteCompteProfile")
	public ModelAndView deleteCompteProfile(@RequestParam Integer compte_id, @RequestParam Integer related_profile_id) {
		ModelAndView mav = new ModelAndView();

		Compte compte = compteService.deleteCompteProfile(compte_id, related_profile_id);

		mav.addObject("compte_id", compte_id);
		mav.addObject("compte", compte);
		mav.setViewName("compte/viewCompte.jsp");

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
	 * View an existing Profile entity
	 * 
	 */
	@RequestMapping("/selectCompteProfile")
	public ModelAndView selectCompteProfile(@RequestParam Integer compte_id, @RequestParam Integer profile_id) {
		Profile profile = profileDAO.findProfileByPrimaryKey(profile_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("compte_id", compte_id);
		mav.addObject("profile", profile);
		mav.setViewName("compte/profile/viewProfile.jsp");

		return mav;
	}

	/**
	 * Delete an existing ManagerRhStatus entity
	 * 
	 */
	@RequestMapping("/deleteCompteManagerRhStatuses")
	public ModelAndView deleteCompteManagerRhStatuses(@RequestParam Integer compte_id, @RequestParam Integer related_managerrhstatuses_id) {
		ModelAndView mav = new ModelAndView();

		Compte compte = compteService.deleteCompteManagerRhStatuses(compte_id, related_managerrhstatuses_id);

		mav.addObject("compte_id", compte_id);
		mav.addObject("compte", compte);
		mav.setViewName("compte/viewCompte.jsp");

		return mav;
	}

	/**
	 * Select the child ManagerRhStatus entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCompteManagerRhStatuses")
	public ModelAndView confirmDeleteCompteManagerRhStatuses(@RequestParam Integer compte_id, @RequestParam Integer related_managerrhstatuses_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("managerrhstatus", managerRhStatusDAO.findManagerRhStatusByPrimaryKey(related_managerrhstatuses_id));
		mav.addObject("compte_id", compte_id);
		mav.setViewName("compte/managerrhstatuses/deleteManagerRhStatuses.jsp");

		return mav;
	}

	/**
	 * Show all Profile entities by Compte
	 * 
	 */
	@RequestMapping("/listCompteProfile")
	public ModelAndView listCompteProfile(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("compte", compteDAO.findCompteByPrimaryKey(idKey));
		mav.setViewName("compte/profile/listProfile.jsp");

		return mav;
	}

	/**
	 * Select an existing Compte entity
	 * 
	 */
	@RequestMapping("/selectCompte")
	public ModelAndView selectCompte(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("compte", compteDAO.findCompteByPrimaryKey(idKey));
		mav.setViewName("compte/viewCompte.jsp");

		return mav;
	}

	/**
	 * Create a new Compte entity
	 * 
	 */
	@RequestMapping("/newCompte")
	public ModelAndView newCompte() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("compte", new Compte());
		mav.addObject("newFlag", true);
		mav.setViewName("compte/editCompte.jsp");

		return mav;
	}

	/**
	 * Select the child Profile entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCompteProfile")
	public ModelAndView confirmDeleteCompteProfile(@RequestParam Integer compte_id, @RequestParam Integer related_profile_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("profile", profileDAO.findProfileByPrimaryKey(related_profile_id));
		mav.addObject("compte_id", compte_id);
		mav.setViewName("compte/profile/deleteProfile.jsp");

		return mav;
	}

	/**
	 * Select the Compte entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCompte")
	public ModelAndView confirmDeleteCompte(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("compte", compteDAO.findCompteByPrimaryKey(idKey));
		mav.setViewName("compte/deleteCompte.jsp");

		return mav;
	}

	/**
	 * Create a new Profile entity
	 * 
	 */
	@RequestMapping("/newCompteProfile")
	public ModelAndView newCompteProfile(@RequestParam Integer compte_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("compte_id", compte_id);
		mav.addObject("profile", new Profile());
		mav.addObject("newFlag", true);
		mav.setViewName("compte/profile/editProfile.jsp");

		return mav;
	}

	/**
	 * Save an existing ManagerRhStatus entity
	 * 
	 */
	@RequestMapping("/saveCompteManagerRhStatuses")
	public ModelAndView saveCompteManagerRhStatuses(@RequestParam Integer compte_id, @ModelAttribute ManagerRhStatus managerrhstatuses) {
		Compte parent_compte = compteService.saveCompteManagerRhStatuses(compte_id, managerrhstatuses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("compte_id", compte_id);
		mav.addObject("compte", parent_compte);
		mav.setViewName("compte/viewCompte.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Compte entities
	 * 
	 */
	public String indexCompte() {
		return "redirect:/indexCompte";
	}

	/**
	 * Show all ManagerRhStatus entities by Compte
	 * 
	 */
	@RequestMapping("/listCompteManagerRhStatuses")
	public ModelAndView listCompteManagerRhStatuses(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("compte", compteDAO.findCompteByPrimaryKey(idKey));
		mav.setViewName("compte/managerrhstatuses/listManagerRhStatuses.jsp");

		return mav;
	}
}