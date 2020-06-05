package org.kgrid.sandboxapplication;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kgrid.sandboxdependency.service.RandomAnimalService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RandomAnimalControllerTest {
  private static final String THE_ANIMAL = "Capybara";
  @Mock RandomAnimalService randomAnimalService;
  @InjectMocks RandomAnimalController randomAnimalController;

  @Before
  public void setup() {
    when(randomAnimalService.getRandomAnimal()).thenReturn(THE_ANIMAL);
  }

  @Test
  public void testGetsAnimalFromAnimalService() {
    randomAnimalController.getRandomAnimal();
    verify(randomAnimalService).getRandomAnimal();
  }

  @Test
  public void testReturnsAnimalFromAnimalService() {
    String response = randomAnimalController.getRandomAnimal();
    assertEquals(THE_ANIMAL, response);
  }
}
