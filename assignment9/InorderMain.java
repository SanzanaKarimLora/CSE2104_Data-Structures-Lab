
package assignment9;

import java.util.Scanner;


public class InorderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        Inorder in = new Inorder();
        
        System.out.println("Enter the number of nodes in the tree : ");
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            in.insert(sc.nextInt());
        }
        
        System.out.println("Inorder traversal is : ");
        in.inorder();
    }
}
