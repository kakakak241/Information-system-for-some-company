package com.danila.zubov.is.business_layer.services.interfaces;

import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.Client;
import com.danila.zubov.is.data_access_layer.entity.Country;

import java.util.List;

public interface CountryService {
    void add(Country country);
    void removeById(Long id);
    void update(Country country);
    List<Country> getAll();
    Country getById(Long id) throws BusinessLayerException;
}