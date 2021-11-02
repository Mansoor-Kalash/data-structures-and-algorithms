# Trees

***data structure can be defined recursively as a collection of nodes, where each node is a data structure consisting of a value and a list of references to nodes. The start of the tree is the "root node" and the reference nodes are the "children". No reference is duplicated and none points to the root.***

## Challenge

**get all value in the tree by breadth first (all element raw by raw from first element in the lift to last element in the right in eash raw in the tree)**

## WhiteBoard

![breadth](breadth.png)

## Approach & Efficiency

can get all element in the tree.
get all element raw by raw frome left to right
Time Big O is O(n)
Space Big O is O(n)


## Challenge

***create method that return the maximum number in the tree.***


## WhiteBoard
![max-tree](max-tree.png)

## API
breadthFirst:  input is Node Type Should be root in the tee. return integer ArrayList get the all element in tree presented in breadth first.


## Approach & Efficiency
can fet the maximum number even if the tree have just a root.
have an Exception if the tree is empty
Time Big O is O(n).
Space Big O is O(1).

## API
maxTree: no input return integer number represent the maximum number in the tree.
