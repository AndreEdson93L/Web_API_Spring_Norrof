package no.accelerate.springwebpreswagger.services;

import no.accelerate.springwebpreswagger.exceptions.CharacterNotFoundException;

import java.util.Collection;

public interface CrudService <T, ID> {
    T findById(ID id) throws CharacterNotFoundException;
    Collection<T> findAll();
    T add(T entity);
    T update(T entity);
    void deleteById(ID id);
    boolean exists(ID id);
}

