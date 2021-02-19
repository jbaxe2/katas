import java.util.*;

public class TriangleTester {
  public static boolean isTriangle (int a, int b, int c) {
    return _confirmPositiveLengthSides (a, b, c) &&
      _checkSides (_sortSides (a, b, c));
  }

  private static boolean _confirmPositiveLengthSides (int a, int b, int c) {
    return 0 < a && 0 < b && 0 < c;
  }

  private static int[] _sortSides (int a, int b, int c) {
    var sides = new int[] {a, b, c};

    Arrays.sort (sides);

    return sides;
  }

  private static boolean _checkSides (int[] sides) {
    return (sides[0] + sides[1]) > sides[2];
  }
}
