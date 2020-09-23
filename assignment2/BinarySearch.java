
package assignment2;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public int ar1[] = new int[1000];
    public int item;
    public int low;
    public int high;
    public int mid;
    public int k, n, t;
    
    
    public BinarySearch(){
        this.item = 0;
        this.low = 0;
        this.high = 1000;
        this.n = 1000;
    }
    
    public void randomNumber(){
        Random rn = new Random();
        for(int i = 0; i < ar1.length; i++){
            ar1[i] = rn.nextInt();
        }
    }
    
    public void sortNumbers(){
        k = n;
        while(k != 0){
            t = 0;
            for(int j = 0; j < k - 1; j++){
                if(ar1[j] > ar1[j+1]){
                    int temp = ar1[j+1];
                    ar1[j+1] = ar1[j];
                    ar1[j] = temp;
                    
                    t = j+1;
                    
                }
                
            }
            k = t;
        }
        
        System.out.println("The sorted array: ");
        for(int i = 0; i < ar1.length; i++){
            System.out.println(ar1[i]);
        }
    }
    
    public void enterElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item which you want to search: ");
        item = sc.nextInt();
    }
    
    public void binarySearch(){
        
        for(int i = 0; i < ar1.length; i++){
            mid = (low + high)/2;
            if(ar1[mid] == item){
                System.out.println("Entered element is found in " + mid + " position");
                break;
            }
            if(ar1[mid] < item){
                low = mid + 1; 
            }
            if(ar1[mid] > item){
                high = mid - 1;
            }
            
        }
        if(low > high){
                System.out.println(item + " is not found in this array.");
                
            }
        
        
            
    }
}
