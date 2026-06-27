package com.schoolms.schoolms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.schoolms.schoolms.Repository")
@EntityScan("com.schoolms.schoolms.Models")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class SchoolMsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchoolMsApplication.class, args);
    }
}