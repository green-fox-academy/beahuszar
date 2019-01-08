package com.greenfox.awesomemix.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepo extends CrudRepository<SongDTO, Long> {
}
