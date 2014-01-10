package app.web;

import app.dao.BuDAO;
import app.dao.CollaborateurDAO;
import app.dao.SalaireDAO;

import app.domain.Bu;
import app.domain.Collaborateur;
import app.domain.Salaire;

import app.service.CollaborateurService;

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
 * Spring MVC controller that handles CRUD requests for Collaborateur entities
 * 
 */

@Controller("CollaborateurController")
public class CollaborateurController {

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
	 * DAO injected by Spring that manages Salaire entities
	 * 
	 */
	@Autowired
	private SalaireDAO salaireDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Collaborateur entities
	 * 
	 */
	@Autowired
	private CollaborateurService collaborateurService;

	/**
	 * Select an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/selectCollaborateur")
	public ModelAndView selectCollaborateur(@RequestParam Integer matriculeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("collaborateur", collaborateurDAO.findCollaborateurByPrimaryKey(matriculeKey));
		mav.setViewName("collaborateur/viewCollaborateur.jsp");

		return mav;
	}

	/**
	 * Delete an existing Bu entity
	 * 
	 */
	@RequestMapping("/deleteCollaborateurBu")
	public ModelAndView deleteCollaborateurBu(@RequestParam Integer collaborateur_matricule, @RequestParam Integer related_bu_id) {
		ModelAndView mav = new ModelAndView();

		Collaborateur collaborateur = collaborateurService.deleteCollaborateurBu(collaborateur_matricule, related_bu_id);

		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.addObject("collaborateur", collaborateur);
		mav.setViewName("collaborateur/viewCollaborateur.jsp");

		return mav;
	}

	/**
	 * Delete an existing Salaire entity
	 * 
	 */
	@RequestMapping("/deleteCollaborateurSalaires")
	public ModelAndView deleteCollaborateurSalaires(@RequestParam Integer collaborateur_matricule, @RequestParam Integer related_salaires_id, @RequestParam Integer related_salaires_collaborateurMatricule, @RequestParam Integer related_salaires_posteIdPoste) {
		ModelAndView mav = new ModelAndView();

		Collaborateur collaborateur = collaborateurService.deleteCollaborateurSalaires(collaborateur_matricule, related_salaires_id, related_salaires_collaborateurMatricule, related_salaires_posteIdPoste);

		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.addObject("collaborateur", collaborateur);
		mav.setViewName("collaborateur/viewCollaborateur.jsp");

		return mav;
	}

	/**
	 * Save an existing Salaire entity
	 * 
	 */
	@RequestMapping("/saveCollaborateurSalaires")
	public ModelAndView saveCollaborateurSalaires(@RequestParam Integer collaborateur_matricule, @ModelAttribute Salaire salaires) {
		Collaborateur parent_collaborateur = collaborateurService.saveCollaborateurSalaires(collaborateur_matricule, salaires);

		ModelAndView mav = new ModelAndView();
		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.addObject("collaborateur", parent_collaborateur);
		mav.setViewName("collaborateur/viewCollaborateur.jsp");

		return mav;
	}

	/**
	 * Select the child Salaire entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCollaborateurSalaires")
	public ModelAndView confirmDeleteCollaborateurSalaires(@RequestParam Integer collaborateur_matricule, @RequestParam Integer related_salaires_id, @RequestParam Integer related_salaires_collaborateurMatricule, @RequestParam Integer related_salaires_posteIdPoste) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salaire", salaireDAO.findSalaireByPrimaryKey(related_salaires_id, related_salaires_collaborateurMatricule, related_salaires_posteIdPoste));
		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.setViewName("collaborateur/salaires/deleteSalaires.jsp");

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
	 * Select the Collaborateur entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCollaborateur")
	public ModelAndView confirmDeleteCollaborateur(@RequestParam Integer matriculeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("collaborateur", collaborateurDAO.findCollaborateurByPrimaryKey(matriculeKey));
		mav.setViewName("collaborateur/deleteCollaborateur.jsp");

		return mav;
	}

	/**
	 * Save an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/saveCollaborateur")
	public String saveCollaborateur(@ModelAttribute Collaborateur collaborateur) {
		collaborateurService.saveCollaborateur(collaborateur);
		return "forward:/indexCollaborateur";
	}

	/**
	 * Show all Salaire entities by Collaborateur
	 * 
	 */
	@RequestMapping("/listCollaborateurSalaires")
	public ModelAndView listCollaborateurSalaires(@RequestParam Integer matriculeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("collaborateur", collaborateurDAO.findCollaborateurByPrimaryKey(matriculeKey));
		mav.setViewName("collaborateur/salaires/listSalaires.jsp");

		return mav;
	}

	/**
	 * Show all Bu entities by Collaborateur
	 * 
	 */
	@RequestMapping("/listCollaborateurBu")
	public ModelAndView listCollaborateurBu(@RequestParam Integer matriculeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("collaborateur", collaborateurDAO.findCollaborateurByPrimaryKey(matriculeKey));
		mav.setViewName("collaborateur/bu/listBu.jsp");

		return mav;
	}

