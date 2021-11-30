package graph;

import java.util.*;

public class Graph<T> {
  Map<Node<T>, List<Node<T>>> graph = new HashMap<>();
  Map<Node<String>, List<Node<String>>> graphh = new HashMap<>();
//  private Integer totalCost = 0;


  public Graph() {
  }


  public Node<T> addNode (T value){
    Node<T> newNode = new Node<>(value);
    graph.put(newNode,new ArrayList<>());

    return newNode;
  }


  public void addEdge (Node<T> root ,Node<T> neighbor ,boolean undirected){
    graph.get(root).add(neighbor);
    if (undirected){
      graph.get(neighbor).add(root);
    }

  }
  public void addEdge(String label1, String label2, int weight) {
    Node<String> wVertex1 = new Node<>(label1, weight);
    Node<String> wVertex2 = new Node<>(label2, weight);

    Node<String>  vertex1 = new Node<>(label1, weight);
    Node<String>  vertex2 = new Node<>(label2, weight);

    graphh.get(vertex1).add(wVertex2);
    graphh.get(vertex2).add(wVertex1);
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
  private int totalCost = 0;
  public int citiesTrip(Graph<String> graph, List<String> cities){
    totalCost = 0;
    if (cities.size() <= 1  ){
      return 0;
    }
    if(graph == null){
      return 0;
    }
    for (int i = 0; i < cities.size()-1; i ++){
      calculatePrice(cities.get(i), cities.get(i + 1), graph);
    }

    return totalCost;
  }

  private void calculatePrice(String city1, String city2, Graph<String> graph){
    Node<String> vertex= new Node(city1);
    if (graph.getNeighbors(vertex) == null){
      return;
    }

    for (Node vertex1: graph.getNeighbors(vertex)) {
      if (Objects.equals(city2, vertex1.value)){
        totalCost += vertex1.weight;
        break;
      }
    }
  }

//  public Integer businessTrip(Graph graph, List<String> cities){
//    totalCost = 0;
//    int citiesSize = cities.size();
//
//    for (int i = 0; i < citiesSize; i ++){
//      if (i + 1 >= citiesSize){
//        break;
//      }
//      helperTrip(cities.get(i), cities.get(i + 1), graph);
//    }
//
//    return totalCost;
//  }
//
//  private void helperTrip(String city1, String city2, Graph graph){
//    if (graph.getNeighbors(new Node(city1)) == null){
//      return;
//    }
//    for (Node vertex: graph.getNeighbors(new Node(city1))) {
//      if (Objects.equals(city2, vertex.v)){
//        totalCost += vertex.weight;
//        break;
//      }
//    }
//  }

//  public String graphBusinessTrip(List<String> cities){
//        int cost = 0;
//        if (cities.size()<=1){
//            return "False, "+ cost + " $";
//        }
////        Node<String> newNode = new Node<>();
////        Node<String> newNode1 = new Node<>();
//
//
//        for (int i =0; i<cities.size(); i++){
//
//            Node<String> newNode = new Node<>(cities.get(i));
//            Node<String> newNode1 = new Node<>(cities.get(i+1));
//
//
//
//            if (graph.containsKey(newNode1)){
//                // if (getNeighbors((Node<T>) newNode).contains(newNode1)){
//                cost += newNode1.weight;
//
//
//            }else {
//                cost = 0;
//                break;
//            }
//        }
//        if (cost==0){
//            return "False, "+ cost + " $";
//        }else {
//            return "True, "+ cost + " $";
//        }
//
//
//    }
//      for (int i =0; i<cities.size(); i++)
//
//  {
//    Node<String> newNode = new Node<>();
//
//
//    newNode = graph.addNode(cities.get(i));
////            newNode1 =graph.addNode(cities.get(i+1));
//
//    if (newNode.weight == 0) {
//      return "False, " + cost + " $";
//
//
//    } else {
//      return "True, " + cost + " $";
//    }
//  }
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
