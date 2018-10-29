package chess;

public class Piece {
  private PieceType type;
  private Team team;

  public Piece(PieceType type, Team team) {
    this.type = type;
    this.team = team;
  }
}
