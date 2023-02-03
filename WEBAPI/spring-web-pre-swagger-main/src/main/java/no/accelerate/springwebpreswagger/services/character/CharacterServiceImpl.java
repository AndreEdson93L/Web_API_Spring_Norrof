package no.accelerate.springwebpreswagger.services.character;

import no.accelerate.springwebpreswagger.exceptions.CharacterNotFoundException;
import no.accelerate.springwebpreswagger.mappers.CharacterMapper;
import no.accelerate.springwebpreswagger.models.Character;
import no.accelerate.springwebpreswagger.models.dto.student.CharacterDTO;
import no.accelerate.springwebpreswagger.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CharacterServiceImpl implements CharacterService {
    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    @Autowired
    public CharacterServiceImpl(CharacterRepository characterRepository, CharacterMapper characterMapper) {
        this.characterRepository = characterRepository;
        this.characterMapper = characterMapper;
    }

    @Override
    public Collection<CharacterDTO> getAllCharacters() {
        Collection<Character> characters = characterRepository.findAll();
        return characterMapper.characterToCharacterDTO(characters);
    }

    @Override
    public CharacterDTO getCharacterById(Integer id) throws CharacterNotFoundException {
        Character character = findById(id);
        return characterMapper.characterToCharacterDTO(character);
    }

    @Override
    public CharacterDTO addCharacter(Character character) {
        Character savedCharacter = add(character);
        return characterMapper.characterToCharacterDTO(savedCharacter);
    }

    @Override
    public CharacterDTO updateCharacter(Integer id, CharacterDTO characterDTO) {
        return null;
    }

    @Override
    public CharacterDTO updateCharacter(Integer id, Character character) throws CharacterNotFoundException {
        try {
            Character foundCharacter = findById(id);
            character.setCharacter_id(id);
            Character updatedCharacter = update(character);
            return characterMapper.characterToCharacterDTO(updatedCharacter);
        } catch (CharacterNotFoundException e) {
            throw new CharacterNotFoundException(id);
        }
    }


    @Override
    public void deleteCharacter(Integer id) {
        deleteById(id);
    }

    @Override
    public Character findById(Integer id) throws CharacterNotFoundException {
        return characterRepository.findById(id).orElseThrow(() -> new CharacterNotFoundException(id));
    }

    @Override
    public Collection<Character> findAll() {
        return characterRepository.findAll();
    }

    @Override
    public Character add(Character entity) {
        return characterRepository.save(entity);
    }

    @Override
    public Character update(Character entity) {
        return characterRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        characterRepository.deleteById(id);
    }

    @Override
    public boolean exists(Integer id) {
        try {
            return characterRepository.existsById(id);
        } catch (Exception e) {
            return false;
        }
    }
}
