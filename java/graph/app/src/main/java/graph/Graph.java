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
