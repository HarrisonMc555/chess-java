package chess;

class Location {
  private int rowIndex;
  private int colIndex;

  private static final int MIN_ROW_INDEX = 0;
  private static final int MAX_ROW_INDEX = Board.BOARD_WIDTH;
  private static final int MIN_COL_INDEX = 0;
  private static final int MAX_COL_INDEX = Board.BOARD_HEIGHT;

  public Location(int rowIndex, int colIndex) {
    if (!isValidRowIndex(rowIndex)) {
      throw new IllegalArgumentException("Invalid row index: " + rowIndex);
    }
    if (!isValidColIndex(colIndex)) {
      throw new IllegalArgumentException("Invalid col index: " + colIndex);
    }
    this.rowIndex = rowIndex;
    this.colIndex = colIndex;
  }

  public int row() {
    return this.rowIndex;
  }

  public int col() {
    return this.colIndex;
  }

  private boolean isValidRowIndex(int rowIndex) {
    return MIN_ROW_INDEX <= rowIndex && rowIndex <= MAX_ROW_INDEX;
  }

  private boolean isValidColIndex(int colIndex) {
    return MIN_COL_INDEX <= colIndex && colIndex <= MAX_COL_INDEX;
  }
}
