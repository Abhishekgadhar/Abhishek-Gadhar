import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        int numberOfOdds;
        if (a % 2 == 0) {
            numberOfOdds = a - 1;
        } else {
            numberOfOdds = a;
        }

        System.out.print("Output: ");
        for (int i = 0; i < numberOfOdds; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < numberOfOdds - 1) {
                System.out.print(", ");
            }
        }

      
    }
}
