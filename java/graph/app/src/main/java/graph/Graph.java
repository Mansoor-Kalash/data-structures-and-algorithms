package graph;

import java.util.*;

public class Graph<T> {
  Map<Node<T>, List<Node<T>>> graph = new HashMap<>();


  public Graph() {
  }


  public Node<T> addNode (T value){
    Node newNode = new Node(value);
    graph.put(newNode,new ArrayList<>());

    return newNode;
  }

  public void addEdge (Node<T> root ,Node<T> neighbor ,boolean undirected){
    graph.get(root).add(neighbor);
    if (undirected){
      graph.get(neighbor).add(root);
    }

  }

  public Set<Node<T>> getNodes (){

    Set<Node<T>> visitedNodes = new HashSet<>();

    if (! graph.isEmpty()){

      graph.forEach((key, value)->{
        visitedNodes.add(key);
      });
      return visitedNodes;

    }else {
      return null;
    }


  }

  public List<Node<T>> getNeighbors(Node<T> neighbor){
    return graph.get(neighbor);


  }
  public List<Node<T>> breadthFirst(Node<T> root) {
    List<Node<T>> list = new ArrayList<>();
    Set<Node<T>> visitedNode = new HashSet<>();
    List<Node<T>> queue = new ArrayList<>();

    queue.add(root);
    visitedNode.add(root);

    while (!queue.isEmpty()) {

      Node<T> front = queue.get(0);
      queue.remove(0);
      list.add(front);

      for (int i = 0; i < graph.get(front).size(); i++) {

        if (!visitedNode.contains(graph.get(front).get(i))) {

          visitedNode.add(graph.get(front).get(i));
          queue.add(graph.get(front).get(i));
        }
      }

    }
    for (int i = 0; i < list.size(); i++) {

      System.out.println(list.get(i).value);
    }
    return list;
  }


  public int getSize(){
    return graph.size();
  }

  @Override
  public String toString() {
    return "Graph{" +
      "graph=" + graph +
      '}';
  }
}
