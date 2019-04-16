/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import node.Node;

public class StackReferenceBased {
    
    private Node top;
    
    public StackReferenceBased(){
        top = null;
    }
    
    public boolean isEmpty(){
       return top == null;
    }
    
    public void push(Object newItem){
        top = new Node(newItem, top);
    }
    
    public Object pop() throws RuntimeException{
        if(!isEmpty()){
            Node temp = top;
            top = top.getNext();
            return temp.getItem();
        }
        
        else{
            throw new RuntimeException("StackException on " + "pop stack empty");
        }
        
    }
    
    public void popAll(){
            top = null;
        }
    
    public Object peek() throws RuntimeException{
        if(!isEmpty()){
            return top.getItem();
        }
        else{
            throw new RuntimeException ("Stack on " +  "peek: stack empty");
        }
        
    }
    
    
    }
    
    

