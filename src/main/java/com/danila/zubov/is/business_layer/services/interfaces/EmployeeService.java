package com.danila.zubov.is.business_layer.services.interfaces;

import com.danila.zubov.is.business_layer.services.tools.BusinessLayerException;
import com.danila.zubov.is.data_access_layer.entity.Client;
import com.danila.zubov.is.data_access_layer.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee employee);
    void removeById(Long id);
    void update(Employee employee);
    List<Employee> getAll();
    Employee getById(Long id) throws BusinessLayerException;
}