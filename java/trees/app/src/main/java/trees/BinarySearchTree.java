package trees;

public class BinarySearchTree<T> extends BinaryTree {

  public void add(T value){
    Node newNode = new Node(value);
    Node current = getRoot();
    if (getRoot() == null){
     setRoot(newNode);
     return;
    }

    while ((Integer)current.value>(Integer) value){

      if (current.left == null){
        current.left=newNode;
      }
      current= current.left;
    }else{
      if (current.right == null) {
        current.right = newNode;
      }
      current=current.right;
    }
   
  }
}
