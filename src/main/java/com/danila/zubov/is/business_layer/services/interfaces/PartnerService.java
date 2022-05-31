package com.danila.zubov.is.business_layer.services.interfaces;

import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.Client;
import com.danila.zubov.is.data_access_layer.entity.EmployeeSkills;
import com.danila.zubov.is.data_access_layer.entity.Partner;

import java.util.List;

public interface PartnerService {
    void add(Partner partner);
    void removeById(Long id);
    void update(Partner partner);
    List<Partner> getAll();
    Partner getById(Long id) throws BusinessLayerException;
}
