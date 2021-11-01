/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
//        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void testTrees(){
      BinarySearchTree<Integer> tree = new BinarySearchTree<>();
      ArrayList<Integer> tset = new ArrayList<>();
assertEquals("Can successfully instantiate an empty tree",tset,tree.preOrder(tree.getRoot()));
      tree.add(40);
      tset.add(40);
      assertEquals("Can successfully instantiate a tree with a single root node",tset,tree.preOrder(tree.getRoot()));

      tree.add(50);
      tree.add(10);
      tset.add(10);
      tset.add(50);
      assertEquals("Can successfully add a left child and right child to a single root node",tset,tree.preOrder(tree.getRoot()));
assertFalse("Can successfully return a collection from a preorder traversal",tree.preOrder(tree.getRoot()).isEmpty());
      assertFalse("Can successfully return a collection from an inorder traversal",tree.InOrder(tree.getRoot()).isEmpty());
      assertFalse("Can successfully return a collection from a postorder traversal",tree.postOrder(tree.getRoot()).isEmpty());

    }
    @Test public void testGetMax(){
      BinarySearchTree<Integer> tree = new BinarySearchTree<>();
tree.add(10);
tree.add(13);
tree.add(1);
tree.add(9);
tree.add(15);
tree.add(12);
assertTrue(tree.treeMax() == 15);
      BinarySearchTree<Integer> treeHaveJustRoot = new BinarySearchTree<>();
      treeHaveJustRoot.add(1);
      assertTrue(treeHaveJustRoot.treeMax() == 1);


    }
    @Test(expected=NullPointerException.class)
  public void testTreeMaxFailure(){
      BinarySearchTree<Integer> tree = new BinarySearchTree<>();

      tree.treeMax();
    }
}