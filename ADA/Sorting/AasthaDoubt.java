package Sorting;

import java.util.Arrays;
import java.util.Random;

 

public class AasthaDoubt {
     public static int x;

 

//   takes last element as pivot
  static  int partition(int arr[], int p, int q) 
    { 
        int pivot = arr[q];  
        int i = (p-1); 
        for (int j=p; j<q; j++) 
        { 
            if (arr[j] < pivot) 
            {   i++; 
               // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
          // swap arr[i+1] and arr[high]  
        int temp = arr[i+1]; 
        arr[i+1] = arr[q]; 
        arr[q] = temp; 
          return i+1; 
    }
   public static int[] sort(int arr[], int p, int q) 
    { 
        if (p <q) 
        { 
            
          int pi = partition(arr,p,q); 
          sort(arr, p, pi-1); 
          sort(arr, pi+1,q);
//          System.out.println("number of recussion "+ x );
        } 
        x++;
        return arr;
    } 
  
     public static void main(String[] args) {
        // TODO Auto-generated method stub
        
//                int arr[] = {10, 7, 8, 9, 1, 5,11,4,12,99}; 
//                int len = arr.length;
           
       Random random = new Random();
        int[] arr2 = new int[1000]; //random
        int[] arr3 = new int[1000]; //ascending
        int[] arr1 = new int[1000];//descending
        int[] arr4 =new int[1000];//same
        
        for (int i = 0; i < 1000; i++){
            int randomNumber = random.nextInt(1000);
            arr2[i] = randomNumber;
        }
        
        for (int i = 0; i < 1000; i++){
           arr3[i] = i;
        }

 

        for (int i = 1000; i > 0; i--){
            arr1[1000 - i] = i;
        }
        for (int i = 1000; i > 0; i--){
            arr4[1000 - i] = 5;
        }
        
        AasthaDoubt ob = new AasthaDoubt(); 
        
       
      long start = System.nanoTime();
        System.out.println("Descending Arrya");
        System.out.println(Arrays.toString(arr1));
        
             
        System.out.println("Sorted Sort  "); 
        System.out.println(Arrays.toString( ob.sort(arr1, 0, arr1.length - 1)));
        System.out.println("number of recussion "+ ob.x );
        System.out.println();
       
       long end = System.nanoTime();
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
        
        
        long st = System.nanoTime();
        System.out.println("Random Arrya");
        System.out.println(Arrays.toString(arr2));
       
        System.out.println("Sorted Sort  "); 
        ob.x= 0;
        System.out.println(Arrays.toString( ob.sort(arr2, 0, arr2.length - 1)));
        System.out.println("number of recussion "+ ob.x );
        System.out.println();
      long ed = System.nanoTime();
       long exe = ed - st;
        System.out.println("Execution time: " + exe + " nanoseconds");
       
       
        long s = System.nanoTime();
        System.out.println("Ascending Arrya");
        System.out.println(Arrays.toString(arr3));
       
        System.out.println("Sorted Sort  "); 
        ob.x = 0;
        System.out.println(Arrays.toString( ob.sort(arr3, 0, arr3.length - 1)));
        System.out.println("number of recussion "+ ob.x );
        System.out.println();
        long e = System.nanoTime();
        long ex = e - s;
        System.out.println("Execution time: " + ex+ " nanoseconds");
        
        
        
        long star = System.nanoTime();
     System.out.println("same number array");
     System.out.println(Arrays.toString(arr4));
            
     System.out.println("Sorted Sort  "); 
     ob.x = 0;
     System.out.println(Arrays.toString( ob.sort(arr4, 0, arr4.length - 1)));
     System.out.println("number of recussion "+ ob.x );
    long en = System.nanoTime();
        long execu = en - star;
        System.out.println("Execution time: " + execu + " nanoseconds");
       
              
            } 
}
 