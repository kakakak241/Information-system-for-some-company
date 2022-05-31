package com.danila.zubov.is.business_layer.services.interfaces;

import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.ServiceCompany;
import com.danila.zubov.is.data_access_layer.entity.Skill;

import java.util.List;

public interface SkillService {
    void add(Skill skill);
    void removeById(Long id);
    void update(Skill skill);
    List<Skill> getAll();
    Skill getById(Long id) throws BusinessLayerException;
}
