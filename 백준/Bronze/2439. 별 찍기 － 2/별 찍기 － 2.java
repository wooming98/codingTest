import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < n + 1; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println("*".repeat(i));
        }
    }
}