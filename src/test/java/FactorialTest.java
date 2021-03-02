import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
  private Factorial factorial;

  @BeforeEach
  public void setUp() {
    factorial = new Factorial();
  }

  @Test
  @DisplayName("Base case of obtaining a factorial.")
  public void testFactorialBaseCase() {
    assertEquals (1, factorial.factorial (0));
  }

  @Test
  @DisplayName("Recursive case of obtaining a factorial.")
  public void testFactorialRecursiveCase() {
    assertEquals (2, factorial.factorial (2));
    assertEquals (6, factorial.factorial (3));
    assertEquals (24, factorial.factorial (4));
    assertEquals (120, factorial.factorial (5));
  }

  @Test
  @DisplayName("Improper input throws.")
  public void testImproperInputToFactorialThrows() {
    assertThrows (
      IllegalArgumentException.class,
      () -> factorial.factorial (-1)
    );

    assertThrows (
      IllegalArgumentException.class,
      () -> factorial.factorial (13)
    );
  }
}
