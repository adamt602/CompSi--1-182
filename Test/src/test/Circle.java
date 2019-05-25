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
public class Circle extends Shape{
    
    private double radius;
    
    public Circle(){
        super();
        radius =0;
        
    }
    
    public void setRadius(double newRadius){
        if (newRadius > 0){
            radius = newRadius;
        }
    }
    
    public double getRadius(){
        return radius;
    }
    
    public String toString(){
        return "I am a Circle\n" + "My radius is: " + radius 
                + "\nMy (x, y location is: (" + getX() + "," + getY() + ")";
    }
    
}
