/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.checkerframework.checker.units.qual.A;

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
Animal cat = new Cat("CAT","meme");
Animal dog = new Dog("dog","pochy");
Animal lion = new Animal("lion","semba");


AnimalShelter shelter = new AnimalShelter();
shelter.enqueue(cat);
shelter.enqueue(dog);
shelter.enqueue(lion);
    System.out.println(shelter.lstAnimalIn());


//cat.dequeue();
//    System.out.println("ssssssss"+cat.toString());


  }

}
