package guru.springframework.sfgpetclinicproject.service;

import guru.springframework.sfgpetclinicproject.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
