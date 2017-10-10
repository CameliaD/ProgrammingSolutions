/*
* Given an array of n integers and a number, k, perform k left rotations on the array. 
* Then print the updated array as a single line of space-separated integers.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        while (k>0) {
            int firstNumber = a[0];
            for(int i = 0; i < n-1; i++) {
                a[i] = a[i + 1];
            }
            a[n - 1] = firstNumber;
            k--;
        }      
        return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
 