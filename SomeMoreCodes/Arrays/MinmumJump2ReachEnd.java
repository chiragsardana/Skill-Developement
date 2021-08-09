package Arrays;

public class MinmumJump2ReachEnd {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		 
        // calling minJumps method
        System.out.println(minJump(arr));
	}
	public static Integer minJump(Integer[] arr) {
		if(arr.length<=1) {
			return 0;
		}
		
		if(arr[0] == 0) {
			return -1;
		}
		
		Integer maxReach = arr[0];
		Integer step = arr[0];
		Integer jump = arr[0];
		
		for(Integer  i = 1;i < arr.length;i++) {
			if(i == arr.length - 1) {
				return jump;
			}
			
			maxReach = Math.max(maxReach, i + arr[i]);
			
			step--;
			
			if(step == 0) {
				jump++;
				
				
				if(i >= maxReach) {
					return -1;
				}
				
				step = maxReach - i;
			}
		}
		
		return -1;
	}
}
