package no.accelerate.springwebpreswagger.controllers;

import no.accelerate.springwebpreswagger.exceptions.CharacterNotFoundException;
import no.accelerate.springwebpreswagger.models.Character;
import no.accelerate.springwebpreswagger.models.dto.student.CharacterDTO;
import no.accelerate.springwebpreswagger.services.character.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {
    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public Collection<CharacterDTO> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("/{id}")
    public CharacterDTO getCharacterById(@PathVariable("id") Integer id) throws CharacterNotFoundException {
        return characterService.getCharacterById(id);
    }

    @PostMapping
    public CharacterDTO addCharacter(@RequestBody Character character) {
        return characterService.addCharacter(character);
    }

    @PutMapping("/{id}")
    public CharacterDTO updateCharacter(@PathVariable("id") Integer id, @RequestBody CharacterDTO characterDto) {
        return characterService.updateCharacter(id, characterDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable("id") Integer id) {
        characterService.deleteCharacter(id);
    }
}


