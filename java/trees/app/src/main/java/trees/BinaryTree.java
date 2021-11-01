package trees;

import java.util.ArrayList;

public abstract class BinaryTree<T> {
  private Node root;

  public BinaryTree() {
    this.root = null;
  }

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }
  public ArrayList<T> preOrder(Node root){
    ArrayList<T> preOrderTree = new ArrayList<T>();

    try{
      if (root != null) {
        preOrderTree.add((T) root.value);
        preOrderTree.addAll(preOrder(root.getLeft()));
        preOrderTree.addAll(preOrder(root.getRight()));
      }
    }catch (Exception e){
      System.out.println("error in preOrder ");
      e.getMessage();
    }


return preOrderTree;
  }
  public ArrayList<T> InOrder(Node root) {
    ArrayList<T> preOrderTree = new ArrayList<T>();
    try {
      if (root != null) {
        preOrder(root.getLeft());
        preOrderTree.add((T) root.getValue());

        preOrder(root.getRight());

      }
    }catch (Exception e){
      System.out.println("error when got InOrder");
      e.getMessage();
    }

    return preOrderTree;
  }
  public ArrayList<T> postOrder(Node root) {
    ArrayList<T> preOrderTree = new ArrayList<T>();

    try {
      if (root != null) {
        preOrder(root.getLeft());
        preOrder(root.getRight());
        preOrderTree.add((T)root.getValue());


      }
    }catch (Exception e){
      System.out.println("error when get post Order");
      e.getMessage();
    }

    return preOrderTree;
  }
  public int treeMax () {

    Node current = getRoot();
try {


    while (current.right != null) {

      current = current.right;

    }
  return (int)current.value;


}catch (Exception e){
  System.out.println("the tree is empty");
  e.getMessage();
}

    return (int)current.value;
  }

  }
