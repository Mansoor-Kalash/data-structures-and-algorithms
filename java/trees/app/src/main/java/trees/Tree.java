package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree<T> {
  public KNode root;


  public void addRoot(T info) {
    root = new KNode(info);
    root.parent = null;
    root.children = new ArrayList<KNode>();
  }



  public Tree fizzBuss(Tree t) {
    Queue<KNode> breadth = new LinkedList<>();
    breadth.add(root);

    while(breadth.peek()!=null){
      KNode front = breadth.remove();
      if (front != null) {
        if (((int) front.info % 15) == 0) {
          front.info= "FizzBuzz";
        } else if (((int) front.info % 5) == 0) {
          front.info= "Buzz";
        } else if (((int) front.info % 3) == 0) {
          front.info="Fizz";
        }else {
          front.info=front.info.toString();
        }
      }
      for (int i=0; i<front.children.size();i++){
        breadth.add((KNode) front.children.get(i));

      }
      }

 return t;
    }

  }



