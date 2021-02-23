import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CaseConverterTest {
  @Test
  @DisplayName("Convert underscore-delimited words to camel case.")
  public void testConvertingUnderscoreDelimitedWordsToCamelCase() {
    assertEquals (
      "theStealthWarrior", CaseConverter.toCamelCase ("the_stealth_warrior")
    );
  }

  @Test
  @DisplayName("Convert dash-delimited words to camel case.")
  public void testConvertingDashDelimitedWordsToCamelCase() {
    assertEquals (
      "theStealthWarrior", CaseConverter.toCamelCase ("the-stealth-warrior")
    );
  }

  @Test
  @DisplayName("No underscore or dash does not convert to camel case.")
  public void testConvertNoDelimiterResultsInSameCasing() {
    assertEquals (
      "the stealth warrior", CaseConverter.toCamelCase ("the stealth warrior")
    );
  }
}
