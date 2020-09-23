
package assignment4;

import java.util.Scanner;


public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Queue qu = new Queue(10);
        
        char num = 0;
        System.out.println("MENU : ");
        System.out.println("Press 1 to enqueue : ");
        System.out.println("Press 2 to dequeue : ");
        System.out.println("Press 3 to display the present array  : ");
        System.out.println("Press 4 to exit : ");
       
        
        do{
           
        System.out.println("Enter your choice : ");
        num = sc.next().charAt(0);
        switch(num){
            
            case '1':
                System.out.println("Enter a number : ");
                int n = sc.nextInt();
                qu.enqueue(n);
                break;
                
            case '2':
                System.out.println("Dequeued item : ");
                System.out.println(qu.dequeue());
                break;
                
            case '3':
                qu.display();
                break;
                
            case '4':
                System.out.println("Successfully exited.");
                break;
        }
        }while(num != '4');
    }
}
