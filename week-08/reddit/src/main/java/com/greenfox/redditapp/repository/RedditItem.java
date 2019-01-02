package com.greenfox.redditapp.repository;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class RedditItem {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  int voteCounter;
  String url;
  String title;

  public RedditItem() {
  }

  public RedditItem(String url, String title) {
    this.url = url;
    this.title = title;
    this.voteCounter = 1;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getVoteCounter() {
    return voteCounter;
  }

  public void setVoteCounter(int voteCounter) {
    this.voteCounter = voteCounter;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
