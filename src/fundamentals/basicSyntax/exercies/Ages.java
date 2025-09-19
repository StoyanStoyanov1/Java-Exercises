package fundamentals.basicSyntax.exercies;
import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfPerson = "";

        int age = Integer.parseInt(scanner.nextLine());

        String result = "";

        if (age < 0) {
            typeOfPerson = "Negative years aren't possible!";
        }

        else if (age <= 2) {
            typeOfPerson = "baby";
        }

        else if (age <= 13) {
            typeOfPerson = "child";
        }

        else if (age <= 19) {
            typeOfPerson = "teenager";
        }

        else if (age <= 65) {
            typeOfPerson = "adult";
        } else {
            typeOfPerson = "elder";
        }

        System.out.println(typeOfPerson);
    }
}
