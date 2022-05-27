package com.danila.zubov.is.data_access_layer.repository;

import com.danila.zubov.is.data_access_layer.entity.ServiceCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCompanyRepository extends JpaRepository<ServiceCompany, Long> {
}
