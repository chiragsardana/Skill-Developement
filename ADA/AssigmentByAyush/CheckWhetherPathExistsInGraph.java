package AssigmentByAyush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CheckWhetherPathExistsInGraph {
	public static Boolean checkPath(Integer[][] adjancencyMatrix, Integer start, Integer end) {
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> BFS = new ArrayList<>();
		queue.add(start);
		Boolean[] visited = new Boolean[adjancencyMatrix.length];
		Arrays.fill(visited, false);
		visited[start] = true;
		while(!queue.isEmpty()) {
			Integer value = queue.poll();
			BFS.add(value);
			for(Integer i = 0;i < adjancencyMatrix.length;i++) {
				if(adjancencyMatrix[value][i] != 0 && (!visited[i])) {
					queue.add(i);
					visited[i] = true;
				}
			}
			
		}
		if(BFS.contains(end)) {
			return true;
		}
		return false;
	}

}
