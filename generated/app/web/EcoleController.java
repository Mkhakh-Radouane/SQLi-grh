package app.web;

import app.dao.DiplomeDAO;
import app.dao.EcoleDAO;

import app.domain.Diplome;
import app.domain.Ecole;

import app.service.EcoleService;

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
 * Spring MVC controller that handles CRUD requests for Ecole entities
 * 
 */

@Controller("EcoleController")
public class EcoleController {

	/**
	 * DAO injected by Spring that manages Diplome entities
	 * 
	 */
	@Autowired
	private DiplomeDAO diplomeDAO;

	/**
	 * DAO injected by Spring that manages Ecole entities
	 * 
	 */
	@Autowired
	private EcoleDAO ecoleDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Ecole entities
	 * 
	 */
	@Autowired
	private EcoleService ecoleService;

	/**
	 * Select an existing Ecole entity
	 * 
	 */
	@RequestMapping("/selectEcole")
	public ModelAndView selectEcole(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ecole", ecoleDAO.findEcoleByPrimaryKey(idKey));
		mav.setViewName("ecole/viewEcole.jsp");

		return mav;
	}

	/**
	 * Select the Ecole entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteEcole")
	public ModelAndView confirmDeleteEcole(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ecole", ecoleDAO.findEcoleByPrimaryKey(idKey));
		mav.setViewName("ecole/deleteEcole.jsp");

		return mav;
	}

	/**
	 * Delete an existing Ecole entity
	 * 
	 */
	@RequestMapping("/deleteEcole")
	public String deleteEcole(@RequestParam Integer idKey) {
		Ecole ecole = ecoleDAO.findEcoleByPrimaryKey(idKey);
		ecoleService.deleteEcole(ecole);
		return "forward:/indexEcole";
	}

	/**
	 * Select the child Diplome entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteEcoleDiplomes")
	public ModelAndView confirmDeleteEcoleDiplomes(@RequestParam Integer ecole_id, @RequestParam Integer related_diplomes_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diplome", diplomeDAO.findDiplomeByPrimaryKey(related_diplomes_id));
		mav.addObject("ecole_id", ecole_id);
		mav.setViewName("ecole/diplomes/deleteDiplomes.jsp");

		return mav;
	}

	/**
	 * Create a new Diplome entity
	 * 
	 */
	@RequestMapping("/newEcoleDiplomes")
	public ModelAndView newEcoleDiplomes(@RequestParam Integer ecole_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ecole_id", ecole_id);
		mav.addObject("diplome", new Diplome());
		mav.addObject("newFlag", true);
		mav.setViewName("ecole/diplomes/editDiplomes.jsp");

		return mav;
	}

	/**
	 * Save an existing Diplome entity
	 * 
	 */
	@RequestMapping("/saveEcoleDiplomes")
	public ModelAndView saveEcoleDiplomes(@RequestParam Integer ecole_id, @ModelAttribute Diplome diplomes) {
		Ecole parent_ecole = ecoleService.saveEcoleDiplomes(ecole_id, diplomes);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ecole_id", ecole_id);
		mav.addObject("ecole", parent_ecole);
		mav.setViewName("ecole/viewEcole.jsp");

		return mav;
	}

	/**
	 * Delete an existing Diplome entity
	 * 
	 */
	@RequestMapping("/deleteEcoleDiplomes")
	public ModelAndView deleteEcoleDiplomes(@RequestParam Integer ecole_id, @RequestParam Integer related_diplomes_id) {
		ModelAndView mav = new ModelAndView();

		Ecole ecole = ecoleService.deleteEcoleDiplomes(ecole_id, related_diplomes_id);

		mav.addObject("ecole_id", ecole_id);
		mav.addObject("ecole", ecole);
		mav.setViewName("ecole/viewEcole.jsp");

		return mav;
	}

	/**
	 * Show all Ecole entities
	 * 
	 */
	@RequestMapping("/indexEcole")
	public ModelAndView listEcoles() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ecoles", ecoleService.loadEcoles());

		mav.setViewName("ecole/listEcoles.jsp");

		return mav;
	}

	/**
	 * Edit an existing Ecole entity
	 * 
	 */
	@RequestMapping("/editEcole")
	public ModelAndView editEcole(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ecole", ecoleDAO.findEcoleByPrimaryKey(idKey));
		mav.setViewName("ecole/editEcole.jsp");

		return mav;
	}

	/**
	 * Save an existing Ecole entity
	 * 
	 */
	@RequestMapping("/saveEcole")
	public String saveEcole(@ModelAttribute Ecole ecole) {
		ecoleService.saveEcole(ecole);
		return "forward:/indexEcole";
	}

	/**
	 * Entry point to show all Ecole entities
	 * 
	 */
	public String indexEcole() {
		return "redirect:/indexEcole";
	}

	/**
	 */
	@RequestMapping("/ecoleController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing Diplome entity
	 * 
	 */
	@RequestMapping("/selectEcoleDiplomes")
	public ModelAndView selectEcoleDiplomes(@RequestParam Integer ecole_id, @RequestParam Integer diplomes_id) {
		Diplome diplome = diplomeDAO.findDiplomeByPrimaryKey(diplomes_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ecole_id", ecole_id);
		mav.addObject("diplome", diplome);
		mav.setViewName("ecole/diplomes/viewDiplomes.jsp");

		return mav;
	}

	/**
	 * Create a new Ecole entity
	 * 
	 */
	@RequestMapping("/newEcole")
	public ModelAndView newEcole() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ecole", new Ecole());
		mav.addObject("newFlag", true);
		mav.setViewName("ecole/editEcole.jsp");

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
	 * Show all Diplome entities by Ecole
	 * 
	 */
	@RequestMapping("/listEcoleDiplomes")
	public ModelAndView listEcoleDiplomes(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ecole", ecoleDAO.findEcoleByPrimaryKey(idKey));
		mav.setViewName("ecole/diplomes/listDiplomes.jsp");

		return mav;
	}

	/**
	 * Edit an existing Diplome entity
	 * 
	 */
	@RequestMapping("/editEcoleDiplomes")
	public ModelAndView editEcoleDiplomes(@RequestParam Integer ecole_id, @RequestParam Integer diplomes_id) {
		Diplome diplome = diplomeDAO.findDiplomeByPrimaryKey(diplomes_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("ecole_id", ecole_id);
		mav.addObject("diplome", diplome);
		mav.setViewName("ecole/diplomes/editDiplomes.jsp");

		return mav;
	}
}