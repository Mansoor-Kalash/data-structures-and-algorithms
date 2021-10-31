# Trees

***data structure can be defined recursively as a collection of nodes, where each node is a data structure consisting of a value and a list of references to nodes. The start of the tree is the "root node" and the reference nodes are the "children". No reference is duplicated and none points to the root.***

## Challenge

***create method that return the maximum number in the tree.***

## WhiteBoard

![max-tree](max-tree.png)

## Approach & Efficiency
can fet the maximum number even if the tree have just a root.
have an Exception if the tree is empty
Time Big O is O(1).
Space Big O is O(1);

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
