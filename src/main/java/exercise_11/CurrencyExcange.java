/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package exercise_11;

import java.util.Scanner;

public class CurrencyExcange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros will you be exchanging?");
        String euroStr= input.next();
        double euros = Double.parseDouble(euroStr);

        System.out.print("What is the current exchange rate?");
        String ratestr= input.next();
        double rate = Double.parseDouble(ratestr);

        double dollars = Math.round(euros * rate* 100.0)/100.0;

        System.out.print(euros + " euros at and exchange rate of "+ rate+ " is\n"
                + dollars + " US Dollars");
    }
}
