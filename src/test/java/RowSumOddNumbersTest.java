import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RowSumOddNumbersTest {
  @Test
  @DisplayName("The first row sum of odd numbers computes to 1.")
  public void testFirstRowSumOddNumbers() {
    assertEquals (1, RowSumOddNumbers.rowSumOddNumbers (1));
  }

  @Test
  @DisplayName("The 42nd row sum of odd numbers computes to the cube of 42.")
  public void testNthRowSumOddNumbersIsNCubed() {
    assertEquals (74088, RowSumOddNumbers.rowSumOddNumbers (42));
  }
}
