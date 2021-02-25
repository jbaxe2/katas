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

    assertEquals (17, sheepCounter.countSheeps (placedSheep));
  }

  @Test
  @DisplayName("Providing null for the sheep placements results in 0 sheep.")
  public void testCountingNullPlacementsThrows() {
    assertEquals (0, sheepCounter.countSheeps (null));
  }
}
