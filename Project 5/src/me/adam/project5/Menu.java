/* File: Node.Menu
 * Programmer: Adam Potter
 * Date: 5/29/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */
package me.adam.project5;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        Scanner personsName = new Scanner(System.in);
        PhoneBook tree = new PhoneBook();
        int input = -1;
        while (input != 6) {
            System.out.println("\n\nPress one of the following corresponding numbers");
            System.out.println("[1] To add somone to the phone book");
            System.out.println("[2] To delete someone from the phone book");
            System.out.println("[3] To search for someone in the phone book");
            System.out.println("[4] To find the exact person you are looking for.");
            System.out.println("[5] To change phone number.");
            System.out.println("[6] To quite the program");
            System.out.print("----------------------------------------------\n> ");
            input = keyBoard.nextInt();

            switch (input) {

                case 1:
                    tree.takeInPeople();
                    System.out.print("Type the name you would like to add.\n>");
                    String name = personsName.nextLine();
                    System.out.print("Type the number you would like to add.\n>");
                    String number = personsName.nextLine();
                    tree.insert(name, number);
                    break;

                case 2:
                    tree.takeInPeople();
                    System.out.print("Type the name you would like to delete\n>");
                    tree.deleteKey(personsName.nextLine());
                    break;

                case 3:
                    tree.takeInPeople();
                    tree.inorder();
                    System.out.println(tree.isEmptyCheck());
                    break;

                case 4: 
                    tree.takeInPeople();
                    System.out.print("Type the name you would like to search for\n>");
                    name = personsName.nextLine();
                    tree.helper(name); break;
                    
                case 5: 
                    tree.takeInPeople();
                    System.out.println("Type the name of the person you would "
                        + "like to change the number to.");
                name = personsName.nextLine();
                System.out.print("Type the number you would like to add.\n>");
                number = personsName.nextLine();
                tree.change(name, number);
                 break;
               

                case 6:
                    tree.WriteTo();
                    System.exit(0);
                    break;

            }

        }


    }

}