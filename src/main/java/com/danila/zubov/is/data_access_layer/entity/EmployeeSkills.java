package com.danila.zubov.is.data_access_layer.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employee_skills")
@Data
public class EmployeeSkills {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "id_skill")
    private Skill skill;
}
