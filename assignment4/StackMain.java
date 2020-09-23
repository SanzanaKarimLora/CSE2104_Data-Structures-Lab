
package assignment4;

import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Stack st = new Stack(10);
        
        char num = 0;
        System.out.println("MENU : ");
        System.out.println("Press 1 to push : ");
        System.out.println("Press 2 to pop : ");
        System.out.println("Press 3 to display the present array  : ");
        System.out.println("Press 4 to exit : ");
       
        
        do{
           
        System.out.println("Enter your choice : ");
        num = sc.next().charAt(0);
        switch(num){
            
            case '1':
                System.out.println("Enter a number : ");
                int n = sc.nextInt();
                st.push(n);
                break;
                
            case '2':
                System.out.println("Popped item : ");
                System.out.println(st.pop());
                break;
                
            case '3':
                st.display();
                break;
                
            case '4':
                break;
        }
        }while(num != '4');
    }
    
}
