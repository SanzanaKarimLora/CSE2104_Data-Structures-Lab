
package assignment6;

import java.util.Scanner;



public class TowerOfHanoi_R {
    
    public static int i = 1, j = 2, k = 3;
    
    
    public static void Hanoi(int n, int i, int j, int k){
        if(n == 1){
            System.out.println(i + " - " + k);
        }
        else{
            Hanoi(n-1, i, k, j);
            System.out.println(i + " - " + k);
            Hanoi(n-1, j, i, k);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of disks : ");
        int n = sc.nextInt();
        Hanoi(n, i, j, k);
        
    }
}
