package insertion.sort;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest extends TestCase {
  @Test
  public void testInsertionSort() {
    int[] arr= {8,4,23,42,16,15};//input
    int[] expected = {4,8,15,16,23,42};

    Assert.assertArrayEquals(expected,InsertionSort.insertionSort(arr));

  }

  @Test(expected=AssertionError.class)
  public void expectedFailure(){
    int[] arr = {};

      assertNull(InsertionSort.insertionSort(arr));

  }

}
