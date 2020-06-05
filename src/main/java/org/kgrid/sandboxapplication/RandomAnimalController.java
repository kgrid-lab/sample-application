package org.kgrid.sandboxapplication;

import org.kgrid.sandboxdependency.service.RandomAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class RandomAnimalController {

  @Autowired
  private RandomAnimalService randomAnimalService;

  @GetMapping
  public String getRandomAnimal() {
    return randomAnimalService.getRandomAnimal();
  }

}
