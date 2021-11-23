package tree.intersection;

public class BinarySearchTree<T> extends BinaryTree {

  public void add(T value) {
    try {
      Node newNode = new Node(value);

      if (getRoot() == null) {
        setRoot(newNode);
        return;
      } else  {
        Node current = getRoot();

        while (current != null) {
          if ((int) current.value > (int) value) {
            if (current.left == null) {
              current.left = newNode;
              return;
            }
            current = current.left;

          } else {
            if (current.right == null) {
              current.right = newNode;
              return;
            }
            current = current.right;
          }
        }


      }
    }catch (Exception e){
      System.out.println("error when add value ");
      e.getMessage();

    }

  }


  public boolean Contains(T value) {
    try {
      Node current = getRoot();
      if (getRoot() == null) {
        return false;
      }

      while (current != null) {
        if (current.value == value) {
          return true;
        } else if ((Integer) current.value > (Integer) value) {
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

    } catch (Exception e) {
      System.out.println("error when add value ");
      e.getMessage();

    }
    return false;

  }


}
