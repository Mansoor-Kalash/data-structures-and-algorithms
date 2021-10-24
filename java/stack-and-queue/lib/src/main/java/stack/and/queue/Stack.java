package stack.and.queue;

public class Stack<T> {
  private Node top;

  public Stack() {
    this.top = null;
  }
  public void push(T value){
Node newNode = new Node(value);
newNode.next=top;
top=newNode;
  }

  public void pop (){
    if (isEmpty()){
      System.out.println("the stack is empty");
      return;
    }
    Node current = top;
    top = top.next;
    current.next=null;
  }
  public boolean isEmpty(){
return top == null;
  }
  public  String peak (){

    return isEmpty()?"the stack is empty":top.value.toString();
  }


}
