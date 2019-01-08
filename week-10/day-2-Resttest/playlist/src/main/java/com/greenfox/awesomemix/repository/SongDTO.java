package com.greenfox.awesomemix.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SongDTO {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public long id;
  public String title;
  public String performer;
  public int rating;

  public SongDTO() {
  }
}
