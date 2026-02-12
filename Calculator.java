import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    double num1 = scanner.nextDouble();

    System.out.println("Enter another number:");
    double num2 = scanner.nextDouble();

    System.out.println("Woukd you like to add. subtract, multiply, or divide the two numbers?");
    String answer = scanner.next();

    if (answer.equals("add")) {
        double result = num1 + num2;
        System.out.println("The sum is " + result);
    }

    else if (answer.equals("subtract")) {
        double result = num1 - num2;
        System.out.println("The difference is " + result);
    }

    else if (answer.equals("multiply")) {
        double result = num1 * num2;
        System.out.println("The product is " + result);
    }

    else if (answer.equals("divide")) {
        if (num2 == 0) {
            System.out.println("Error: Divide by Zero");
        } 
        else {
            double result = num1 / num2;
            System.out.println("The quotient is " + result);
        }
        
    }
}

}
