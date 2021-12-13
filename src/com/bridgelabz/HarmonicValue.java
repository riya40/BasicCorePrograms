package com.bridgelabz;
import java.util.Scanner;
public class HarmonicValue {
    public static void main(String args[]) {
        int n, r;
        float h = 0, sum = 0;
        System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            h = (float) 1 / i;
            System.out.println("the harmonic values" + h);
            sum += h;
            System.out.println("the sum is"+sum);
        }
    }
}