
package assignment2;


public class InsertionSortTest {
    public static void main(String[] args) {
        InsertionSort ins = new InsertionSort();
        
        ins.randomNumber();
        
        long startTime = System.currentTimeMillis();
        ins.insertionSort();
        long stopTime = System.currentTimeMillis();
        long totalTime = stopTime - startTime;
        
        System.out.println("Total time in sorting: " + totalTime);
        
    }
    
}
