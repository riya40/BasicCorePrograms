/**
 * Printing The Number Even Or Odd
 */
package com.bridgelabz;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String args[]) {
        int n;
        Scanner x=new Scanner(System.in);
        n=x.nextInt();
        if(n%2==0) {
            System.out.println("even"+n);
        }
        else {
            System.out.println("odd"+n);
        }

    }
}
