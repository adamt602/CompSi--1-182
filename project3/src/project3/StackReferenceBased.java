/* File: StackReferenceBased.java
 * Programmer: Adam Potter
 * Date: 4/8/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */
package project3;

import language.Node;

public class StackReferenceBased implements StackInterface {

    private Node top;

    public StackReferenceBased() {
        top = null;
    }

    public boolean isEmpty() {
        
        return top == null;

    }

    public void popAll() {
        top = null;
        
    }

    public void push(char newItem) {
        top = new Node(newItem, top);
    }
    
    
    public char pop() throws StackException {
        if(!isEmpty()){
            Node temp = top;
            top = top.getNext();
            return temp.getItem();
        }
        
        else{
            throw new StackException("Stack Exception on " + "pop Stack empty");
        }
    }

    public char peek() throws StackException {
        if(!isEmpty()){
            return top.getItem();
        }
        
        else{
            throw new StackException("StackException on " + "peek: stack empty");
        }
    }

    @Override
    public void push(Object newItem) throws StackException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
