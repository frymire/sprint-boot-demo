package io.github.frymire;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

  public HelloController() { }

  // Handles a GET to http://localhost:8080/greeting?name=Mark
  @GetMapping("/greeting")
  public String greetingGet(@RequestParam String name) {
    return "Hello, " + name + "!";
  }

  // Handles a POST to http://localhost:8080/greeting with payload { "name" : "Mark" }
  @PostMapping(value = "/greeting", consumes = MediaType.APPLICATION_JSON_VALUE)
  public String greetingPost(@RequestBody Person person) {
    return "Hi, " + person.getName() + "!";
  }
}
