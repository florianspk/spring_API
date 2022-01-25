package com.estiam.Estiam_SpringJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication @EnableJpaAuditing
public class EstiamSpringJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstiamSpringJavaApplication.class, args);
    }

}
