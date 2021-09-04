package SBK.Events;

import java.io.*;
import java.text.*;
import java.math.*;
import java.util.Scanner;
import java.util.regex.*;

public class Solution3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = (int) in.nextFloat();
        for(int i=0;i<10;i++) {
           System.out.println(N+" x "+(i+1)+" = "+(N* (i+1)));
                
        }
    }
}