package dev.iseif.reactiverestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@SpringBootApplication

public class ReactiveRestApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReactiveRestApiApplication.class, args);
  }
}
