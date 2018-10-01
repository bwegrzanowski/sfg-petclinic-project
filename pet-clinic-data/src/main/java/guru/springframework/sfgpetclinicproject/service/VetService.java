package guru.springframework.sfgpetclinicproject.service;

import guru.springframework.sfgpetclinicproject.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
