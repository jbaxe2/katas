public class CaseConverter {
  public static String toCamelCase (String starterString) {
    String[] splitStrings =
      starterString.split (_determineDelimiter (starterString));

    return String.join ("", _capitalizeTokens (splitStrings));
  }

  private static String _determineDelimiter (String delimitedString) {
    return (delimitedString.contains ("_")) ? "_" : "-";
  }

  private static String[] _capitalizeTokens (String[] splitStrings) {
    for (int i=1; i<splitStrings.length; i++) {
      splitStrings[i] = ("" + splitStrings[i].charAt (0)).toUpperCase() +
        splitStrings[i].substring (1).toLowerCase();
    }

    return splitStrings;
  }
}
