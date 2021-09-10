import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the second number: ");
        int y = scanner.nextInt();
        scanner.nextLine();
        int gcd = GreatestCommonDivisor.getGreatestCommonDivisor(x, y);
        System.out.println("The Greatest Common Divisor of " + x + " and " + y + " is " + gcd);
        System.out.println("Press any key to exit: ");
        scanner.nextLine();
    }
}
