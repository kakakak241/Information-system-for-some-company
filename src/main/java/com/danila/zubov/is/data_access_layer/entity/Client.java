package com.danila.zubov.is.data_access_layer.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
@Table(name = "client")
@Data
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(min = 2, max = 35)
    @Column(name = "first_name", nullable = false, length = 35)
    private String firstName;

    @Size(min = 2, max = 35)
    @Column(name = "last_name", nullable = false, length = 35)
    private String lastName;

    @Column(name = "birthdate", nullable = false)
    private Timestamp birthdate;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Size(min = 3, max = 320)
    @Column(name = "mail", nullable = false, length = 320)
    private String mail;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country")
    private Country country;

}
