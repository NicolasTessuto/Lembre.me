package br.com.nts.lembreme.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String document;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Event> events;

}
