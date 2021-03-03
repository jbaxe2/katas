import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FindNextSquareTest {
  @Test
  @DisplayName("Find the next square based on a provided square.")
  public void testFindNextSquareGivenSquare() {
    assertEquals (4, NumberFun.findNextSquare (1));
    assertEquals (144, NumberFun.findNextSquare (121));
    assertEquals (676, NumberFun.findNextSquare (625));
  }

  @Test
  @DisplayName("A number that does not have an integer square root returns -1.")
  public void testNonSquareRootIntReturnsNegativeOne() {
    assertEquals (-1, NumberFun.findNextSquare (114));
  }
}
