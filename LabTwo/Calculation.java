import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Choose operation: 1 for (+), 2 for (-), 3 for (*), 4 for (/): ");
        int operation = sc.nextInt();

        switch (operation) {
            
                case 1:
                System.out.println("Sum: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Division: " + ((double) num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operation selected.");
                break;
        }

        
        sc.close();
    }
}
