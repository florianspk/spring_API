package com.estiam.Estiam_SpringJava.model.Dao;

import com.estiam.Estiam_SpringJava.model.Etudiant.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantDao extends JpaRepository<Etudiant,Integer> {
}
