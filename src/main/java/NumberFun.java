public class NumberFun {
  public static long findNextSquare (long possibleSquare) {
    return _isSquare (possibleSquare) ? _obtainNextSquare (possibleSquare) : -1;
  }

  private static boolean _isSquare (long possibleSquare) {
    double squareRoot = Math.sqrt (possibleSquare);
    double floor = Math.floor (squareRoot);

    return (squareRoot * squareRoot) == (floor * floor);
  }

  private static long _obtainNextSquare (long square) {
    double nextSquareDouble = Math.sqrt (square) + 1;

    return Double.valueOf (nextSquareDouble * nextSquareDouble).longValue();
  }
}
