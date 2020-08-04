package com.ammarnaji.booklibraryapi;

import com.ammarnaji.booklibraryapi.dao.UsersRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackageClasses = UsersRepository.class)
public class ABookLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ABookLibraryApplication.class, args);
        System.out.println("Username: root \nPassword: toor");
    }

}
