public class PalindromeChecker {
  public boolean checkPalindrome (String possiblePalindrome) {
    String reversedStr = _reverseString (possiblePalindrome);

    return reversedStr.equals (possiblePalindrome);
  }

  private String _reverseString (String starterStr) {
    var reversed = new StringBuilder();

    for (int i=starterStr.length()-1; i>=0; i--) {
      reversed.append (starterStr.charAt (i));
    }

    return reversed.toString();
  }
}
