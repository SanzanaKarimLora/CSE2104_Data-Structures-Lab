
package assignment9;

import java.util.Scanner;


public class PostorderMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        Postorder post = new Postorder();
        
        System.out.println("Enter the number of nodes in the tree : ");
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            post.insert(sc.nextInt());
        }
        
        System.out.println("Postorder traversal is : ");
        post.postorder();
    }
}
