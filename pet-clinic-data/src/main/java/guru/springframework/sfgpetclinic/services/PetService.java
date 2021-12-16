package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface PetService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
