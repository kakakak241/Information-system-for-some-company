package com.danila.zubov.is.business_layer.services.implementations;

import com.danila.zubov.is.business_layer.services.interfaces.ClientService;
import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.Client;
import com.danila.zubov.is.data_access_layer.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public void add(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void removeById(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public void update(Client client) {
        clientRepository.save(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client getById(Long id) throws BusinessLayerException {
        try {
            return clientRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            throw new BusinessLayerException(e.getMessage());
        }
    }
}