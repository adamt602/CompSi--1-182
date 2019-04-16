package queens;

/* File: Queens.java
 * Programmer: Adam Potter
 * Date: 4/8/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */
public class Queens {

    // Squares per row or column 
    public static final int BOARD_SIZE = 8;

    //Used to indicate ane empty square 
    public static final int EMPTY = 0;

    //Used to indicate a square that contains a queen
    public static final int QUEEN = 1;

    //Chess board
    private int board[][];

    public Queens() {
        board = new int[BOARD_SIZE][BOARD_SIZE];
        clearBoard();

    }

    public void clearBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = 0;
            }
        }
    }

    public void displayBoard() {
        for (int row = 0; row < board.length; row++) {
            System.out.print("\n|");
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column] + "|");
            }
        }
        System.out.println("\n");

    }

    public boolean placeQueens(int column) {

        if (column >= BOARD_SIZE) {
            return true; //Base case
        } else {
            boolean queenPlaced = false;
            int row = 0; //Number of squares in column

            while (!queenPlaced && (row < BOARD_SIZE)) {
                //If square can be attacked 

                if (isUnderAttack(row, column)) {

                    ++row;

                } else { //Place queen and consider next column
                    setQueen(row, column);
                    queenPlaced = placeQueens(column + 1);
                    //if no queen is possible in next column,
                    if (!queenPlaced) {
                        //backtrack: remove queen placed eariler 
                        // and try next square in column 
                        removeQueen(row, column);
                        ++row;
                    }
                }

            }

            return queenPlaced;
        }
    }

        private void setQueen(int row, int column) {
        //Sets a queen at square indicated by row and column
        board[row][column] = QUEEN;
    }

    private void removeQueen(int row, int column) {
        //Removes a queen at square indicated by row and column 
        board[row][column] = EMPTY;
    }

    private boolean isUnderAttack(int row, int column) {

        //Looks for queen behind
        for (int i = 0; i < column; i++) {
            if (board[row][i] == QUEEN) {
                return true;
            }
        }
        //Looks infront of queen
        for (int i = column + 1; i < BOARD_SIZE; i++) {
            if (board[row][i] == QUEEN) {
                return true;
            }

        }
//            //Looks horizontaly 
//            for(int i = 0; i < board.length; i++){
//                if(board[row][column] == QUEEN){
//                    return true;
//                }
//            }
        //Looks for queens vertically 
        for (int i = 0; i < BOARD_SIZE; i++) {

            if (board[row][i] == QUEEN) {
                return true;
            }
        }

        //Looks behind the queen in a negativly sloped diagonal line.
        for (int i = index(row), j = index(column); i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == QUEEN) {
                return true;
            }
        }
        //Looks in front of the queen in a negativly sloped diagonal line.
        for (int i = row + 1, j = column + 1; i < BOARD_SIZE && j < BOARD_SIZE; i++, j++) {
            if (board[i][j] == QUEEN) {
                return true;
            }
        }
        //Looks in front of the queen in a positivly sloped diagonal line
        for (int i = index(row), j = column + 1; i >= 0 && j < BOARD_SIZE; i--, j++) {
            if (board[i][j] == QUEEN) {
                return true;
            }
        }
        //Looks behind the queen in a positivly sloped diagonal line.
        for (int i = row + 1, j = index(column); i < BOARD_SIZE && j >= 0; i++, j--) {
            if (board[i][j] == QUEEN) {
                return true;
            }
        }

        return false;

    }

    private int index(int number) {
        return number - 1;
    }

}
