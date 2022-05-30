package com.danila.zubov.is.data_access_layer.repository;

import com.danila.zubov.is.data_access_layer.entity.Client;
import com.danila.zubov.is.data_access_layer.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
