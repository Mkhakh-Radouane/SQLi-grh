package app.web;

import app.dao.CompteDAO;
import app.dao.ManagerRhStatusDAO;

import app.domain.Compte;
import app.domain.ManagerRhStatus;

import app.service.ManagerRhStatusService;

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
 * Spring MVC controller that handles CRUD requests for ManagerRhStatus entities
 * 
 */

@Controller("ManagerRhStatusController")
public class ManagerRhStatusController {

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
	 * Service injected by Spring that provides CRUD operations for ManagerRhStatus entities
	 * 
	 */
	@Autowired
	private ManagerRhStatusService managerRhStatusService;

	/**
	 * Select an existing ManagerRhStatus entity
	 * 
	 */
	@RequestMapping("/selectManagerRhStatus")
	public ModelAndView selectManagerRhStatus(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("managerrhstatus", managerRhStatusDAO.findManagerRhStatusByPrimaryKey(idKey));
		mav.setViewName("managerrhstatus/viewManagerRhStatus.jsp");

		return mav;
	}

	/**
	 * Edit an existing ManagerRhStatus entity
	 * 
	 */
	@RequestMapping("/editManagerRhStatus")
	public ModelAndView editManagerRhStatus(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("managerrhstatus", managerRhStatusDAO.findManagerRhStatusByPrimaryKey(idKey));
		mav.setViewName("managerrhstatus/editManagerRhStatus.jsp");

		return mav;
	}

	/**
	 * Show all Compte entities by ManagerRhStatus
	 * 
	 */
	@RequestMapping("/listManagerRhStatusCompte")
	public ModelAndView listManagerRhStatusCompte(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("managerrhstatus", managerRhStatusDAO.findManagerRhStatusByPrimaryKey(idKey));
		mav.setViewName("managerrhstatus/compte/listCompte.jsp");

		return mav;
	}

	/**
	 * Save an existing Compte entity
	 * 
	 */
	@RequestMapping("/saveManagerRhStatusCompte")
	public ModelAndView saveManagerRhStatusCompte(@RequestParam Integer managerrhstatus_id, @ModelAttribute Compte compte) {
		ManagerRhStatus parent_managerrhstatus = managerRhStatusService.saveManagerRhStatusCompte(managerrhstatus_id, compte);

		ModelAndView mav = new ModelAndView();
		mav.addObject("managerrhstatus_id", managerrhstatus_id);
		mav.addObject("managerrhstatus", parent_managerrhstatus);
		mav.setViewName("managerrhstatus/viewManagerRhStatus.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/managerrhstatusController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing Compte entity
	 * 
	 */
	@RequestMapping("/selectManagerRhStatusCompte")
	public ModelAndView selectManagerRhStatusCompte(@RequestParam Integer managerrhstatus_id, @RequestParam Integer compte_id) {
		Compte compte = compteDAO.findCompteByPrimaryKey(compte_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("managerrhstatus_id", managerrhstatus_id);
		mav.addObject("compte", compte);
		mav.setViewName("managerrhstatus/compte/viewCompte.jsp");

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
	 * Edit an existing Compte entity
	 * 
	 */
	@RequestMapping("/editManagerRhStatusCompte")
	public ModelAndView editManagerRhStatusCompte(@RequestParam Integer managerrhstatus_id, @RequestParam Integer compte_id) {
		Compte compte = compteDAO.findCompteByPrimaryKey(compte_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("managerrhstatus_id", managerrhstatus_id);
		mav.addObject("compte", compte);
		mav.setViewName("managerrhstatus/compte/editCompte.jsp");

		return mav;
	}

	/**
	 * Select the ManagerRhStatus entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteManagerRhStatus")
	public ModelAndView confirmDeleteManagerRhStatus(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("managerrhstatus", managerRhStatusDAO.findManagerRhStatusByPrimaryKey(idKey));
		mav.setViewName("managerrhstatus/deleteManagerRhStatus.jsp");

		return mav;
	}

	/**
	 * Create a new Compte entity
	 * 
	 */
	@RequestMapping("/newManagerRhStatusCompte")
	public ModelAndView newManagerRhStatusCompte(@RequestParam Integer managerrhstatus_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("managerrhstatus_id", managerrhstatus_id);
		mav.addObject("compte", new Compte());
		mav.addObject("newFlag", true);
		mav.setViewName("managerrhstatus/compte/editCompte.jsp");

		return mav;
	}

	/**
	 * Delete an existing ManagerRhStatus entity
	 * 
	 */
	@RequestMapping("/deleteManagerRhStatus")
	public String deleteManagerRhStatus(@RequestParam Integer idKey) {
		ManagerRhStatus managerrhstatus = managerRhStatusDAO.findManagerRhStatusByPrimaryKey(idKey);
		managerRhStatusService.deleteManagerRhStatus(managerrhstatus);
		return "forward:/indexManagerRhStatus";
	}

	/**
	 * Select the child Compte entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteManagerRhStatusCompte")
	public ModelAndView confirmDeleteManagerRhStatusCompte(@RequestParam Integer managerrhstatus_id, @RequestParam Integer related_compte_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("compte", compteDAO.findCompteByPrimaryKey(related_compte_id));
		mav.addObject("managerrhstatus_id", managerrhstatus_id);
		mav.setViewName("managerrhstatus/compte/deleteCompte.jsp");

		return mav;
	}

	/**
	 * Entry point to show all ManagerRhStatus entities
	 * 
	 */
	public String indexManagerRhStatus() {
		return "redirect:/indexManagerRhStatus";
	}

	/**
	 * Create a new ManagerRhStatus entity
	 * 
	 */
	@RequestMapping("/newManagerRhStatus")
	public ModelAndView newManagerRhStatus() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("managerrhstatus", new ManagerRhStatus());
		mav.addObject("newFlag", true);
		mav.setViewName("managerrhstatus/editManagerRhStatus.jsp");

		return mav;
	}

	/**
	 * Delete an existing Compte entity
	 * 
	 */
	@RequestMapping("/deleteManagerRhStatusCompte")
	public ModelAndView deleteManagerRhStatusCompte(@RequestParam Integer managerrhstatus_id, @RequestParam Integer related_compte_id) {
		ModelAndView mav = new ModelAndView();

		ManagerRhStatus managerrhstatus = managerRhStatusService.deleteManagerRhStatusCompte(managerrhstatus_id, related_compte_id);

		mav.addObject("managerrhstatus_id", managerrhstatus_id);
		mav.addObject("managerrhstatus", managerrhstatus);
		mav.setViewName("managerrhstatus/viewManagerRhStatus.jsp");

		return mav;
	}

	/**
	 * Save an existing ManagerRhStatus entity
	 * 
	 */
	@RequestMapping("/saveManagerRhStatus")
	public String saveManagerRhStatus(@ModelAttribute ManagerRhStatus managerrhstatus) {
		managerRhStatusService.saveManagerRhStatus(managerrhstatus);
		return "forward:/indexManagerRhStatus";
	}

	/**
	 * Show all ManagerRhStatus entities
	 * 
	 */
	@RequestMapping("/indexManagerRhStatus")
	public ModelAndView listManagerRhStatuss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("managerrhstatuss", managerRhStatusService.loadManagerRhStatuss());

		mav.setViewName("managerrhstatus/listManagerRhStatuss.jsp");

		return mav;
	}
}