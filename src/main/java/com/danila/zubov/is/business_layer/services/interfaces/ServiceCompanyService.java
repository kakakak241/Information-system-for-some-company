package com.danila.zubov.is.business_layer.services.interfaces;

import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.Client;
import com.danila.zubov.is.data_access_layer.entity.Partner;
import com.danila.zubov.is.data_access_layer.entity.ServiceCompany;

import java.util.List;

public interface ServiceCompanyService {
    void add(ServiceCompany serviceCompany);
    void removeById(Long id);
    void update(ServiceCompany serviceCompany);
    List<ServiceCompany> getAll();
    ServiceCompany getById(Long id) throws BusinessLayerException;
}
