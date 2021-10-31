package trees;

public class BinarySearchTree<T> extends BinaryTree {

  public void add(T value) {

    Node newNode = new Node(value);
    Node current = getRoot();
    try {
      if (getRoot() == null) {
        setRoot(newNode);
        return;
      }

      while (current != null) {
        if ((Integer) current.value > (Integer) value) {
          if (current.left == null) {
            current.left = newNode;
          }
          current = current.left;

        } else {
          if (current.right == null) {
            current.right = newNode;
          }
          current = current.right;
        }
      }
    }catch (ClassCastException e){
      System.out.println(e.getCause());
    }

  }

  public boolean Contains(T value){
    Node current = getRoot();
    if (getRoot() == null) {
      return false;
    }

    while (current != null) {
      if (current.value == value){
        return true;
      }else if ((Integer) current.value > (Integer) value) {
        if (current.left == null) {
          return false;
        }
        current = current.left;

      } else {
        if (current.right == null) {
          return true;
        }
        current = current.right;
      }
    }
    return false;
  }
}
