package stack.and.queue;

import java.util.Locale;

public class AnimalShelter extends Queue {

  public AnimalShelter() {
    super();
  }


  public  void enqueue (String value){
String valueUperCase = value.toString();
  if (valueUperCase == "CAT"||  valueUperCase == "DOG"){
    super.enqueue(valueUperCase);

  }

}

  public String dequeue(){

   String c = super.dequeue().toUpperCase();

   return c == "CAT"||c == "DOG"?c:null;

}



}
