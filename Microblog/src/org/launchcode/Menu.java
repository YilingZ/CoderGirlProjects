package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    private User john = new User("url", "coolGuyJohn", "John", "Doe", "john@gmail.com");
    private User mary = new User("url2", "maryMary", "Mary", "Bob", "mary@yahoo.com");
    private User joe = new User("url", "JoeJo", "Joe", "Louis", "joe@hockey.com");
    private User currentuser = john;

    private ArrayList<User> userLog;


    private ArrayList<Post> postLog;

    public Menu(){
        this.userLog = new ArrayList();
        userLog.add(john);
        userLog.add(mary);
        userLog.add(joe);

        this.postLog = new ArrayList();

        Post first = new Post(john, "My first post!");
        postLog.add(first);
        Post second = new Post(mary, "My second post", "www.awesome.com");
        postLog.add(second);
        Post third = new Post (joe, "The third Post");
        postLog.add(third);
        Post fourth = new Post(joe, "Another post", "www.google.com");
        postLog.add(fourth);
        Post fifth = new Post(joe, "Joe posts a lot");
        postLog.add(fifth);
    }




    public void start(){

        int userChoice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Main Menu\n");
        System.out.println("1) Create a new user\n" +
                "2) Log in into an existing user account\n" +
                "3) Create a post as the current user\n" +
                "4) Print all posts\n" +
                "5) Print all users\n" +
                "You are currently user "+currentuser.getUsername()+". What would you like to do? (Enter the number.)");
        userChoice = scanner.nextInt();

        if (userChoice == 1){

            UserCreator newUser = new UserCreator();
            User user = newUser.createUser();
            currentuser = user;

        }else if (userChoice == 2){

            currentuser=login(currentuser);


        }else if (userChoice == 3){

            PostCreator newPost = new PostCreator();
            Post post = newPost.createPost(currentuser);
            postLog.add(post);

        }else if (userChoice == 4){

            //Loops through the list of posts, pulling out each post
            //and storing it into a variable. Then prints the results
            //of the toString method.
            for(Post post: postLog){
                System.out.println(post.toString());
                System.out.println("");
            }

        } else if (userChoice == 5) {

            for (User user : userLog) {

                System.out.println(user.getUsername());
                System.out.println("");
            }

        } else {

            System.out.println("Please enter the number from 1-5.");
        }


    }


    public User login(User user){

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are currently logged in as " + user.getUsername() + ".");

        System.out.println("Which account do you want to change to? Mary or Joe?");

        if (scanner.nextLine().toLowerCase().equals("mary")){

            user = mary;

        } else if (scanner.nextLine().toLowerCase().equals("joe")){

            user = joe;

        } else {

            System.out.println("Please enter one of the two names.");
        }

        return user;

    }








    
}
