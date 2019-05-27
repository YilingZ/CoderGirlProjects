package org.launchcode;
import java.util.Scanner;

public class UserCreator {


    private static String url;
    private static String userName;
    private static String firstName;
    private static String lastName;
    private static String email;


    public User createUser(){

        User user = new User ("","","","","");

        System.out.println("Create a new user.");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(toString());
            System.out.println("Are these information correct?");

        } while(scanner.nextLine().toLowerCase().equals("n"));


        //Set the value of new user.
        //How to individuate the users? What if two users have the same name?

            user.setAvatarUrl(url);
            user.setUsername(userName);
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);

            System.out.println("User " + user.getUsername() + " has been created.");

            return user;

    }



    //Set and print the input information from the keyboard.
    @Override
    public String toString() {

        url = createUrl();
        userName = createUserName();
        firstName = createFirstName();
        lastName = createLastName();
        email = createEmail();

        return "AvatarUrl: " + url +
                "\n Username: " + userName +
                "\n First Name: " + firstName +
                "\n Last Name: " + lastName +
                "\n Email: " + email;
    }


    static String createUrl(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the url for your avatar picture");
        return scanner.nextLine();

    }

    static String createUserName(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username.");
        return scanner.nextLine();

    }

    static String createFirstName (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name.");
        return scanner.nextLine();

    }


    static String createLastName (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your last name.");
        return scanner.nextLine();

    }


    static String createEmail (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email.");
        return scanner.nextLine();

    }



}

