package com.danila.zubov.is.data_access_layer.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "partner")
@Data
public class Partner {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(min = 2, max = 250)
    @Column(name = "name", nullable = false, length = 250)
    private String name;

    @Size(min = 3, max = 320)
    @Column(name = "mail", nullable = false, length = 320)
    private String mail;

}
