import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EnoughIsEnoughTest {
  @Test
  @DisplayName("Arrays have the n'th or greater entries deleted properly.")
  public void testDeleteNthAndMoreEntriesOfArray() {
    assertArrayEquals (
      new int[] {20, 37, 21},
      EnoughIsEnough.deleteNth (new int[] {20, 37, 20, 21}, 1)
    );

    assertArrayEquals (
      new int[] {1, 1, 3, 3, 7, 2, 2, 2},
      EnoughIsEnough.deleteNth (new int[] {1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)
    );

    assertArrayEquals (
      new int[] {1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
      EnoughIsEnough.deleteNth (
        new int[] {1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1},
        3
      )
    );

    assertArrayEquals (
      new int[] {1, 1, 1, 1, 1},
      EnoughIsEnough.deleteNth (new int[] {1, 1, 1, 1, 1}, 5)
    );
  }

  @Test
  @DisplayName("Input of an empty array results in an empty array.")
  public void testDeleteNthOfEmptyArrayIsEmptyArray() {
    assertArrayEquals (
      new int[]{},
      EnoughIsEnough.deleteNth (new int[]{}, 5)
    );
  }

  @Test
  @DisplayName("Input of 0 for max occurrences results in an empty array.")
  public void testDeleteNthIsZeroResultsInEmptyArray() {
    assertArrayEquals (
      new int[]{},
      EnoughIsEnough.deleteNth (new int[] {1, 2, 3, 4, 5}, 0)
    );
  }
}
