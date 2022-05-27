package com.danila.zubov.is.data_access_layer.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employee_skills")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeSkills {
    @Basic
    @Column(name = "id", nullable = false)
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_employee", nullable = false)
    private Long idEmployee;
    @Basic
    @Column(name = "id_skill", nullable = false)
    private Long idSkill;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeSkills that = (EmployeeSkills) o;
        return Objects.equals(id, that.id) && Objects.equals(idEmployee, that.idEmployee) && Objects.equals(idSkill, that.idSkill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idEmployee, idSkill);
    }
}
