package hashtable;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable <T>{
  private LinkedList<Node<T>>[] bucket;
  private final int sizeHashTable = 15;
  private int size;

  public HashTable() {
    this.bucket = new LinkedList[sizeHashTable];
    this.size = 0;

  }
  public int hash(String key){
int hash = key.hashCode();
return    Math.abs(hash) % this.bucket.length;
  }

  public Node<T> add(String key, T value){
    int index = hash(key);

    Node<T> newNode = new Node<T>(key,value);

    if(this.bucket[index] == null){
      this.bucket[index] = new LinkedList<>();
    }

    this.bucket[index].add(newNode);
    this.size++;
    return newNode;
  }
  public T get(String key){
    int index = hash(key);


    if(this.bucket[index] != null) {
      for (Node node : this.bucket[index]) {
        if (node.key.equals(key)) {
         return (T) node.value;
        }
      }

    }
    return null;
  }

  public ArrayList<ArrayList<String>>  leftJoin(HashTable<String> synonym, HashTable<String> antonyms){
    ArrayList<ArrayList<String>> d2 = new ArrayList<>();
    ArrayList<String>d1 = new ArrayList<>();
    synonym.
   for (LinkedList<Node<String>> f: synonym.bucket){
     for (Node n : f){

     }
     if(f.getFirst().value != null){
       d1.add(f.getFirst().key.toString());
       d1.add(synonym.get(f.getFirst().key.toString()));
//       d1.add(antonyms.get(f.getFirst().key.toString()));
       d2.add(d1);
     }

    }
   return d2;
  }

  public boolean contains(String key){
    int index = hash(key);

    if(this.bucket[index] != null){
      for( Node n : this.bucket[index]){
        if(n.key.equals(key)){
          return true;
        }
      }
    }
    return false;
  }

  public LinkedList<Node<T>>[] getBucket() {
    return bucket;
  }
  public int size(){
    return this.size;
  }
}
