package tree.intersection;



public class HashNode<T>{
  public String key;
  public T value;
  public HashNode next;

  public HashNode() {
  }

  public HashNode(String key, T value) {
    this.key = key;
    this.value = value;
  }

}

