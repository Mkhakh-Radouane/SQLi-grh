package app.web;

import app.dao.PosteDAO;
import app.dao.SalaireDAO;

import app.domain.Poste;
import app.domain.Salaire;

import app.service.PosteService;

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
 * Spring MVC controller that handles CRUD requests for Poste entities
 * 
 */

@Controller("PosteController")
public class PosteController {

	/**
	 * DAO injected by Spring that manages Poste entities
	 * 
	 */
	@Autowired
	private PosteDAO posteDAO;

	/**
	 * DAO injected by Spring that manages Salaire entities
	 * 
	 */
	@Autowired
	private SalaireDAO salaireDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Poste entities
	 * 
	 */
	@Autowired
	private PosteService posteService;

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
	 * Edit an existing Poste entity
	 * 
	 */
	@RequestMapping("/editPoste")
	public ModelAndView editPoste(@RequestParam Integer idPosteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("poste", posteDAO.findPosteByPrimaryKey(idPosteKey));
		mav.setViewName("poste/editPoste.jsp");

		return mav;
	}

	/**
	 * Create a new Poste entity
	 * 
	 */
	@RequestMapping("/newPoste")
	public ModelAndView newPoste() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("poste", new Poste());
		mav.addObject("newFlag", true);
		mav.setViewName("poste/editPoste.jsp");

		return mav;
	}

	/**
	 * Show all Salaire entities by Poste
	 * 
	 */
	@RequestMapping("/listPosteSalaires")
	public ModelAndView listPosteSalaires(@RequestParam Integer idPosteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("poste", posteDAO.findPosteByPrimaryKey(idPosteKey));
		mav.setViewName("poste/salaires/listSalaires.jsp");

		return mav;
	}

	/**
	 * Create a new Salaire entity
	 * 
	 */
	@RequestMapping("/newPosteSalaires")
	public ModelAndView newPosteSalaires(@RequestParam Integer poste_idPoste) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("poste_idPoste", poste_idPoste);
		mav.addObject("salaire", new Salaire());
		mav.addObject("newFlag", true);
		mav.setViewName("poste/salaires/editSalaires.jsp");

		return mav;
	}

	/**
	 * Save an existing Poste entity
	 * 
	 */
	@RequestMapping("/savePoste")
	public String savePoste(@ModelAttribute Poste poste) {
		posteService.savePoste(poste);
		return "forward:/indexPoste";
	}

	/**
	 * Select the child Salaire entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePosteSalaires")
	public ModelAndView confirmDeletePosteSalaires(@RequestParam Integer poste_idPoste, @RequestParam Integer related_salaires_id, @RequestParam Integer related_salaires_collaborateurMatricule, @RequestParam Integer related_salaires_posteIdPoste) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salaire", salaireDAO.findSalaireByPrimaryKey(related_salaires_id, related_salaires_collaborateurMatricule, related_salaires_posteIdPoste));
		mav.addObject("poste_idPoste", poste_idPoste);
		mav.setViewName("poste/salaires/deleteSalaires.jsp");

		return mav;
	}

	/**
	 * Select the Poste entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePoste")
	public ModelAndView confirmDeletePoste(@RequestParam Integer idPosteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("poste", posteDAO.findPosteByPrimaryKey(idPosteKey));
		mav.setViewName("poste/deletePoste.jsp");

		return mav;
	}

	/**
	 * Save an existing Salaire entity
	 * 
	 */
	@RequestMapping("/savePosteSalaires")
	public ModelAndView savePosteSalaires(@RequestParam Integer poste_idPoste, @ModelAttribute Salaire salaires) {
		Poste parent_poste = posteService.savePosteSalaires(poste_idPoste, salaires);

		ModelAndView mav = new ModelAndView();
		mav.addObject("poste_idPoste", poste_idPoste);
		mav.addObject("poste", parent_poste);
		mav.setViewName("poste/viewPoste.jsp");

		return mav;
	}

	/**
	 * Edit an existing Salaire entity
	 * 
	 */
	@RequestMapping("/editPosteSalaires")
	public ModelAndView editPosteSalaires(@RequestParam Integer poste_idPoste, @RequestParam Integer salaires_id, @RequestParam Integer salaires_collaborateurMatricule, @RequestParam Integer salaires_posteIdPoste) {
		Salaire salaire = salaireDAO.findSalaireByPrimaryKey(salaires_id, salaires_collaborateurMatricule, salaires_posteIdPoste, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("poste_idPoste", poste_idPoste);
		mav.addObject("salaire", salaire);
		mav.setViewName("poste/salaires/editSalaires.jsp");

		return mav;
	}

	/**
	 * Show all Poste entities
	 * 
	 */
	@RequestMapping("/indexPoste")
	public ModelAndView listPostes() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("postes", posteService.loadPostes());

		mav.setViewName("poste/listPostes.jsp");

		return mav;
	}

	/**
	 * Delete an existing Salaire entity
	 * 
	 */
	@RequestMapping("/deletePosteSalaires")
	public ModelAndView deletePosteSalaires(@RequestParam Integer poste_idPoste, @RequestParam Integer related_salaires_id, @RequestParam Integer related_salaires_collaborateurMatricule, @RequestParam Integer related_salaires_posteIdPoste) {
		ModelAndView mav = new ModelAndView();

		Poste poste = posteService.deletePosteSalaires(poste_idPoste, related_salaires_id, related_salaires_collaborateurMatricule, related_salaires_posteIdPoste);

		mav.addObject("poste_idPoste", poste_idPoste);
		mav.addObject("poste", poste);
		mav.setViewName("poste/viewPoste.jsp");

		return mav;
	}

	/**
	 * Delete an existing Poste entity
	 * 
	 */
	@RequestMapping("/deletePoste")
	public String deletePoste(@RequestParam Integer idPosteKey) {
		Poste poste = posteDAO.findPosteByPrimaryKey(idPosteKey);
		posteService.deletePoste(poste);
		return "forward:/indexPoste";
	}

	/**
	 * Entry point to show all Poste entities
	 * 
	 */
	public String indexPoste() {
		return "redirect:/indexPoste";
	}

	/**
	 * Select an existing Poste entity
	 * 
	 */
	@RequestMapping("/selectPoste")
	public ModelAndView selectPoste(@RequestParam Integer idPosteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("poste", posteDAO.findPosteByPrimaryKey(idPosteKey));
		mav.setViewName("poste/viewPoste.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/posteController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * View an existing Salaire entity
	 * 
	 */
	@RequestMapping("/selectPosteSalaires")
	public ModelAndView selectPosteSalaires(@RequestParam Integer poste_idPoste, @RequestParam Integer salaires_id, @RequestParam Integer salaires_collaborateurMatricule, @RequestParam Integer salaires_posteIdPoste) {
		Salaire salaire = salaireDAO.findSalaireByPrimaryKey(salaires_id, salaires_collaborateurMatricule, salaires_posteIdPoste, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("poste_idPoste", poste_idPoste);
		mav.addObject("salaire", salaire);
		mav.setViewName("poste/salaires/viewSalaires.jsp");

		return mav;
	}
}