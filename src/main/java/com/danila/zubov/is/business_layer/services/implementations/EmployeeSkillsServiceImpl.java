package com.danila.zubov.is.business_layer.services.implementations;

import com.danila.zubov.is.business_layer.services.interfaces.EmployeeSkillsService;
import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.EmployeeSkills;
import com.danila.zubov.is.data_access_layer.repository.EmployeeSkillsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSkillsServiceImpl implements EmployeeSkillsService {
    private final EmployeeSkillsRepository employeeSkillsRepository;

    public EmployeeSkillsServiceImpl(EmployeeSkillsRepository employeeSkillsRepository) {
        this.employeeSkillsRepository = employeeSkillsRepository;
    }

    @Override
    public void add(EmployeeSkills employeeSkills) {
        employeeSkillsRepository.save(employeeSkills);
    }

    @Override
    public void removeById(Long id) {
        employeeSkillsRepository.deleteById(id);
    }

    @Override
    public void update(EmployeeSkills employeeSkills) {
        employeeSkillsRepository.save(employeeSkills);
    }

    @Override
    public List<EmployeeSkills> getAll() {
        return employeeSkillsRepository.findAll();
    }

    @Override
    public EmployeeSkills getById(Long id) throws BusinessLayerException {
        try {
            return employeeSkillsRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            throw new BusinessLayerException(e.getMessage());
        }
    }
}