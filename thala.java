/**
 * thala
 */
import java.util.Scanner;

public class thala {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");

        String userInput = scanner.nextLine();


        scanner.close();
        System.out.println(userInput);
        System.out.println("thala for a reason");
    }
}