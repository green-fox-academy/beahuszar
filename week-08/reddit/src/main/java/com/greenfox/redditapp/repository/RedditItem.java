package com.greenfox.redditapp.repository;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "items")
public class RedditItem {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private int voteCounter;
  private String url;
  private String title;

  @Temporal(TemporalType.TIMESTAMP)
  @DateTimeFormat(pattern = "yyyy-MM-DD")
  private Date date = new Date();

  public RedditItem() {
    this.voteCounter = 1;
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

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
