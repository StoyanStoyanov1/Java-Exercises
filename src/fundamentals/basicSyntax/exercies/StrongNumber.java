package fundamentals.basicSyntax.exercies;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
