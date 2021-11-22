package hashtable;

public class Node <T>{
  public String key;
  public T value;
  public Node next;

  public Node() {
  }

  public Node(String key, T value) {
    this.key = key;
    this.value = value;
  }

}
