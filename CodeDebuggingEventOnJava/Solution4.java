package SBK.Events;

import java.util.Iterator;
import java.util.TreeSet;

public class Solution4 {  
	   public static void main(String[] args) {  
	     
	        int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};  
	  
	        System.out.println("Duplicate elements in given array: ");  
	        TreeSet<Integer> treeSet = new TreeSet<>();
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i+1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  {
	                	treeSet.add(arr[i]);
	                }
	            }  
	        }  
	        Iterator<Integer> iterator = treeSet.iterator();
	        while (iterator.hasNext())
	            System.out.println(iterator.next() + " ");
	    }  
	}
