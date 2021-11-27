# Graphs

A graph is a non-linear data structure that can be looked at as a collection of vertices  potentially connected by edges.

## Challenge

Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

1. add node
   Arguments: value
   Returns: The added node
   Add a node to the graph

2. add edge
   Arguments: 2 nodes to be connected by the edge, weight (optional)
   Returns: nothing
   Adds a new edge between two nodes in the graph
   If specified, assign a weight to the edge
   Both nodes should already be in the Graph

3. get nodes
   Arguments: none
   Returns all of the nodes in the graph as a collection (set, list, or similar)

4. get neighbors
   Arguments: node
   Returns a collection of edges connected to the given node
   Include the weight of the connection in the returned collection

5. size
   Arguments: none
   Returns the total number of nodes in the graph


## Approach & Efficiency

### the big O notation for each method

1. add node
   time = O(1)
   space = O(n)

2. add edge
   time = O(1)
   space = O(1)

3. get nodes
   time = O(n)
   space = O(n) because  declaring a HashSet.

4. get neighbors :
   time = O(1)
   space = O(1)

5. size
   time = O(1)
   space = O(1)

## API

1. add node : this method is to add a new node to the graph.

2. add edge : this method is to add a new edge between two Nodes in the graph.

3. get nodes : this method returns a HashSet which contains all the Nodes in the graph.

4. get neighbors : this method return a list of all the Nodes that are connected to the Node we pass.

5. size : this method returns the size of the graph HashSet.
