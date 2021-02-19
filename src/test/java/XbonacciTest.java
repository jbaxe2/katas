import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class XbonacciTest {
  private Xbonacci xbonacci;

  @BeforeEach
  public void setUp() {
    xbonacci = new Xbonacci();
  }

  @Test
  @DisplayName("An array of three doubles outputs the appropriate sequence.")
  public void testThreeDoublesArrayOutputsCorrectSequence() {
    assertArrayEquals (
      new double[] {1, 1, 1, 3, 5, 9, 17, 31, 57, 105},
      xbonacci.tribonacci (new double[] {1, 1, 1}, 10)
    );

    assertArrayEquals (
      new double[] {0, 0, 1, 1, 2, 4, 7, 13, 24, 44},
      xbonacci.tribonacci (new double[] {0, 0, 1}, 10)
    );

    assertArrayEquals (
      new double[] {0, 1, 1, 2, 4, 7, 13, 24, 44, 81},
      xbonacci.tribonacci (new double[] {0, 1, 1}, 10)
    );
  }

  @Test
  @DisplayName("Specifying sequence size of 0 results in an empty sequence.")
  public void testZeroSequenceSizeCreatesEmptySequence() {
    assertArrayEquals (
      new double[]{}, xbonacci.tribonacci (new double[] {1, 1, 1}, 0)
    );
  }

  @Test
  @DisplayName("Sequence size of 1 or 2 results in subarray.")
  public void testSmallSizeResultsInAppropriateSubArray() {
    assertArrayEquals (
      new double[] {1}, xbonacci.tribonacci (new double[] {1, 2, 3}, 1)
    );

    assertArrayEquals (
      new double[] {1, 2}, xbonacci.tribonacci (new double[] {1, 2, 3}, 2)
    );
  }
}
