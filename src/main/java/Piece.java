package chess;

import java.util.List;

public interface Piece {
  public List<Location> getValidMoves(Board board);
}
