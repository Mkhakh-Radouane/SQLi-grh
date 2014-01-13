package app.service.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import app.dao.ProfileDAO;
import app.domain.Profile;


public class IdToInstanceConverter implements Converter<String, Profile>{
    @Autowired
    ProfileDAO profiledao;
    public Profile convert(String id) {
        return this.profiledao.findProfileByPrimaryKey(Integer.parseInt(id));
    }
}