package no.accelerate.springwebpreswagger.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//import no.accelerate.springwebpreswagger.models.enumerators.FranchiseName;

import java.util.Set;

@Entity
@Getter
@Setter
public class Franchise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int franchise_id;
    @Column(length = 50, nullable = false)
    private String franchise_name;
    @Column(length = 250, nullable = false)
    private String description;
    @JsonIgnore
    @OneToMany(mappedBy = "movie_id")
    private Set<Movie> movies;
}

