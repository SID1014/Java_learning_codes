

public class Minesweeper {

  public static void main(String[] args) {

    int rows = Integer.parseInt(args[0]);
    int cols = Integer.parseInt(args[1]);
    int mines = Integer.parseInt(args[2]);

    

    char[][] board = new char[rows][cols];
   

    // Place mines randomly
    for (int i = 0; i < mines; i++) {
      int row = (int) (Math.random()*rows);
      int col = (int) (Math.random()*cols);
      while (board[row][col] == '*') {
        // Ensure unique mine placement
        row = (int) (Math.random()*rows);
        col = (int) (Math.random()*cols);
      }
      board[row][col] = '*';
    }

    // Count neighboring mines for empty cells
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        if (board[row][col] != '*') {
            int count = 0;
            for (int i = Math.max(0, row - 1); i <= Math.min(row + 1, board.length - 1); i++) {
              for (int j = Math.max(0, col - 1); j <= Math.min(col + 1, board[0].length - 1); j++) {
                if (i != row || j != col && board[i][j] == '*') {
                  count++;
                }
              }
            }
          board[row][col] = (char) (count + '0');
        }
      }
    }

    for (int row = 0; row < board.length; row++) {
        for (int col = 0; col < board[0].length; col++) {
          System.out.print(board[row][col] + "  ");
        }
        System.out.println();
      }
  }

}