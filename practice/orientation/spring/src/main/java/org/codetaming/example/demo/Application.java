package org.codetaming.example.demo;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// a convenience annotation that adds all of the following:
//@Configuration: tags the class as a source of bean definitions for the application context.
//@EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
//@EnableWebMvc (automatically added when spring-webmvc is noticed) flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
//@ComponentScan tells Spring to look for other components, configurations, and services in this package, allowing it to find the controllers.
public class Application {
  public static void main(String[] args) {
    //main() method uses Spring Boot’s SpringApplication.run() method to launch an application.
    //no XML lines at all, no web.xml either
    //100% pure Java, no need for configuring plumbing or infrastructure
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    //this runs on start up.
    //It retrieves all the beans that were created either by your app or were automatically added thanks to Spring Boot.
    //It sorts them and prints them out.
    return args -> {
      System.out.println("Let's inspect the beans provided by Spring Boot:");

      String[] beanNames = ctx.getBeanDefinitionNames();
      Arrays.sort(beanNames);
      for (String beanName : beanNames) {
        System.out.println(beanName);
      }
    };
  }
}
