import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SumPartsTest {
  @Test
  @DisplayName("Sum the parts of an input array of integers.")
  public void testSumPartsOfIntArrayInput() {
    assertArrayEquals (
      new int[] {20, 20, 19, 16, 10, 0},
      SumParts.sumParts (new int[] {0, 1, 3, 6, 10})
    );

    assertArrayEquals (
      new int[] {21, 20, 18, 15, 11, 6, 0},
      SumParts.sumParts (new int[] {1, 2, 3, 4, 5, 6})
    );
  }

  @Test
  @DisplayName("Sum of empty array results in array with 0 int as single element.")
  public void testEmptyArrayResultsInSingle0ElementArray() {
    assertArrayEquals (new int[] {0}, SumParts.sumParts (new int[] {}));
  }

  @Test
  @DisplayName("Sum of null array results in array with 0 int as single element.")
  public void testNullArrayResultsInSingle0ElementArray() {
    assertArrayEquals (new int[] {0}, SumParts.sumParts (null));
  }
}
