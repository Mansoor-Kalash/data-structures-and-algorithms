/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

public class Library {
  public static void main(String[] args) {
Stack <Integer> v = new Stack<>();
    System.out.println(v.isEmpty());
    System.out.println(v.peak());
    v.push(6);
    v.push(5);
    System.out.println(v.peak());
    v.pop();
    v.pop();
    v.pop();

    System.out.println(v.peak());
    Queue<Integer> n = new Queue<>();
    n.enqueue(1);
    System.out.println(n.dequeue());

    System.out.println(Bracket.validateBrackets("{{jhgjg}}"));
  }
}