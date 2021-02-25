import java.util.*;
import java.util.stream.*;

public class EqualSidesArray {
  public static int findEvenIndex (int[] arr) {
    for (int i=0; i<arr.length-1; i++) {
      if (_determineIfIndex (arr, i)) {
        return i;
      }
    }

    return -1;
  }

  private static boolean _determineIfIndex (int[] arr, int possibleIndex) {
    int[] leftArray = Arrays.copyOfRange (arr, 0, possibleIndex);
    int[] rightArray = Arrays.copyOfRange (arr, possibleIndex+1, arr.length);

    return _sumsEquate (leftArray, rightArray);
  }

  private static boolean _sumsEquate (int[] firstArr, int[] secondArr) {
    final int firstSum = IntStream.of (firstArr).sum();
    final int secondSum = IntStream.of (secondArr).sum();

    return firstSum == secondSum;
  }
}
