public class Tortoise {
  public static int[] race (int v1, int v2, int g) {
    if (!_verifyConditions (v1, v2, g)) {
      return null;
    }

    double decimalHours = _calculateDecimalTime (v1, v2, g);

    return _calculateTimeComponents (decimalHours);
  }

  private static boolean _verifyConditions (int v1, int v2, int g) {
    return (0 < v1 && 0 < v2 && 0 < g) && (v1 < v2);
  }

  private static double _calculateDecimalTime (int v1, int v2, int g) {
    return (g + 0.0) / (v2 - v1);
  }

  private static int[] _calculateTimeComponents (double decimalHours) {
    int hours = (int) Math.floor (decimalHours);

    double decimalMinutes = (decimalHours - hours) * 60.0;
    double normalizedMinutes = decimalMinutes + 0.0001;
    int minutes = (int) Math.floor (normalizedMinutes);

    double decimalSeconds = (normalizedMinutes - minutes) * 60.0;
    int seconds = _normalizeSeconds ((int) Math.floor (decimalSeconds));

    return new int[] {hours, minutes, seconds};
  }

  private static int _normalizeSeconds (int seconds) {
    if (0 > seconds) {
      seconds = 60 - seconds;
    }

    return seconds;
  }
}
