import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {
  private PalindromeChecker palindromeChecker;

  @BeforeEach
  public void setUp() {
    palindromeChecker = new PalindromeChecker();
  }

  @Test
  @DisplayName("Check that a palindrome String is a palindrome.")
  public void testCheckForPalindrome() {
    assertTrue (
      palindromeChecker.checkPalindrome ("abba")
    );
  }

  @Test
  @DisplayName("Check fails for String that is not a palindrome.")
  public void testCheckFailsForNonPalindrome() {
    assertFalse (
      palindromeChecker.checkPalindrome ("asdffdsadf7")
    );
  }
}
