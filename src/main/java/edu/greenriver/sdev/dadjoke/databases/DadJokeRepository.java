package edu.greenriver.sdev.dadjoke.databases;

import edu.greenriver.sdev.dadjoke.models.DadJoke;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadJokeRepository  extends JpaRepository<DadJoke, Integer> {

}
