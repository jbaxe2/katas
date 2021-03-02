public class Factorial {
  public int factorial (int n) throws IllegalArgumentException {
    _validateInput (n);

    if (0 == n) {
      return 1;
    }

    return _factorial (n);
  }

  private void _validateInput (int n) {
    if (0 > n) {
      throw new IllegalArgumentException (
        "Input for factorial cannot be negative."
      );
    }

    if (12 < n) {
      throw new IllegalArgumentException (
        "Unable to accept input greater than 12."
      );
    }
  }

  private int _factorial (int n) {
    if (1 < n) {
      return n * _factorial (n - 1);
    }

    return n;
  }
}
