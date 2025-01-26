# Tree Data Structure

Tree is a hierarchical data structure, it is used to represent and organize data in the form of a hierarchy (parent-child relationship).

## Some Real World Examples
1. **Folder Structure** in our operating system.
2. **Structure of an organization** forming a pyramid structure like:
   - Principal
   - HOD's
   - Teachers
   - Students

## Terminologies
1. **Parent Node**: The node which is a predecessor of a node is called the parent node of that node. For example: {A} is the parent node of {B, C}.
2. **Leaf**: It is the last node of the tree, which has null in the left and right subtree.
3. **Child Node**: A node which is a successor of another node is called a child node. For example: {B, C} are child nodes of {A}.
4. **Sibling**: Child nodes of the same parent are called sibling nodes.
5. **Root**: The topmost node of the tree is called the root.
6. **Subtree**: A child of the root having multiple children is called a subtree.

## Types of Tree Data Structure
There are 3 types of Tree:
1. **Binary Tree**: It can have at most 2 child nodes only (left and right).

2. **Ternary Tree**:
It can have atmost 3 child nodes (left, mid, right).

3. **Generic Tree**: Generic trees are a collection of nodes where each node is a data structure that consists of records and a list of references to its children(duplicate references are not allowed). Unlike the linked list, each node stores the address of multiple nodes.

Properties of Tree Data Structure:
1. **Number of Edges**: Edge can be defined as the connection between 2 nodes.
2. **Depth of Node**: It can be defined as the depth of node is equal to the number of childs of the root node, the more children there are, the greater the depth will be.
3. **Degree of Node**: It can be defined as the number of childs connected with a node is called the degree of node.
4. **Height of a node**: The height of a node can be defined as the length of the longest path from the node to a leaf node of the tree.
5. **Height of the Tree**: The height of a tree is the length of the longest path from the root of the tree to a leaf node of the tree.

## Advantages of Tree:
1. Efficient Searching: Tree DS is efficient for searching and retrieving data. The time complexity of searching is O(log n). It is better than arrays.

2. Fast Insertion & Deletion: Insertion and deletion of nodes can be done in O(log n) time. These tree provide sorted, floor and ceiling data.

3. Natural organization: Trees have a natural hierarchical organization that can be used to represent many types of relationships. This makes them particularly useful for representing things like file systems, organizational structures, and taxonomies.

4. Flexible size: Unlike Arrays, trees can easily grow or shrink dynamically depending on the number of nodes that are added or removed. This makes them particularly useful for applications where the data size may change over time.

## Disadvantages of Tree:

1. Memory overhead: Trees can require a significant amount of memory to store, especially if they are very large. This can be a problem for applications that have limited memory resources.

2. Imbalanced trees: If a tree is not balanced, it can result in uneven search times. This can be a problem in applications where speed is critical.

3. Complexity: Unlike Arrays and Linked Lists, Trees can be complex data structures, and they can be difficult to understand and implement correctly. This can be a problem for developers who are not familiar with them.

4. Search, Insert and Delete Times: If a problem requires only search, insert and delete, not other operations like sorted data traversal, floor, and ceiling, Hash Tables always beat Self Balancing Binary Search Trees.

5. The implementation and manipulation of trees can be complex and require a good understanding of the algorithms.
