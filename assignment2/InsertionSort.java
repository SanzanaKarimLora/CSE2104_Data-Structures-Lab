
package assignment2;

import java.util.Random;

public class InsertionSort {
    public int ar1[] = new int[1000];
    public int t;
    public int i;
    public int n;
    public int compare;
    public int movement;
    
    public InsertionSort(){
        this.i = 0;
        this.n = 1000;
        this.compare = 0;
        this.movement = 0;
    }
    
    public void randomNumber(){
        Random rn = new Random();
        for(int i = 1; i < n; i++){
            ar1[i] = rn.nextInt();
        }
    }
     
    public void insertionSort(){
        ar1[0] = -2147000000;
        for(int j = 2; j < n; j++){
            t = ar1[j];
            movement++;
            i = j - 1;
            compare++;
            while((i > -1) && (t < ar1[i])){
                ar1[i + 1] = ar1[i];
                movement++;
                i = i - 1;
            }
            ar1[i + 1] = t;
            movement++;
        }
        
        System.out.println("The sorted array: ");
        for(int j = 0; j < ar1.length; j++){
            System.out.println(ar1[j]);
        }
        
        System.out.println("Total number of data comparison : " + compare);
        System.out.println("Total number of data movement : " + movement);
    } 
}
