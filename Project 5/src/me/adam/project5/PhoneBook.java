/* File: Node.PhoneBook
 * Programmer: Adam Potter
 * Date: 5/29/2019
 * Cource: CMPSCI 182 - Data Structures/Program Design
 * Description: 
 * Usage: 
 */
package me.adam.project5;

public class PhoneBook {

    private Person root, leftTree, rightTree;

    public PhoneBook() {
        root = null;
    }

    public boolean isEmptyCheck() {
        return root == null;
    }

    public Person search(Person root, String name) {

        // Base Cases: root is null or key is present at root 
        if (root == null || root.getName().hashCode() == name.hashCode()) {
            return root;
        }

        // val is greater than root's key 
        if (root.getName().hashCode() > name.hashCode()) {
            return search(root.getLeft(), name);

        }

        // val is less than root's key 
        return search(root.getRight(), name);
    }

    public void insert(String name, String number) {
        //method stub
        root = insertRec(root, name, number);

    }

    public Person insertRec(Person root, String name, String number) {

        if (root == null) {
            root = new Person(name, number);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (name.hashCode() < root.getName().hashCode()) {
            root.setLeft(insertRec(root.getLeft(), name, number));

        } else if (name.hashCode() > root.getName().hashCode()) {
            root.setRight(insertRec(root.getRight(), name, number));

        }

        /* return the (unchanged) node pointer */
        return root;
    }

    public void inorder() {
        inorderRec(root);

    }

    public void helper(String name) {
        searchFor(root, name);
    }

    public void searchFor(Person root, String name) {

        if (root != null && root.getName().hashCode() != name.hashCode()) {
            searchFor(root.getLeft(), name);
            if (root.getName().hashCode() != name.hashCode()) {

                searchFor(root.getRight(), name);
            }

        }

        if (root != null && root.getName().hashCode() == name.hashCode()) {
            System.out.println(root.getName() + " " + root.getPhoneNumber());
        }

    }

    public void inorderRec(Person root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.println(root.getName() + " " + root.getPhoneNumber());
            inorderRec(root.getRight());
        }
    }

    public void deleteKey(String name) {
        root = deleteRec(root, name);
    }

    /* A recursive function to insert a new key in BST */
    Person deleteRec(Person root, String name) {
        /* Base Case: If the tree is empty */
        if (root == null) {
            return root;
        }

        /* Otherwise, recur down the tree */
        if (name.hashCode() < root.getName().hashCode()) {
            root.setLeft(deleteRec(root.getLeft(), name));
        } else if (name.hashCode() > root.getName().hashCode()) {
            root.setRight(deleteRec(root.getRight(), name));
        } // if key is same as root's key, then This is the node 
        // to be deleted 
        else {
            // node with only one child or no child 
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }

            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.setName(minValue(root));

            // Delete the inorder successor 
            root.setRight(deleteRec(root.getRight(), root.getName()));
        }

        return root;
    }
    
    private Person findParent(Person curr, Person child){
        
        if(curr.getLeft() == child || curr.getRight() == child){
            return curr;
        }
        
        else if(child.getName().hashCode() > curr.getName().hashCode()){
            findParent(curr.getRight(), child);
        }
        
        else if(child.getName().hashCode() < curr.getName().hashCode()) {
            findParent(curr.getLeft(), child);
            
        }
        
        
            return curr;
        
            
    }

    public String minValue(Person root) {
        String minv = root.getName();
        while (root.getLeft() != null) {
            minv = root.getName();
            root = root.getLeft();
        }
        return minv;
    }

}
