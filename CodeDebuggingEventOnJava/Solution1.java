package SBK.Events;

import java.io.*;
import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean valid = true;   
  
        for(int i = 0; i < (A.length()); i++) {
            if(A.charAt(i) != A.charAt((A.length() - 1) - i)) {
                valid = false;
                break;
            }

        }

        if(!valid) System.out.println("No");

        else System.out.println("Yes");

    }
}