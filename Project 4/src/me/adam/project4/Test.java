/* File: Test.java
 * Programmer: Adam Potter
 * Date: 4/24/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */
package me.adam.project4;


public class Test {
    
    public static void main(String[] args){
        Queue aQueue = new Queue();
        
        int length;
        
        for(length = 0; length < 9; length++){
            aQueue.enqueue( new Integer(length));
        }
        System.out.print("DeQueue method: ");
        for(int i = 0; i < length; i++){
            System.out.print(aQueue.dequeue() + ", ");
        }
        
        aQueue.enqueue(new Integer(100));
        System.out.println("\n" + "Peek method: " + aQueue.peek() + ", " +  aQueue.peek());
        
    }
    
    
    
}
