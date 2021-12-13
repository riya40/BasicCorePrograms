/**
 * Printing an Alphabet an Vowel or Consonant
 */
package com.bridgelabz;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String args[]) {

        System.out.println("enter alphabet");
        Scanner sc=new Scanner(System.in);
        char p=sc.next().charAt(0);
        //Checking the Vowel
        if((p=='a')||(p=='e')||(p=='i')||(p=='o')||(p=='u')){
            System.out.println("vowel:"+p);

        }
        //Printing the Consonant
        else {
            System.out.println("consonant:"+p);
        }
    }
}
