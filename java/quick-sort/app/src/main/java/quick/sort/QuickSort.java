package quick.sort;

import java.util.Arrays;

public class QuickSort {

  public static int[] quickSort(int[] arr, int left, int right) {

    if (left < right) {
      int position = partition(arr, left, right);
      quickSort(arr, left, position - 1);
      quickSort(arr, position + 1, right);
    }
    return arr;
  }

  static int partition(int[] arr, int left, int right) {

    int pivot = arr[right];
    int low = (left - 1);

    for (int i = left; i <= right - 1; i++) {
      if (arr[i] < pivot) {
        low++;
        swap(arr, low, i);
      }
    }
    swap(arr, low + 1, right);
    return (low + 1);
  }

  static void swap(int[] arr, int i, int low) {
    int temp;
    temp = arr[i];
    arr[i] = arr[low];
    arr[low] = temp;
  }

}

