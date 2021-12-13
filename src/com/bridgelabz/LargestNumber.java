/**
 * Printing the Largest Number Among Three Numbers
 */
package com.bridgelabz;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String args[]){
        int a,b,c;
        System.out.println("enter the first value");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("enter the second value");
        b=sc.nextInt();
        System.out.println("enter the third value");
        c=sc.nextInt();

        //Checking  the largest numbers
        if((a>b)&&(a>c)) {
            System.out.println("largest is:"+a);
        }
        else if((b>a)&&(b>c)) {
            System.out.println("largest is:"+b);
        }
        else {
            System.out.println("largest is:"+c);
        }
    }
}
