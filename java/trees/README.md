# Trees

***data structure can be defined recursively as a collection of nodes, where each node is a data structure consisting of a value and a list of references to nodes. The start of the tree is the "root node" and the reference nodes are the "children". No reference is duplicated and none points to the root.***

## Challenge

***create method that return the maximum number in the tree.***

## WhiteBoard

![max-tree](max-tree.png)


## Approach & Efficiency
can fet the maximum number even if the tree have just a root.
have an Exception if the tree is empty
Time Big O is O(n).
Space Big O is O(1).

## API
maxTree: no input return integer number represent the maximum number in the tree.
