package currencyapplication;
import java.util.Scanner;

public class CurrencyTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount;
        do {
            System.out.print("Enter the amount (should not exceed 50000 and be a multiple of 100): ");
            amount = scanner.nextInt();
        } while (!isValidAmount(amount));

        System.out.println("entered amount " + amount);
    }

    private static boolean isValidAmount(int amount) {
        if (amount > 50000 || amount % 100 != 0) {
            System.out.println("Invalid amount Please enter a valid amount.");
            return false;
        }
        return true;
    }
}
