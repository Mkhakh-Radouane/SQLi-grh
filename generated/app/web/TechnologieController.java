package app.web;

import app.dao.TechnologieDAO;
import app.dao.TechnologiesMaitriseesDAO;

import app.domain.Technologie;
import app.domain.TechnologiesMaitrisees;

import app.service.TechnologieService;

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
 * Spring MVC controller that handles CRUD requests for Technologie entities
 * 
 */

@Controller("TechnologieController")
public class TechnologieController {

	/**
	 * DAO injected by Spring that manages Technologie entities
	 * 
	 */
	@Autowired
	private TechnologieDAO technologieDAO;

	/**
	 * DAO injected by Spring that manages TechnologiesMaitrisees entities
	 * 
	 */
	@Autowired
	private TechnologiesMaitriseesDAO technologiesMaitriseesDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Technologie entities
	 * 
	 */
	@Autowired
	private TechnologieService technologieService;

	/**
	 * Create a new TechnologiesMaitrisees entity
	 * 
	 */
	@RequestMapping("/newTechnologieTechnologiesMaitriseeses")
	public ModelAndView newTechnologieTechnologiesMaitriseeses(@RequestParam Integer technologie_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("technologie_id", technologie_id);
		mav.addObject("technologiesmaitrisees", new TechnologiesMaitrisees());
		mav.addObject("newFlag", true);
		mav.setViewName("technologie/technologiesmaitriseeses/editTechnologiesMaitriseeses.jsp");

		return mav;
	}

