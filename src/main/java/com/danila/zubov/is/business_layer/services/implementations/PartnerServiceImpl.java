package com.danila.zubov.is.business_layer.services.implementations;

import com.danila.zubov.is.business_layer.services.interfaces.PartnerService;
import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.Partner;
import com.danila.zubov.is.data_access_layer.repository.PartnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerServiceImpl implements PartnerService {
    private final PartnerRepository partnerRepository;

    public PartnerServiceImpl(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    @Override
    public void add(Partner partner) {
        partnerRepository.save(partner);
    }

    @Override
    public void removeById(Long id) {
        partnerRepository.deleteById(id);
    }

    @Override
    public void update(Partner partner) {
        partnerRepository.save(partner);
    }

    @Override
    public List<Partner> getAll() {
        return partnerRepository.findAll();
    }

    @Override
    public Partner getById(Long id) throws BusinessLayerException {
        try {
            return partnerRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            throw new BusinessLayerException(e.getMessage());
        }
    }
}