
package assignment3;


public class QuickSortTest {
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        
        qs.noOfElements();
        qs.enterElements();
        qs.QuickSort(0, qs.n -1);
    }
}
