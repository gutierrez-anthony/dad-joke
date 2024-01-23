package edu.greenriver.sdev.dadjoke.services;

import edu.greenriver.sdev.dadjoke.databases.DadJokeRepository;
import edu.greenriver.sdev.dadjoke.models.DadJoke;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadJokeService {

    private DadJokeRepository repository;

    public DadJokeService(DadJokeRepository repository) {
        this.repository = repository;
    }

    public List<DadJoke> getAll() {
        return repository.findAll();
    }

    public void addDadJoke(DadJoke dadJoke) {
        repository.save(dadJoke);
    }

    public DadJoke updateJoke(int id, String jokeText) {
        DadJoke currentDadJoke = repository.findById(id).orElseThrow();

        currentDadJoke.setJokeText(jokeText);
        return repository.save(currentDadJoke);
    }

    public void deleteDadJoke(int id) {
        repository.delete(repository.findById(id).orElseThrow());
    }
}
