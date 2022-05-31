package com.danila.zubov.is.business_layer.services.implementations;

import com.danila.zubov.is.business_layer.services.interfaces.CountryService;
import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.Country;
import com.danila.zubov.is.data_access_layer.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void add(Country country) {
        countryRepository.save(country);
    }

    @Override
    public void removeById(Long id) {
        countryRepository.deleteById(id);
    }

    @Override
    public void update(Country country) {
        countryRepository.save(country);
    }

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country getById(Long id) throws BusinessLayerException {
        try {
            return countryRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            throw new BusinessLayerException(e.getMessage());
        }
    }
}
