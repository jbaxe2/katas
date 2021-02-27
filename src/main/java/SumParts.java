public class SumParts {
  public static int[] sumParts (int[] intArr) {
    if (null == intArr) {
      return new int[] {0};
    }

    return _sumParts (intArr);
  }

  private static int[] _sumParts (int[] intArr) {
    var result = new int[intArr.length+1];

    int fullSum = 0;
    int decrementBy = 0;

    for (int intNum : intArr) {
      fullSum += intNum;
    }

    for (int i=0; i<intArr.length; i++) {
      result[i] = fullSum - decrementBy;
      decrementBy += intArr[i];
    }

    result[intArr.length] = 0;

    return result;
  }
}
