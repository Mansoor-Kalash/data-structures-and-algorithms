package tree.intersection;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public  class BinaryTree<T> {
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
    ArrayList<T> InOrderTree = new ArrayList<T>();

    try{
      if (root != null) {
        InOrderTree.addAll(InOrder(root.getLeft()));
        InOrderTree.add((T) root.value);
        InOrderTree.addAll(InOrder(root.getRight()));
      }
    }catch (Exception e){
      System.out.println("error in InOrder ");
      e.getMessage();
    }


    return InOrderTree;
  }
  public ArrayList<T> postOrder(Node root) {
    ArrayList<T> postOrderTree = new ArrayList<T>();

    try{
      if (root != null) {
        postOrderTree.addAll(postOrder(root.getLeft()));
        postOrderTree.addAll(postOrder(root.getRight()));
        postOrderTree.add((T) root.value);

      }
    }catch (Exception e){
      System.out.println("error in postOrder ");
      e.getMessage();
    }


    return postOrderTree;


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
  public ArrayList<T> breadthFirst(Node root){
    ArrayList<T> breadth = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node element = queue.remove();
      breadth.add((T)element.value);
      if (element.left != null) {
        queue.add(element.left);
      }
      if (element.right != null) {
        queue.add(element.right);
      }

    }

    return breadth;
  }


}
