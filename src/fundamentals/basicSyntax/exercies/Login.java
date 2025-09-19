package fundamentals.basicSyntax.exercies;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tryCounter = 0;
        String username = scanner.nextLine();
        String correctPassword = new StringBuilder(username).reverse().toString();

        boolean isLogged = false;

        while (tryCounter < 4) {
            tryCounter ++;
            String password = scanner.nextLine();

            if (password.equals(correctPassword)) {
                System.out.printf("User %s logged in.", username);
                isLogged = true;
                break;
            }

            if (tryCounter < 4 ) {
                System.out.println("Incorrect password. Try again.");
            }
        }

        if (!isLogged) {
            System.out.printf("User %s blocked!", username);
        }

    }
}
