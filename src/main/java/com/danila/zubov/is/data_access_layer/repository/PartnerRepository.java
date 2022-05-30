package com.danila.zubov.is.data_access_layer.repository;


import com.danila.zubov.is.data_access_layer.entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {
}
