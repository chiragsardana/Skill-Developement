package Arrays;

public class MaximumAndMinimum {
	static class Pair{
		Integer min;
		Integer max;
		Pair(){
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
		}
	}
	public static Pair getMinMaxPairwise(Integer arr[], int n) {
        Pair minmax = new Pair();
        int i;
        /* If array has even number of elements then 
    initialize the first two elements as minimum and 
    maximum */
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            } else {
                minmax.min = arr[0];
                minmax.max = arr[1];
            }
            i = 2;
            /* set the starting index for loop */
        } /* If array has odd number of elements then 
    initialize the first element as minimum and 
    maximum */ else {
            minmax.min = arr[0];
            minmax.max = arr[0];
            i = 1;
            /* set the starting index for loop */
        }
 
        /* In the while loop, pick elements in pair and 
     compare the pair with max and min so far */
        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                }
                if (arr[i + 1] < minmax.min) {
                    minmax.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > minmax.max) {
                    minmax.max = arr[i + 1];
                }
                if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
            i += 2;
            /* Increment the index by 2 as two 
               elements are processed in loop */
        }
 
        return minmax;
    }
	public static void main(String[] args) {
		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;
		Integer arr[] = {1000, 11, 445, 1, 330, 3000};
//		System.out.print();
		getMinMax(arr, min, max);
		Pair answer = getMinMaxReccursively(arr, 0, arr.length - 1);
		System.out.println("The Minimum and Maximum using Technique Like Merge Sort or We can call it as Tournament Method : "+answer.min+" and "+answer.max);
		answer = getMinMaxPairwise(arr, arr.length);
		System.out.println("The Minimum and Maximum using Pairwise : "+answer.min+" and "+answer.max);
		
	}
	public static Pair getMinMaxReccursively(Integer[] arr, Integer low, Integer high) {
		Pair minmax = new Pair();
		Pair mn1 = new Pair();
		Pair mn2 = new Pair();
		Integer mid;
//		If there is only one element
		if(low  == high) {
			minmax.max = arr[low];
			minmax.min = arr[high];
			return minmax;
		}
//		If there is only two elements
		if(low  == high + 1) {
			if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
		}
		/* If there are more than 2 elements */
        mid = (low + high) / 2;
        mn1 = getMinMaxReccursively(arr, low, mid);
        mn2 = getMinMaxReccursively(arr, mid + 1, high);
 
        /* compare minimums of two parts*/
        if (mn1.min < mn2.min) {
            minmax.min = mn1.min;
        } else {
            minmax.min = mn2.min;
        }
 
        /* compare maximums of two parts*/
        if (mn1.max > mn2.max) {
            minmax.max = mn1.max;
        } else {
            minmax.max = mn2.max;
        }
 
        return minmax;
		
	}
	public static void getMinMax(Integer[] arr,Integer min, Integer max) {
		if(arr.length == 1) {
			min = arr[0];
			max = arr[0];
			return;
		}
		
		if(arr[0] > arr[1]) {
			min = arr[1];
			max = arr[0];
		}else {
			min = arr[0];
			max = arr[1];
		}
		
		for(Integer i = 2; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The Min and Max of Given Array using Linear Search is :"+min+" and "+max);
	}
}