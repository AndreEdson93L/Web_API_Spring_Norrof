package no.accelerate.springwebpreswagger.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//import no.accelerate.springwebpreswagger.models.enumerators.Gender;
import java.util.Set;

@Entity
@Getter
@Setter
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int character_id;
    @Column(length = 50, nullable = false)
    private String full_name;
    @Column(length = 50, nullable = true)
    private String alias;
    @Column(length = 20, nullable = false)
    private String gender;
    @Column(length = 250, nullable = true)
    private String picture;

    @JsonIgnore
    @ManyToMany(mappedBy = "characters")
    private Set<Movie> movies;
}

