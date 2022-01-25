package com.estiam.Estiam_SpringJava.model.Dao;

import com.estiam.Estiam_SpringJava.model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
