
package assignment6;

import java.util.Scanner;

public class TOH_NonR {
   
   public static Stack hanoi[]; 
    
   public static void TowerOfHanoi(int n){
       hanoi = new Stack[4];
       for(int i = 0; i <= 3; i++){
           hanoi[i] = new Stack(4);
       }
       
       for(int d = n; d > 0; d--){
           hanoi[1].push(d);
       }
       
       showMovement(n, 1, 2, 3);
   }
   
   public static void showMovement(int n, int i, int j, int k){
       
       
       if(n > 0){
           showMovement(n-1, i, k, j);
           Integer d = (Integer) hanoi[i].pop();
           hanoi[j].push(d);
           System.out.println("Move disk " + d + " from tower "+ i + " to top of tower " + j);
           showMovement(n-1, k, j, i);

       }
       
       
   }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of disks : ");
        int n = sc.nextInt();
        TowerOfHanoi(n);
    }
}
