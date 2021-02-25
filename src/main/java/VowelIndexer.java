import java.util.stream.*;

public class VowelIndexer {
  private final static char[] vowels = new char[] {
    'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
  };

  public static String vowel2Index (String starterStr) {
    String[] indexedStr = _createIndexedStr (starterStr.toCharArray());

    return _buildString (indexedStr);
  }

  private static String[] _createIndexedStr (char[] theChars) {
    var indexedStr = new String[theChars.length];

    for (var i=0; i<theChars.length; i++) {
      indexedStr[i] =
        _charIsVowel (theChars[i]) ? ("" + (i+1)) : ("" + theChars[i]);
    }

    return indexedStr;
  }

  private static boolean _charIsVowel (char theChar) {
    for (char vowel : vowels) {
      if (vowel == theChar) {
        return true;
      }
    }

    return false;
  }

  private static String _buildString (String[] indexedStr) {
    var result = new StringBuilder();

    Stream.of (indexedStr).forEach (result::append);

    return result.toString();
  }
}
