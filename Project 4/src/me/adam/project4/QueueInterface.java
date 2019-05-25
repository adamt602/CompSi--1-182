/* File: QueueInterface.java
 * Programmer: Adam Potter
 * Date: 4/24/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */
package me.adam.project4;


public interface QueueInterface {
    
    public boolean isEmpty();
    
    public void enqueue(Object newItem);
    
    public Object dequeue() throws QueueException;
    
    public void dequeueAll();
    
    public Object peek() throws QueueException;
    
}
