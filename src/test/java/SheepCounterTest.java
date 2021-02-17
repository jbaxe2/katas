import error.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SheepCounterTest {
  private SheepCounter sheepCounter;

  @BeforeEach
  public void setUp() {
    sheepCounter = new SheepCounter();
  }

  @Test
  @DisplayName("The sheep counter counts an appropriate number of sheep.")
  public void testCountingSheep() {
    Boolean[] placedSheep = {
      true, true, true, false, true, true, true, true,
      true, false, true, false, true, false, false, true,
      true, true, true, true, false, false, true, true
    };

    int sheepCount = 0;

    try {
      sheepCount = sheepCounter.countSheeps (placedSheep);
    } catch (InvalidSheep ignored) {}

    assertEquals (17, sheepCount);
  }

  @Test
  @DisplayName("Providing null for the sheep placements throws.")
  public void testCountingNullPlacementsThrows() {
    Exception exception = assertThrows (
      InvalidSheep.class,
      () -> sheepCounter.countSheeps (null)
    );

    String expectedMsg = "Sheep placements cannot be null.";

    assertEquals (exception.getMessage(), expectedMsg);
  }

  @Test
  @DisplayName("Providing null values for the sheep throws.")
  public void testCountingNullSheepThrows() {
    Boolean[] placedSheep = {
      true, true, true, false, true, true, true, true,
      true, false, true, false, true, false, null, true,
      true, true, true, null, false, false, true, true
    };

    Exception exception = assertThrows (
      InvalidSheep.class,
      () -> sheepCounter.countSheeps (placedSheep)
    );

    String expectedMsg = "Placements for sheep cannot be null.";

    assertEquals (exception.getMessage(), expectedMsg);
  }
}
