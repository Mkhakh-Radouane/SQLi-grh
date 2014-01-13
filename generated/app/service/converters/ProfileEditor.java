package app.service.converters;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import app.dao.ProfileDAO;
import app.domain.Profile;
import app.service.ProfileService;


public class ProfileEditor extends PropertyEditorSupport {
 @Autowired
    private final ProfileService profileService;
 
    public ProfileEditor(ProfileService profileService) {
        this.profileService = profileService;
    }
 
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Profile country = profileService.findProfileByPrimaryKey(Integer.parseInt(text));
        setValue(country);
    }
 
}