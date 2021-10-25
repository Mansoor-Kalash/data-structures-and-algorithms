package stack.and.queue;

public class Queue <T>{
  Node front;
  Node rear;

  public Queue() {
    this.front = null;
    this.rear = null;
  }
  public boolean isEmpty (){
    return front == null;
  }
  public void enqueue(T value){
    Node newNode = new Node(value);
if (isEmpty()){
  front = newNode;
}else {
  rear.next = newNode;
}
rear = newNode;
  }
  public String dequeue (){
    if (isEmpty()){
      return  "the queue is empty";
    }
    Node temp = front;
    front = front.next;
    temp.next = null;
    return temp.value.toString();
  }
public String peak (){
    return isEmpty()?"the queue is empty":front.value.toString();
}


}
