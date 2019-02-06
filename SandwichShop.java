import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner( System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int soldVeggies;
        int soldBurgers;
        int soldSubs;
        int soldSoup;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is "+goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        soldVeggies = keyboard.nextInt();
        if (soldVeggies >= goalForVeggies){
            out.println("Made goal for veggies.\n");
        } else{
            out.println("Fell short, "+(goalForVeggies-soldVeggies)+" veggies to the goal.\n");
        }

        out.println("The sales goal for burgers is "+goalForBurgers);
        out.println("How many Burgers were sold today?");
        soldBurgers = keyboard.nextInt();
        if (soldBurgers >= goalForBurgers){
            out.println("Made goal for burgers.\n");
        } else{
            out.println("Fell short, "+(goalForBurgers-soldBurgers)+" from goal for burgers.\n");
        }

        out.println("The sales goal for subs is "+goalForSubs);
        out.println("How many subs were sold today?");
        soldSubs = keyboard.nextInt();
        if (soldSubs >= goalForSubs){
            out.println("Made goal for subs.\n");
        } else{
            out.println("Fell short, "+(goalForSubs-soldSubs)+" from goal for subs.\n");
        }

        out.println("The sales goal for soup is "+goalForSoup);
        out.println("How many soup were sold today?");
        soldSoup = keyboard.nextInt();
        if (soldSoup >= goalForSoup){
            out.println("Made goal for soup.\n");
        } else{
            out.println("Fell short, "+(goalForSoup-soldSoup)+" from goal for soup.\n");
        }

        boolean meetAllGoals = (soldVeggies >= goalForVeggies)&&(soldBurgers >= goalForBurgers)&&(soldSubs >= goalForSubs)&&(soldSoup >= goalForSoup);
        if (meetAllGoals){
                    out.println("Made goal for everything!");
        }




    }

}
