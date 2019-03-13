import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Tables");
        boolean playAgain;

        do {
            System.out.println("How large would you like to see them? (<=20)");
            int number;
            number = keyboard.nextInt();

            if(number<=20){
                multiplication(number);
            } else{
                    System.out.println("Please enter a number less than 20.");
            }

            System.out.println("Do you want to play again?");
            playAgain = keyboard.next().toLowerCase().contains("y");

        }while(playAgain);

    }

    public static void multiplication(int number) {
        int x = 0;
        int y = 0;
        for (x = 0; x <= number; x++) {
            for (y = 0; y <= number; y++) {
                System.out.println(x + " * " + y + " = " + (x * y));
            }
        }
    }
}