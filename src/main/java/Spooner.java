public class Spooner {
  public String spoonerize (String words) {
    String[] tokens = words.split (" ");

    if (2 == tokens.length) {
      String first = tokens[1].charAt (0) + tokens[0].substring (1);
      String second = tokens[0].charAt (0) + tokens[1].substring (1);

      return first + " " + second;
    }

    return words;
  }
}
