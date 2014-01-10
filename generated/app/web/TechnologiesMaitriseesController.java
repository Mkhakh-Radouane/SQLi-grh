package app.web;

import app.dao.TechnologieDAO;
import app.dao.TechnologiesMaitriseesDAO;

import app.domain.Technologie;
import app.domain.TechnologiesMaitrisees;

import app.service.TechnologiesMaitriseesService;

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
 * Spring MVC controller that handles CRUD requests for TechnologiesMaitrisees entities
 * 
 */

@Controller("TechnologiesMaitriseesController")
public class TechnologiesMaitriseesController {

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
	 * Service injected by Spring that provides CRUD operations for TechnologiesMaitrisees entities
	 * 
	 */
	@Autowired
	private TechnologiesMaitriseesService technologiesMaitriseesService;

	/**
	 * Select the child Technologie entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTechnologiesMaitriseesTechnologie")
	public ModelAndView confirmDeleteTechnologiesMaitriseesTechnologie(@RequestParam Integer technologiesmaitrisees_technologieField, @RequestParam Integer technologiesmaitrisees_collaborateur, @RequestParam Integer related_technologie_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologie", technologieDAO.findTechnologieByPrimaryKey(related_technologie_id));
		mav.addObject("technologiesmaitrisees_technologieField", technologiesmaitrisees_technologieField);
		mav.addObject("technologiesmaitrisees_collaborateur", technologiesmaitrisees_collaborateur);
		mav.setViewName("technologiesmaitrisees/technologie/deleteTechnologie.jsp");

		return mav;
	}

	/**
	 * Edit an existing Technologie entity
	 * 
	 */
	@RequestMapping("/editTechnologiesMaitriseesTechnologie")
	public ModelAndView editTechnologiesMaitriseesTechnologie(@RequestParam Integer technologiesmaitrisees_technologieField, @RequestParam Integer technologiesmaitrisees_collaborateur, @RequestParam Integer technologie_id) {
		Technologie technologie = technologieDAO.findTechnologieByPrimaryKey(technologie_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("technologiesmaitrisees_technologieField", technologiesmaitrisees_technologieField);
		mav.addObject("technologiesmaitrisees_collaborateur", technologiesmaitrisees_collaborateur);
		mav.addObject("technologie", technologie);
		mav.setViewName("technologiesmaitrisees/technologie/editTechnologie.jsp");

		return mav;
	}

	/**
	 * Select the TechnologiesMaitrisees entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTechnologiesMaitrisees")
	public ModelAndView confirmDeleteTechnologiesMaitrisees(@RequestParam Integer technologieFieldKey, @RequestParam Integer collaborateurKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologiesmaitrisees", technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologieFieldKey, collaborateurKey));
		mav.setViewName("technologiesmaitrisees/deleteTechnologiesMaitrisees.jsp");

		return mav;
	}

	/**
	 * Show all TechnologiesMaitrisees entities
	 * 
	 */
	@RequestMapping("/indexTechnologiesMaitrisees")
	public ModelAndView listTechnologiesMaitriseess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologiesmaitriseess", technologiesMaitriseesService.loadTechnologiesMaitriseess());

		mav.setViewName("technologiesmaitrisees/listTechnologiesMaitriseess.jsp");

		return mav;
	}

	/**
	 * Show all Technologie entities by TechnologiesMaitrisees
	 * 
	 */
	@RequestMapping("/listTechnologiesMaitriseesTechnologie")
	public ModelAndView listTechnologiesMaitriseesTechnologie(@RequestParam Integer technologieFieldKey, @RequestParam Integer collaborateurKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologiesmaitrisees", technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologieFieldKey, collaborateurKey));
		mav.setViewName("technologiesmaitrisees/technologie/listTechnologie.jsp");

		return mav;
	}

	/**
	 * Create a new Technologie entity
	 * 
	 */
	@RequestMapping("/newTechnologiesMaitriseesTechnologie")
	public ModelAndView newTechnologiesMaitriseesTechnologie(@RequestParam Integer technologiesmaitrisees_technologieField, @RequestParam Integer technologiesmaitrisees_collaborateur) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("technologiesmaitrisees_technologieField", technologiesmaitrisees_technologieField);
		mav.addObject("technologiesmaitrisees_collaborateur", technologiesmaitrisees_collaborateur);
		mav.addObject("technologie", new Technologie());
		mav.addObject("newFlag", true);
		mav.setViewName("technologiesmaitrisees/technologie/editTechnologie.jsp");

