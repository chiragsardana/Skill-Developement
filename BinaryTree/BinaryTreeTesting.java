package Tree;

public class BinaryTreeTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeUsingNode tree = new BinaryTreeUsingNode();
		 
		tree.add(6);
	    tree.add(4);
	    tree.add(8);
	    tree.add(3);
	    tree.add(5);
	    tree.add(7);
	    tree.add(9);
	    
//	    System.out.println(tree.containsNode(6));
//	    
//	    tree.delete(6);
//	    System.out.println(tree.containsNode(6));
	    
	    System.out.print("The Preorder of the Tree : ");
	    tree.traversePreOrder(tree.root);
	    System.out.print("\nThe Postorder of the Tree : ");
	    tree.traversePostOrder(tree.root);
	    System.out.print("\nThe Inorder of the Tree : ");
	    tree.traverseInOrder(tree.root);
	    System.out.print("\nThe Level order of the Tree : ");
	    tree.traverseLevelOrder();
	    
	    System.out.println("\nThe Number of Nodes is : "+tree.countNodes());
	}

}
