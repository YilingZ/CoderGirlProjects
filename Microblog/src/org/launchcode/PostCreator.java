package org.launchcode;
import java.util.Scanner;

public class PostCreator {

    private String draft;



    public Post createPost(User user){
        Scanner scanner = new Scanner(System.in);

        Post post = new Post (user,"");

        System.out.println("Create a new post.");

        do{
            draft = createContent();
            System.out.println("Do you want to post this? \n" + draft);
            System.out.println(user.getUsername()+ user.getId());

        }while(scanner.nextLine().toLowerCase().equals("n"));

        post.setContent(draft);

        return post;
    }


    static String createContent(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to post?");
        return scanner.nextLine();
    }



}
