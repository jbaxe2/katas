import error.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberCreatorTest {
  private PhoneNumberCreator phoneNumberCreator;

  @BeforeEach
  public void setUp() {
    phoneNumberCreator = new PhoneNumberCreator();
  }

  @Test
  @DisplayName("Create a phone number based on an array of numerical input.")
  public void testCreatePhoneNumber() {
    var phoneArray = new int[] {5, 2, 3, 5, 5, 5, 0, 7, 2, 1};

    String phoneNumber = null;

    try {
      phoneNumber = phoneNumberCreator.createPhoneNumber (phoneArray);
    } catch (ImproperPhoneNumber ignored) {}

    assertEquals ("(523) 555-0721", phoneNumber);
  }

  @Test
  @DisplayName("Attempting to create a phone number with invalid input throws.")
  public void testCreateImproperPhoneNumberThrows() {
    Exception exception = assertThrows (
      ImproperPhoneNumber.class,
      () -> phoneNumberCreator.createPhoneNumber (new int[] {})
    );

    String expectedMsg = "Phone number input has improper length.";

    assertEquals (exception.getMessage(), expectedMsg);
  }

  @Test
  @DisplayName("Creating a phone number with negative integers throws.")
  public void testCreateNegativeIntPhoneNumberThrows() {
    var phoneArray = new int[] {5, 2, 3, 5, 5, -5, 0, -7, 2, 1};

    Exception exception = assertThrows (
      ImproperPhoneNumber.class,
      () -> phoneNumberCreator.createPhoneNumber (phoneArray)
    );

    String expectedMsg = "Phone number digits cannot be negative.";

    assertEquals (exception.getMessage(), expectedMsg);
  }

  @Test
  @DisplayName("Creating a phone number with non-single digit integers throws.")
  public void testCreateNonSingleDigitIntPhoneNumberThrows() {
    var phoneArray = new int[] {5, 2, 3, 5, 5, 15, 0, 27, 2, 1};

    Exception exception = assertThrows (
      ImproperPhoneNumber.class,
      () -> phoneNumberCreator.createPhoneNumber (phoneArray)
    );

    String expectedMsg = "Phone number integer input must be single-digit.";

    assertEquals (exception.getMessage(), expectedMsg);
  }
}
