import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);
    }
}