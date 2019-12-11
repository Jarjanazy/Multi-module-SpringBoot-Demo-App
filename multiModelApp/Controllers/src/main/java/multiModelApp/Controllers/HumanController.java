package multiModelApp.Controllers;


import multiModelApp.Domain.Human;
import multiModelApp.Services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HumanController {

    private HumanService humanService;

    @Autowired
    public HumanController(HumanService humanService){
        this.humanService = humanService;
    }

    @GetMapping("/humans")
    public List<Human> getAllHumans(){
        return humanService.getAllHumans();

    }
}
