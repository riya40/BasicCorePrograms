package com.bridgelabz;
import java.util.Scanner;
public class Quotient {
    public static void main(String args[]){
        int a,b,q,r;
        System.out.println("enter the first value");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("enter the second value");
        b=sc.nextInt();
        q=a/b;
        r=a%b;
        System.out.println("Quotient is:"+q+"\nRemainder is:"+r);
    }
}
