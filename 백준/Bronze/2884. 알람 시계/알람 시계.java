import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b - 45 >= 0) {
            b = b - 45;
            System.out.println(a + " " + b);
        } else if (b - 45 < 0) {
            if (a == 0) {
                a = 23;
            } else {
                a -= 1;
            }
            b = b + 15;
            System.out.println(a + " " + b);
        }
    }
}