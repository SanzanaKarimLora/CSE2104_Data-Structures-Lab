
package assignment5;

import java.util.Scanner;

public class DoublyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList ls = new DoublyLinkedList();
        
        char num = 0;
        System.out.println("MENU : ");
        System.out.println("Press 1 to insert : ");
        System.out.println("Press 2 to delete : ");
        System.out.println("Press 3 to display  : ");
        System.out.println("Press 4 to exit : ");
       
        
        do{
           
        System.out.println("Enter your choice : ");
        num = sc.next().charAt(0);
        switch(num){
            
            case '1':
                System.out.println("Enter a number : ");
                int n = sc.nextInt();
                int p = sc.nextInt();
                ls.insertPosition(n, p);
                break;
                
            case '2':
                System.out.println("Enter the position which you want to delete : ");
                int pos = sc.nextInt();
                ls.deleteNode(pos);
                System.out.println();
                break;
                
            case '3':
                ls.display();
                break;
                
            case '4':
                System.out.println("Successfully exited.");
                break;
        }
        }while(num != '4');
        
        
       
    }
}
