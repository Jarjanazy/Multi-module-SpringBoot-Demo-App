package multiModelApp.Services;

import multiModelApp.Domain.Human;
import multiModelApp.Domain.Repos.HumanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanService {
    private HumanRepo humanRepo;

    @Autowired
    public HumanService(HumanRepo humanRepo){
        this.humanRepo = humanRepo;
    }

    public List<Human> getAllHumans(){
        return humanRepo.findAll();
    }
}
