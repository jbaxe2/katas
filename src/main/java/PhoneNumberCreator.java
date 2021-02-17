import java.util.*;
import java.util.stream.*;

public class PhoneNumberCreator {
  public String createPhoneNumber (int[] phoneArray) throws ImproperPhoneNumber {
    _verifyInput (phoneArray);

    return _createAreaCode (Arrays.copyOfRange (phoneArray, 0, 3)) +
      " " + _createOfficeCode (Arrays.copyOfRange (phoneArray, 3, 6)) + "-" +
      _createStationNumber (Arrays.copyOfRange (phoneArray, 6, 10));
  }

  private void _verifyInput (int[] phoneArray) throws ImproperPhoneNumber {
    if (10 != phoneArray.length) {
      throw new ImproperPhoneNumber ("Phone number input has improper length.");
    }

    for (int digit : phoneArray) {
      if (0 > digit) {
        throw new ImproperPhoneNumber ("Phone number digits cannot be negative.");
      }

      if (9 < digit) {
        throw new ImproperPhoneNumber (
          "Phone number integer input must be single-digit."
        );
      }
    }
  }

  private String _createAreaCode (int[] areaCode) {
    return "(" + _smushDigits (areaCode) + ")";
  }

  private String _createOfficeCode (int[] officeCode) {
    return _smushDigits (officeCode);
  }

  private String _createStationNumber (int[] stationNumber) {
    return _smushDigits (stationNumber);
  }

  private String _smushDigits (int[] phoneDigits) {
    var joiner = new StringJoiner ("");

    IntStream.of (phoneDigits).forEach (digit -> joiner.add (String.valueOf (digit)));

    return joiner.toString();
  }
}
