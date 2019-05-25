/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Bioni
 */
public class Shape {

    private int x, y;
    
    public Shape(){
        x = 0;
        y =0;
    }
    
    public Shape(int newX, int newY){
        setX(newX);
        setY(newY);
    }
    
    public void setX(int newX){
        if(newX >= 0){
            x = newX;
        }
    }
    
    public void setY(int newY){
        if(newY >= 0){
            y = newY;
        }
        
    }
    
    public int getX(){
    return x;
}
    public int getY(){
        return y;
    }
    
    public String toString(){
        return "I am a Shape\n" + super.toString() + "\nMy (x, y) values are: " 
                + "("+ x + "," + y + ")";
    }
    
}
