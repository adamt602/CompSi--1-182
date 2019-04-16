/* File: StringRecognizer.java
 * Programmer: Adam Potter
 * Date: 4/8/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */
package node;


public class Node {
    private Object item;
    private Node next;
    
    //default constructor 
    public Node(){
        item = null;
        next = null;
    }
            
   public  Node(Object newItem){
        item = newItem;
        next = null;
    }
   
   public Node(Object newItem, Node nextNode){
       item = newItem;
       next = nextNode;
   }
   
   public Object getItem(){
       return item;
   }
   
   public Node getNext(){
       return next;
   }
   
   public void setItem(Object newItem){
       item = newItem;
   }
   
   public void setNext(Node newNext){
       next = newNext;
   }
    
}
