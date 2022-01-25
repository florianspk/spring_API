package com.estiam.Estiam_SpringJava.model.Etudiant;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Etudiant")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String firstName;
    @Column(length = 50)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    private String login;
    @Column(nullable = false)
    private String password;
    @Temporal(TemporalType.DATE)
    Date dateDeNaissance;
    @Temporal(TemporalType.TIME)
    Date heureDeReveil;
    @Temporal(TemporalType.TIMESTAMP)
    Date derniereConnexion;

}


