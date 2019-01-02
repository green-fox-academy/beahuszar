package com.greenfox.redditapp.service;

import com.greenfox.redditapp.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedditService {

  private RedditRepository repository;

  @Autowired
  public RedditService(RedditRepository repository) {
    this.repository = repository;
  }


}
