package stack.and.queue;

public class Stack<T> {
  private Node top;

  public Stack() {
    this.top = null;
  }

  public Node getTop() {
    return top;
  }

  public void setTop(Node top) {
    this.top = top;
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
  public Integer getMax(){

    Node current= top;
    Node maxStack= top;

    while (current.getNext()!=null){

      if ((Integer)maxStack.getValue() < (Integer) current.getNext().getValue()){
        maxStack= current.getNext();
      }
      current= current.getNext();
    }

    return (Integer) maxStack.getValue();
  }
  public boolean isEmpty(){
return top == null;
  }
  public  String peak (){

    return isEmpty()?"the stack is empty":top.value.toString();
  }


}
