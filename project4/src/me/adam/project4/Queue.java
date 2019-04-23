/* File: Queue.java
 * Programmer: Adam Potter
 * Date: 4/24/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */
package me.adam.project4;

public class Queue implements QueueInterface {

    private Node lastNode, firstNode;

    //Default constructor 
    public Queue() {
        lastNode = null;
        firstNode = null;
    }

    //Checks to see if the queue is empty
    public boolean isEmpty() {
        return firstNode == null;
    }

    //removes everything from the que.
    public void dequeueAll() {
        firstNode = null;
        lastNode = null;
    }

    public void enqueue(Object newItem) {
        Node newNode = new Node(newItem);

        if (isEmpty()) {
            //insert into empty queue
            newNode.setNext(newNode);
            firstNode = newNode;
        } else {
            //insert into nonempty queue
            lastNode.setNext(newNode);
        }

        lastNode = newNode;
    }

    public Object dequeue() throws QueueException {
        Object temp;
        if (!isEmpty()) {
            //Queue is not empty remove front
            temp = firstNode.getItem();
            firstNode = firstNode.getNext();

            if (firstNode == lastNode) {
                lastNode = null;
            }
            return temp;
        } else {
            throw new QueueException("Queue Exception on dequeue: queue is empty");
        }
    }
    
    public Object peek() throws QueueException{
        if(!isEmpty()){
            //Queue is not empty retreave the front
            return firstNode.getItem();
        }
        
        else{
            throw new QueueException("Queue Exception on peek: queue is empty");
        }
    }

}
