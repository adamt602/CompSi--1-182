
package project1;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Name: Adam Potter
 * Date: 2/25/19 
 * Project description:  
 * 
 */
public class Exercise {
    
    
    
    
    public static void main(String[] args){
        //"Driver Program" 
        
        int x = 2; 
        int n = 3;
        
       
        //System.out.println(power1(x, n));
        System.out.println(power2(x, n));
        
    }
    
    public static int power1(int x, int n){// Method "stub"
        
       
        
        int power1 = 1;
        
           for(int i = 0; i < n; i++){
               power1 *= x;
           }
        
        
        return power1;
    }
    
    public static int power2(int x, int n){ // Method "stub"
        
      
        
        if(n == 0){
            
            return 1;
        }
        
        else{
            
           
            
            return x* power2(x , n - 1);
        }
        
        
        
       
        
        
    }
    
}
