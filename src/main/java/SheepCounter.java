import error.*;

public class SheepCounter {
  public int countSheeps (Boolean[] placedSheeps) throws InvalidSheep {
    _verifySheepPlacements (placedSheeps);

    int count = 0;

    for (Boolean placedSheep : placedSheeps) {
      if (placedSheep) {
        count++;
      }
    }

    return count;
  }

  private void _verifySheepPlacements (Boolean[] placedSheeps) throws InvalidSheep {
    if (null == placedSheeps) {
      throw new InvalidSheep ("Sheep placements cannot be null.");
    }

    for (Boolean placedSheep : placedSheeps) {
      _verifySheepPlacement (placedSheep);
    }
  }

  private void _verifySheepPlacement (Boolean sheepPlacement) throws InvalidSheep {
    if (null == sheepPlacement) {
      throw new InvalidSheep ("Placements for sheep cannot be null.");
    }
  }
}
