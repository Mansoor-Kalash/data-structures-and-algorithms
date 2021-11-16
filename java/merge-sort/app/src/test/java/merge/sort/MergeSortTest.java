package merge.sort;

import junit.framework.TestCase;

import java.util.Arrays;
import org.junit.Test;

public class MergeSortTest extends TestCase {
@Test
  public void testMergesort() {
    int[] arr= {45,12,9,20};
    int[] result= MergeSort.mergesort(arr);
    int[] expected = {9,12,20,45};
    assertTrue("Should be equal", Arrays.equals(expected,result));
  }
@Test
  public void testMergesortIfArrayEmpty() {
    int[] arr= {};
    int[] result= MergeSort.mergesort(arr);
    int[] expected = {};
    assertTrue("Should be equal", Arrays.equals(expected,result));
  }
  @Test
  public void testMergeWithDuplicateValues(){
    int[] arr= {45,12,9,20,12,44,12,55,100,44};
    int[] result= MergeSort.mergesort(arr);
    int[] expected = {9,12,12,12,20,44,44,45,55,100};
    assertTrue("Should be equal", Arrays.equals(expected,result));
  }
}
