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
//  void revers (LinkedList<Integer> old){
//
//    Node l1 = old.head;
//      LinkedList<Integer> reversLinkedList= new LinkedList<>();
//      Node current = reversLinkedList.head;
//    for (int i =0;i <old.size;i++){
//
//      Node temp = current;
//     current = new Node(l1.value);
//      current.next = temp1;
//
//      l1= l1.next;
//    }



//  }


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
  void Append(T value){
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
  void addBefore ( T before,T newValue){
    if (before==null){
      System.out.println("The value you want add after it, should not be null");
      return;
    }else if (head.value == before){
      add(newValue);
      size+=1;
      return;
    }
    Node current = head;
b
    while (current != null ) {
      if (current.next.value == before){
        Node newNode = new Node(newValue);
        newNode.next=current.next;
        current.next = newNode;
        size+=1;
        return;
      }
      current=current.next;
    }
  }
  void addAfter ( T after,T newValeu){
    if (after==null){
      System.out.println("The value you want add after it, should not be null");
      return;
    }
    Node current = head;

    while (current != null ) {
      if (current.value == after){
        Node newNode = new Node(newValeu);
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
//  public static LinkedList<Integer> zip(LinkedList<Integer> first , LinkedList<Integer> second){
//    LinkedList<T> zipList = new LinkedList<>();
//    Node current1 =  first.head;
//    Node current2 = second.head;
//
//    Node tf1 = current1.next;
//    Node ts2 = current2.next;
////    Node temp1 =tf1;
////      Node temp2 = ts2;
//      tf1.next = current2;
//    current2.next = tf1;
//
//    for (int i =0 ; i< first.size; i++){
//      Node temp1 =tf1;
//      Node temp2 = ts2;
//      current1.next=current2;
//      current2.next=temp1;
//      current1= current2.next;
//      current2=c;
//    }
//
//  }

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
