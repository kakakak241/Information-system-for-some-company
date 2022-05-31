package com.danila.zubov.is.business_layer.services.implementations;

import com.danila.zubov.is.business_layer.services.interfaces.SkillService;
import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.Skill;
import com.danila.zubov.is.data_access_layer.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {
    private final SkillRepository skillRepository;

    public SkillServiceImpl(SkillRepository skillRepository){
        this.skillRepository = skillRepository;
    }

    @Override
    public void add(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public void removeById(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public void update(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public List<Skill> getAll() {
        return skillRepository.findAll();
    }

    @Override
    public Skill getById(Long id) throws BusinessLayerException {
        try {
            return skillRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            throw new BusinessLayerException(e.getMessage());
        }
    }
}