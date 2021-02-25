import java.util.*;

public class SurrealCheck {
  public boolean isSurreal (String left, String right) {
    if ("".equals(left) || "".equals(right)) {
      return true;
    }

    return _isSurreal (left, right);
  }

  private boolean _isSurreal (String left, String right) {
    List<Double> leftNums, rightNums;

    try {
      leftNums = _convertStringsToDoubles (_splitNumbersStr (left));
      rightNums = _convertStringsToDoubles (_splitNumbersStr (right));
    } catch (Exception e) {
      return false;
    }

    return _checkLeftVsRight (leftNums, rightNums);
  }

  private List<Double> _convertStringsToDoubles (String[] numbersStrs) {
    List<Double> numDoubles = new ArrayList<>();

    for (String numberStr : numbersStrs) {
      numDoubles.add (
        numberStr.contains ("/") ?
          _convertFraction (numberStr) : Double.parseDouble (numberStr)
      );
    }

    return numDoubles;
  }

  private String[] _splitNumbersStr (String numbersStr) {
    return numbersStr.split (" ");
  }

  private boolean _checkLeftVsRight (List<Double> left, List<Double> right) {
    return left.stream().noneMatch (
      leftNum -> right.stream().anyMatch (rightNum -> leftNum >= rightNum)
    );
  }

  private double _convertFraction (String fraction) {
    String[] fractionParts = fraction.split ("/");

    int numerator = Integer.parseInt (fractionParts[0]);
    int denominator = Integer.parseInt (fractionParts[1]);

    return (numerator + 0.0) / denominator;
  }
}
