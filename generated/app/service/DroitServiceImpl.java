package app.service;

import app.dao.DroitDAO;
import app.dao.ProfileDAO;

import app.domain.Droit;
import app.domain.Profile;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Droit entities
 * 
 */

@Service("DroitService")
@Transactional
public class DroitServiceImpl implements DroitService {

	/**
	 * DAO injected by Spring that manages Droit entities
	 * 
	 */
	@Autowired
	private DroitDAO droitDAO;

	/**
	 * DAO injected by Spring that manages Profile entities
	 * 
	 */
	@Autowired
	private ProfileDAO profileDAO;

	/**
	 * Instantiates a new DroitServiceImpl.
	 *
	 */
	public DroitServiceImpl() {
	}

	/**
	 * Delete an existing Droit entity
	 * 
	 */
	@Transactional
	public void deleteDroit(Droit droit) {
		droitDAO.remove(droit);
		droitDAO.flush();
	}

	/**
	 * Return a count of all Droit entity
	 * 
	 */
	@Transactional
	public Integer countDroits() {
		return ((Long) droitDAO.createQuerySingleResult("select count(o) from Droit o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Droit findDroitByPrimaryKey(Integer id) {
		return droitDAO.findDroitByPrimaryKey(id);
	}

	/**
	 * Load an existing Droit entity
	 * 
	 */
	@Transactional
	public Set<Droit> loadDroits() {
		return droitDAO.findAllDroits();
	}

	/**
	 * Return all Droit entity
	 * 
	 */
	@Transactional
	public List<Droit> findAllDroits(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Droit>(droitDAO.findAllDroits(startResult, maxRows));
	}

	/**
	 * Save an existing Profile entity
	 * 
	 */
	@Transactional
	public Droit saveDroitProfiles(Integer id, Profile related_profiles) {
		Droit droit = droitDAO.findDroitByPrimaryKey(id, -1, -1);
		Profile existingprofiles = profileDAO.findProfileByPrimaryKey(related_profiles.getId());

		// copy into the existing record to preserve existing relationships
		if (existingprofiles != null) {
			existingprofiles.setId(related_profiles.getId());
			existingprofiles.setProfileField(related_profiles.getProfileField());
			related_profiles = existingprofiles;
		} else {
			related_profiles = profileDAO.store(related_profiles);
			profileDAO.flush();
		}

		related_profiles.getDroits().add(droit);
		droit.getProfiles().add(related_profiles);
		related_profiles = profileDAO.store(related_profiles);
		profileDAO.flush();

		droit = droitDAO.store(droit);
		droitDAO.flush();

		return droit;
	}

	/**
	 * Save an existing Droit entity
	 * 
	 */
	@Transactional
	public void saveDroit(Droit droit) {
		Droit existingDroit = droitDAO.findDroitByPrimaryKey(droit.getId());

		if (existingDroit != null) {
			if (existingDroit != droit) {
				existingDroit.setId(droit.getId());
				existingDroit.setDroitField(droit.getDroitField());
			}
			droit = droitDAO.store(existingDroit);
		} else {
			droit = droitDAO.store(droit);
		}
		droitDAO.flush();
	}

	/**
	 * Delete an existing Profile entity
	 * 
	 */
	@Transactional
	public Droit deleteDroitProfiles(Integer droit_id, Integer related_profiles_id) {
		Profile related_profiles = profileDAO.findProfileByPrimaryKey(related_profiles_id, -1, -1);

		Droit droit = droitDAO.findDroitByPrimaryKey(droit_id, -1, -1);

		related_profiles.getDroits().remove(droit);
		droit.getProfiles().remove(related_profiles);

		profileDAO.remove(related_profiles);
		profileDAO.flush();

		return droit;
	}
}
