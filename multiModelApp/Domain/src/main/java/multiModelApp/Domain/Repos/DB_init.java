package multiModelApp.Domain.Repos;

import multiModelApp.Domain.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
* this class is annotated as Component, so that SpringBoot is able to detect it
* in the component scan
* */
@Component
public class DB_init implements CommandLineRunner {

    private HumanRepo humanRepo;

    @Autowired
    public DB_init(HumanRepo humanRepo){
        this.humanRepo = humanRepo;
    }

    public void run(String... args) throws Exception {
        Human human1 = new Human("Ahmad");
        Human human2 = new Human("abdo");
        /* populate the h2 database */
        humanRepo.save(human1);
        humanRepo.save(human2);
    }
}
