package com.danila.zubov.is.business_layer.services.implementations;

import com.danila.zubov.is.business_layer.services.interfaces.ServiceCompanyService;
import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.ServiceCompany;
import com.danila.zubov.is.data_access_layer.repository.ServiceCompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCompanyServiceImpl implements ServiceCompanyService {
    private final ServiceCompanyRepository serviceCompanyRepository;

    public ServiceCompanyServiceImpl(ServiceCompanyRepository serviceCompanyRepository) {
        this.serviceCompanyRepository = serviceCompanyRepository;
    }
    @Override
    public void add(ServiceCompany serviceCompany) {
        serviceCompanyRepository.save(serviceCompany);
    }

    @Override
    public void removeById(Long id) {
        serviceCompanyRepository.deleteById(id);
    }

    @Override
    public void update(ServiceCompany serviceCompany) {
        serviceCompanyRepository.save(serviceCompany);
    }

    @Override
    public List<ServiceCompany> getAll() {
        return serviceCompanyRepository.findAll();
    }

    @Override
    public ServiceCompany getById(Long id) throws BusinessLayerException {
        try {
            return serviceCompanyRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            throw new BusinessLayerException(e.getMessage());
        }
    }
}