	/**
	 * Edit an existing Salaire entity
	 * 
	 */
	@RequestMapping("/editCollaborateurSalaires")
	public ModelAndView editCollaborateurSalaires(@RequestParam Integer collaborateur_matricule, @RequestParam Integer salaires_id, @RequestParam Integer salaires_collaborateurMatricule, @RequestParam Integer salaires_posteIdPoste) {
		Salaire salaire = salaireDAO.findSalaireByPrimaryKey(salaires_id, salaires_collaborateurMatricule, salaires_posteIdPoste, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.addObject("salaire", salaire);
		mav.setViewName("collaborateur/salaires/editSalaires.jsp");

		return mav;
	}

	/**
	 * Select the child Bu entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteCollaborateurBu")
	public ModelAndView confirmDeleteCollaborateurBu(@RequestParam Integer collaborateur_matricule, @RequestParam Integer related_bu_id) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bu", buDAO.findBuByPrimaryKey(related_bu_id));
		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.setViewName("collaborateur/bu/deleteBu.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Collaborateur entities
	 * 
	 */
	public String indexCollaborateur() {
		return "redirect:/indexCollaborateur";
	}

	/**
	 */
	@RequestMapping("/collaborateurController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Collaborateur entity
	 * 
	 */
	@RequestMapping("/newCollaborateur")
	public ModelAndView newCollaborateur() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("collaborateur", new Collaborateur());
		mav.addObject("newFlag", true);
		mav.setViewName("collaborateur/editCollaborateur.jsp");

		return mav;
	}

	/**
	 * View an existing Bu entity
	 * 
	 */
	@RequestMapping("/selectCollaborateurBu")
	public ModelAndView selectCollaborateurBu(@RequestParam Integer collaborateur_matricule, @RequestParam Integer bu_id) {
		Bu bu = buDAO.findBuByPrimaryKey(bu_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.addObject("bu", bu);
		mav.setViewName("collaborateur/bu/viewBu.jsp");

		return mav;
	}

	/**
	 * Delete an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/deleteCollaborateur")
	public String deleteCollaborateur(@RequestParam Integer matriculeKey) {
		Collaborateur collaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(matriculeKey);
		collaborateurService.deleteCollaborateur(collaborateur);
		return "forward:/indexCollaborateur";
	}

	/**
	 * Edit an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/editCollaborateur")
	public ModelAndView editCollaborateur(@RequestParam Integer matriculeKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("collaborateur", collaborateurDAO.findCollaborateurByPrimaryKey(matriculeKey));
		mav.setViewName("collaborateur/editCollaborateur.jsp");

		return mav;
	}

	/**
	 * Edit an existing Bu entity
	 * 
	 */
	@RequestMapping("/editCollaborateurBu")
	public ModelAndView editCollaborateurBu(@RequestParam Integer collaborateur_matricule, @RequestParam Integer bu_id) {
		Bu bu = buDAO.findBuByPrimaryKey(bu_id, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.addObject("bu", bu);
		mav.setViewName("collaborateur/bu/editBu.jsp");

		return mav;
	}

	/**
	 * Create a new Bu entity
	 * 
	 */
	@RequestMapping("/newCollaborateurBu")
	public ModelAndView newCollaborateurBu(@RequestParam Integer collaborateur_matricule) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.addObject("bu", new Bu());
		mav.addObject("newFlag", true);
		mav.setViewName("collaborateur/bu/editBu.jsp");

		return mav;
	}

	/**
	 * View an existing Salaire entity
	 * 
	 */
	@RequestMapping("/selectCollaborateurSalaires")
	public ModelAndView selectCollaborateurSalaires(@RequestParam Integer collaborateur_matricule, @RequestParam Integer salaires_id, @RequestParam Integer salaires_collaborateurMatricule, @RequestParam Integer salaires_posteIdPoste) {
		Salaire salaire = salaireDAO.findSalaireByPrimaryKey(salaires_id, salaires_collaborateurMatricule, salaires_posteIdPoste, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.addObject("salaire", salaire);
		mav.setViewName("collaborateur/salaires/viewSalaires.jsp");

		return mav;
	}

	/**
	 * Show all Collaborateur entities
	 * 
	 */
	@RequestMapping("/indexCollaborateur")
	public ModelAndView listCollaborateurs() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("collaborateurs", collaborateurService.loadCollaborateurs());

		mav.setViewName("collaborateur/listCollaborateurs.jsp");

		return mav;
	}

	/**
	 * Save an existing Bu entity
	 * 
	 */
	@RequestMapping("/saveCollaborateurBu")
	public ModelAndView saveCollaborateurBu(@RequestParam Integer collaborateur_matricule, @ModelAttribute Bu bu) {
		Collaborateur parent_collaborateur = collaborateurService.saveCollaborateurBu(collaborateur_matricule, bu);

		ModelAndView mav = new ModelAndView();
		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.addObject("collaborateur", parent_collaborateur);
		mav.setViewName("collaborateur/viewCollaborateur.jsp");

		return mav;
	}

	/**
	 * Create a new Salaire entity
	 * 
	 */
	@RequestMapping("/newCollaborateurSalaires")
	public ModelAndView newCollaborateurSalaires(@RequestParam Integer collaborateur_matricule) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("collaborateur_matricule", collaborateur_matricule);
		mav.addObject("salaire", new Salaire());
		mav.addObject("newFlag", true);
		mav.setViewName("collaborateur/salaires/editSalaires.jsp");

		return mav;
	}
}