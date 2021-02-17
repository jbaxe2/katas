import java.util.*;
import java.util.stream.*;

public class PhoneNumberCreator {
  public String createPhoneNumber (int[] phoneArray) throws ImproperPhoneNumber {
    if (10 != phoneArray.length) {
      throw new ImproperPhoneNumber ("Phone number input has improper length.");
    }

    return _createAreaCode (Arrays.copyOfRange (phoneArray, 0, 3)) +
      " " + _createOfficeCode (Arrays.copyOfRange (phoneArray, 3, 6)) + "-" +
      _createStationNumber (Arrays.copyOfRange (phoneArray, 6, 10));
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
