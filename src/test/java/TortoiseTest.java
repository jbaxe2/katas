import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TortoiseTest {
  @Test
  @DisplayName("Valid speeds and gain results in a proper time.")
  public void testValidSpeedsAndGainResultsProperTime() {
    assertArrayEquals (new int[] {0,32,18}, Tortoise.race (720, 850, 70));
    assertArrayEquals (new int[] {0,17,4}, Tortoise.race (720, 850, 37));
    assertArrayEquals (new int[] {2,0,0}, Tortoise.race (80, 100, 40));
    assertArrayEquals (new int[] {2,50,46}, Tortoise.race (720, 850, 370));
    assertArrayEquals (new int[] {0,3,2}, Tortoise.race (120, 850, 37));
    assertArrayEquals (new int[] {3,21,49}, Tortoise.race (80, 91, 37));
    assertArrayEquals (new int[] {18,20,0}, Tortoise.race (820, 850, 550));
  }

  @Test
  @DisplayName("Return null if the first velocity is greater than the second.")
  public void testFirstVelocityGreaterThanSecondReturnsNull() {
    assertArrayEquals (null, Tortoise.race (850, 720, 70));
    assertArrayEquals (null, Tortoise.race (91, 80, 37));
    assertArrayEquals (null, Tortoise.race (100, 80, 40));
  }

  @Test
  @DisplayName("Returns null if the gain is not positive.")
  public void testGainNotPositiveResultsInNull() {
    assertArrayEquals (null, Tortoise.race (850, 720, 0));
    assertArrayEquals (null, Tortoise.race (850, 720, -10));
  }
}
