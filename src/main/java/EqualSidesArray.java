import java.util.*;

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
    final int firstSum = _sumArrayValues (firstArr);
    final int secondSum = _sumArrayValues (secondArr);

    return firstSum == secondSum;
  }

  private static int _sumArrayValues (int[] arr) {
    int sum = 0;

    for (int value : arr) {
      sum += value;
    }

    return sum;
  }
}
