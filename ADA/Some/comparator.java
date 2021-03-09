package Some;

import java.util.Comparator;

public class comparator implements Comparator<Node>{
	// Comparator class created for PriorityQueue 
    // returns 1 if node0.key > node1.key 
    // returns 0 if node0.key < node1.key and 
    // returns -1 otherwise 
  
        @Override
        public int compare(Node node0, Node node1) 
        { 
            return node0.key - node1.key; 
        } 
}
