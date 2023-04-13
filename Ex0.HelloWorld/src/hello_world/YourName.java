package hello_world;

import java.util.Scanner;

public class YourName {
    public static void main(String[] args)
    {
        System.out.println("What is your name ?");
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();  // Read user input
        System.out.println("Nice to meet you: " + userName);  // Output user input

        scanner.close();
        return;
    }
}
