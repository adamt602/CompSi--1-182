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
public interface StackInterface {
    
    public boolean isEmpty();
    public void popAll();
    public void push(char newItem);
    public void push(Object newItem) throws StackException;
    public char pop() throws StackException;
    public char peek() throws StackException;
            
            
            
             
    
}
