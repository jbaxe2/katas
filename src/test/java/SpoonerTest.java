import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpoonerTest {
  private Spooner spooner;

  @BeforeEach
  public void setUp() {
    spooner = new Spooner();
  }

  @Test
  @DisplayName("Two words, tokenized by a space, are sponerized.")
  public void testSpoonerizeTwoWordsTokenizedBySpace() {
    assertEquals ("pit nicking", spooner.spoonerize ("nit picking"));
    assertEquals ("bedding wells", spooner.spoonerize ("wedding bells"));
    assertEquals ("belly jeans", spooner.spoonerize ("jelly beans"));
  }
}
