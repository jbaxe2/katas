public class Xbonacci {
  public double[] tribonacci (double[] signature, int size) {
    if (1 > size) {
      return new double[]{};
    }

    if (3 > size) {
      return _createSmallSequence (signature, size);
    }

    return _createRegularSequence (signature, size);
  }

  private double[] _createSmallSequence (double[] signature, int size) {
    double[] sequence;

    if (1 == size) {
      sequence = new double[] {signature[0]};
    } else {
      sequence = new double[] {signature[0], signature[1]};
    }

    return sequence;
  }

  private double[] _createRegularSequence (double[] signature, int size) {
    var sequence = new double[size];

    _copySignatureIntoSequence (signature, sequence);
    _createSequenceEntries (sequence, size);

    return sequence;
  }

  private void _copySignatureIntoSequence (double[] signature, double[] sequence) {
    System.arraycopy (signature, 0, sequence, 0, signature.length);
  }

  private void _createSequenceEntries (double[] sequence, int size) {
    for (int i=3; i<size; i++) {
      sequence[i] = sequence[i-3] + sequence[i-2] + sequence[i-1];
    }
  }
}
