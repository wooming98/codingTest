import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int r = scanner.nextInt();
            String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                System.out.print(String.valueOf(s.charAt(j)).repeat(r));
            }
            System.out.println();
        }
    }
}