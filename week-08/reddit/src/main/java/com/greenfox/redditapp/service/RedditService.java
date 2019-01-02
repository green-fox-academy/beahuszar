package com.greenfox.redditapp.service;

import com.greenfox.redditapp.repository.RedditItem;
import com.greenfox.redditapp.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedditService {

  private RedditRepository repository;

  @Autowired
  public RedditService(RedditRepository repository) {
    this.repository = repository;
  }


  public List<RedditItem> getAllItems() {
    List<RedditItem> itemList = new ArrayList<>();
    repository.findAll().forEach(itemList::add);
    return itemList;
  }

  public void saveItem(RedditItem item) {
    repository.save(item);
  }
}
