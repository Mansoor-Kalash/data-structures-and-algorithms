/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.add(40);
    tree.add(50);
    tree.add(10);
    ArrayList<Integer> i = tree.preOrder(tree.getRoot());
    for (Integer n :i){
      System.out.println(n);
    }
    System.out.println(tree.Contains(1));
    System.out.println(tree.preOrder(tree.getRoot()));
    tree.add(8);
  }

}
