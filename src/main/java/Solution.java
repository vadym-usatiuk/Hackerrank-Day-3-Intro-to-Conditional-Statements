//Task
//        Given an integer, , perform the following conditional actions:
//
//        If  is odd, print Weird
//        If  is even and in the inclusive range of  2 to 5, print Not Weird
//        If  is even and in the inclusive range of  6 to 20, print Weird
//        If  is even and greater than 20, print Not Weird
//        Complete the stub code provided in your editor to print whether or not  is weird.
//
//        Input Format
//
//        A single line containing a positive integer, .
//
//        Constraints
//
//        Output Format
//
//        Print Weird if the number is weird; otherwise, print Not Weird.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // If  is odd, print Weird
        //Entered number is even
        if (1 <= N && N <= 100) {
            if (N % 2 == 0) {
                //If  is even and in the inclusive range of 2 to 5, print Not Weird
                if (2 <= N && N <= 5) {
                    System.out.println("Not Weird");
                }
                // If  is even and in the inclusive range of 6 to 20, print Weird
                else if (6 <= N && N <= 20) {
                    System.out.println("Weird");
                }
                //If  is even and greater than 20, print Not Weird
                else if (N >= 20) {
                    System.out.println("Not Weird");
                }
            } else {
                //Entered number is odd
                System.out.println("Weird");
            }
        }
        else {
            System.out.println("The number should be in inclusive range between 1 and 100");
        }
        scanner.close();
    }
}
