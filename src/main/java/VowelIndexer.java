import java.util.*;

public class VowelIndexer {
  private final static List<Character> vowels = Arrays.asList (
    'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
  );

  public static String vowel2Index (String starterStr) {
    String[] indexedStr = _createIndexedStr (starterStr.toCharArray());

    return String.join ("", indexedStr);
  }

  private static String[] _createIndexedStr (char[] theChars) {
    var indexedStr = new String[theChars.length];

    for (var i=0; i<theChars.length; i++) {
      indexedStr[i] =
        vowels.contains (theChars[i]) ? ("" + (i+1)) : ("" + theChars[i]);
    }

    return indexedStr;
  }
}
