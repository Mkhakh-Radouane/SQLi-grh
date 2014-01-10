package app.web;

import app.dao.DiplomeDAO;
import app.dao.EcoleDAO;
import app.dao.NiveauDAO;

import app.domain.Diplome;
import app.domain.Ecole;
import app.domain.Niveau;

import app.service.DiplomeService;

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
 * Spring MVC controller that handles CRUD requests for Diplome entities
 * 
 */

@Controller("DiplomeController")
public class DiplomeController {

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
	 * DAO injected by Spring that manages Niveau entities
	 * 
	 */
	@Autowired
	private NiveauDAO niveauDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Diplome entities
	 * 
	 */
	@Autowired
	private DiplomeService diplomeService;

	/**
	 * Save an existing Diplome entity
	 * 
	 */
	@RequestMapping("/saveDiplome")
	public String saveDiplome(@ModelAttribute Diplome diplome) {
		diplomeService.saveDiplome(diplome);
		return "forward:/indexDiplome";
	}

	/**
	 * Show all Ecole entities by Diplome
	 * 
	 */
	@RequestMapping("/listDiplomeEcole")
	public ModelAndView listDiplomeEcole(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diplome", diplomeDAO.findDiplomeByPrimaryKey(idKey));
		mav.setViewName("diplome/ecole/listEcole.jsp");

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
	 * View an existing Ecole entity
	 * 
	 */
	@RequestMapping("/selectDiplomeEcole")
	public ModelAndView selectDiplomeEcole(@RequestParam Integer diplome_id, @RequestParam Integer ecole_id) {
		Ecole ecole = ecoleDAO.findEcoleByPrimaryKey(ecole_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diplome_id", diplome_id);
		mav.addObject("ecole", ecole);
		mav.setViewName("diplome/ecole/viewEcole.jsp");

		return mav;
	}

	/**
	 * Save an existing Ecole entity
	 * 
	 */
	@RequestMapping("/saveDiplomeEcole")
	public ModelAndView saveDiplomeEcole(@RequestParam Integer diplome_id, @ModelAttribute Ecole ecole) {
		Diplome parent_diplome = diplomeService.saveDiplomeEcole(diplome_id, ecole);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diplome_id", diplome_id);
		mav.addObject("diplome", parent_diplome);
		mav.setViewName("diplome/viewDiplome.jsp");

		return mav;
	}

	/**
	 * View an existing Niveau entity
	 * 
	 */
	@RequestMapping("/selectDiplomeNiveau")
	public ModelAndView selectDiplomeNiveau(@RequestParam Integer diplome_id, @RequestParam Integer niveau_id) {
		Niveau niveau = niveauDAO.findNiveauByPrimaryKey(niveau_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diplome_id", diplome_id);
		mav.addObject("niveau", niveau);
		mav.setViewName("diplome/niveau/viewNiveau.jsp");

		return mav;
	}

	/**
	 * Delete an existing Diplome entity
	 * 
	 */
	@RequestMapping("/deleteDiplome")
	public String deleteDiplome(@RequestParam Integer idKey) {
		Diplome diplome = diplomeDAO.findDiplomeByPrimaryKey(idKey);
		diplomeService.deleteDiplome(diplome);
		return "forward:/indexDiplome";
	}

	/**
	 * Entry point to show all Diplome entities
	 * 
	 */
	public String indexDiplome() {
		return "redirect:/indexDiplome";
	}

	/**
	 * Select an existing Diplome entity
	 * 
	 */
	@RequestMapping("/selectDiplome")
	public ModelAndView selectDiplome(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diplome", diplomeDAO.findDiplomeByPrimaryKey(idKey));
		mav.setViewName("diplome/viewDiplome.jsp");

		return mav;
	}

	/**
	 * Select the Diplome entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDiplome")
	public ModelAndView confirmDeleteDiplome(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diplome", diplomeDAO.findDiplomeByPrimaryKey(idKey));
		mav.setViewName("diplome/deleteDiplome.jsp");

		return mav;
	}

	/**
	 * Edit an existing Niveau entity
	 * 
	 */
	@RequestMapping("/editDiplomeNiveau")
	public ModelAndView editDiplomeNiveau(@RequestParam Integer diplome_id, @RequestParam Integer niveau_id) {
		Niveau niveau = niveauDAO.findNiveauByPrimaryKey(niveau_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diplome_id", diplome_id);
		mav.addObject("niveau", niveau);
		mav.setViewName("diplome/niveau/editNiveau.jsp");

		return mav;
	}

	/**
	 * Delete an existing Niveau entity
	 * 
	 */
	@RequestMapping("/deleteDiplomeNiveau")
	public ModelAndView deleteDiplomeNiveau(@RequestParam Integer diplome_id, @RequestParam Integer related_niveau_id) {
		ModelAndView mav = new ModelAndView();

		Diplome diplome = diplomeService.deleteDiplomeNiveau(diplome_id, related_niveau_id);

		mav.addObject("diplome_id", diplome_id);
		mav.addObject("diplome", diplome);
		mav.setViewName("diplome/viewDiplome.jsp");

		return mav;
	}

	/**
	 * Show all Diplome entities
	 * 
	 */
	@RequestMapping("/indexDiplome")
	public ModelAndView listDiplomes() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diplomes", diplomeService.loadDiplomes());

		mav.setViewName("diplome/listDiplomes.jsp");

		return mav;
	}

	/**
	 * Show all Niveau entities by Diplome
	 * 
	 */
	@RequestMapping("/listDiplomeNiveau")
	public ModelAndView listDiplomeNiveau(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diplome", diplomeDAO.findDiplomeByPrimaryKey(idKey));
		mav.setViewName("diplome/niveau/listNiveau.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/diplomeController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Ecole entity
	 * 
	 */
	@RequestMapping("/editDiplomeEcole")
	public ModelAndView editDiplomeEcole(@RequestParam Integer diplome_id, @RequestParam Integer ecole_id) {
		Ecole ecole = ecoleDAO.findEcoleByPrimaryKey(ecole_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diplome_id", diplome_id);
		mav.addObject("ecole", ecole);
		mav.setViewName("diplome/ecole/editEcole.jsp");

		return mav;
	}

	/**
	 * Select the child Ecole entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDiplomeEcole")
	public ModelAndView confirmDeleteDiplomeEcole(@RequestParam Integer diplome_id, @RequestParam Integer related_ecole_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("ecole", ecoleDAO.findEcoleByPrimaryKey(related_ecole_id));
		mav.addObject("diplome_id", diplome_id);
		mav.setViewName("diplome/ecole/deleteEcole.jsp");

		return mav;
	}

	/**
	 * Save an existing Niveau entity
	 * 
	 */
	@RequestMapping("/saveDiplomeNiveau")
	public ModelAndView saveDiplomeNiveau(@RequestParam Integer diplome_id, @ModelAttribute Niveau niveau) {
		Diplome parent_diplome = diplomeService.saveDiplomeNiveau(diplome_id, niveau);

		ModelAndView mav = new ModelAndView();
		mav.addObject("diplome_id", diplome_id);
		mav.addObject("diplome", parent_diplome);
		mav.setViewName("diplome/viewDiplome.jsp");

		return mav;
	}

	/**
	 * Edit an existing Diplome entity
	 * 
	 */
	@RequestMapping("/editDiplome")
	public ModelAndView editDiplome(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diplome", diplomeDAO.findDiplomeByPrimaryKey(idKey));
		mav.setViewName("diplome/editDiplome.jsp");

		return mav;
	}

	/**
	 * Delete an existing Ecole entity
	 * 
	 */
	@RequestMapping("/deleteDiplomeEcole")
	public ModelAndView deleteDiplomeEcole(@RequestParam Integer diplome_id, @RequestParam Integer related_ecole_id) {
		ModelAndView mav = new ModelAndView();

		Diplome diplome = diplomeService.deleteDiplomeEcole(diplome_id, related_ecole_id);

		mav.addObject("diplome_id", diplome_id);
		mav.addObject("diplome", diplome);
		mav.setViewName("diplome/viewDiplome.jsp");

		return mav;
	}

	/**
	 * Create a new Diplome entity
	 * 
	 */
	@RequestMapping("/newDiplome")
	public ModelAndView newDiplome() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("diplome", new Diplome());
		mav.addObject("newFlag", true);
		mav.setViewName("diplome/editDiplome.jsp");

		return mav;
	}

	/**
	 * Create a new Niveau entity
	 * 
	 */
	@RequestMapping("/newDiplomeNiveau")
	public ModelAndView newDiplomeNiveau(@RequestParam Integer diplome_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("diplome_id", diplome_id);
		mav.addObject("niveau", new Niveau());
		mav.addObject("newFlag", true);
		mav.setViewName("diplome/niveau/editNiveau.jsp");

		return mav;
	}

	/**
	 * Select the child Niveau entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteDiplomeNiveau")
	public ModelAndView confirmDeleteDiplomeNiveau(@RequestParam Integer diplome_id, @RequestParam Integer related_niveau_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("niveau", niveauDAO.findNiveauByPrimaryKey(related_niveau_id));
		mav.addObject("diplome_id", diplome_id);
		mav.setViewName("diplome/niveau/deleteNiveau.jsp");

		return mav;
	}

	/**
	 * Create a new Ecole entity
	 * 
	 */
	@RequestMapping("/newDiplomeEcole")
	public ModelAndView newDiplomeEcole(@RequestParam Integer diplome_id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("diplome_id", diplome_id);
		mav.addObject("ecole", new Ecole());
		mav.addObject("newFlag", true);
		mav.setViewName("diplome/ecole/editEcole.jsp");

		return mav;
	}
}