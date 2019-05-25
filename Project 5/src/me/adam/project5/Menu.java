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
        while (input != 0) {
            System.out.println("Press one of the following corresponding numbers");
            System.out.println("[1] To add somone to the phone book");
            System.out.println("[2] To delete someone from the phone book");
            System.out.println("[3] To search for someone in the phone book");
            System.out.println("[4] To quite the program");
            input = keyBoard.nextInt();

            switch (input) {

                case 1:
                    System.out.println("Type the name you would like to add.");
                    String name = personsName.nextLine();
                    System.out.println("Type the number you would like to add.");
                    String number = personsName.nextLine();
                    tree.insert(name, number);
                    break;

                case 2:
                    System.out.println("Type the name you would like to delete");
                    tree.deleteKey(personsName.nextLine());
                    break;

                case 3:
                    tree.inorder();
                    System.out.println(tree.isEmptyCheck());
                    break;

                case 4:
                    System.exit(0);
                    break;

            }

        }

//        tree.insert("Zyan");
//        tree.insert("todd");
//        tree.insert("bob");
//        tree.insert("sally");
//        tree.insert("Adam");
//        tree.insert("Sydeny");
//        tree.insert("it");

        tree.inorder();
        System.out.println("\n");
        System.out.println("Inorder traversal of the given tree");
        tree.inorder();

        System.out.println("\nDelete Adam");
        tree.deleteKey("Adam");
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete it");
        tree.deleteKey("it");
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\nDelete Sydeny");
        tree.deleteKey("Sydeny");
        System.out.println("Inorder traversal of the modified tree");

    }

}
