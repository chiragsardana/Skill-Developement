 package Tree;

import Queue.QueueUsingNode;

public class BinaryTreeUsingNode {
	Node root;
	BinaryTreeUsingNode(){
		root = null;
	}
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    } 
	 
	    if (value < current.data) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.data) { 
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
	private boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.data) {
	        return true;
	    } 
	    return value < current.data
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	public boolean containsNode(int value) {
	    return containsNodeRecursive(root, value);
	}
	private Node deleteNodeRecursive(Node current, int value) {
		if(current == null) {
			return null;
		}
		if(value == current.data) {
//			In this we have three cases :
//			1.when deletion node has no child
//			2.when deletion node has only one child
//			3.when deletion node has two child
			
//			Case 1
			if(current.left == null && current.right == null) {
				return null;
			}
//			Case 2
			if (current.right == null) {
			    return current.left;
			}
			if (current.left == null) {
			    return current.right;
			}
//			Case 3 
			int smallestValue = findSmallestValue(current.right);
			current.data = smallestValue;
			current.right = deleteNodeRecursive(current.right, smallestValue);
			return current;
		}
		if (value < current.data) {
	        current.left = deleteNodeRecursive(current.left, value);
	        return current;
	    }
	    current.right = deleteNodeRecursive(current.right, value);
		return current;
	}
	private int findSmallestValue(Node root) {
	    return root.left == null ? root.data : findSmallestValue(root.left);
	}
	public void delete(int value) {
	    root = deleteNodeRecursive(root, value);
	}
//	Traversal
	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(node.data+" ");
	        traverseInOrder(node.right);
	    }
	}
	public void traversePreOrder(Node node) {
	    if (node != null) {
	        System.out.print(node.data+" ");
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	public void traversePostOrder(Node node) {
	    if (node != null) {
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print(node.data+" ");
	    }
	}
	public void traverseLevelOrder() {
	    if (root == null) {
	        return;
	    }
	 
	    QueueUsingNode<Node> nodes = new QueueUsingNode();
	    nodes.enqueue(root);
	 
	    while (!nodes.isEmpty()) {
	 
	        Node node = nodes.dequeue();
	 
	        System.out.print(" " + node.data);
	 
	        if (node.left != null) {
	            nodes.enqueue(node.left);
	        }
	 
	        if (node.right != null) {
	            nodes.enqueue(node.right);
	        }
	    }
	}
	public int countNodes() {
		return countNodes(root);
	}
	private int countNodes(Node root) {
		if(root == null ) {
			return 0;
		}
		int counter = 1;
		counter += countNodes(root.left);
		counter += countNodes(root.right);
		return counter;
	}
}
