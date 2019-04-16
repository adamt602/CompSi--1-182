package postfixcalculator;
import java.util.Scanner;
import node.Node;
import stack.StackReferenceBased;


public class Main {

  //Create Empty Stack
  private static StackReferenceBased postfix = new StackReferenceBased();

  public static void main(String[] args) {
    //create scanner object
    Scanner keyBoard = new Scanner(System.in);
    //ask user for equation
    System.out.println("Please type in a postfixed expression: ");
    
    String userInput = keyBoard.nextLine();
    //TODO Run through userInput and push numbers
    for(int i = 0; i < userInput.length(); i++){
      if(!operandChecker(userInput.charAt(i))){
        postfix.push(Character.getNumericValue(userInput.charAt(i)));
      }else{
        doCalculation(userInput.charAt(i));

      }
    }
    
    System.out.println(postfix.pop());
  }

  private static boolean operandChecker(char test){
    return test == '+' || test == '-'|| test == '*' ||  test == '/' || test == '%';

  }

  private static void doCalculation(char operator){
    int operand2 = (Integer)postfix.pop();
    int operand1 = (Integer)postfix.pop();


    switch (operator) {
                case '+':
                     postfix.push(operand1 + operand2); break;
                case '-':
                    postfix.push(operand1 - operand2); break;
                case '*':
                    postfix.push(operand1 * operand2); break;
                case '/':
                    postfix.push(operand1 / operand2); break;
                case '%':
                    postfix.push(operand1 % operand2); break;
                default:
                    
            }
  }

  

}