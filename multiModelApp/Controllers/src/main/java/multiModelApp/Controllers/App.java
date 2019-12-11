package multiModelApp.Controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
* these annotations are used to inform Spring Boot of the location of our repos/Entities,
* as we didn't put the repos in the same package as the Spring Boot application
* */
@EnableJpaRepositories(basePackages = {"multiModelApp.Domain"})
@EntityScan(basePackages = {"multiModelApp.Domain"})
@ComponentScan(basePackages = {"multiModelApp.Services", "multiModelApp.Domain.Repos", "multiModelApp.Controllers"})
@SpringBootApplication
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class);

    }
}
