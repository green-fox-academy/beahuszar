package com.greenfoxacademy.tamagotchi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DrinkRepo extends CrudRepository<Drink, Long> {
}
