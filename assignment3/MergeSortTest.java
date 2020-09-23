
package assignment3;


public class MergeSortTest {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        
        ms.noOfElements();
        ms.enterElements();
        ms.MergeSort(ms.A, ms.p, ms.r);
    }
}
