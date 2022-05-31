package com.danila.zubov.is.business_layer.services.interfaces;

import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.Client;

import java.util.List;

public interface ClientService {
    void add(Client client);
    void removeById(Long id);
    void update(Client client);
    List<Client> getAll();
    Client getById(Long id) throws BusinessLayerException;
}
