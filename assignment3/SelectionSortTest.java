
package assignment3;

public class SelectionSortTest {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        
        ss.randomNumber();
        long startTime = System.currentTimeMillis();
        ss.selectionSort();
        long stopTime = System.currentTimeMillis();
        long totalTime = stopTime - startTime;
        
        System.out.println("Total time in selection sort is : " + totalTime);
    }
}
