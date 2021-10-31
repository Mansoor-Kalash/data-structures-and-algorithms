# Trees

***data structure can be defined recursively as a collection of nodes, where each node is a data structure consisting of a value and a list of references to nodes. The start of the tree is the "root node" and the reference nodes are the "children". No reference is duplicated and none points to the root.***

## Challenge

### Create a Binary Tree class

include a method for each of the depth first traversals:

1. pre order: returns an array of the values, ordered appropriately.
2. in order: returns an array of the values, ordered appropriately.
3. post order:  returns an array of the values, ordered appropriately.

### Create a Binary Search Tree class

This class should be a sub-class of the Binary Tree Class, include methods:

1. Add: Adds a new node with that value in the correct location in the binary search tree.
2. Contains: Returns boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
1. Can successfully instantiate an empty tree.
2. Can successfully instantiate a tree with a single root node.
3. Can successfully add a left child and right child to a single root node
4. Can successfully return a collection from a preorder traversal
5. Can successfully return a collection from an inorder traversal
6. Can successfully return a collection from a postorder traversal

Big O
preOrder: time O(1) , Space O(n)
inOrder: time O(1), Space O(n)
postOrder: time O(1), Space O(n)
add : time O(n), Space O(1)
contains: time O(n), Space O(1)



## API
preOrder: return an array list of value for tree as root => left => right
inOrder: return an array list of value for tree as left » root » right
postOrder: return an array list of value for tree as left » right » root
add : accept value then add the value in the correct location in the binary search tree.
contains: accept value and check if it exist will return true else false.
