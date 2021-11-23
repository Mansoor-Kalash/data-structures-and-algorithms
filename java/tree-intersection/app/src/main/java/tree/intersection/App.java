/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree.intersection;

public class App {


    public static void main(String[] args) {
      HashTable<String,Integer> hashTable=new HashTable<>();
      hashTable.add("8",""+2);
      BinarySearchTree<Integer> tree = new BinarySearchTree<>();
      tree.add(150);
      tree.add(100);
      tree.add(200);
      tree.add(250);
      tree.add(75);
      tree.add(125);
      tree.add(175);
      tree.add(300);
      tree.add(160);
      tree.add(350);
      tree.add(500);

      BinarySearchTree<Integer> tree2 = new BinarySearchTree<>();
      tree2.add(42);
      tree2.add(15);
      tree2.add(100);
      tree2.add(200);
      tree2.add(500);
      tree2.add(600);
      tree2.add(125);
      tree2.add(160);
      tree2.add(175);
      tree2.add(350);



      System.out.println(tree.InOrder(tree.getRoot()));
      System.out.println(tree.InOrder(tree2.getRoot()));
      System.out.println(hashTable.tree_intersection(tree,tree2));

    }
}
