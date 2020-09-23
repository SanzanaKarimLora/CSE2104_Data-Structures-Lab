
import java.util.Random;


public class BubbleSort {
    static int ar[] = new int[1000];
     static int k, n=1000, t, comparison=0, swap=0;
    public static void main(String[] args) {
        
        Random rn = new Random(1000);
        for(int i = 0; i < ar.length; i++){
            ar[i] = rn.nextInt();
            System.out.println(ar[i]);
        }
        
        long startTime = System.currentTimeMillis();
        bubbleSort();
        long stopTime = System.currentTimeMillis();
        long totalTime = stopTime - startTime;
        
        System.out.println("Total time in bubble sort is : " + totalTime);
        
    }
    
    public static void bubbleSort(){
        k = n;
        while(k != 0){
            t = 0;
            for(int j = 0; j < k - 1; j++){
                comparison++;
                if(ar[j] > ar[j+1]){
                    int temp = ar[j+1];
                    ar[j+1] = ar[j];
                    ar[j] = temp;
                    
                    t = j+1;
                    swap++;
                }
                
            }
            k = t;
        }
        
        System.out.println("The sorted array: ");
        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
        
        System.out.println("Number of comparison count :" + comparison);
        System.out.println("Number of swap count :" + swap);
    }

    
}
