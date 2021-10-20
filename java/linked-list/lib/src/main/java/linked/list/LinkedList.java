package linked.list;

public class LinkedList<T> {
  Node head;
  int size = 0;

  LinkedList(){
    this.head=null;

  }

 void add (T value){
    Node temp = head;

    head = new Node(value);

    head.next = temp;

size +=1;

  }


  boolean include (T value){
    Node current = head;
    while (current != null) {
if (current.value == value){
  return true;
}
      current = current.next;
    }
    return false;
  }
  void addLast(T value){
    Node current = head;
    while (current != null ) {
      if (current.next == null){
        Node newNode = new Node(value);
        current.next = newNode;
        newNode.next = null;
        size+=1;
        return;

      }
      current=current.next;
    }
  }
  void addBefore ( T before,T value){
    if (before==null){
      System.out.println("The value you want add after it, should not be null");
      return;
    }else if (head.value == before){
      add(value);
      size+=1;
      return;
    }
    Node current = head;

    while (current != null ) {
      if (current.next.value == before){
        Node newNode = new Node(value);
        newNode.next=current.next;
        current.next = newNode;
        size+=1;
        return;
      }
      current=current.next;
    }
  }
  void addAfter ( T after,T value){
    Node current = head;
    if (after==null){
      System.out.println("The value you want add after it, should not be null");
      return;
    }
    while (current != null ) {
      if (current.value == after){
        Node newNode = new Node(value);
        newNode.next=current.next;
        current.next = newNode;
        size+=1;
        return;
      }
      current=current.next;
    }
  }
  public int kthFromEnd(int k)  {

    if (k >size-1){
      System.out.println("the number is out the range");
      return 404;
    }

    int positon = size-k-1;

    Node current = head;
    if (positon == 0){

      return (Integer) current.value;
    }
    for (int i=0; i<positon-1;i++){
      current=current.next;
    }
    int value = (Integer)current.value;
    return value ;
  }

  public String toString(){
Node current = head;
String content = "";
    while (current != null) {
content += "{ "+current.value+" } ->";
      current = current.next;
    }
    content += "{ null }";
    return content;
  }


}
