package trees;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;


import static org.junit.Assert.assertEquals;

public class BinaryTreeTest extends TestCase {

  public void testBreadthFirst() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(10);
    tree.add(11);
    tree.add(9);
    tree.add(8);
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(10);
    expected.add(9);
    expected.add(11);
    expected.add(8);
//    ArrayList breadth = tree.breadthFirst(tree.getRoot());
    assertEquals("should the return value be {10,9,qq,8}",expected,tree.breadthFirst(tree.getRoot()));

  }
  @Test(expected=NullPointerException.class)
  public void testBreadthFailure(){
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
Node node = new Node(null);
    tree.breadthFirst(node);
  }
}
