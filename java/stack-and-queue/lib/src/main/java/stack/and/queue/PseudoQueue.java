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
  public String dequeue() {
    String output = "";

    if (stack2.isEmpty()){
      System.out.println("the stack is empty");
      return "the stack is empty";
    }else{
      output = stack2.pop();

    }
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        T newValue = (T) stack1.getTop().getValue();
        stack2.push(newValue);
        stack1.pop();
      }
    }

return output;

  }

  @Override
  public String toString() {
    return  stack2.peak();
  }
}
