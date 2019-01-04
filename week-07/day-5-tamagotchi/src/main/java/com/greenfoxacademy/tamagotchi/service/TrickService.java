package com.greenfoxacademy.tamagotchi.service;

import com.greenfoxacademy.tamagotchi.repository.Trick;
import com.greenfoxacademy.tamagotchi.repository.TrickRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrickService {

  private TrickRepo trickRepo;

  public TrickService() {
  }

  @Autowired
  public TrickService(TrickRepo trickRepo) {
    this.trickRepo = trickRepo;
  }

  public void saveTrick(String name) {
    trickRepo.save(new Trick(name));
  }

  public void deleteTrick(long id) {
    trickRepo.deleteById(id);
  }
}
