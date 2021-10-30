package trees;

import java.util.ArrayList;

public class BinaryTree<T> {
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
    if (root != null){
      preOrderTree.add((T) root);
      preOrder(root.getLeft());
      preOrder(root.getRight());

    }
return preOrderTree;
  }
  public ArrayList<T> InOrder(Node root) {
    ArrayList<T> preOrderTree = new ArrayList<T>();
    if (root != null) {
      preOrder(root.getLeft());
      preOrderTree.add((T) root.getValue());

      preOrder(root.getRight());

    }
    return preOrderTree;
  }
  public ArrayList<T> postOrder(Node root) {
    ArrayList<T> preOrderTree = new ArrayList<T>();
    if (root != null) {
      preOrder(root.getLeft());
      preOrder(root.getRight());
      preOrderTree.add((T)root.getValue());


    }
    return preOrderTree;
  }

  }
