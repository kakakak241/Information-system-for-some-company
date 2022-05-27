package com.danila.zubov.is.data_access_layer.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "client")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
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
    @Basic
    @Column(name = "country", nullable = true)
    private Long country;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName) && Objects.equals(birthdate, client.birthdate) && Objects.equals(age, client.age) && Objects.equals(mai, client.mai) && Objects.equals(country, client.country) && Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthdate, age, mai, country, id);
    }
}
