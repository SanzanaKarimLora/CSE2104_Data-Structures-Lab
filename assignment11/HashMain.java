
package assignment11;

import java.util.Scanner;

public class HashMain {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       Hashing hash = new Hashing();
       
        System.out.println("Insert the values : ");
        for(int i = 0; i < 10; i++){
            hash.put(sc.nextInt(), sc.nextInt());
        }
        System.out.println(hash);
        
        System.out.println("Enter the value which you want to search : ");
        int n = sc.nextInt();
        
        for(int i = 0; i < 10; i++){
            /*if(hash.table[i] == n){
               System.out.println("Found!!!"); 
            }
            else{
               System.out.println("Not Found!!!");     
            }*/
        }
    }
}
