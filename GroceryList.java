package com.practice.hellocodergirl;

import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstItem;
        String secondItem;
        String thirdItem;
        int firstQuant;
        int secondQuant;
        int thirdQuant;
        float firstPrice;
        float secondPrice;
        float thirdPrice;
        float totalCost;

        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? ");
        firstItem = keyboard.nextLine();
        out.print("Item 2? ");
        secondItem = keyboard.nextLine();
        out.print("Item 3? ");
        thirdItem = keyboard.nextLine();

        out.println();
        out.print("Now, please enter the quantity of each item. ");
        out.println("(Input numbers only.) ");
        out.print("How many "+firstItem+"? ");
        firstQuant = keyboard.nextInt();
        out.print("How many "+secondItem+"? ");
        secondQuant = keyboard.nextInt();
        out.print("How many "+thirdItem+"? ");
        thirdQuant = keyboard.nextInt();

        out.println();
        out.print("Now, please enter the price of each item. ");
        out.println("(Input numbers only.) ");
        out.print("How much does one "+firstItem+" cost? ");
        firstPrice = keyboard.nextFloat();
        out.print("How much does one "+secondItem+" cost? ");
        secondPrice = keyboard.nextFloat();
        out.print("How much does one "+thirdItem+" cost? ");
        thirdPrice = keyboard.nextFloat();

        out.println();
        out.println("Calculating your grocery bill.\n");
        totalCost = firstQuant * firstPrice + secondQuant * secondPrice + thirdQuant * thirdPrice;
        out.println("Your total cost is "+totalCost);


    }
}
