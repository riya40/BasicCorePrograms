package com.bridgelabz;
/**Flip Coin AND Printing The Percentage
 * Using the Random Function
 */
public class FlipCoin {

    public static void main(String args[]) {
        int headcount = 0, tailcount = 0;
        for (int i = 0; i < 10; i++) {
            //using the random function for ganing the coin flip
            int c = (int) Math.floor(Math.random() * 10) % 2;
            //count the coin flip
            if (c < 0.5) {
                System.out.println("tails");
                tailcount++;
            } else {
                System.out.println("heads");
                headcount++;
            }
        }
        //calculating the percentage
        float tailspercentage = (tailcount * 100)/100;
        float headdspercentage = (headcount * 100)/100;

        //printing the percentage
        System.out.println("the percentage of tails:" + tailspercentage+ "\nthe percentage of heads" + headdspercentage);

    }
}