package com.ericsson.gerrit.goget;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by hongkailiu on 2017-02-21.
 */
@SpringBootApplication
@Slf4j
public class App extends WebMvcConfigurerAdapter {
  //@Autowired
  //MyAppConfig myAppConfig;
  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(App.class, args);
    log.debug("Let's inspect the beans provided by Spring Boot:");
    String[] beanNames = ctx.getBeanDefinitionNames();
    Arrays.sort(beanNames);
    for (String beanName : beanNames) {
      log.debug(beanName);
    }
  }
}
