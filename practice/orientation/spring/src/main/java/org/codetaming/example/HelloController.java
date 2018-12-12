package org.codetaming.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// it’s ready for use by Spring MVC to handle web requests
// combines @Controller and @ResponseBody, two annotations that results in
// web requests returning data rather than a view.
public class HelloController {
  @RequestMapping("/")
  // maps "/" to the index() method,
  // When invoked from a browser or using curl on the command line,
  // the method returns pure text
  public String index() {
    return "GGGrrrrrrrrrrrrrrrrrrr";
  }
}