	/**
	 * Save an existing TechnologiesMaitrisees entity
	 * 
	 */
	@RequestMapping("/saveTechnologieTechnologiesMaitriseeses")
	public ModelAndView saveTechnologieTechnologiesMaitriseeses(@RequestParam Integer technologie_id, @ModelAttribute TechnologiesMaitrisees technologiesmaitriseeses) {
		Technologie parent_technologie = technologieService.saveTechnologieTechnologiesMaitriseeses(technologie_id, technologiesmaitriseeses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("technologie_id", technologie_id);
		mav.addObject("technologie", parent_technologie);
		mav.setViewName("technologie/viewTechnologie.jsp");

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
	 * Select the child TechnologiesMaitrisees entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTechnologieTechnologiesMaitriseeses")
	public ModelAndView confirmDeleteTechnologieTechnologiesMaitriseeses(@RequestParam Integer technologie_id, @RequestParam Integer related_technologiesmaitriseeses_technologieField, @RequestParam Integer related_technologiesmaitriseeses_collaborateur) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologiesmaitrisees", technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(related_technologiesmaitriseeses_technologieField, related_technologiesmaitriseeses_collaborateur));
		mav.addObject("technologie_id", technologie_id);
		mav.setViewName("technologie/technologiesmaitriseeses/deleteTechnologiesMaitriseeses.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Technologie entities
	 * 
	 */
	public String indexTechnologie() {
		return "redirect:/indexTechnologie";
	}

	/**
	 * View an existing TechnologiesMaitrisees entity
	 * 
	 */
	@RequestMapping("/selectTechnologieTechnologiesMaitriseeses")
	public ModelAndView selectTechnologieTechnologiesMaitriseeses(@RequestParam Integer technologie_id, @RequestParam Integer technologiesmaitriseeses_technologieField, @RequestParam Integer technologiesmaitriseeses_collaborateur) {
		TechnologiesMaitrisees technologiesmaitrisees = technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologiesmaitriseeses_technologieField, technologiesmaitriseeses_collaborateur, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("technologie_id", technologie_id);
		mav.addObject("technologiesmaitrisees", technologiesmaitrisees);
		mav.setViewName("technologie/technologiesmaitriseeses/viewTechnologiesMaitriseeses.jsp");

		return mav;
	}

	/**
	 * Create a new Technologie entity
	 * 
	 */
	@RequestMapping("/newTechnologie")
	public ModelAndView newTechnologie() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologie", new Technologie());
		mav.addObject("newFlag", true);
		mav.setViewName("technologie/editTechnologie.jsp");

		return mav;
	}

	/**
	 * Delete an existing TechnologiesMaitrisees entity
	 * 
	 */
	@RequestMapping("/deleteTechnologieTechnologiesMaitriseeses")
	public ModelAndView deleteTechnologieTechnologiesMaitriseeses(@RequestParam Integer technologie_id, @RequestParam Integer related_technologiesmaitriseeses_technologieField, @RequestParam Integer related_technologiesmaitriseeses_collaborateur) {
		ModelAndView mav = new ModelAndView();

		Technologie technologie = technologieService.deleteTechnologieTechnologiesMaitriseeses(technologie_id, related_technologiesmaitriseeses_technologieField, related_technologiesmaitriseeses_collaborateur);

		mav.addObject("technologie_id", technologie_id);
		mav.addObject("technologie", technologie);
		mav.setViewName("technologie/viewTechnologie.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/technologieController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Technologie entity
	 * 
	 */
	@RequestMapping("/deleteTechnologie")
	public String deleteTechnologie(@RequestParam Integer idKey) {
		Technologie technologie = technologieDAO.findTechnologieByPrimaryKey(idKey);
		technologieService.deleteTechnologie(technologie);
		return "forward:/indexTechnologie";
	}

	/**
	 * Show all TechnologiesMaitrisees entities by Technologie
	 * 
	 */
	@RequestMapping("/listTechnologieTechnologiesMaitriseeses")
	public ModelAndView listTechnologieTechnologiesMaitriseeses(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologie", technologieDAO.findTechnologieByPrimaryKey(idKey));
		mav.setViewName("technologie/technologiesmaitriseeses/listTechnologiesMaitriseeses.jsp");

		return mav;
	}

	/**
	 * Select the Technologie entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTechnologie")
	public ModelAndView confirmDeleteTechnologie(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologie", technologieDAO.findTechnologieByPrimaryKey(idKey));
		mav.setViewName("technologie/deleteTechnologie.jsp");

		return mav;
	}

	/**
	 * Edit an existing Technologie entity
	 * 
	 */
	@RequestMapping("/editTechnologie")
	public ModelAndView editTechnologie(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologie", technologieDAO.findTechnologieByPrimaryKey(idKey));
		mav.setViewName("technologie/editTechnologie.jsp");

		return mav;
	}

	/**
	 * Save an existing Technologie entity
	 * 
	 */
	@RequestMapping("/saveTechnologie")
	public String saveTechnologie(@ModelAttribute Technologie technologie) {
		technologieService.saveTechnologie(technologie);
		return "forward:/indexTechnologie";
	}

	/**
	 * Select an existing Technologie entity
	 * 
	 */
	@RequestMapping("/selectTechnologie")
	public ModelAndView selectTechnologie(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologie", technologieDAO.findTechnologieByPrimaryKey(idKey));
		mav.setViewName("technologie/viewTechnologie.jsp");

		return mav;
	}

	/**
	 * Show all Technologie entities
	 * 
	 */
	@RequestMapping("/indexTechnologie")
	public ModelAndView listTechnologies() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologies", technologieService.loadTechnologies());

		mav.setViewName("technologie/listTechnologies.jsp");

		return mav;
	}

	/**
	 * Edit an existing TechnologiesMaitrisees entity
	 * 
	 */
	@RequestMapping("/editTechnologieTechnologiesMaitriseeses")
	public ModelAndView editTechnologieTechnologiesMaitriseeses(@RequestParam Integer technologie_id, @RequestParam Integer technologiesmaitriseeses_technologieField, @RequestParam Integer technologiesmaitriseeses_collaborateur) {
		TechnologiesMaitrisees technologiesmaitrisees = technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologiesmaitriseeses_technologieField, technologiesmaitriseeses_collaborateur, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("technologie_id", technologie_id);
		mav.addObject("technologiesmaitrisees", technologiesmaitrisees);
		mav.setViewName("technologie/technologiesmaitriseeses/editTechnologiesMaitriseeses.jsp");

		return mav;
	}
}