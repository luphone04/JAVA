package practiceMyself;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter the second number: ");
        double number2 = scan.nextDouble();
        scan.nextLine();

        System.out.print("What operation do you wnat to perform?");
        String operation = scan.nextLine();

        switch(operation){
            case "+":
                System.out.println("number1 + number2 = " + (number1 + number2));
                break;
            case "-":
                System.out.println("number1 - number2 = " + (number1 - number2));
                break;
            case "*":
                System.out.println("number1 * number2 = " + (number1 * number2));
                break;
            case "/":
                if(number2 == 0){
                    System.out.println("Cannot divide by zero");
                }else{
                    System.out.println("number1 / number2 = " + (number1 / number2));
                }
                break;
            default:
                System.out.println("Invalid operation"); // This will also print out this even if the condition is true if you don't break;
        }


//        if (operation.equals("+")) {
//            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
//        } else if (operation.equals("-")) {
//            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
//
//        } else if (operation.equals("*")) {
//            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
//        } else if (operation.equals("/")) {
//            if(number2 == 0){
//                System.out.println("You cannot divide by zero");
//            }else{
//                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
//            }
//
//        }else{
//            System.out.print("Invalid Operation");
//        }

        scan.close();
    }
}
