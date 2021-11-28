package tree.intersection;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable <T, I >{
  private LinkedList<HashNode<T>>[] bucket;
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

  public HashNode<T> add(String key, T value){
    int index = hash(key);

    HashNode<T> newHashNode = new HashNode<T>(key,value);

    if(this.bucket[index] == null){
      this.bucket[index] = new LinkedList<>();
    }

    this.bucket[index].add(newHashNode);
    this.size++;
    return newHashNode;
  }
  public T get(String key){
    int index = hash(key);


    if(this.bucket[index] != null) {
      for (HashNode hashNode : this.bucket[index]) {
        if (hashNode.key.equals(key)) {
          return (T) hashNode.value;
        }
      }

    }
    return null;
  }

  public boolean contains(String key){
    int index = hash(key);

    if(this.bucket[index] != null){
      for( HashNode n : this.bucket[index]){
        if(n.key.equals(key)){
          return true;
        }
      }
    }
    return false;
  }

  public LinkedList<HashNode<T>>[] getBucket() {
    return bucket;
  }
  public int size(){
    return this.size;
  }
  static ArrayList<String> tree_intersection (BinarySearchTree Tree1, BinarySearchTree Tree2 ){

    ArrayList<Integer> Tree1Array= Tree1.InOrder(Tree1.getRoot());
    ArrayList<Integer> Tree2Array= Tree2.InOrder(Tree2.getRoot());

    HashTable<String,Integer> HashMap= new HashTable<>();
    ArrayList<String> arrayList = new ArrayList<>();


    for (int i =0;i<Tree1Array.size();i++){
      if (!HashMap.contains(Tree1Array.get(i).toString())){
        HashMap.add(Tree1Array.get(i).toString(),""+1);
      }else{
        HashMap.add(Tree1Array.get(i).toString(),HashMap.get(Tree1Array.get(i).toString())+1);

      }
    }
    for ( int i =0 ;i< Tree2Array.size();i++){
      if (!HashMap.contains(Tree2Array.get(i).toString())){
        HashMap.add(Tree2Array.get(i).toString(),""+1);

      }else{
        HashMap.add(Tree2Array.get(i).toString(),HashMap.get(Tree2Array.get(i).toString())+1);
        arrayList.add(Tree2Array.get(i).toString());
      }
    }
    return  arrayList;

  }



}
