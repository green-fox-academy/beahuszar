package com.greenfox.restconrollertutorial.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

  @RequestMapping("/topics")
  public List<Topic> getAllTopics() {
    return Arrays.asList(
        new Topic("spring", "Spring framework","Spring Framework description"),
        new Topic("java", "core java","core java description"),
        new Topic("javascript", "Javascript","JavaScript description"));
  }
}
