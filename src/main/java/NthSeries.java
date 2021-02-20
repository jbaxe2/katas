public class NthSeries {
  public static String seriesSum (int n) {
    if (1 > n) {
      return "0.00";
    }

    return _formatSummedSeries (_sumSeries (_buildSeries (n)));
  }

  private static double[] _buildSeries (int n) {
    var series = new double[n];

    for (int i=0; i<n; i++) {
      series[i] = 1.0 / (3 * i + 1);
    }

    return series;
  }

  private static double _sumSeries (double[] series) {
    double sum = 0.0;

    for (double term : series) {
      sum += term;
    }

    return sum;
  }

  private static String _formatSummedSeries (double summedSeries) {
    return String.format ("%10.2f", summedSeries).trim();
  }
}
