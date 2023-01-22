package practiceMyself;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); // Do not change this line // Write your program here

         System.out.print("What is your name? ");
         String name = scanner.nextLine(); // read user input



        System.out.printf("Hello %s How old are you? ", name);
        int age = scanner.nextInt();

//        double gpa = Double.parseDouble(scanner.nextLine()); // read user input


        scanner.nextLine(); // read the newline character

        System.out.printf("%d is an excellent age to start programming! WHat language do you prefer?", age);
        String language = scanner.nextLine();

        System.out.printf("%s is a very populart programming language.", language);


        scanner.close(); // close the scanner

    }
}
