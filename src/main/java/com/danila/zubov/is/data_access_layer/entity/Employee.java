package com.danila.zubov.is.data_access_layer.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
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
    @Column(name = "mail", nullable = true, length = -1)
    private String mail;
    @Basic
    @Column(name = "post", nullable = true, length = -1)
    private String post;
    @OneToMany(mappedBy = "skill", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Skill> skills;
}
