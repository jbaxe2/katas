import java.util.*;

public class EnoughIsEnough {
  public static int[] deleteNth (int[] elements, int maxOccurrences) {
    if (null == elements) {
      return null;
    }

    if (0 == maxOccurrences) {
      return new int[]{};
    }

    return _deleteNth (elements, maxOccurrences);
  }

  private static int[] _deleteNth (int[] elements, int maxOccurrences) {
    Map<Integer, Integer> occurred = new HashMap<>();
    List<Integer> filtered = new ArrayList<>();

    for (int element : elements) {
      int occurrences = occurred.getOrDefault (element, 0);

      if (occurrences < maxOccurrences) {
        occurred.put (element, occurrences + 1);
        filtered.add (element);
      }
    }

    return filtered.stream().mapToInt (Integer::valueOf).toArray();
  }
}
