/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion.sort;

public class Library {
  public static void main(String[] args) {
//    int[] arr= {8,4,23,42,16,15};
    int[] arr = new int[0];
int [] arr2 = InsertionSort.insertionSort(arr);
    for (int th : arr2){
    System.out.println(th);
  }
  }


}