import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SurrealCheckTest {
  private SurrealCheck surrealCheck;

  @BeforeEach
  public void setUp() {
    surrealCheck = new SurrealCheck();
  }

  @Test
  @DisplayName("Verify valid surreal numbers are checked properly.")
  public void testValidSurrealNumbersCheckProperly() {
    assertTrue (surrealCheck.isSurreal ("-1", "1"));
    assertTrue (surrealCheck.isSurreal ("1/2", "3/4"));
    assertTrue (surrealCheck.isSurreal ("-3 -2 -1 0", "17"));
    assertTrue (surrealCheck.isSurreal ("18 33 -2 19 -1/8", "99 34 200/3"));
    assertTrue (surrealCheck.isSurreal ("-3", "-2 65"));
  }

  @Test
  @DisplayName("Verify improper inputs do not validate as surreal numbers")
  public void testImproperInputInvalidateSurrealNumbers() {
    assertFalse (surrealCheck.isSurreal ("1", "-1"));
    assertFalse (surrealCheck.isSurreal ("18 33 -2 19 1/8", "99 31 200/3"));
  }
}
