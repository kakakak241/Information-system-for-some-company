package com.danila.zubov.is.data_access_layer.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "client")
@Data
public class Client {
    @Basic
    @Column(name = "first_name", nullable = true, length = -1)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = true, length = -1)
    private String lastName;
    @Basic
    @Column(name = "birthdate", nullable = true)
    private Timestamp birthdate;
    @Basic
    @Column(name = "age", nullable = true)
    private Long age;
    @Basic
    @Column(name = "mai", nullable = true, length = -1)
    private String mai;
    @ManyToOne
    @JoinColumn(name = "country")
    private Country country;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
}
