package tree.intersection;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

public class HashTableTest extends TestCase {

  @Test
  public void test_AllCommonNodes() {
    BinarySearchTree bt = new BinarySearchTree();
    bt.add(30);
    bt.add(20);
    bt.add(50);
    bt.add(100);
    bt.add(150);
    bt.add(800);

    BinarySearchTree bt2 = new BinarySearchTree();
    bt2.add(30);
    bt2.add(20);
    bt2.add(50);
    bt2.add(100);
    bt2.add(150);
    bt2.add(800);


    ArrayList<String> actual = new ArrayList<>();
    actual.add("20");
    actual.add("30");
    actual.add("50");
    actual.add("100");
    actual.add("150");
    actual.add("800");

    assertEquals("Should equal [20, 30, 50, 100, 150, 800]", actual,
      HashTable.tree_intersection(bt, bt2));

  }

  @Test
  public void test_SomeCommonNodes() {
    BinarySearchTree bt = new BinarySearchTree();
    bt.add(30);
    bt.add(20);
    bt.add(50);
    bt.add(100);
    bt.add(150);
    bt.add(800);

    BinarySearchTree bt2 = new BinarySearchTree();
    bt2.add(30);
    bt2.add(20);
    bt2.add(50);

        ArrayList<String> actual = new ArrayList<>();
    actual.add("20");
    actual.add("30");
    actual.add("50");

    assertEquals("Should equal [20, 30, 50]", actual,
      HashTable.tree_intersection(bt, bt2));
  }

  @Test
  public void test_EmptyBinaryTree(){
    BinarySearchTree bt = new BinarySearchTree();

    BinarySearchTree bt2 = new BinarySearchTree();
    bt2.add(30);
    bt2.add(20);
    bt2.add(50);
    bt2.add(100);
    bt2.add(150);
    bt2.add(800);

    ArrayList<Integer> actual = new ArrayList<>();
    assertEquals("Should equal empty hashset", actual,
      HashTable.tree_intersection(bt, bt2));

  }
}
