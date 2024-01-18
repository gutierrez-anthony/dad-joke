package edu.greenriver.sdev.dadjoke.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadJoke {
    @Id
    private int id;

    private String jokeText;
}
