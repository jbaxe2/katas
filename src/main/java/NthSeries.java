import java.util.stream.*;

public class NthSeries {
  public static String seriesSum (int n) {
    if (1 > n) {
      return "0.00";
    }

    return _formatSummedSeries (
      DoubleStream.of (_buildSeries (n)).sum()
    );
  }

  private static double[] _buildSeries (int n) {
    var series = new double[n];

    for (int i=0; i<n; i++) {
      series[i] = 1.0 / (3 * i + 1);
    }

    return series;
  }

  private static String _formatSummedSeries (double summedSeries) {
    return String.format ("%10.2f", summedSeries).trim();
  }
}
