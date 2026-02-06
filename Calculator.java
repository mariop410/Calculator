import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a whole number:");
    int num1 = scanner.nextInt();

    System.out.println("Enter another whole number:");
    int num2 = scanner.nextInt();

    System.out.println("Woukd you like to add or subtract the two numbers");
    String answer = scanner.next();

    if (answer.equals("add")) {
        int result = num1 + num2;
        System.out.println("The sum is " + result);
    }

    else if (answer.equals("subtract")) {
        int result = num1 - num2;
        System.out.println("The difference is " + result);
    }
}

}
