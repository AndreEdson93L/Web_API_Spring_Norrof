package no.accelerate.springwebpreswagger.services.character;

import no.accelerate.springwebpreswagger.exceptions.CharacterNotFoundException;
import no.accelerate.springwebpreswagger.models.Character;
import no.accelerate.springwebpreswagger.models.dto.student.CharacterDTO;
import no.accelerate.springwebpreswagger.services.CrudService;
import java.util.Collection;

public interface CharacterService extends CrudService<Character, Integer> {
        Collection<CharacterDTO> getAllCharacters();
        CharacterDTO getCharacterById(Integer id) throws CharacterNotFoundException;
        CharacterDTO addCharacter(Character character);
        CharacterDTO updateCharacter(Integer id, CharacterDTO characterDTO);

        CharacterDTO updateCharacter(Integer id, Character character) throws CharacterNotFoundException;

        void deleteCharacter(Integer id);

}




