package chess;

class BoardSquare {
  private boolean isOccupied;
  private Piece piece;

  public BoardSquare(boolean isOccupied, Piece piece) {
    this.isOccupied = isOccupied;
    this.piece = piece;
  }
}
