package com.bridgelabz;
/**
 * Printing the Power of Two
 */

import java.util.Scanner;
public class Power {
    public static void main(String args[]) {
        double sum = 0;
        int r = 0,n;
        System.out.println("enter the value");
        Scanner scanner=new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(n);
        for(int i = 0;i <= n;i++) {
            r = 2 * i;//Calculating the power of two
            System.out.println("the power value is"+r);
        }
        //Priniting the Leap year not
        if((r % 4 == 0) && (r % 100!=0)){
            System.out.println("leap year:"+r);
        }
        else {
            System.out.println("not a leapyear:"+r);
        }
    }
}
