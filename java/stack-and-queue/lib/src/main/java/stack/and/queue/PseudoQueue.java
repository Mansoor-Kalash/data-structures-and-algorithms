package stack.and.queue;

public class  PseudoQueue<T> {
  private Stack<T> stack1 = new Stack<>();
  private Stack<T> stack2= new Stack<>();


  public void enqueue(T value){
    stack1.push(value);
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
       T newValue =(T)stack1.getTop().getValue();
        stack2.push(newValue);
        stack1.pop();
      }
    }

  }
  public void dequeue() {
    if (stack2.isEmpty()){
      System.out.println("the queue is empty");
    }else{
      stack2.pop();
    }
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        T newValue = (T) stack1.getTop().getValue();
        stack2.push(newValue);
        stack1.pop();
      }
    }
  }

  @Override
  public String toString() {
    return  stack2.peak();
  }
}
