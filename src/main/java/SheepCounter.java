import java.util.stream.*;

public class SheepCounter {
  public int countSheeps (Boolean[] placedSheeps) {
    if (null == placedSheeps) {
      return 0;
    }

    return (int) Stream.of (placedSheeps).filter (sheep -> sheep).count();
  }
}
