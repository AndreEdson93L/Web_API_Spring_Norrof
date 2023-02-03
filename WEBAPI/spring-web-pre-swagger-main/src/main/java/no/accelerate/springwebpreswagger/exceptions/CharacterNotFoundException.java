package no.accelerate.springwebpreswagger.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CharacterNotFoundException extends Exception {
    public CharacterNotFoundException(int id) {
        super(String.format("Character with id %d not found", id));
    }
}
