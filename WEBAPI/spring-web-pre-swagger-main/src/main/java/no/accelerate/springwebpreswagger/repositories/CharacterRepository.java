package no.accelerate.springwebpreswagger.repositories;

import no.accelerate.springwebpreswagger.models.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface CharacterRepository extends JpaRepository<Character, Integer> {
    @Query("SELECT c FROM Character c WHERE c.full_name = :fullName")
    Set<Character> findAllByName(@Param("fullName") String fullName);

    @Query("SELECT c FROM Character c WHERE c.alias = :alias")
    Character findCharacterByAlias(@Param("alias") String alias);
}

