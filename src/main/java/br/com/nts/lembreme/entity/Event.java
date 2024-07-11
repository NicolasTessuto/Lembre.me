package br.com.nts.lembreme.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime remindDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
