package no.accelerate.springwebpreswagger.mappers;

import no.accelerate.springwebpreswagger.models.Character;
import no.accelerate.springwebpreswagger.models.dto.student.CharacterDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface CharacterMapper {

    @Mapping(target = "character_id", source = "character.character_id")
    @Mapping(target = "full_name", source = "character.full_name")
    @Mapping(target = "alias", source = "character.alias")
    @Mapping(target = "gender", source = "character.gender")
    @Mapping(target = "picture", source = "character.picture")
    @Mapping(target = "movies", source = "character.movies")
    CharacterDTO  characterToCharacterDTO(Character character);

    Collection<CharacterDTO> characterToCharacterDTO(Collection<Character> characters);

    @Named(value = "moviesToMoviesId")
    default Set<Integer> map(Set<Character> value) {
        if(value == null)
            return null;
        return value.stream()
                .map(s -> s.getCharacter_id())
                .collect(Collectors.toSet());
    }
}
