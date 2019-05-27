package org.launchcode;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        Menu menu = new Menu();
        do {

            menu.start();
            System.out.println("Do you want to go back to the main menu?");

        }while (scanner.nextLine().toLowerCase().equals("y"));

    }
}
