package com.danila.zubov.is.data_access_layer.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "employee")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany(mappedBy = "skill", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Skill> skills;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(birthdate, employee.birthdate) && Objects.equals(age, employee.age) && Objects.equals(mail, employee.mail) && Objects.equals(post, employee.post) && Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthdate, age, mail, post, id);
    }
}
