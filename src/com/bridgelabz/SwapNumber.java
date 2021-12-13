package com.bridgelabz;
/**
 * Swaping The Two Numbers
 */

import java.util.Scanner;
public class SwapNumber {
    public static void main(String args[]) {
        int a,b,swap;
        
        System.out.println("enter the first value");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("enter the second value");
        b=sc.nextInt();

        //Swaping number
        swap=a;
        a=b;
        b=swap;
        System.out.println("swap is" +a+""+b);
    }
}
