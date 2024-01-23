package edu.greenriver.sdev.dadjoke.controllers;

import edu.greenriver.sdev.dadjoke.models.DadJoke;
import edu.greenriver.sdev.dadjoke.services.DadJokeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DadJokeController {
    public DadJokeService service;

    public DadJokeController(DadJokeService service) {
        this.service = service;
    }

    @GetMapping("/jokes")
    public List<DadJoke> getDadJokes(){
        return service.getAll();
    }

    @PostMapping("/jokes")
    public void addDadJoke(@RequestBody DadJoke dadJoke){
        service.addDadJoke(dadJoke);
    }

    @PutMapping("/jokes/{id}")
    public DadJoke updateJoke(@PathVariable int id,
                              @RequestBody String updatedJoke){
        return service.updateJoke(id, updatedJoke);
    }

    @DeleteMapping("/jokes/{id}")
    public void deleteDadJoke(@PathVariable int id){
        service.deleteDadJoke(id);
    }
}
