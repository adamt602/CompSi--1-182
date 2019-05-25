/* File: Node.Person
 * Programmer: Adam Potter
 * Date: 5/29/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */
package me.adam.project5;


public class Person {
    private String name, phoneNumber;
    private Person right, left;
    
    public Person(){
        name = "";
        phoneNumber = "";
        right = null;
        left = null;
    }
    
    public Person(String newName){
        setName(newName);
        phoneNumber = "";
        right = null;
        left = null;
    }
    
    public Person(String newName, String newPhoneNumber){
        setName(newName);
        setPhoneNumber(newPhoneNumber);
        right = null;
        left = null;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public Person getRight(){
        return right;
    }
    
    public Person getLeft(){
        return left;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setPhoneNumber(String newPhoneNumber){
        phoneNumber = newPhoneNumber;
    }
    public void setRight(Person newRight){
        right = newRight;
    }
    public void setLeft(Person newLeft){
        left = newLeft;
    }
}
