import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOrOddTest {
  @Test
  @DisplayName("Test that even numbers will return 'Even'.")
  public void testEvenReturnsEven() {
    assertEquals ("Even", EvenOrOdd.even_or_odd (0));
    assertEquals ("Even", EvenOrOdd.even_or_odd (42));
  }

  @Test
  @DisplayName("Test that even numbers will return 'Even'.")
  public void testOddReturnsOdd() {
    assertEquals ("Odd", EvenOrOdd.even_or_odd (15));
    assertEquals ("Odd", EvenOrOdd.even_or_odd (23));
  }
}
