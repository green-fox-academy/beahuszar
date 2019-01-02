package com.greenfox.redditapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedditRepository extends CrudRepository<RedditItem, Long> {
}
