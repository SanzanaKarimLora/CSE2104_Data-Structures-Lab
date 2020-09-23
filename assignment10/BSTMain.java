
package assignment10;

import java.util.Scanner;


public class BSTMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        
        System.out.println("Binary Search Tree : ");          
        char ch;
        
        do{
            System.out.println("Binary Tree Operations : ");
            System.out.println("1. insert ");
            System.out.println("2. search");
            
            int choice = sc.nextInt();            
            switch (choice){
                case 1 : 
                System.out.println("Enter integer element to insert");
                bst.insert( sc.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bst.search( sc.nextInt() ));
                break;
                
             default : 
                System.out.println("Wrong Entry \n ");
                break; 
            }
            
            System.out.println("\nPost order traversal :");
            bst.postorder();
            System.out.println("\nPre order traversal :");
            bst.preorder();
            System.out.println("\nIn order traversal :");
            bst.inorder();
            
            System.out.println("\nDo you want to continue (Type y or n) ");
            ch = sc.next().charAt(0);   
        }while(ch == 'Y'|| ch == 'y');
        
    }
}
