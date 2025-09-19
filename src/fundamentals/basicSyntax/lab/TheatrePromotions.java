package fundamentals.basicSyntax.lab;
import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticketPrice = 0;
        boolean isValid = true;

        String typeOfDay = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());


        switch (typeOfDay) {
            case "weekday":
                if (age < 0 || age > 122) {
                    isValid = false;
                }
                else if (age <= 18) {
                    ticketPrice = 12;
                } else if (age <= 64) {
                    ticketPrice = 18;
                } else {
                    ticketPrice = 12;
                }
                break;

            case "weekend":
                if (age < 0 || age > 122) {
                    isValid = false;
                }
                else if (age <= 18) {
                    ticketPrice = 15;
                } else if (age <= 64) {
                    ticketPrice = 20;
                } else {
                    ticketPrice = 15;
                }
                break;
            case "holiday":
                if (age < 0 || age > 122) {
                    isValid = false;
                }
                else if (age <= 18) {
                    ticketPrice = 5;
                } else if (age <= 64) {
                    ticketPrice = 12;
                } else {
                    ticketPrice = 10;
                }
                break;
        }

        if (isValid) {
            System.out.printf("%d$", ticketPrice);
        } else {
            System.out.println("Error!");
        }

    }
}
