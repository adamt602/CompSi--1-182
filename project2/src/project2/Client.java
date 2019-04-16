/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Bioni
 */
public class Client {
    
    public static void main(String[] args){
        
        LinkedString bob = new LinkedString("How are");
        System.out.println(bob.toString());
        System.out.println(bob.charAt(4));
        LinkedString the = new LinkedString(" you?");
       
        System.out.println(bob.concat(the));
        LinkedString it = bob.subString(1, 3);
        System.out.println(it.toString());
        
                
    }
    
}
