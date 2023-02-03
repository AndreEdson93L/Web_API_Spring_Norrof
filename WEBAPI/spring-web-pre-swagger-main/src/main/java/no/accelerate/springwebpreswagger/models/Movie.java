package no.accelerate.springwebpreswagger.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
//import no.accelerate.springwebpreswagger.models.enumerators.Genre;

import java.util.Set;

@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movie_id;
    @Column(length = 50, nullable = false)
    private String title;

    @Column(length = 20, nullable = false)
    private String genre;

    @Column(length = 20, nullable = false)
    private String release_year;
    @Column(length = 50, nullable = false)
    private String director;
    @Column(length = 250, nullable = true)
    private String picture;
    @Column(length = 250, nullable = true)
    private String trailer;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "franchise_id")
    private Franchise franchise_id;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "movie_character",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private Set<Character> characters;
}
