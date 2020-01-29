
package co.example.bancolombia.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PracticeController {
  
  

  /**
   * Constructor.
   */
  protected PracticeController() {
    super();
  }
  
  @RequestMapping("/")
  @GetMapping(produces = "application/json")
  public String createNotification() {
    return "HELLO WORLD";
  }


}
