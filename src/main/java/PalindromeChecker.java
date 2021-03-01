public class PalindromeChecker {
  public boolean checkPalindrome (String possiblePalindrome) {
    String reversedStr = _reverseString (possiblePalindrome);

    return reversedStr.equals (possiblePalindrome);
  }

  private String _reverseString (String starterStr) {
    var reversedStr = new StringBuilder();

    for (int i=starterStr.length()-1; i>=0; i--) {
      reversedStr.append (starterStr.charAt (i));
    }

    return reversedStr.toString();
  }
}
