package stack.and.queue;

import org.checkerframework.checker.units.qual.C;

import java.util.Locale;

public class AnimalShelter {
 private Queue<String> queue = new Queue<>();

  public AnimalShelter() {

  }



  public  void enqueue (Animal value){


if (value instanceof Cat || value instanceof Dog){
  queue.enqueue(value.getAnimalType());

  }else
    System.out.println("should be cat or dog");

}

  public String dequeue(String pref){
  if (pref.toLowerCase() == "cat"||pref.toLowerCase() == "dog"){
      return queue.dequeue();
    }
  return null;

}
public String lstAnimalIn(){
    return queue.rear.value.toString();
}



}
