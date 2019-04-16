//the
package project2;

/**
 * Programmer: Adam Potter
 * Project Description: 
 */
public class LinkedString {
    private Node head;
    private int length;
    
    public LinkedString(char[] value){
       head = new Node(value[0]);
       int length = value.length;
       Node newNode = new Node(value[1]);
       head.setNext(newNode);
       Node perv = newNode;
       
       for(int i = 2; i <value.length; ++i){
       newNode = new Node(value[i]);
       perv.setNext(newNode);
       perv = newNode;
       }
    }
    
    public LinkedString(String original){
        this(original.toCharArray());
        
    }
    
    public char charAt(int index){
        Node curr = head;
        if(1 <= index){
            for(int i = 0; i < index; ++i){
            curr = curr.getNext();
            }
            return curr.getItem();
        }
        else{
            return curr.getItem();        }
    }
    
    
    
    public LinkedString concat(LinkedString str){
        return new LinkedString(toString() + str.toString());
    }
    public boolean isEmpty(){
        if(length == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int length(){
        return length;
    }
    
    public LinkedString subString(int beginIndex, int endIndex){
        String output = "";
        
        for(int counter = beginIndex; counter < endIndex; ++counter){
            output += charAt(counter);
        }
        return new LinkedString(output);
    }
    
    @Override
    public String toString(){
        String myString = "";
        Node curr = head;
        while(curr != null){
            myString += curr.getItem() + "";
            curr = curr.getNext();
        }
        return myString;
    }
    
    
}
