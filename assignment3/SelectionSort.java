
package assignment3;

import java.util.Random;

public class SelectionSort {
    public int ar[] = new int[1000];
    public int n;
    public int t;
    
    public SelectionSort(){
        this.n = 999;
        this.t = 0;
    }
    
    public void randomNumber(){
        Random rn = new Random();
        for(int i = 0; i < ar.length; i++){
            ar[i] = rn.nextInt();
        }
    }
    
    public void selectionSort(){
        for(int j = n; j >= 1; j--){
            t = 0;
            for(int k = 1; k <= j; k++){
                if(ar[t] < ar[k]){
                    t = k;
                }
                int temp = ar[j];
                ar[j] = ar[t];
                ar[t] = temp;
            }
        }
        System.out.println("The sorted array: ");
        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }
}

