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
        while (input != 5) {
            System.out.println("\n\nPress one of the following corresponding numbers");
            System.out.println("[1] To add somone to the phone book");
            System.out.println("[2] To delete someone from the phone book");
            System.out.println("[3] To search for someone in the phone book");
            System.out.println("[4] To find the exact person you are looking for.");
            System.out.println("[5] To quite the program");
            System.out.print("----------------------------------------------\n> ");
            input = keyBoard.nextInt();

            switch (input) {

                case 1:
                    System.out.print("Type the name you would like to add.\n>");
                    String name = personsName.nextLine();
                    System.out.print("Type the number you would like to add.\n>");
                    String number = personsName.nextLine();
                    tree.insert(name, number);
                    break;

                case 2:
                    System.out.print("Type the name you w^ould like to delete\n>");
                    tree.deleteKey(personsName.nextLine());
                    break;

                case 3:
                    tree.inorder();
                    System.out.println(tree.isEmptyCheck());
                    break;

                case 4: 
                    System.out.print("Type the name you would like to search for\n>");
                    name = personsName.nextLine();
                    tree.helper(name); break;

                case 5:
                    tree.WriteTo();
                    System.exit(0);
                    break;

            }

        }


    }

}