package com.danila.zubov.is.business_layer.services.interfaces;

import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.Client;
import com.danila.zubov.is.data_access_layer.entity.EmployeeSkills;

import java.util.List;

public interface EmployeeSkillsService {
    void add(EmployeeSkills employeeSkills);
    void removeById(Long id);
    void update(EmployeeSkills employeeSkills);
    List<EmployeeSkills> getAll();
    EmployeeSkills getById(Long id) throws BusinessLayerException;
}