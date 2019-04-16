package queens;

/* File: Client.java
 * Programmer: Adam Potter
 * Date: 4/8/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */


public class Client {

    public static void main(String[] args) {
        Queens bob = new Queens();
        

        for (int i = 0; i < Queens.BOARD_SIZE; i++) {
            bob.placeQueens(i);
        }

        bob.displayBoard();

    }

}
