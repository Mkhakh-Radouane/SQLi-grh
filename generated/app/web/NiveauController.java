package app.web;

import app.dao.DiplomeDAO;
import app.dao.NiveauDAO;

import app.domain.Diplome;
import app.domain.Niveau;

import app.service.NiveauService;

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
 * Spring MVC controller that handles CRUD requests for Niveau entities
 * 
 */

@Controller("NiveauController")
public class NiveauController {

	/**
	 * DAO injected by Spring that manages Diplome entities
	 * 
	 */
	@Autowired
	private DiplomeDAO diplomeDAO;

	/**
	 * DAO injected by Spring that manages Niveau entities
	 * 
	 */
	@Autowired
	private NiveauDAO niveauDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Niveau entities
	 * 
	 */
	@Autowired
	private NiveauService niveauService;

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
	 * Edit an existing Diplome entity
	 * 
	 */
	@RequestMapping("/editNiveauDiplomes")
	public ModelAndView editNiveauDiplomes(@RequestParam Integer niveau_id, @RequestParam Integer diplomes_id) {
		Diplome diplome = diplomeDAO.findDiplomeByPrimaryKey(diplomes_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("niveau_id", niveau_id);
		mav.addObject("diplome", diplome);
		mav.setViewName("niveau/diplomes/editDiplomes.jsp");

		return mav;
	}

	/**
	 * Create a new Niveau entity
	 * 
	 */
	@RequestMapping("/newNiveau")
	public ModelAndView newNiveau() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("niveau", new Niveau());
		mav.addObject("newFlag", true);
		mav.setViewName("niveau/editNiveau.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Niveau entities
	 * 
	 */
	public String indexNiveau() {
		return "redirect:/indexNiveau";
	}

	/**
	 * Select the child Diplome entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteNiveauDiplomes")
	public ModelAndView confirmDeleteNiveauDiplomes(@RequestParam Integer niveau_id, @RequestParam Integer related_diplomes_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diplome", diplomeDAO.findDiplomeByPrimaryKey(related_diplomes_id));
		mav.addObject("niveau_id", niveau_id);
		mav.setViewName("niveau/diplomes/deleteDiplomes.jsp");

		return mav;
	}

	/**
	 * Select an existing Niveau entity
	 * 
	 */
	@RequestMapping("/selectNiveau")
	public ModelAndView selectNiveau(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("niveau", niveauDAO.findNiveauByPrimaryKey(idKey));
		mav.setViewName("niveau/viewNiveau.jsp");

		return mav;
	}

	/**
	 * Delete an existing Niveau entity
	 * 
	 */
	@RequestMapping("/deleteNiveau")
	public String deleteNiveau(@RequestParam Integer idKey) {
		Niveau niveau = niveauDAO.findNiveauByPrimaryKey(idKey);
		niveauService.deleteNiveau(niveau);
		return "forward:/indexNiveau";
	}

	/**
	 * Show all Niveau entities
	 * 
	 */
	@RequestMapping("/indexNiveau")
	public ModelAndView listNiveaus() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("niveaus", niveauService.loadNiveaus());

		mav.setViewName("niveau/listNiveaus.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/niveauController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Diplome entity
	 * 
	 */
	@RequestMapping("/saveNiveauDiplomes")
	public ModelAndView saveNiveauDiplomes(@RequestParam Integer niveau_id, @ModelAttribute Diplome diplomes) {
		Niveau parent_niveau = niveauService.saveNiveauDiplomes(niveau_id, diplomes);

		ModelAndView mav = new ModelAndView();
		mav.addObject("niveau_id", niveau_id);
		mav.addObject("niveau", parent_niveau);
		mav.setViewName("niveau/viewNiveau.jsp");

		return mav;
	}

	/**
	 * Select the Niveau entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteNiveau")
	public ModelAndView confirmDeleteNiveau(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("niveau", niveauDAO.findNiveauByPrimaryKey(idKey));
		mav.setViewName("niveau/deleteNiveau.jsp");

		return mav;
	}

	/**
	 * Save an existing Niveau entity
	 * 
	 */
	@RequestMapping("/saveNiveau")
	public String saveNiveau(@ModelAttribute Niveau niveau) {
		niveauService.saveNiveau(niveau);
		return "forward:/indexNiveau";
	}

	/**
	 * Delete an existing Diplome entity
	 * 
	 */
	@RequestMapping("/deleteNiveauDiplomes")
	public ModelAndView deleteNiveauDiplomes(@RequestParam Integer niveau_id, @RequestParam Integer related_diplomes_id) {
		ModelAndView mav = new ModelAndView();

		Niveau niveau = niveauService.deleteNiveauDiplomes(niveau_id, related_diplomes_id);

		mav.addObject("niveau_id", niveau_id);
		mav.addObject("niveau", niveau);
		mav.setViewName("niveau/viewNiveau.jsp");

		return mav;
	}

	/**
	 * Show all Diplome entities by Niveau
	 * 
	 */
	@RequestMapping("/listNiveauDiplomes")
	public ModelAndView listNiveauDiplomes(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("niveau", niveauDAO.findNiveauByPrimaryKey(idKey));
		mav.setViewName("niveau/diplomes/listDiplomes.jsp");

		return mav;
	}

	/**
	 * Edit an existing Niveau entity
	 * 
	 */
	@RequestMapping("/editNiveau")
	public ModelAndView editNiveau(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("niveau", niveauDAO.findNiveauByPrimaryKey(idKey));
		mav.setViewName("niveau/editNiveau.jsp");

		return mav;
	}

	/**
	 * View an existing Diplome entity
	 * 
	 */
	@RequestMapping("/selectNiveauDiplomes")
	public ModelAndView selectNiveauDiplomes(@RequestParam Integer niveau_id, @RequestParam Integer diplomes_id) {
		Diplome diplome = diplomeDAO.findDiplomeByPrimaryKey(diplomes_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("niveau_id", niveau_id);
		mav.addObject("diplome", diplome);
		mav.setViewName("niveau/diplomes/viewDiplomes.jsp");

		return mav;
	}

	/**
	 * Create a new Diplome entity
	 * 
	 */
	@RequestMapping("/newNiveauDiplomes")
	public ModelAndView newNiveauDiplomes(@RequestParam Integer niveau_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("niveau_id", niveau_id);
		mav.addObject("diplome", new Diplome());
		mav.addObject("newFlag", true);
		mav.setViewName("niveau/diplomes/editDiplomes.jsp");

		return mav;
	}
}