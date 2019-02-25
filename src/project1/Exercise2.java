
package project1;

/**
 * Name: Adam Potter
 * Date: 2/25/19 
 * Project description:  
 * 
 */
public class Exercise2 {
    
    public static void main(String[] args){
        //"Driver method" 
        System.out.println(harmonic(4));
        
        
        
    }
    
    public static double harmonic(int n){ //Method "stub" 
        if(n == 1){
            
        return 1;
        
        }
        
        else {
            
            return 1.0/n + harmonic(n - 1);
            
            
            
            
        }
        // n = 4 
//       double sum = 0;
//        sum = 1 / n;
//        n -= 1;
//        sum = 1 / n;


        
        
        
    }
    
}
