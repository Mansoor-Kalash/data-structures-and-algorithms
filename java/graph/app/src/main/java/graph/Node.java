package graph;

public class Node <T>{
  T value;
  int weight;

  public Node(T value, int weight) {
    this.value = value;
    this.weight = weight;
  }

  public Node(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }
}
