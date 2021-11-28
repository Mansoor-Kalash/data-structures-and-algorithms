package trees;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTest extends TestCase {

  public void testFizzBuss() {
    String actual = "";
    Tree tree1 = new Tree();
    KNode a = new KNode(1);
    KNode b = new KNode(2);
    KNode c = new KNode(3);

    tree1.addRoot(15);
    tree1.root.addChild(a);
    a.addChild(b);
    tree1.root.addChild(c);

    Tree t = tree1.fizzBuss(tree1);
    Queue<KNode> breadth = new LinkedList<>();
    breadth.add(t.root);

    while (breadth.peek() != null) {
      KNode front = breadth.remove();
      actual += front.info.toString();
      for (int i = 0; i < front.children.size(); i++) {
        breadth.add((KNode) front.children.get(i));

      }
    }
    String expected = "FizzBuzz" + "1" + "Fizz" + "2";
assertEquals(expected,actual);



  }
  @Test(expected=NoSuchFieldError.class)
  public void testFizzBuzzFailure(){
    Tree tree1 = new Tree();
    KNode a = new KNode(1);
    KNode b = new KNode(1);
    KNode c = new KNode(1);

    tree1.addRoot("h");
    tree1.root.addChild(a);
    a.addChild(b);
    tree1.root.addChild(c);


  }
}
