package fundamentals.basicSyntax.exercies;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfTheGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double price = 0;



        switch (typeOfTheGroup) {
            case "Students":
                price = studentPrices(dayOfTheWeek) * groupOfPeople;
                if (groupOfPeople >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                if (groupOfPeople >= 100) {
                    groupOfPeople -= 10;
                }
                price = businessPrices(dayOfTheWeek) * groupOfPeople;
                break;
            case "Regular":

                price = regularPrices(dayOfTheWeek) * groupOfPeople;
                if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                    price *= 0.95;
                }
                break;
        }

        System.out.printf("Total price: %.02f", price);

    }

    public static double studentPrices(String dayOfTheWeek) {
        return switch (dayOfTheWeek) {
            case "Friday" -> 8.45;
            case "Saturday" -> 9.80;
            case "Sunday" -> 10.46;
            default -> 0;
        };
    }

    public static double businessPrices(String dayOfTheWeek) {
        return switch (dayOfTheWeek) {
            case "Friday" -> 10.90;
            case "Saturday" -> 15.60;
            case "Sunday" -> 16;
            default -> 0;
        };
    }

    public static double regularPrices(String dayOfTheWeek) {
        return switch (dayOfTheWeek) {
            case "Friday" -> 15;
            case "Saturday" -> 20;
            case "Sunday" -> 22.50;
            default -> 0;
        };
    }

}
