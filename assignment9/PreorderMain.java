
package assignment9;

import java.util.Scanner;

public class PreorderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        Preorder pre = new Preorder();
        
        System.out.println("Enter the number of nodes in the tree : ");
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            pre.insert(sc.nextInt());
        }
        
        System.out.println("Preorder traversal is : ");
        pre.preorder();
    }
}
