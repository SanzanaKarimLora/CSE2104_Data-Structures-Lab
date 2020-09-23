
package assignment13;


public class Insert_Delete_ListPrint {
    
    public void arrayPrint(int arr[][]){
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i][0] != 100000)
                System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
    
    public void point(int arr[][]){
        
        for (int i=0; i < arr.length; i++){
            
            if (arr[i][0] != 100000) {
                arr[i][1] = storeIndexNumber(arr, i);
            }
        }
        if (arr[arr.length-1][1] == 0){
            arr[arr.length-1][1] = -1;
        }
    }
    public int storeIndexNumber(int arr[][], int next){
        for (int i = next + 1; i < arr.length; i++){
            
            if (arr[i][0] != 100000) {
                return i;
            }
        }
        return -1;
    }
    
    public void delete(int arr[][], int x){
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i][0] == x){
                arr[i][0] = 100000;
                arr[i][1] = -1;
                break;
            }
        }
    }
    
    public void printIndex(int arr[][], int index){
        int i = index;
        if (i != -1) {
            while (i < arr.length) {
                System.out.println(arr[i][0]);

                if (arr[i][1] == -1) {
                    break;
                }
                i = arr[i][1];
            }
        }else {
            System.out.println("Noting to Print");
        }
    }
    
    public void insert(int arr[][], int data){
        int i = nullIndex(arr);
        if (i != -1){
            arr[nullIndex(arr)][0] = data;
            System.out.println("Inserted data : ");
        }
        else
            System.out.println("No Empty Space to Store data");
    }
    public int nullIndex(int arr[][]){
        for (int i = 0; i < arr.length; i++){
            
            if (arr[i][0] == 100000) {
                return i;
            }
        }
        return -1;
    }
}
