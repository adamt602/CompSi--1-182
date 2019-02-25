
package project1;

import java.util.Scanner;

/**
 * Name: Adam Potter
 * Date: 2/25/19 
 * Project description:  
 * 
 */
public class CreditCardTester {
    
    public static void main(String[] args){
        
        Scanner keyBoard = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);
        
        CreditCard c1 = new CreditCard();
        System.out.println("Welcome to Bank of America: Would you like to create"
                + "an account with us? (Yes or No)");
        String input = keyBoard.next();
        
        if(input.equalsIgnoreCase("yes")|| input.equalsIgnoreCase("y")){
            System.out.println("Okay, lets work on getting everything set up.");
            System.out.println("What is your name?");
            String name = keyBoard.next();
            System.out.println("How much money do you have?");
            double balance = userInput.nextDouble();
            CreditCard c2 = new CreditCard(name, balance);
            System.out.println("Your account is all set up your account number is:"
                    + " " + c2.getAccountNumber());
            
            do{
                System.out.println("-----------------------------------------------");
                System.out.println("Type a number for one of the following options.");
                System.out.println("[0]Check account balance.");
                System.out.println("[1]Check Reward Points.");
                System.out.println("[2]Make a purchase.");
                System.out.println("[3]Make a payment.");
                System.out.println("[4]Take out a cash advance.");
                System.out.println("[5] Exit program");
                int userInput2 = keyBoard.nextInt();
                
                if(userInput2 == 0){
                    System.out.println("Your account balance is: " + 
                            c2.getAccountBalance());
                    
                }
                
                else if(userInput2 == 1){
                    System.out.println("You have: " + c2.getRewardPoints() + 
                            " Reward Points");
                }
                
                else if(userInput2 == 2){
                    System.out.println("How much is the purchase?");
                    double purchase = userInput.nextDouble();
                    c2.creditCardCharge(purchase);
                    
                }
                
                else if(userInput2 == 3){
                    System.out.println("You owe the bank: " + c2.getLoan() 
                            + "\nYour next due date is: " + c2.getdueDate());
                    System.out.println("How much would you like to pay?");
                    double payment = userInput.nextDouble();
                    if(c2.getAccountBalance() - payment > 0){
                        c2.makePayment(payment);
                    }
                    
                    else{
                        System.out.println("insufficient funds");
                    }
                }
                
                else if(userInput2 == 4){
                    System.out.println("How much mone would you like to take out?");
                    double takeOut = userInput.nextDouble();
                    c2.cashAdvance(takeOut);
                    
                }
                
                else { 
                    System.out.println("Have a nice day!");
                    System.exit(0);
                }
                
            }while(true);
                
           
            
        }
        
        else{
            System.out.println("Well maybe next visit you will!");
            System.exit(0);
        }
        
    }
    
    
    
}
