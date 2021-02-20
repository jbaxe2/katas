import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class NthSeriesTest {
  @Test
  @DisplayName("The first n terms of a series sum appropriately.")
  public void testSumFirstNthTermsInSeries() {
    assertEquals ("0.00", NthSeries.seriesSum (0));
    assertEquals ("1.00", NthSeries.seriesSum (1));
    assertEquals ("1.25", NthSeries.seriesSum (2));
    assertEquals ("1.57", NthSeries.seriesSum (5));
    assertEquals ("1.77", NthSeries.seriesSum (9));
    assertEquals ("1.94", NthSeries.seriesSum (15));
  }
}
