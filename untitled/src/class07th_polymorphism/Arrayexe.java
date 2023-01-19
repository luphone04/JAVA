package class07th_polymorphism;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrayexe {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a real number (or enter 'q' to quit): ");
            String input = scanner.next();
            if (input.equals("q")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a real number or 'q' to quit.");
            }
        }

        if (numbers.size() > 0) {
            Collections.sort(numbers);
            System.out.println(numbers);
            System.out.println("Number of elements: " + numbers.size());
            System.out.println("Highest number: " + numbers.get(numbers.size() - 1));
            System.out.println("Lowest number: " + numbers.get(0));
            double sum = 0;
            for (double number : numbers) {
                sum += number;
            }
            double average = sum / numbers.size();
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}

