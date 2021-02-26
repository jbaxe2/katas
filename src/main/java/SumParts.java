import java.util.*;
import java.util.stream.*;

public class SumParts {
  public static int[] sumParts (int[] intArr) {
    if (null == intArr) {
      return new int[] {0};
    }

    return _sumParts (intArr);
  }

  private static int[] _sumParts (int[] intArr) {
    List<Integer> result = new ArrayList<>();

    List<Integer> intList =
      IntStream.of (intArr).boxed().collect (Collectors.toList());

    for (int i=0; i<intArr.length; i++) {
      result.add (_sumListParts (intList.subList (i, intArr.length)));
    }

    result.add (0);

    return result.stream().mapToInt (Integer::intValue).toArray();
  }

  private static int _sumListParts (final List<Integer> intList) {
    return intList.stream().mapToInt (Integer::intValue).sum();
  }
}