		return mav;
	}

	/**
	 * Delete an existing Technologie entity
	 * 
	 */
	@RequestMapping("/deleteTechnologiesMaitriseesTechnologie")
	public ModelAndView deleteTechnologiesMaitriseesTechnologie(@RequestParam Integer technologiesmaitrisees_technologieField, @RequestParam Integer technologiesmaitrisees_collaborateur, @RequestParam Integer related_technologie_id) {
		ModelAndView mav = new ModelAndView();

		TechnologiesMaitrisees technologiesmaitrisees = technologiesMaitriseesService.deleteTechnologiesMaitriseesTechnologie(technologiesmaitrisees_technologieField, technologiesmaitrisees_collaborateur, related_technologie_id);

		mav.addObject("technologiesmaitrisees_technologieField", technologiesmaitrisees_technologieField);
		mav.addObject("technologiesmaitrisees_collaborateur", technologiesmaitrisees_collaborateur);
		mav.addObject("technologiesmaitrisees", technologiesmaitrisees);
		mav.setViewName("technologiesmaitrisees/viewTechnologiesMaitrisees.jsp");

		return mav;
	}

	/**
	 * View an existing Technologie entity
	 * 
	 */
	@RequestMapping("/selectTechnologiesMaitriseesTechnologie")
	public ModelAndView selectTechnologiesMaitriseesTechnologie(@RequestParam Integer technologiesmaitrisees_technologieField, @RequestParam Integer technologiesmaitrisees_collaborateur, @RequestParam Integer technologie_id) {
		Technologie technologie = technologieDAO.findTechnologieByPrimaryKey(technologie_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("technologiesmaitrisees_technologieField", technologiesmaitrisees_technologieField);
		mav.addObject("technologiesmaitrisees_collaborateur", technologiesmaitrisees_collaborateur);
		mav.addObject("technologie", technologie);
		mav.setViewName("technologiesmaitrisees/technologie/viewTechnologie.jsp");

		return mav;
	}

	/**
	 * Save an existing Technologie entity
	 * 
	 */
	@RequestMapping("/saveTechnologiesMaitriseesTechnologie")
	public ModelAndView saveTechnologiesMaitriseesTechnologie(@RequestParam Integer technologiesmaitrisees_technologieField, @RequestParam Integer technologiesmaitrisees_collaborateur, @ModelAttribute Technologie technologie) {
		TechnologiesMaitrisees parent_technologiesmaitrisees = technologiesMaitriseesService.saveTechnologiesMaitriseesTechnologie(technologiesmaitrisees_technologieField, technologiesmaitrisees_collaborateur, technologie);

		ModelAndView mav = new ModelAndView();
		mav.addObject("technologiesmaitrisees_technologieField", technologiesmaitrisees_technologieField);
		mav.addObject("technologiesmaitrisees_collaborateur", technologiesmaitrisees_collaborateur);
		mav.addObject("technologiesmaitrisees", parent_technologiesmaitrisees);
		mav.setViewName("technologiesmaitrisees/viewTechnologiesMaitrisees.jsp");

		return mav;
	}

	/**
	 * Edit an existing TechnologiesMaitrisees entity
	 * 
	 */
	@RequestMapping("/editTechnologiesMaitrisees")
	public ModelAndView editTechnologiesMaitrisees(@RequestParam Integer technologieFieldKey, @RequestParam Integer collaborateurKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologiesmaitrisees", technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologieFieldKey, collaborateurKey));
		mav.setViewName("technologiesmaitrisees/editTechnologiesMaitrisees.jsp");

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
	 * Create a new TechnologiesMaitrisees entity
	 * 
	 */
	@RequestMapping("/newTechnologiesMaitrisees")
	public ModelAndView newTechnologiesMaitrisees() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologiesmaitrisees", new TechnologiesMaitrisees());
		mav.addObject("newFlag", true);
		mav.setViewName("technologiesmaitrisees/editTechnologiesMaitrisees.jsp");

		return mav;
	}

	/**
	 * Select an existing TechnologiesMaitrisees entity
	 * 
	 */
	@RequestMapping("/selectTechnologiesMaitrisees")
	public ModelAndView selectTechnologiesMaitrisees(@RequestParam Integer technologieFieldKey, @RequestParam Integer collaborateurKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("technologiesmaitrisees", technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologieFieldKey, collaborateurKey));
		mav.setViewName("technologiesmaitrisees/viewTechnologiesMaitrisees.jsp");

		return mav;
	}

	/**
	 * Save an existing TechnologiesMaitrisees entity
	 * 
	 */
	@RequestMapping("/saveTechnologiesMaitrisees")
	public String saveTechnologiesMaitrisees(@ModelAttribute TechnologiesMaitrisees technologiesmaitrisees) {
		technologiesMaitriseesService.saveTechnologiesMaitrisees(technologiesmaitrisees);
		return "forward:/indexTechnologiesMaitrisees";
	}

	/**
	 * Delete an existing TechnologiesMaitrisees entity
	 * 
	 */
	@RequestMapping("/deleteTechnologiesMaitrisees")
	public String deleteTechnologiesMaitrisees(@RequestParam Integer technologieFieldKey, @RequestParam Integer collaborateurKey) {
		TechnologiesMaitrisees technologiesmaitrisees = technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologieFieldKey, collaborateurKey);
		technologiesMaitriseesService.deleteTechnologiesMaitrisees(technologiesmaitrisees);
		return "forward:/indexTechnologiesMaitrisees";
	}

	/**
	 */
	@RequestMapping("/technologiesmaitriseesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Entry point to show all TechnologiesMaitrisees entities
	 * 
	 */
	public String indexTechnologiesMaitrisees() {
		return "redirect:/indexTechnologiesMaitrisees";
	}
}