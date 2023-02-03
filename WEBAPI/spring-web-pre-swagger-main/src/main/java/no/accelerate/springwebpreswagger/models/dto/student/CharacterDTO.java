package no.accelerate.springwebpreswagger.models.dto.student;

import lombok.Getter;
import lombok.Setter;
import no.accelerate.springwebpreswagger.models.Movie;
//import no.accelerate.springwebpreswagger.models.enumerators.Gender;

import java.util.Set;

@Getter
@Setter
public class CharacterDTO {
    private Integer character_id;
    private String full_name;
    private String alias;
    private String gender;
    private String picture;
    private Set<Movie> movies;

}
