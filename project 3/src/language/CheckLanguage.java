/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package language;

import project3.StackReferenceBased;

/**
 *
 * @author Bioni
 */
public class CheckLanguage {
    
    public static void checkLanguage(String userInput){
                StackReferenceBased bob = new StackReferenceBased();
        int i = 0;

        while (i < userInput.length() && userInput.charAt(i) != '$') {
            bob.push(userInput.charAt(i));
            ++i;
        }
        ++i;
        boolean check = true;

        if (i < userInput.length()) {

            while (bob.isEmpty() != true && check == true && i < userInput.length()) {
                if(bob.peek() == userInput.charAt(i)){
                    System.out.println(bob.peek() + " = " + userInput.charAt(i));
                }
                check = (bob.pop() == userInput.charAt(i));
                i++;
            }

        } else {
            check = false;
        }

        System.out.println("The strings are the same is: " + check);
    }
    
}
