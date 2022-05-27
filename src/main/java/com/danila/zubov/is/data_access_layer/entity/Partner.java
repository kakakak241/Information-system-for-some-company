package com.danila.zubov.is.data_access_layer.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "partner")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Partner {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partner partner = (Partner) o;
        return Objects.equals(id, partner.id) && Objects.equals(name, partner.name) && Objects.equals(mail, partner.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mail);
    }
}
