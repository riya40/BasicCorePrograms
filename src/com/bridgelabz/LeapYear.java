package com.bridgelabz;
/**Determine the Leap Year
 * Printing the Leap year
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]){
        int year=0;
        System.out.println("enter the year");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if((year%4==0) && (year%100!=0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leapyear");
        }

    }
}
