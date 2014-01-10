package app.web;

import app.dao.CollaborateurDAO;
import app.dao.PosteDAO;
import app.dao.SalaireDAO;

import app.domain.Collaborateur;
import app.domain.Poste;
import app.domain.Salaire;

import app.service.SalaireService;

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
 * Spring MVC controller that handles CRUD requests for Salaire entities
 * 
 */

@Controller("SalaireController")
public class SalaireController {

	/**
	 * DAO injected by Spring that manages Collaborateur entities
	 * 
	 */
	@Autowired
	private CollaborateurDAO collaborateurDAO;

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
	 * Service injected by Spring that provides CRUD operations for Salaire entities
	 * 
	 */
	@Autowired
	private SalaireService salaireService;

	/**
	 * Create a new Salaire entity
	 * 
	 */
	@RequestMapping("/newSalaire")
	public ModelAndView newSalaire() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salaire", new Salaire());
		mav.addObject("newFlag", true);
		mav.setViewName("salaire/editSalaire.jsp");

		return mav;
	}

	/**
	 * View an existing Poste entity
	 * 
	 */
	@RequestMapping("/selectSalairePoste")
	public ModelAndView selectSalairePoste(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste, @RequestParam Integer poste_idPoste) {
		Poste poste = posteDAO.findPosteByPrimaryKey(poste_idPoste, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.addObject("poste", poste);
		mav.setViewName("salaire/poste/viewPoste.jsp");

		return mav;
	}

	/**
	 * Select an existing Salaire entity
	 * 
	 */
	@RequestMapping("/selectSalaire")
	public ModelAndView selectSalaire(@RequestParam Integer idKey, @RequestParam Integer collaborateurMatriculeKey, @RequestParam Integer posteIdPosteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salaire", salaireDAO.findSalaireByPrimaryKey(idKey, collaborateurMatriculeKey, posteIdPosteKey));
		mav.setViewName("salaire/viewSalaire.jsp");

		return mav;
	}

	/**
	 * Edit an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/editSalaireCollaborateur")
	public ModelAndView editSalaireCollaborateur(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste, @RequestParam Integer collaborateur_matricule) {
		Collaborateur collaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(collaborateur_matricule, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.addObject("collaborateur", collaborateur);
		mav.setViewName("salaire/collaborateur/editCollaborateur.jsp");

		return mav;
	}

	/**
	 * Delete an existing Salaire entity
	 * 
	 */
	@RequestMapping("/deleteSalaire")
	public String deleteSalaire(@RequestParam Integer idKey, @RequestParam Integer collaborateurMatriculeKey, @RequestParam Integer posteIdPosteKey) {
		Salaire salaire = salaireDAO.findSalaireByPrimaryKey(idKey, collaborateurMatriculeKey, posteIdPosteKey);
		salaireService.deleteSalaire(salaire);
		return "forward:/indexSalaire";
	}

	/**
	 * Create a new Poste entity
	 * 
	 */
	@RequestMapping("/newSalairePoste")
	public ModelAndView newSalairePoste(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.addObject("poste", new Poste());
		mav.addObject("newFlag", true);
		mav.setViewName("salaire/poste/editPoste.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Salaire entities
	 * 
	 */
	public String indexSalaire() {
		return "redirect:/indexSalaire";
	}

	/**
	 * Create a new Collaborateur entity
	 * 
	 */
	@RequestMapping("/newSalaireCollaborateur")
	public ModelAndView newSalaireCollaborateur(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.addObject("collaborateur", new Collaborateur());
		mav.addObject("newFlag", true);
		mav.setViewName("salaire/collaborateur/editCollaborateur.jsp");

		return mav;
	}

	/**
	 * Delete an existing Poste entity
	 * 
	 */
	@RequestMapping("/deleteSalairePoste")
	public ModelAndView deleteSalairePoste(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste, @RequestParam Integer related_poste_idPoste) {
		ModelAndView mav = new ModelAndView();

		Salaire salaire = salaireService.deleteSalairePoste(salaire_id, salaire_collaborateurMatricule, salaire_posteIdPoste, related_poste_idPoste);

		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.addObject("salaire", salaire);
		mav.setViewName("salaire/viewSalaire.jsp");

		return mav;
	}

	/**
	 * Select the child Poste entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteSalairePoste")
	public ModelAndView confirmDeleteSalairePoste(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste, @RequestParam Integer related_poste_idPoste) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("poste", posteDAO.findPosteByPrimaryKey(related_poste_idPoste));
		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.setViewName("salaire/poste/deletePoste.jsp");

		return mav;
	}

	/**
	 * Save an existing Poste entity
	 * 
	 */
	@RequestMapping("/saveSalairePoste")
	public ModelAndView saveSalairePoste(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste, @ModelAttribute Poste poste) {
		Salaire parent_salaire = salaireService.saveSalairePoste(salaire_id, salaire_collaborateurMatricule, salaire_posteIdPoste, poste);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.addObject("salaire", parent_salaire);
		mav.setViewName("salaire/viewSalaire.jsp");

		return mav;
	}

	/**
	 * Delete an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/deleteSalaireCollaborateur")
	public ModelAndView deleteSalaireCollaborateur(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste, @RequestParam Integer related_collaborateur_matricule) {
		ModelAndView mav = new ModelAndView();

		Salaire salaire = salaireService.deleteSalaireCollaborateur(salaire_id, salaire_collaborateurMatricule, salaire_posteIdPoste, related_collaborateur_matricule);

		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.addObject("salaire", salaire);
		mav.setViewName("salaire/viewSalaire.jsp");

		return mav;
	}

	/**
	 * View an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/selectSalaireCollaborateur")
	public ModelAndView selectSalaireCollaborateur(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste, @RequestParam Integer collaborateur_matricule) {
		Collaborateur collaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(collaborateur_matricule, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.addObject("collaborateur", collaborateur);
		mav.setViewName("salaire/collaborateur/viewCollaborateur.jsp");

		return mav;
	}

	/**
	 * Show all Poste entities by Salaire
	 * 
	 */
	@RequestMapping("/listSalairePoste")
	public ModelAndView listSalairePoste(@RequestParam Integer idKey, @RequestParam Integer collaborateurMatriculeKey, @RequestParam Integer posteIdPosteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salaire", salaireDAO.findSalaireByPrimaryKey(idKey, collaborateurMatriculeKey, posteIdPosteKey));
		mav.setViewName("salaire/poste/listPoste.jsp");

		return mav;
	}

	/**
	 * Save an existing Collaborateur entity
	 * 
	 */
	@RequestMapping("/saveSalaireCollaborateur")
	public ModelAndView saveSalaireCollaborateur(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste, @ModelAttribute Collaborateur collaborateur) {
		Salaire parent_salaire = salaireService.saveSalaireCollaborateur(salaire_id, salaire_collaborateurMatricule, salaire_posteIdPoste, collaborateur);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.addObject("salaire", parent_salaire);
		mav.setViewName("salaire/viewSalaire.jsp");

		return mav;
	}

	/**
	 * Select the child Collaborateur entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteSalaireCollaborateur")
	public ModelAndView confirmDeleteSalaireCollaborateur(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste, @RequestParam Integer related_collaborateur_matricule) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("collaborateur", collaborateurDAO.findCollaborateurByPrimaryKey(related_collaborateur_matricule));
		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.setViewName("salaire/collaborateur/deleteCollaborateur.jsp");

		return mav;
	}

	/**
	 * Show all Collaborateur entities by Salaire
	 * 
	 */
	@RequestMapping("/listSalaireCollaborateur")
	public ModelAndView listSalaireCollaborateur(@RequestParam Integer idKey, @RequestParam Integer collaborateurMatriculeKey, @RequestParam Integer posteIdPosteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salaire", salaireDAO.findSalaireByPrimaryKey(idKey, collaborateurMatriculeKey, posteIdPosteKey));
		mav.setViewName("salaire/collaborateur/listCollaborateur.jsp");

		return mav;
	}

	/**
	 * Show all Salaire entities
	 * 
	 */
	@RequestMapping("/indexSalaire")
	public ModelAndView listSalaires() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salaires", salaireService.loadSalaires());

		mav.setViewName("salaire/listSalaires.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/salaireController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Poste entity
	 * 
	 */
	@RequestMapping("/editSalairePoste")
	public ModelAndView editSalairePoste(@RequestParam Integer salaire_id, @RequestParam Integer salaire_collaborateurMatricule, @RequestParam Integer salaire_posteIdPoste, @RequestParam Integer poste_idPoste) {
		Poste poste = posteDAO.findPosteByPrimaryKey(poste_idPoste, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("salaire_id", salaire_id);
		mav.addObject("salaire_collaborateurMatricule", salaire_collaborateurMatricule);
		mav.addObject("salaire_posteIdPoste", salaire_posteIdPoste);
		mav.addObject("poste", poste);
		mav.setViewName("salaire/poste/editPoste.jsp");

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
	 * Save an existing Salaire entity
	 * 
	 */
	@RequestMapping("/saveSalaire")
	public String saveSalaire(@ModelAttribute Salaire salaire) {
		salaireService.saveSalaire(salaire);
		return "forward:/indexSalaire";
	}

	/**
	 * Edit an existing Salaire entity
	 * 
	 */
	@RequestMapping("/editSalaire")
	public ModelAndView editSalaire(@RequestParam Integer idKey, @RequestParam Integer collaborateurMatriculeKey, @RequestParam Integer posteIdPosteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salaire", salaireDAO.findSalaireByPrimaryKey(idKey, collaborateurMatriculeKey, posteIdPosteKey));
		mav.setViewName("salaire/editSalaire.jsp");

		return mav;
	}

	/**
	 * Select the Salaire entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteSalaire")
	public ModelAndView confirmDeleteSalaire(@RequestParam Integer idKey, @RequestParam Integer collaborateurMatriculeKey, @RequestParam Integer posteIdPosteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("salaire", salaireDAO.findSalaireByPrimaryKey(idKey, collaborateurMatriculeKey, posteIdPosteKey));
		mav.setViewName("salaire/deleteSalaire.jsp");

		return mav;
	}
}