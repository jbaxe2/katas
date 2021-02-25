import java.util.*;
import java.util.concurrent.atomic.*;

public class RowSumOddNumbers {
  public static int rowSumOddNumbers (int n) {
    List<List<Integer>> triangle = _buildOddTriangle (n);

    return _sumRow (triangle.get (n-1));
  }

  private static List<List<Integer>> _buildOddTriangle (int n) {
    var triangle = new ArrayList<List<Integer>>();

    for (int i=0; i<n; i++) {
      triangle.add (i, _buildOddRow (i));
    }

    return triangle;
  }

  private static List<Integer> _buildOddRow (int row) {
    var oddRow = new ArrayList<Integer>();
    int rowStart = row * row + row + 1;

    for (int i=0; i<=row; i++) {
      oddRow.add (i, (rowStart + 2 * i));
    }

    return oddRow;
  }

  private static int _sumRow (List<Integer> oddRow) {
    var sum = new AtomicInteger();

    oddRow.forEach (sum::addAndGet);

    return sum.get();
  }
}
