package com.greenfoxacademy.tamagotchi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepo extends CrudRepository<Pet, Long > {
  boolean existsByName(String name);
}
