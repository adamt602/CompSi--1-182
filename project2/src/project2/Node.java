
package project2;

/**
 *
 * @author Bioni
 */
public class Node {
    private char item; // for project 2 make char 
    private Node next;
    
    
    public Node(){
        item = 0;
        next = null;
    
}
    public Node(char newItem){
       setItem(newItem);
       next = null;
    }
    public Node(char newItem, Node newNext){
        setItem(newItem);
        setNext(newNext);
        
    }
    
    public char getItem(){
        return item;
    }
    public Node getNext(){
        return next;
    }
    public void setItem(char newItem){
        item = newItem;
    }    
    public void setNext(Node newNext){
        next = newNext;
    }
}
