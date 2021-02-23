import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class VowelIndexerTest {
  @Test
  @DisplayName("Valid strings are able to be indexed properly.")
  public void testValidStringsAreIndexedProperly() {
    assertEquals(
      "th3s 6s my str15ng",
      VowelIndexer.vowel2Index("this is my string")
    );

    assertEquals(
      "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld",
      VowelIndexer.vowel2Index("Codewars is the best site in the world")
    );

    assertEquals(
      "T2m4rr7w 10s g1415ng t20 b23 r2627n29ng",
      VowelIndexer.vowel2Index("Tomorrow is going to be raining")
    );
  }

  @Test
  @DisplayName("Empty string results in empty string.")
  public void testEmptyStringResultsInEmptyString() {
    assertEquals ("", VowelIndexer.vowel2Index (""));
  }
}
