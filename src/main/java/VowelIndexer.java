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
      if (_charIsVowel (theChars[i])) {
        indexedStr[i] = "" + (i+1);
      } else {
        indexedStr[i] = "" + theChars[i];
      }
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

    for (String anIndexedStr : indexedStr) {
      result.append (anIndexedStr);
    }

    return result.toString();
  }
}
