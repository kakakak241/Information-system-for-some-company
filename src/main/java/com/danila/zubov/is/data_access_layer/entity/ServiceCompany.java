package com.danila.zubov.is.data_access_layer.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "service_company")
@Data
public class ServiceCompany {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "name", nullable = true, length = -1)
    private String name;
    @Basic
    @Column(name = "mail", nullable = true, length = -1)
    private String mail;
}