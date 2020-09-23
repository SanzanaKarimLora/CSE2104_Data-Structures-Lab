
package assignment13;


public class Main {
    public static void main(String[] args) {
        
        Insert_Delete_ListPrint ob = new Insert_Delete_ListPrint();
        
        int arr[][] = new int[10][2];
        
        for (int i = 0, x = 10; i < arr.length; i++ ){
            arr[i][0] = x;
            x += 10;
        }
        
        System.out.println("Initial Condition : ");
        ob.point(arr);
        ob.arrayPrint(arr);
        System.out.println(" ");
        
        System.out.println("Deleting 10 30 50 100 : ");
        ob.delete(arr, 10);
        ob.delete(arr, 30);
        ob.delete(arr, 40);
        ob.delete(arr, 50);
        ob.delete(arr, 100);
        ob.point(arr);
        System.out.println(" ");
        
        System.out.println("After Deleting : ");
        ob.arrayPrint(arr);
        System.out.println(" ");
        
        System.out.println("Print the index of empty space : ");
        ob.printIndex(arr, ob.storeIndexNumber(arr, -1));
        System.out.println(" ");
        
        System.out.println("The Index of Empty space of the array are : ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i][1] == -1){
                System.out.println(i);
            }
        }
        System.out.println("");
        
        System.out.println("Inserting : ");
        ob.insert(arr, 10);
        ob.insert(arr, 40);
        ob.insert(arr, 100);
        ob.point(arr);
        ob.printIndex(arr, ob.storeIndexNumber(arr, -1));
        System.out.println(" ");
    }
}
