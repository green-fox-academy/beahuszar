package com.greenfoxacademy.tamagotchi.repository;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

@Entity
public interface DrinkRepo extends CrudRepository<Drink, Long> {
}
