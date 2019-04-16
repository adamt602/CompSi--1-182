/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import project3.StackException;

/**
 *
 * @author Bioni
 */
public class Chapter7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackException e = new StackException("Error, on pop(), stack is empty.");
        System.out.println(e.getMessage());
    }
    
}
