
package assignment3;

import java.util.Scanner;

public class MergeSort {
    Scanner sc = new Scanner(System.in);
    public int n1,n2,i,j,k,n,p,r;
    public int q;
    public int A[] = new int[1000]; 
    public int L[] = new int[n1+1];
    public int R[] = new int[n2+1];
    
    public MergeSort(){
        this.n = 0;
        this.p = 0;
        this.r = n-1;
    }
    
    public void noOfElements(){
        System.out.println("Enter the no of elements : ");
        n = sc.nextInt();
    }
    
    public void enterElements(){
        System.out.println("Enter the elements : ");
        for(i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
    }
    
    public void MergeSort(int A[], int p, int r){
        if(p < r){
            q = ((p + r)/2);
            MergeSort(A, p, q);
            MergeSort(A, (q + 1), r);
            Merge(A, p, q, r);
           
        
        }
        
        System.out.println("The sorted array : ");
        for(i = 0; i < n; i++){
            System.out.println(A[i]);
        }
        
        
    }
    
    public void Merge(int A[], int p, int q, int r){
        n1 = (q - p + 1);
        n2 = (r - q);
        for(i = 0; i < n1; i++){
            L[i] = A[p + i];
        }
        for(j = 0; j < n2; j++){
            R[j] = A[q + j + 1];
        }
        L[n1] = 984690;
        R[n2] = 984200;
        
        i = 0;
        j = 0;
        for(k = p; k <= r; k++){
            if(L[i] <= R[j]){
                A[k] = L[i];
                i++;
            }
            else{
                A[k] = R[j];
                j++;
            }
        }
        
        
    }
}
