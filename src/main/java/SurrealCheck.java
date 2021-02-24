public class SurrealCheck {
  public boolean isSurreal (String left, String right) {
    if ("".equals (left) || "".equals (right)) {
      return true;
    }

    double[] leftNums, rightNums;

    try {
      leftNums = _convertStringsToDoubles (_splitNumbersStr (left));
      rightNums = _convertStringsToDoubles (_splitNumbersStr (right));
    } catch (Exception e) {
      return false;
    }

    return _checkLeftVsRight (leftNums, rightNums);
  }

  private double[] _convertStringsToDoubles (String[] numbersStrs) {
    var numDoubles = new double[numbersStrs.length];

    for (int i=0; i<numbersStrs.length; i++) {
      String number = numbersStrs[i];

      if (number.contains ("/")) {
        numDoubles[i] = _convertFraction (number);
      } else {
        numDoubles[i] = Double.parseDouble (number);
      }
    }

    return numDoubles;
  }

  private String[] _splitNumbersStr (String numbersStr) {
    return numbersStr.split (" ");
  }

  private boolean _checkLeftVsRight (double[] left, double[] right) {
    for (double leftNum : left) {
      for (double rightNum : right) {
        if (leftNum >= rightNum) {
          return false;
        }
      }
    }

    return true;
  }

  private double _convertFraction (String fraction) {
    String[] fractionParts = fraction.split ("/");

    int numerator = Integer.parseInt (fractionParts[0]);
    int denominator = Integer.parseInt (fractionParts[1]);

    return (numerator + 0.0) / denominator;
  }
}
