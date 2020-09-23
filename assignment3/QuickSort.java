
package assignment3;

import java.util.Scanner;
public class QuickSort {
    Scanner sc = new Scanner(System.in);
    
    public int arr[] = new int[100];
    public int n, i, j;
    
    public QuickSort(){
        this.i = 0;
        this.j = 0;
        this.n = 0;
    }
    
    public void noOfElements(){
        System.out.println("Enter the no of elements : ");
        n = sc.nextInt();
    }
    
    public void enterElements(){
        System.out.println("Enter the elements : ");
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    
    public void QuickSort(int f, int l){
        if(f < l){
            i = f + 1;
            while((arr[i] < arr[f]) && (i <= l)){
                i = i + 1;
            }
            j = l;
            while(arr[j] > arr[f]){
                j = j - 1;
            }
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                do{
                    i = i + 1;
                }while(arr[i] <= arr[f]);
                do{
                    j = j - 1;
                }while(arr[j] >= arr[f]);
            }
            int temp = arr[f];
            arr[f] = arr[j];
            arr[j] = temp;
            QuickSort(f, j - 1);
            QuickSort(j + 1, l);
        }
        System.out.println("The sorted array : ");
        for(i = 0; i < n; i++){
            System.out.println(arr[i]);
        }        
        
    }
    
}
