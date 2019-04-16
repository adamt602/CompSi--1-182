/* File: StringRecognizer.java
 * Programmer: Adam Potter
 * Date: 4/8/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */
package language;

import language.CheckLanguage;
import java.util.Scanner;

public class StringRecognizer {

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);

       

        System.out.println("Please type a string: ");
        String userInput = keyBoard.nextLine();
        //ABC$CBA
        CheckLanguage.checkLanguage(userInput);

    }

}
