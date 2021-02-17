import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AdderTest {
  private Adder adder;

  @BeforeEach
  public void setUp() {
    adder = new Adder();
  }

  @Test
  @DisplayName("Simple addition of two integers.")
  public void testAddTwoIntegers() {
    assertEquals (25, adder.add (12, 13));
  }

  @Test
  @DisplayName("Simple addition of two doubles.")
  public void testAddTwoDoubles() {
    assertEquals (25.0, adder.add (12.5, 12.5));
  }
}
