package linked.list;

public class LinkedList<T> {
  Node head;

  LinkedList(){
    this.head=null;

  }

 void add (T value){
    Node temp = head;

    head = new Node(value);

    head.next = temp;


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
