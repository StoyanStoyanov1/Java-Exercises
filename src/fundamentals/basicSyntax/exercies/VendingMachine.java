package fundamentals.basicSyntax.exercies;

import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCoins = 0.0;

        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double receivedCoin = Double.parseDouble(input);

            if (coinIsValid(receivedCoin)) {
                totalCoins += receivedCoin;
            } else {
                System.out.printf("Cannot accept %.2f%n", receivedCoin);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            double price = getProductPrice(input);

            if (price == -1) {
                System.out.println("Invalid product");
            } else if (totalCoins >= price) {
                totalCoins -= price;
                System.out.println("Purchased " + input);
            } else {
                System.out.println("Sorry, not enough money");
            }

            input = scanner.nextLine();
        }

        System.out.printf("Change: %.02f%n", totalCoins);
    }

    private static boolean coinIsValid(double receivedCoin) {
        double[] possibleCoins = {0.1, 0.2, 0.5, 1.0, 2.0};
        for (double coin : possibleCoins) {
            if (receivedCoin == coin) {
                return true;
            }
        }
        return false;
    }

    private static double getProductPrice(String product) {
        Map<String, Double> prices = new HashMap<>();
        prices.put("Nuts", 2.0);
        prices.put("Water", 0.7);
        prices.put("Crisps", 1.5);
        prices.put("Soda", 0.8);
        prices.put("Coke", 1.0);

        return prices.getOrDefault(product, -1.0);
    }
}
