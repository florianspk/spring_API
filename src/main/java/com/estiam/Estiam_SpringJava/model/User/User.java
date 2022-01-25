package com.estiam.Estiam_SpringJava.model.User;

import java.util.Date;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Table (name = "user")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 50)
    private String firstName;
    @Column(length = 50)
    private String lastName;
    @Column(nullable = false,unique = true)
    private String email;
    private String login;
    @Column(nullable = false)
    private String password;
    private boolean actif;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('MONSIEUR', 'MADAME', 'MADEMOISELLE')")
    private Civilite civilite;
    @Temporal(TemporalType.DATE)
    Date dateDeNaissance;
    @Temporal(TemporalType.TIME)
    Date heureDeReveil;
    @Temporal(TemporalType.TIMESTAMP)
    Date derniereConnexion;

    public User() {
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = Math.toIntExact(id);
    }

    public int getId() {
        return id;
    }
}
