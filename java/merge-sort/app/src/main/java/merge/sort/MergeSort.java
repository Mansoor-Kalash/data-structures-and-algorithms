package merge.sort;

import java.util.ArrayList;

public class MergeSort {
  public static int[] mergesort(int[] arr) {
    int n = arr.length;

    if (n > 1) {

      int mid = n / 2;
      int[] left = new int[mid];
      int[] right = new int[n - mid];
      for (int i = 0; i < mid; i++) {
        left[i] = arr[i];
      }

      for (int i = 0; i < (n - mid); i++) {
        right[i] = arr[mid + i];
      }


      mergesort(left);

      mergesort(right);
      merge(left, right, arr);


    }
    return arr;

  }

  public static int[] merge(int[] left, int[] right, int[] arr) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];

      } else {
        arr[k++] = right[j++];

      }

    }
    if (i == left.length) {
      for (int r = k; r < arr.length; r++) {
        arr[r] = right[j];
        j++;
      }

    } else {
      for (int r = k; r < arr.length; r++) {
        arr[r] = left[i];
        i++;
      }
    }

    return arr;

  }
}





