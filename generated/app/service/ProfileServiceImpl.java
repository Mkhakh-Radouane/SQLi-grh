package app.service;

import app.dao.CompteDAO;
import app.dao.DroitDAO;
import app.dao.ProfileDAO;

import app.domain.Compte;
import app.domain.Droit;
import app.domain.Profile;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Profile entities
 * 
 */

@Service("ProfileService")
@Transactional
public class ProfileServiceImpl implements ProfileService {

	/**
	 * DAO injected by Spring that manages Compte entities
	 * 
	 */
	@Autowired
	private CompteDAO compteDAO;

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
	 * Instantiates a new ProfileServiceImpl.
	 *
	 */
	public ProfileServiceImpl() {
	}

	/**
	 * Save an existing Compte entity
	 * 
	 */
	@Transactional
	public Profile saveProfileComptes(Integer id, Compte related_comptes) {
		Profile profile = profileDAO.findProfileByPrimaryKey(id, -1, -1);
		Compte existingcomptes = compteDAO.findCompteByPrimaryKey(related_comptes.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcomptes != null) {
			existingcomptes.setId(related_comptes.getId());
			existingcomptes.setLogin(related_comptes.getLogin());
			existingcomptes.setPassword(related_comptes.getPassword());
			existingcomptes.setEmail(related_comptes.getEmail());
			existingcomptes.setActivation(related_comptes.getActivation());
			related_comptes = existingcomptes;
		}

		related_comptes.setProfile(profile);
		profile.getComptes().add(related_comptes);
		related_comptes = compteDAO.store(related_comptes);
		compteDAO.flush();

		profile = profileDAO.store(profile);
		profileDAO.flush();

		return profile;
	}

	/**
	 * Save an existing Profile entity
	 * 
	 */
	@Transactional
	public void saveProfile(Profile profile) {
		Profile existingProfile = profileDAO.findProfileByPrimaryKey(profile.getId());

		if (existingProfile != null) {
			if (existingProfile != profile) {
				existingProfile.setId(profile.getId());
				existingProfile.setProfileField(profile.getProfileField());
			}
			profile = profileDAO.store(existingProfile);
		} else {
			profile = profileDAO.store(profile);
		}
		profileDAO.flush();
	}

	/**
	 * Save an existing Droit entity
	 * 
	 */
	@Transactional
	public Profile saveProfileDroits(Integer id, Droit related_droits) {
		Profile profile = profileDAO.findProfileByPrimaryKey(id, -1, -1);
		Droit existingdroits = droitDAO.findDroitByPrimaryKey(related_droits.getId());

		// copy into the existing record to preserve existing relationships
		if (existingdroits != null) {
			existingdroits.setId(related_droits.getId());
			existingdroits.setDroitField(related_droits.getDroitField());
			related_droits = existingdroits;
		} else {
			related_droits = droitDAO.store(related_droits);
			droitDAO.flush();
		}

		profile.getDroits().add(related_droits);
		related_droits.getProfiles().add(profile);
		profile = profileDAO.store(profile);
		profileDAO.flush();

		related_droits = droitDAO.store(related_droits);
		droitDAO.flush();

		return profile;
	}

	/**
	 * Return a count of all Profile entity
	 * 
	 */
	@Transactional
	public Integer countProfiles() {
		return ((Long) profileDAO.createQuerySingleResult("select count(o) from Profile o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Profile findProfileByPrimaryKey(Integer id) {
		return profileDAO.findProfileByPrimaryKey(id);
	}

	/**
	 * Delete an existing Droit entity
	 * 
	 */
	@Transactional
	public Profile deleteProfileDroits(Integer profile_id, Integer related_droits_id) {
		Profile profile = profileDAO.findProfileByPrimaryKey(profile_id, -1, -1);
		Droit related_droits = droitDAO.findDroitByPrimaryKey(related_droits_id, -1, -1);

		profile.getDroits().remove(related_droits);
		related_droits.getProfiles().remove(profile);
		profile = profileDAO.store(profile);
		profileDAO.flush();

		related_droits = droitDAO.store(related_droits);
		droitDAO.flush();

		droitDAO.remove(related_droits);
		droitDAO.flush();

		return profile;
	}

	/**
	 * Load an existing Profile entity
	 * 
	 */
	@Transactional
	public Set<Profile> loadProfiles() {
		return profileDAO.findAllProfiles();
	}

	/**
	 * Delete an existing Profile entity
	 * 
	 */
	@Transactional
	public void deleteProfile(Profile profile) {
		profileDAO.remove(profile);
		profileDAO.flush();
	}

	/**
	 * Delete an existing Compte entity
	 * 
	 */
	@Transactional
	public Profile deleteProfileComptes(Integer profile_id, Integer related_comptes_id) {
		Compte related_comptes = compteDAO.findCompteByPrimaryKey(related_comptes_id, -1, -1);

		Profile profile = profileDAO.findProfileByPrimaryKey(profile_id, -1, -1);

		related_comptes.setProfile(null);
		profile.getComptes().remove(related_comptes);

		compteDAO.remove(related_comptes);
		compteDAO.flush();

		return profile;
	}

	/**
	 * Return all Profile entity
	 * 
	 */
	@Transactional
	public List<Profile> findAllProfiles(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Profile>(profileDAO.findAllProfiles(startResult, maxRows));
	}
}
