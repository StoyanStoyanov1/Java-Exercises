package fundamentals.basicSyntax.exercies;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = Integer.parseInt(sc.nextLine());
        String word = sc.nextLine();

        for (int i = 1; i <= times; i++) {
            System.out.printf("%d. %s", i, word);
        }
    }
}
