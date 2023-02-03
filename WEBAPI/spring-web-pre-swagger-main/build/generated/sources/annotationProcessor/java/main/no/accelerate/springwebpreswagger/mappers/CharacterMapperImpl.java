package no.accelerate.springwebpreswagger.mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import no.accelerate.springwebpreswagger.models.Character;
import no.accelerate.springwebpreswagger.models.Movie;
import no.accelerate.springwebpreswagger.models.dto.student.CharacterDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-03T06:25:42+0000",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class CharacterMapperImpl implements CharacterMapper {

    @Override
    public CharacterDTO characterToCharacterDTO(Character character) {
        if ( character == null ) {
            return null;
        }

        CharacterDTO characterDTO = new CharacterDTO();

        characterDTO.setCharacter_id( character.getCharacter_id() );
        characterDTO.setFull_name( character.getFull_name() );
        characterDTO.setAlias( character.getAlias() );
        characterDTO.setGender( character.getGender() );
        characterDTO.setPicture( character.getPicture() );
        Set<Movie> set = character.getMovies();
        if ( set != null ) {
            characterDTO.setMovies( new LinkedHashSet<Movie>( set ) );
        }

        return characterDTO;
    }

    @Override
    public Collection<CharacterDTO> characterToCharacterDTO(Collection<Character> characters) {
        if ( characters == null ) {
            return null;
        }

        Collection<CharacterDTO> collection = new ArrayList<CharacterDTO>( characters.size() );
        for ( Character character : characters ) {
            collection.add( characterToCharacterDTO( character ) );
        }

        return collection;
    }
}
