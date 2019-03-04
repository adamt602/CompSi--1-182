
package project1;

/**
 * Name: Adam Potter
 * Date: 2/25/19 
 * Project description:  
 * 
 */
public class CreditCard {
    // Declare global variables 
    private String name, dueDate; 
    private int rewardPoints, accountNumber;
    private double accountBalance, loan, interestRate = 0.05, charges = 0;
       
    
    
    //Write constructor methods here.
    
   public CreditCard(){
       name = "default";
       accountNumber = (int)(Math.random() * (999999 - 100000) + 1);
       rewardPoints = 0;
       accountBalance = 0;
       dueDate = "5/1/19";
       loan = 0;
       
    }
   
    public CreditCard(String newName, double newAccountBalance){
       name = newName;
       accountNumber = (int)(Math.random() * (999999 - 100000) + 1);
       rewardPoints = 0;
       accountBalance = newAccountBalance;
       dueDate = "5/1/19";
       loan = 0;
    }
    

    //Write getter and setter methods here
    
    public String getName(){
        return name;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public int getRewardPoints(){
        return rewardPoints;
    }
            
    public double getAccountBalance(){
        return accountBalance;
    }
    
    public String getdueDate(){
        return dueDate;
    }
    
    public double getLoan(){
        
        return loan;
    }
    
    public void setName(String newName){
        name = newName;
    }
    public void creditCardCharge(double chargeAmount){
        if(chargeAmount > 0){
        loan += chargeAmount;
        }
        else{
            System.out.println("Error: This is not a charge!"); 
        }
    }
    
    public void cashAdvance(double newLoan){
        if(newLoan >= 0){
        
        double interest = newLoan * interestRate;
        loan = newLoan + interest;
        accountBalance += newLoan;
        
        }
        else{
            System.out.println("You cant take out a negative loan.");
        }
        
    }
    
    public void makePayment(double payment){
        if(payment >= 0 && loan > 0){
        loan -= payment;
        }
        
        else{
            System.out.println("No payment needed to be made.");
        }
    }

    //toString() methoid override goes here (optional) 
    
    public String toString(){
        
        return "Account number: " +accountNumber+ "\nAccount name: " + name 
                + "\nAccount balance: " + accountBalance + "Due Date: " + dueDate +
                "Reward points: " + rewardPoints;
    }
    
    
    
}
